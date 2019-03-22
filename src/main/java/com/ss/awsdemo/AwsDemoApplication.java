package com.ss.awsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class AwsDemoApplication{
//public class AwsDemoApplication implements CommandLineRunner {

	
	//@Autowired
	//private StudentRepository studentRepository;

	public static void main(String[] args) {
		//SpringApplication app = new SpringApplication(AwsDemoApplication.class);
		//app.run(args);
		SpringApplication.run(AwsDemoApplication.class, args);
	}
	
	//@Override
    //public void run(String... arg0) throws IOException, URISyntaxException {
	//	System.out.println(studentRepository);
	//	studentRepository.findAll().forEach(System.out::println);
    //}

}