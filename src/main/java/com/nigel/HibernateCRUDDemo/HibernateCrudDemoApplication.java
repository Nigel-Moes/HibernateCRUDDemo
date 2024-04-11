package com.nigel.HibernateCRUDDemo;

import com.nigel.HibernateCRUDDemo.dao.AppDAO;
import com.nigel.HibernateCRUDDemo.entity.Instructor;
import com.nigel.HibernateCRUDDemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateCrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return runner -> createInstrutor(appDAO);
	}

	private void createInstrutor(AppDAO appDAO) {

		/*

		// create the instructor
		Instructor tempInstructor = new Instructor("Nigel", "Moes", "nigel@moes.com");

		// create the instructor detail
		InstructorDetail tempInstructorDetail = new InstructorDetail(
				"http://www.luv2code.com/youtube",
				"Triathlon");

		 */

		// create the instructor
		Instructor tempInstructor = new Instructor("Juan", "Valdez", "diego@valdez.com");

		// create the instructor detail
		InstructorDetail tempInstructorDetail = new InstructorDetail(
				"http://www.luv2code.com/youtube",
				"Guitar");

		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// save the instructor
		System.out.println("Saving instructor: " + tempInstructor);
		appDAO.save(tempInstructor);

		System.out.println("Done!");
	}

}
