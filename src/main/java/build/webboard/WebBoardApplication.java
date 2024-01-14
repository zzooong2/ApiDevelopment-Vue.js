package build.webboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@MapperScan(basePackages = "build.webboard.mapper")
@SpringBootApplication
public class WebBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebBoardApplication.class, args);
	}

}
