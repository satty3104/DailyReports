package proj.sample.dailyreport.service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proj.sample.dailyreport.dto.DailyReportReq;
import proj.sample.dailyreport.dto.DailyReportRes;
import proj.sample.dbflute.exbhv.ReportsBhv;
import proj.sample.dbflute.exentity.Reports;

@Service
public class DailyReportService {
	
	@Autowired
	private ReportsBhv reportsBhv;
	
	// すべての日報を返却
	public List<DailyReportRes> getAllReports() {
		
		List<DailyReportRes> resultList = new ArrayList<>();
		ListResultBean<Reports> entityList = reportsBhv.selectList(cb -> {
			cb.specify().columnSubject();
			cb.specify().columnBody();
			cb.specify().columnWriter();
			cb.specify().columnPublishedAt();
			cb.query().addOrderBy_Id_Asc();
		});
		if (!entityList.isEmpty()) {
			for (Reports report : entityList) {
				DailyReportRes reportRes = new DailyReportRes();
				reportRes = setResReport(report);
				resultList.add(reportRes);
			}
		} else {
			resultList = null;
		}
		return resultList;
	}
	
	// 1件の日報を返却
	public DailyReportRes getOneReports(int id) {
		
		DailyReportRes result = new DailyReportRes();
		OptionalEntity<Reports> entity = reportsBhv.selectEntity(cb -> {
			cb.query().setId_Equal(id);
			cb.specify().columnSubject();
			cb.specify().columnBody();
			cb.specify().columnWriter();
			cb.specify().columnPublishedAt();
		});
		if (entity.isPresent()) {
			Reports report = new Reports();
			report = entity.get();
			result = setResReport(report);
		} else {
			result = null;
		}
		return result;
	}
	
	// 日報作成
	public DailyReportRes addReport(DailyReportReq postReport) {
		
		Reports report = new Reports();
		report = setReqReport(postReport);
		reportsBhv.insert(report);
		
		DailyReportRes result = new DailyReportRes();
		result = setResReport(report);
		return result;
	}
	
	// Reportsからレスポンス用DTOに詰め替え
	public DailyReportRes setResReport(Reports report) {
		DailyReportRes result = new DailyReportRes();
		result.setId(report.getId());
		result.setSubject(report.getSubject());
		result.setBody(report.getBody());
		result.setWriter(report.getWriter());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		String published_at_str = report.getPublishedAt().format(formatter);
		result.setPublished_at(published_at_str);
		return result;
	}
	
	// リクエスト用DTOからReportsに詰め替え
	public Reports setReqReport(DailyReportReq report) {
		Reports result = new Reports();
		result.setSubject(report.getSubject());
		result.setBody(report.getBody());
		result.setWriter(report.getWriter());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime published_at = LocalDateTime.parse(report.getPublished_at(), formatter);
		result.setPublishedAt(published_at);
		return result;
	}
}
