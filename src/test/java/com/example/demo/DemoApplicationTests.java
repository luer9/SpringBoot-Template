package com.example.demo;

import com.example.demo.pojo.Dog;
import com.example.demo.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private Dog dog;
	@Autowired
	private Person person;
	@Test
	void contextLoads() {
		System.out.println(dog);
		System.out.println(person);
	}

}
