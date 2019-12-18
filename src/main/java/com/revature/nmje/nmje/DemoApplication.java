package com.revature.nmje.nmje;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.api.services.sheets.v4.model.BatchGetValuesResponse;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		sheetsService = SheetsServiceUtil.getSheetsService();
		List<String> ranges = Arrays.asList("Dec9 - Dec13");
		BatchGetValuesResponse readResult = sheetsService.spreadsheets().values()
				.batchGet(SPREADSHEET_ID)
				.setRanges(ranges)
				.execute();
		System.out.println(readResult.toPrettyString());
	}

}
