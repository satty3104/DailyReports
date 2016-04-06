CREATE TABLE dailyreports.reports
(
  id int unsigned NOT NULL AUTO_INCREMENT,
  subject varchar(200),
  body varchar(10000),
  writer varchar(100),
  published_at datetime,
  created_at datetime,
  modified_at datetime,
  version_no bigint unsigned DEFAULT 0,
  PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8;
