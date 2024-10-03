package in.prashant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.prashant.entity.CitizenPlan;
import in.prashant.repository.CitizenPlanRepository;
import in.prashant.request.SearchRequest;

@Service
public class PlansReportServiceImpl implements IPlanReportService{

	@Autowired
	private CitizenPlanRepository repository;
	
	@Override
	public List<String> getPlanNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPlanStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
