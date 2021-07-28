package com.example.onetomanydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyUniApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyUniApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner mappingDemo(UniversityRepository universityRepository,
										 StudentRepository studentRepository) {
		return args -> {

			Student student=new Student(1L,"Subhranshu Mishra");
			Student student1=new Student(2L,"Deepak Raghuwanshi");
			List<Student> studentList=new ArrayList<>();
			studentList.add(student);
			studentList.add(student1);
			//studentRepository.save(new Student(1L,"Subhranshu Mishra"))
			//studentRepository.save(new Student(2L,"Deepak Raghuwanshi"));
			University university =new University("BPUT","01th Jan 1990",studentList);
			universityRepository.save(university);

		};
	}*/
}

