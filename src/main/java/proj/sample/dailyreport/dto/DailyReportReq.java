package proj.sample.dailyreport.dto;

import lombok.Data;

@Data
public class DailyReportReq {
	String subject;
	String body;
	String writer;
	String published_at;
}
