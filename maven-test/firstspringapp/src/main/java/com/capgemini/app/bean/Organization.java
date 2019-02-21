package com.capgemini.app.bean;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Organization {
	private int orgId;
	private String name;
	private Set<String> cities;
	private List<String> boardMembers;
	private Map<String, String> branchManagers;
	private LocalDate dateOfEstablishment;
	private double shareValue;
	private boolean listed;
	private Properties ipAddresses;

	public Organization() {
		super();
	}

	public Organization(int orgId, String name) {
		super();
		this.orgId = orgId;
		this.name = name;
	}

	public List<String> getBoardMembers() {
		System.out.println("Board Members are: " + boardMembers);
		return boardMembers;
	}

	public Map<String, String> getBranchManagers() {
		System.out.println("Branch Managers are:" + branchManagers);
		return branchManagers;
	}

	public Set<String> getCities() {
		System.out.println("Cities= " + cities);
		return cities;
	}

	public LocalDate getDateOfEstablishment() {
		System.out.println("Date of Estableshment : " + dateOfEstablishment);
		return dateOfEstablishment;
	}

	public Properties getIpAddresses() {
		System.out.println("IPAddresses: " + ipAddresses);
		return ipAddresses;
	}

	public String getName() {
		System.out.println("Organization Name= " + name);
		return name;
	}

	public int getOrgId() {
		System.out.println("Organization Id=" + orgId);
		return orgId;
	}

	public double getShareValue() {
		System.out.println("ShareValue =" + shareValue);
		return shareValue;
	}

	public boolean isListed() {
		System.out.println("Company is Listed: " + listed);
		return listed;
	}

	public void setBoardMembers(List<String> boardMembers) {
		this.boardMembers = boardMembers;
	}

	public void setBranchManagers(Map<String, String> branchManagers) {
		this.branchManagers = branchManagers;
	}

	public void setCities(Set<String> cities) {
		this.cities = cities;
	}

	public void setDateOfEstablishment(LocalDate dateOfEstablishment) {
		this.dateOfEstablishment = dateOfEstablishment;
	}

	public void setIpAddresses(Properties ipAddresses) {
		this.ipAddresses = ipAddresses;
	}

	public void setListed(boolean listed) {
		this.listed = listed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public void setShareValue(double shareValue) {
		this.shareValue = shareValue;
	}

	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", name=" + name + ", cities=" + cities + ", boardMembers="
				+ boardMembers + ", branchManagers=" + branchManagers + ", dateOfEstablishment=" + dateOfEstablishment
				+ ", shareValue=" + shareValue + ", listed=" + listed + ", ipAddresses=" + ipAddresses + "]";
	}
}