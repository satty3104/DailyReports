package proj.sample.dailyreport.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import proj.sample.dailyreport.dto.DailyReportReq;
import proj.sample.dailyreport.dto.DailyReportRes;
import proj.sample.dailyreport.service.DailyReportService;

@RestController
@RequestMapping("/reports/")
public class DailyReportController {
	
	@Autowired
	private DailyReportService dailyReportService;
	
	// すべての日報を返却
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<DailyReportRes>> getAllReports() {
		
		List<DailyReportRes> reportList = new ArrayList<>();
		reportList = dailyReportService.getAllReports();
		return new ResponseEntity<>(reportList, null, HttpStatus.OK);
	}
	
	// 1件の日報を返却
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<DailyReportRes> getOneReports(@PathVariable int id) {
		
		String code = "";
		DailyReportRes report = new DailyReportRes();
		report = dailyReportService.getOneReports(id);
		if (report != null) {
			code = "200";
		} else {
			code = "404";
		}
		if (code.equals("200")) {
			return new ResponseEntity<>(report, null, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(report, null, HttpStatus.NOT_FOUND);
		}
	}
	
	// 日報作成
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<DailyReportRes> addReport(@RequestBody DailyReportReq report) {
		
		DailyReportRes result = new DailyReportRes();
		result = dailyReportService.addReport(report);
		return new ResponseEntity<>(result, null, HttpStatus.OK);
	}
}
