package proj.sample.dailyreport.dto;

import lombok.Data;
import proj.sample.dailyreport.entity.ReportsEntity;

import java.util.List;


/*
 * ◆日報APIのDTOクラス
 */
@Data
public class ReportDTO {

//	// id
//	private Integer id;
//	// subject：件名
//	private String subject;
//	// body：本文
//	private String body;
//	// writer：筆者
//	private String writer;
//	// published_at：公開日時
//	private String published_at;
//	// created_at
//	private String created_at;
//	// modified_at
//	private String modified_at;
//	// version_no
//	private Long version_no;
	
	// ReturnCode
	private String returnCode;

	// レポートエンティティを格納するリスト
	List<ReportsEntity> reportsEntity;
	
}
