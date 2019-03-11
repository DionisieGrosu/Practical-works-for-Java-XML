package com.XMLPractice.XMLPracticalWorks;

import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class querySAXXML {
	 public static void main(String[] args) {

	      try {
	         File inputFile = new File("company.xml");
	         SAXParserFactory factory = SAXParserFactory.newInstance();
	         SAXParser saxParser = factory.newSAXParser();
	         Scanner input = new Scanner(System.in);
		     	System.out.println("Enter 0 for exite or any number for continue!");
		     	 String proverca = input.nextLine();
		     	while(!proverca.equals("0")) {
		     		 System.out.println("Enter EmpId from 001 to 006!");
			         String empId = input.nextLine();	
	         queryHandler userhandler = new queryHandler(empId);
	         saxParser.parse(inputFile, userhandler);  
	         System.out.println("Enter 0 for exite or any number for continue!");
	     	 proverca = input.nextLine();
	     	 }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   } 
}


class queryHandler extends DefaultHandler{
	boolean lastName = false;
	boolean firstName = false;
	boolean birthDate = false;
	boolean position = false;
	boolean skill = false;
	boolean managerId = false;
	String empId;
	String inputEmpId;
	public queryHandler(String inputEmpId) {
		this.inputEmpId = inputEmpId;
	}
	
	
	@Override
	   public void startElement(
	      String uri, String localName, String qName, Attributes attributes)
	      throws SAXException {
		
		
		if (qName.equalsIgnoreCase("employee")) {
			empId = attributes.getValue("empId");
	      }
		 if((inputEmpId).equals(empId) && qName.equalsIgnoreCase("employee")) {
			 System.out.println("EmployeeId: " + empId);
			 System.out.println("Start element: " + qName);
		 }
		 
		 if(qName.equalsIgnoreCase("lastName")) {
			 lastName = true;
		 }else if(qName.equalsIgnoreCase("firstName")) {
			 firstName = true;
		 }else if(qName.equalsIgnoreCase("birthDate")) {
			 birthDate = true;
		 }else if(qName.equalsIgnoreCase("position")) {
			 position = true;
		 }else if(qName.equalsIgnoreCase("skill")) {
			 skill = true;
		 }else if(qName.equalsIgnoreCase("managerId")) {
			 managerId = true;
		 }
		
		 
	 }
	 
	 @Override
	   public void characters(char ch[], int start, int length) throws SAXException {
		 if(lastName && (inputEmpId).equals(empId)) {
			 System.out.println("Last Name: " + new String(ch, start, length));
			 lastName = false;
		 }else if(firstName && (inputEmpId).equals(empId)) {
			 System.out.println("First Name: " + new String(ch, start, length));
			 firstName = false;
		 }else if(birthDate && (inputEmpId).equals(empId)) {
			 System.out.println("BirthDate: " + new String(ch, start, length));
			 birthDate = false;
		 }else if(position && (inputEmpId).equals(empId)) {
			 System.out.println("Position: " + new String(ch, start, length));
			 position = false;
		 }else if(skill && (inputEmpId).equals(empId)) {
			 System.out.println("Skill: " + new String(ch, start, length));
			 skill = false;
		 }else if(managerId && (inputEmpId).equals(empId)) {
			 System.out.println("ManagerId: " + new String(ch, start, length));
			 managerId = false;
		 }
		 
	 }
	 }
	 

