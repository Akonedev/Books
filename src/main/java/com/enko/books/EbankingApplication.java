package com.enko.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

/*@SpringBootApplication

public class EbankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbankingApplication.class, args);
	}

}
*/

@SpringBootApplication
public class EbankingApplication  implements CommandLineRunner {

	@Value("${jwt.secret}")
	private String jwt;
	public static void main(String[] args) {
		SpringApplication.run(EbankingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("property jwt value is: " + jwt);
	}
}
