package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping("/add")
	public void createEmployee(){
		System.out.println("In Create Employee");
	}
}
