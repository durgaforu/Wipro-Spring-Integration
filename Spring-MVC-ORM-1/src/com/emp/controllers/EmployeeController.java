package com.emp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.emp.dao.ListProductDao;
import com.emp.dao.entities.Product;
import com.emp.service.EmployeeService;

@Controller
public class EmployeeController {

	//@Autowired
	//private ListProductDao prodDaoImpl;
	
	@Autowired
	private EmployeeService empService;
	
	
	
	@RequestMapping("listProds.htm")
	public ModelAndView listProducts() {

		ModelAndView mav = new ModelAndView();

		//List<Product> prods= prodDaoImpl.listProds();
		
		//mav.addObject("products", prods);
		empService.test();
		mav.setViewName("Products");
		
		return mav;
	}

	@RequestMapping(value = "/one.htm")
	public void f1() {
		System.out.println("---- f1 method of EmployeeController");
	}

	@RequestMapping(value = "/two.htm")
	public String f2() {
		System.out.println("---- f2 method of EmployeeController");
		return "Disp";
	}

	@RequestMapping(value = "/thr.htm")
	public ModelAndView f3() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("empName", "Richards");
		mav.addObject("city", "Hyderabad");

		mav.setViewName("Test");

		return mav;

	}

	@RequestMapping("/saveEmp.htm")
	public ModelAndView saveEmployee(@RequestParam("empId") String empId, @RequestParam("empName") String empName,
			@RequestParam("salary") double sal) {
		ModelAndView mav = new ModelAndView();
		Employee emp = new Employee();

		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setSalary(sal);

		mav.addObject("employee", emp);
		mav.setViewName("EmpDisp");

		return mav;
	}

	@RequestMapping("/saveEmp_v1.htm")
	public ModelAndView saveEmployee_v1(@ModelAttribute("ee") Employee emp) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("employee", emp);
		mav.setViewName("EmpDisp");

		return mav;
	}

}
