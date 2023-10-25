package com.chinook.music;

import com.chinook.music.util.DatabaseInfoPrinter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MusicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MusicApplication.class, args);

		// Fetch and print database info
		DatabaseInfoPrinter databaseInfoPrinter = context.getBean(DatabaseInfoPrinter.class);
		databaseInfoPrinter.printDatabaseInfo();
	}
}