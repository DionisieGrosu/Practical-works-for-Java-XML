package com.XMLPractice.XMLPracticalWorks;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class domParser {


	public static void main(String[] args) {
		try {
		File inputFile = new File("company.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName("department");
        //NodeList nEmployees = doc.getElementsByTagName("employee");
        System.out.println("----------------------------");
        
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element: " + nNode.getNodeName());
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            	 Element eElement = (Element) nNode;
            	 System.out.println("Department name: " + eElement.getAttribute("name"));
            	 System.out.println("DepartmentId: " + eElement.getAttribute("depId"));
            	 //System.out.println("EmployeeId: " + eElement.getChildNodes());
            	 NodeList nEmployees = eElement.getChildNodes();
            	 for(int temp2 = 0; temp2 < nEmployees.getLength(); temp2++) {
            		 Node employee = nEmployees.item(temp2);
            		 if (employee.getNodeType() == Node.ELEMENT_NODE) {
            			 Element eEmployee = (Element)employee;
            		 System.out.println("EmployeeId: " + eEmployee.getAttribute("empId"));
            		 System.out.println("LastName: " + eEmployee.getElementsByTagName("lastName").item(0).getTextContent());
            		 System.out.println("FirstName: " + eEmployee.getElementsByTagName("firstName").item(0).getTextContent());
            		 System.out.println("BirthDate: " + eEmployee.getElementsByTagName("birthDate").item(0).getTextContent());
            		 System.out.println("Position: " + eEmployee.getElementsByTagName("position").item(0).getTextContent());
            		 for(int temp3 = 0; temp3 < eEmployee.getElementsByTagName("skill").getLength(); temp3++) {
            			 System.out.println("Skills: " + eEmployee.getElementsByTagName("skill").item(temp3).getTextContent());
            		 }
            		 System.out.println();
            		
            		 
            		 }
            	 }
            	
            }
            System.out.println("----------------------------");
        }
        
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
