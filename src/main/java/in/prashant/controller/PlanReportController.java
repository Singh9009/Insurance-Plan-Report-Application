package in.prashant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.prashant.entity.CitizenPlan;
import in.prashant.request.SearchRequest;
import in.prashant.service.IPlanReportService;

@Controller
public class PlanReportController {

	@Autowired
	private IPlanReportService service;
	
	@GetMapping("/")
	public String showHomePage(Model model)
	{		
		model.addAttribute("searchmodel", new SearchRequest());
		init(model);
		return "index";
	}

	private void init(Model model) {
//		SearchRequest searchObj = new SearchRequest();
//		model.addAttribute("modelSearch", searchObj); //model.addAttribute("search", new SearchRequest());
		model.addAttribute("names", service.getPlanNames());
		model.addAttribute("status", service.getPlanStatus());
	}
	
	@PostMapping("/search")
	public String searchHandler(@ModelAttribute("searchmodel") SearchRequest search, Model model)
	{
		List<CitizenPlan> citizenList =  service.search(search);
		model.addAttribute("citizenList",citizenList);
		init(model);
		return "index";
	}
}
