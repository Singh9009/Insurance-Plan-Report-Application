package in.prashant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.prashant.service.IPlanReportService;

@Controller
public class PlanReportController {

	@Autowired
	private IPlanReportService service;
	
	@GetMapping("/")
	public String showHomePage()
	{
		return "index";
	}
}
