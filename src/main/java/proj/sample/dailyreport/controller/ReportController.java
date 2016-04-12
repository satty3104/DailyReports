package proj.sample.dailyreport.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import proj.sample.dailyreport.dto.ReportDTO;
import proj.sample.dailyreport.entity.ReportsEntity;
import proj.sample.dailyreport.form.ReportForm;
import proj.sample.dbflute.exbhv.ReportsBhv;
import proj.sample.dbflute.exentity.Reports;


/*
 * ◆日報のGET,POST,PUT,DELETEを制御するクラス
 *  2016/04/08 作成
 * 
 */
@Controller
public class ReportController {

//	//@Autowired
//	private ReportService reportService;
	
	@Autowired
	private ReportsBhv reportsBhv;
	
	/*
	 * ◆日報を全件検索するメソッド_GET
	 */
    @RequestMapping(value = "/GET/reports/", method = RequestMethod.GET)
    @ResponseBody
    public ReportDTO reportSelectAll() {
    	
    	// 基点テーブルのConditionBeanを生成
    	//ReportsCB cb = new ReportsCB();
    	// 絞り込み条件・並び替え条件を設定
    	// 全件なのでなし
    	// Behaviorのメソッドを呼ぶ
		List<Reports> memberList = reportsBhv.selectList(cb -> { 
		    
			cb.specify().columnId();
		    cb.specify().columnSubject();
		    cb.specify().columnBody();
		    cb.specify().columnWriter();
		    cb.specify().columnPublishedAt();
		    
		});
		
		// 返却用DTO
		ReportDTO reportDTO = editSelectResult(memberList);
		reportDTO.setReturnCode("200 OK");
    
        return reportDTO;
    }
    
    /*
	 * ◆日報を１件検索するメソッド_GET
	 */
    @RequestMapping(value = "/GET/reports/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ReportDTO reportSelect(@PathVariable int id) {
    	
    	// 絞り込み条件・並び替え条件を設定
    	// Behaviorのメソッドを呼ぶ
		List<Reports> memberList = reportsBhv.selectList(cb -> { 
		    cb.query().setId_Equal(id);
		});
		
		// 返却用DTO
		ReportDTO reportDTO = editSelectResult(memberList);
		reportDTO.setReturnCode("200 OK");
    
        return reportDTO;
    }
    
	
    /*
     * 検索結果編集メソッド
     */
    private ReportDTO editSelectResult(List<Reports> memberList){
    	
		// 返却用DTO
		ReportDTO reportDTO = new ReportDTO();
		List<ReportsEntity> reportsEntityList = new ArrayList<ReportsEntity>();

		// 検索結果を編集する
		for (Reports selectResult : memberList) {

			ReportsEntity reportsEntity = new ReportsEntity();

			// id
			reportsEntity.setId(selectResult.getId());
			// subject：件名
			reportsEntity.setSubject(selectResult.getSubject());
			// body：本文
			reportsEntity.setBody(selectResult.getBody());
			// writer：筆者
			reportsEntity.setWriter(selectResult.getWriter());
			// published_at：公開日時
			reportsEntity.setPublished_at(selectResult.getPublishedAt());
			reportsEntityList.add(reportsEntity);
		}

		reportDTO.setReportsEntity(reportsEntityList);
		return reportDTO;
    }
    
    
//    /*
//	 * ◆1件の日報を作成するメソッド
//	 */
//	@RequestMapping(value = "/POST/reports/", method = RequestMethod.GET)
//	public String reportInsert(Model model) {
//    	
//		Logger.getLogger("ReportController").info("ここまでは処理実行");
//    	
//    	return "ReportInsert";
//    }

	/*
	 * ◆1件の日報を作成するメソッド
	 */
    @Transactional
	@RequestMapping(value = "/POST/reports/", method = RequestMethod.POST)
	public ResponseEntity<ReportForm> reportInsert(@ModelAttribute ReportForm form) {

		Reports reports = new Reports();
		// subject：件名
		reports.setSubject(form.getSubject());
		// body：本文
		reports.setBody(form.getBody());
		// writer：筆者
		reports.setWriter(form.getWriter());
		// published_at：公開日時
		reports.setPublishedAt(form.getPublished_at());
		
		// 登録処理実行
		reportsBhv.insert(reports);
		
		Logger.getLogger("ReportController").info("登録されたID：" + reports.getId());
		
//		// 自動採番されたIDを取得する
//		int insertId = reports.getId();
		
		form.setId(reports.getId());
		
		return new ResponseEntity<>(form, HttpStatus.OK);
	}
	
	
	
//	/*
//	 * ◆1件の日報を作成するメソッド_GET
//	 */
//    @RequestMapping(value = "/reports/insert/", method = RequestMethod.GET)
//    public String reportInsertGET(@ModelAttribute("form") ReportForm form) {
//    	
//    	form.setMessage1("日報API＿INSERT");
////        model.addAttribute("reportForm", form);
////        model.addAttribute("message", "日報API＿INSERT");
//        
//        return "ReportInsert";
//    }
//    
//	/*
//	 * ◆1件の日報を作成するメソッド_PST
//	 */
//	@RequestMapping(value = "/reports/insert/", method = RequestMethod.POST)
//    public ReportDTO reportInsertPOST(ReportForm form) {
//    	
//		reportService = new ReportService();
//		
//		// エラー回避用仮宣言
//		ReportDTO reportDTO = new ReportDTO();
//		// formからDTOに値を詰め替える
//		BeanUtils.copyProperties(reportDTO, form);
//		// サービスクラス呼び出し
//		reportDTO = reportService.insertReport(reportDTO);
//		
//        return reportDTO;
//    }
	
	
	
}
