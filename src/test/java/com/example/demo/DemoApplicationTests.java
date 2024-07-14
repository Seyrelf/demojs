package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		LocalDateTime first = LocalDateTime.of(2010,1,19,1,0,0);
		LocalDateTime second = LocalDateTime.of(2024,12,12,0,0,0);
		Duration duration = Duration.between(first, second);
		System.out.println(duration);
		LocalDateTime end;
		long k = duration.dividedBy(24).dividedBy(366).toHours();
		System.out.println(k);
		List<String> a= new ArrayList<>();
		List<String> b= new ArrayList<>();
		a.add("a");
		b.addAll(a);
		for(int i = 0;i <k;i++){
			end = first.plusYears(1);
			System.out.println(first+ "|" +end);
			first = first.plusYears(1);
			b.addAll(a);
			System.out.println(b);
		}
		System.out.println(first+ "|" +second);


	}

}
