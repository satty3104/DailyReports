package proj.sample.dailyreport.form;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ReportForm {

	// id
	private Integer id;
	// subject：件名
	private String subject;
	// body：本文
	private String body;
	// writer：筆者
	private String writer;
	// published_at：公開日時
	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss.SSS")
	private java.time.LocalDateTime published_at;
	
}
