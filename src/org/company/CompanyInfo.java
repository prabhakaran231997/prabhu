package org.company;

public class CompanyInfo {
	private void companyname() {
		System.out.println("GreensTech");
	}

	private void companyid() {
		System.out.println("7857645646");
	}

	private void companyaddress() {
		System.out.println("chennai");
	}

	public static void main(String[] args) {
		CompanyInfo course = new CompanyInfo();
		course.companyname();
		course.companyid();
		course.companyaddress();
	}
}
