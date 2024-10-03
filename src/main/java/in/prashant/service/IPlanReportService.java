package in.prashant.service;

import java.util.List;

import in.prashant.entity.CitizenPlan;
import in.prashant.request.SearchRequest;

public interface IPlanReportService{

	public List<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();
	
}
