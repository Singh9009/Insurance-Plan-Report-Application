package in.prashant.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="CITIZEN_PLANS_INFO")
public class CitizenPlan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	@Column(length = 20)
	private String citizenName;
	@Column(length = 6)
	private String gender;
	@Column(length = 20)
	private String planName;
	@Column(length = 20)
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private Double benefitAmount;
	@Column(length = 20)
	private String denialReason;
	private LocalDate terminatedDate;
	@Column(length = 20)
	private String terminationReason;
	
	
}

