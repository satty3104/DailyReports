package proj.sample.dailyreport.entity;

import lombok.Data;

/*
 * ◆Reportsのエンティティ
 */
@Data
public class ReportsEntity {

	// id
	private Integer id;
	// subject：件名
	private String subject;
	// body：本文
	private String body;
	// writer：筆者
	private String writer;
	// published_at：公開日時
	private java.time.LocalDateTime published_at;
	// created_at
	private java.time.LocalDateTime created_at;
	// modified_at
	private java.time.LocalDateTime modified_at;
	// version_no
	private Long version_no;
	
}
