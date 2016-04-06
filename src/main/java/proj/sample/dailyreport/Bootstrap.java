package proj.sample.dailyreport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

import proj.sample.dbflute.allcommon.DBFluteBeansJavaConfig;

@SpringBootApplication
@EnableAsync
@Import({DBFluteBeansJavaConfig.class})
public class Bootstrap {

  public static void main(String[] args) {
    SpringApplication.run(Bootstrap.class, args);
  }
}
