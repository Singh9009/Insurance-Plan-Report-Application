package in.prashant.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
		return repository.getPlanNames();
	}

	@Override
	public List<String> getPlanStatus() {
		return repository.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		CitizenPlan entity = new CitizenPlan();
		
		if(request.getPlanName() !=null && !"".equals(request.getPlanName()))
			entity.setPlanName(request.getPlanName());
		
		if(request.getPlanStatus() !=null && !"".equals(request.getPlanStatus()))
			entity.setPlanStatus(request.getPlanStatus());
		
		if(request.getGender() !=null && !"".equals(request.getGender()))
			entity.setGender(request.getGender());
		
		if(request.getStartDate() != null && !"".equals(request.getStartDate()))
		{
			String startDate = request.getStartDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			//Convert string date to Localdate
			LocalDate date = LocalDate.parse(startDate, formatter);
			entity.setPlanStartDate(date);
		}
		
		if(request.getEndDate() != null && !"".equals(request.getEndDate()))
		{
			String endDate = request.getEndDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			//Convert string date to Localdate
			LocalDate date = LocalDate.parse(endDate, formatter);
			entity.setPlanEndDate(date);
		}
		
		return repository.findAll(Example.of(entity));
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
