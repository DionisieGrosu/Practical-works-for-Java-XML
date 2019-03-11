package com.XMLPractice.XMLPracticalWorks;

import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class queryDOMXML {
	public static void main(String[] args) {
		  try {
			  Scanner input = new Scanner(System.in);
		         File inputFile = new File("company.xml");
		         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		         Document doc = dBuilder.parse(inputFile);
		         doc.getDocumentElement().normalize();
		         
		         NodeList nEmployee = doc.getElementsByTagName("employee");
		         System.out.println("Enter 0 for exite or any number for continue!");
		         String number = input.nextLine();
		         while(!number.equals("0")) {
		        	 
		         
		         System.out.println("Enter EmpId from 001 to 006!");
		         String empId = input.nextLine();
		         for(int temp = 0; temp < nEmployee.getLength(); temp++) {
		        	 Node Employee = nEmployee.item(temp);
		        	 if(Employee.getNodeType() == Node.ELEMENT_NODE) {
		        		 Element eEmployee = (Element)Employee;
		        		
		        		 
		        		 if(eEmployee.getAttribute("empId").equals(empId)) {
		        			 System.out.println("Current element: " + eEmployee.getAttribute("empId"));
			        		 System.out.println("LastName: " + eEmployee.getElementsByTagName("lastName").item(0).getTextContent());
		            		 System.out.println("FirstName: " + eEmployee.getElementsByTagName("firstName").item(0).getTextContent());
		            		 System.out.println("BirthDate: " + eEmployee.getElementsByTagName("birthDate").item(0).getTextContent());
		            		 System.out.println("Position: " + eEmployee.getElementsByTagName("position").item(0).getTextContent());
		            		 for(int temp3 = 0; temp3 < eEmployee.getElementsByTagName("skill").getLength(); temp3++) {
		            			 System.out.println("Skills: " + eEmployee.getElementsByTagName("skill").item(temp3).getTextContent());
		            		 }
		            		 break;
		        		 }
		        		 
		        	 }
		         }
		         System.out.println();
		         System.out.println("Enter 0 for exite or any number for continue!");
		         number = input.nextLine();
		         }
		  }catch(Exception e) {
			  e.getStackTrace();
		  }
	}
}
