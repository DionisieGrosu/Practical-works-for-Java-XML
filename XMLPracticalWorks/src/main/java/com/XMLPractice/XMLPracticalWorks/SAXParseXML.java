package com.XMLPractice.XMLPracticalWorks;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParseXML {

	public static void main(String[] args) {
		try {
			File inputFile = new File("company.xml");
	         SAXParserFactory factory = SAXParserFactory.newInstance();
	         SAXParser saxParser = factory.newSAXParser();
	         SAXHandler userhandler = new SAXHandler();
	         saxParser.parse(inputFile, userhandler);
		}catch (Exception e) {
	         e.printStackTrace();
	         }
}
}

class SAXHandler extends DefaultHandler{
	boolean lastName = false;
	boolean firstName = false;
	boolean birthDate = false;
	boolean position = false;
	boolean skill = false;
	boolean managerId = false;
	
	 @Override
	   public void startElement(String uri, 
	   String localName, String qName, Attributes attributes) throws SAXException {
		 if(qName.equalsIgnoreCase("department")) {
			 String dName = attributes.getValue("name");
			 String dDepId = attributes.getValue("depId");
			 System.out.println();
			 System.out.println("DepartmentId: " + dDepId);
			 System.out.println("Department name: " + dName);
			 System.out.println();
		 }else if(qName.equalsIgnoreCase("employee")) {
			 String eEmpId = attributes.getValue("empId");
			 System.out.println("EmployeeId: " + eEmpId);
		 }else if(qName.equalsIgnoreCase("lastName")) {
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
	   public void endElement(String uri, 
	   String localName, String qName) throws SAXException {
	      if (qName.equalsIgnoreCase("student")) {
	         System.out.println("End Element :" + qName);
	      }
	   }
	 
	 
	 @Override
	   public void characters(char ch[], int start, int length) throws SAXException {
		 if(lastName) {
			 System.out.println("Last Name: " + new String(ch, start, length));
			 lastName = false;
		 }else if(firstName) {
			 System.out.println("First Name: " + new String(ch, start, length));
			 firstName = false;
		 }else if(birthDate) {
			 System.out.println("BirthDate: " + new String(ch, start, length));
			 birthDate = false;
		 }else if(position) {
			 System.out.println("Position: " + new String(ch, start, length));
			 position = false;
		 }else if(skill) {
			 System.out.println("Skill: " + new String(ch, start, length));
			 skill = false;
		 }else if(managerId) {
			 System.out.println("ManagerId: " + new String(ch, start, length));
			 System.out.println();
			 managerId = false;
		 }
		 
	 }
	
}
