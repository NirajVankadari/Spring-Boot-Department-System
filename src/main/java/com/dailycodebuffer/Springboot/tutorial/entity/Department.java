package com.dailycodebuffer.Springboot.tutorial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
	
	@NotBlank(message = "Please Add Department Name")
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
//	public Long getDepartmentId() {
//		return departmentId;
//	}
//	public void setDepartmentId(Long departmentId) {
//		this.departmentId = departmentId;
//	}
//	public String getDepartmentName() {
//		return departmentName;
//	}
//	public void setDepartmentName(String departmentName) {
//		this.departmentName = departmentName;
//	}
//	public String getDepartmentAddress() {
//		return departmentAddress;
//	}
//	public void setDepartmentAddress(String departmentAddress) {
//		this.departmentAddress = departmentAddress;
//	}
//	public String getDepartmentCode() {
//		return departmentCode;
//	}
//	public void setDepartmentCode(String departmentCode) {
//		this.departmentCode = departmentCode;
//	}
//	public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
//		super();
//		this.departmentId = departmentId;
//		this.departmentName = departmentName;
//		this.departmentAddress = departmentAddress;
//		this.departmentCode = departmentCode;
//	}
//	public Department() {
//		super();
//	}
//	@Override
//	public String toString() {
//		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
//				+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
//	}
	
	
}
