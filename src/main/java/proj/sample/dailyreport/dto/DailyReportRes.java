package proj.sample.dailyreport.dto;

import lombok.Data;

@Data
public class DailyReportRes {
	int id;
	String subject;
	String body;
	String writer;
	String published_at;
}
