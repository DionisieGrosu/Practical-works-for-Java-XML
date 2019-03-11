package com.XMLPractice.XMLPracticalWorks;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXMLFile {

	public static void main(String[] args) {
		try {
					DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			        Document doc = dBuilder.newDocument();
			        
			        Element rootElement = doc.createElement("company");
			        doc.appendChild(rootElement);
			        
			        Element department = doc.createElement("department");
			        rootElement.appendChild(department);
			        Attr attrName = doc.createAttribute("name");
			        attrName.setValue("Development");
			        Attr attrDepId = doc.createAttribute("depId");
			        attrDepId.setValue("1");
			        department.setAttributeNode(attrName);
			        department.setAttributeNode(attrDepId);
			        
			        Element employee = doc.createElement("employee");
			        department.appendChild(employee);
			        Attr attrEmpId = doc.createAttribute("empId");
			        attrEmpId.setValue("001");
			        employee.setAttributeNode(attrEmpId);
			        
			        Element lastName = doc.createElement("lastName");
			        lastName.appendChild(doc.createTextNode("Smith"));
			        employee.appendChild(lastName);
			        
			        Element firstName = doc.createElement("firstName");
			        firstName.appendChild(doc.createTextNode("Liam"));
			        employee.appendChild(firstName);
			        
			        Element birthDate = doc.createElement("birthDate");
			        birthDate.appendChild(doc.createTextNode("02.12.1990"));
			        employee.appendChild(birthDate);
			        
			        Element position = doc.createElement("position");
			        position.appendChild(doc.createTextNode("Department Manager"));
			        employee.appendChild(position);
			        
			        Element skills = doc.createElement("skills");
			        employee.appendChild(skills);
			        
			        Element skill = doc.createElement("skill");
			        skill.appendChild(doc.createTextNode("Communication"));
			        skills.appendChild(skill);
			        
			        Element skill2 = doc.createElement("skill");
			        skill2.appendChild(doc.createTextNode("Java"));
			        skills.appendChild(skill2);
			        
			        Element managerId = doc.createElement("managerId");
			        managerId.appendChild(doc.createTextNode("0"));
			        employee.appendChild(managerId);
			        
			        
			        
			        Element employee2 = doc.createElement("employee");
			        department.appendChild(employee2);
			        Attr attrEmpId2 = doc.createAttribute("empId");
			        attrEmpId2.setValue("002");
			        employee2.setAttributeNode(attrEmpId2);
			      
			        Element lastName2 = doc.createElement("lastName");
			        lastName2.appendChild(doc.createTextNode("Johnson"));
			        employee2.appendChild(lastName2);
			        
			        Element firstName2 = doc.createElement("firstName");
			        firstName2.appendChild(doc.createTextNode("Logan"));
			        employee2.appendChild(firstName2);
			        
			        Element birthDate2 = doc.createElement("birthDate");
			        birthDate2.appendChild(doc.createTextNode("10.03.1993"));
			        employee2.appendChild(birthDate2);
			        
			        Element position2 = doc.createElement("position");
			        position2.appendChild(doc.createTextNode("Developer"));
			        employee2.appendChild(position2);
			        
			        Element skills2 = doc.createElement("skills");
			        employee2.appendChild(skills2);
			        
			        Element skill3 = doc.createElement("skill");
			        skill3.appendChild(doc.createTextNode("C++"));
			        skills2.appendChild(skill3);
			        
			        Element skill4 = doc.createElement("skill");
			        skill4.appendChild(doc.createTextNode("Phyton"));
			        skills2.appendChild(skill4);
			        
			        Element skill5 = doc.createElement("skill");
			        skill5.appendChild(doc.createTextNode("Java"));
			        skills2.appendChild(skill5);
			        
			        Element managerId2 = doc.createElement("managerId");
			        managerId2.appendChild(doc.createTextNode("001"));
			        employee2.appendChild(managerId2);
			        
			        
			        
			        Element employee3 = doc.createElement("employee");
			        department.appendChild(employee3);
			        Attr attrEmpId3 = doc.createAttribute("empId");
			        attrEmpId3.setValue("003");
			        employee3.setAttributeNode(attrEmpId3);
			      
			        Element lastName3 = doc.createElement("lastName");
			        lastName3.appendChild(doc.createTextNode("Davis"));
			        employee3.appendChild(lastName3);
			        
			        Element firstName3 = doc.createElement("firstName");
			        firstName3.appendChild(doc.createTextNode("Lucas"));
			        employee3.appendChild(firstName3);
			        
			        Element birthDate3 = doc.createElement("birthDate");
			        birthDate3.appendChild(doc.createTextNode("25.06.1994"));
			        employee3.appendChild(birthDate3);
			        
			        Element position3 = doc.createElement("position");
			        position3.appendChild(doc.createTextNode("Tester"));
			        employee3.appendChild(position3);
			        
			        Element skills3 = doc.createElement("skills");
			        employee3.appendChild(skills3);
			        
			        Element skill6 = doc.createElement("skill");
			        skill6.appendChild(doc.createTextNode("Manual Testing"));
			        skills3.appendChild(skill6);
			        
			        Element skill7 = doc.createElement("skill");
			        skill7.appendChild(doc.createTextNode("Automation Testing"));
			        skills3.appendChild(skill7);
			        
			        Element skill8 = doc.createElement("skill");
			        skill8.appendChild(doc.createTextNode("Java"));
			        skills3.appendChild(skill8);
			        
			        Element managerId3 = doc.createElement("managerId");
			        managerId3.appendChild(doc.createTextNode("001"));
			        employee3.appendChild(managerId3);
			        
			        
			        
			        
			        Element department2 = doc.createElement("department");
			        rootElement.appendChild(department2);
			        Attr attrName2 = doc.createAttribute("name");
			        attrName2.setValue("Accounting");
			        department2.setAttributeNode(attrName2);
			        Attr attrdepId2 = doc.createAttribute("depId");
			        attrdepId2.setValue("2");
			        department2.setAttributeNode(attrdepId2);
			        
			        Element employee4 = doc.createElement("employee");
			        department2.appendChild(employee4);
			        Attr attrEmpId4 = doc.createAttribute("empId");
			        attrEmpId4.setValue("004");
			        employee4.setAttributeNode(attrEmpId4);
			        
			        Element lastName4 = doc.createElement("lastName");
			        lastName4.appendChild(doc.createTextNode("Taylor"));
			        employee4.appendChild(lastName4);
			        
			        Element firstName4 = doc.createElement("firstName");
			        firstName4.appendChild(doc.createTextNode("Jacob"));
			        employee4.appendChild(firstName4);
			        
			        Element birthDate4 = doc.createElement("birthDate");
			        birthDate4.appendChild(doc.createTextNode("22.09.1995"));
			        employee4.appendChild(birthDate4);
			        
			        Element position4 = doc.createElement("position");
			        position4.appendChild(doc.createTextNode("Department Manager"));
			        employee4.appendChild(position4);
			        
			        Element skills4 = doc.createElement("skills");
			        employee4.appendChild(skills4);
			        
			        Element skill9 = doc.createElement("skill");
			        skill9.appendChild(doc.createTextNode("Communication"));
			        skills4.appendChild(skill9);
			        
			        Element skill10 = doc.createElement("skill");
			        skill10.appendChild(doc.createTextNode("Accounting"));
			        skills4.appendChild(skill10);
			        
			        Element managerId4 = doc.createElement("managerId");
			        managerId4.appendChild(doc.createTextNode("0"));
			        employee4.appendChild(managerId4);
			        
			        
			        
			        Element employee5 = doc.createElement("employee");
			        department2.appendChild(employee5);
			        Attr attrEmpId5 = doc.createAttribute("empId");
			        attrEmpId5.setValue("005");
			        employee5.setAttributeNode(attrEmpId5);
			      
			        Element lastName5 = doc.createElement("lastName");
			        lastName5.appendChild(doc.createTextNode("Harris"));
			        employee5.appendChild(lastName5);
			        
			        Element firstName5 = doc.createElement("firstName");
			        firstName5.appendChild(doc.createTextNode("Luke"));
			        employee5.appendChild(firstName5);
			        
			        Element birthDate5 = doc.createElement("birthDate");
			        birthDate5.appendChild(doc.createTextNode("20.11.1992"));
			        employee5.appendChild(birthDate5);
			        
			        Element position5 = doc.createElement("position");
			        position5.appendChild(doc.createTextNode("Accountant"));
			        employee5.appendChild(position5);
			        
			        Element skills5 = doc.createElement("skills");
			        employee5.appendChild(skills5);
			        
			        Element skill11 = doc.createElement("skill");
			        skill11.appendChild(doc.createTextNode("Accounting"));
			        skills5.appendChild(skill11);
			        
			        Element skill12 = doc.createElement("skill");
			        skill12.appendChild(doc.createTextNode("Business and Management"));
			        skills5.appendChild(skill12);
			        
			        Element skill13 = doc.createElement("skill");
			        skill13.appendChild(doc.createTextNode("Legal Right"));
			        skills5.appendChild(skill13);
			        
			        Element managerId5 = doc.createElement("managerId");
			        managerId5.appendChild(doc.createTextNode("004"));
			        employee5.appendChild(managerId5);
			        
			        
			        
			        Element employee6 = doc.createElement("employee");
			        department2.appendChild(employee6);
			        Attr attrEmpId6 = doc.createAttribute("empId");
			        attrEmpId6.setValue("006");
			        employee6.setAttributeNode(attrEmpId6);
			      
			        Element lastName6 = doc.createElement("lastName");
			        lastName6.appendChild(doc.createTextNode("Bennett"));
			        employee6.appendChild(lastName6);
			        
			        Element firstName6 = doc.createElement("firstName");
			        firstName6.appendChild(doc.createTextNode("Ellie"));
			        employee6.appendChild(firstName6);
			        
			        Element birthDate6 = doc.createElement("birthDate");
			        birthDate6.appendChild(doc.createTextNode("19.10.1990"));
			        employee6.appendChild(birthDate6);
			        
			        Element position6 = doc.createElement("position");
			        position6.appendChild(doc.createTextNode("Secretary"));
			        employee6.appendChild(position6);
			        
			        Element skills6 = doc.createElement("skills");
			        employee6.appendChild(skills6);
			        
			        Element skill14 = doc.createElement("skill");
			        skill14.appendChild(doc.createTextNode("Beautiful"));
			        skills6.appendChild(skill14);
			        
			        Element skill15 = doc.createElement("skill");
			        skill15.appendChild(doc.createTextNode("Automation Testing"));
			        skills6.appendChild(skill5);
			        
			        Element skill16 = doc.createElement("skill");
			        skill16.appendChild(doc.createTextNode("Java"));
			        skills6.appendChild(skill6);
			        
			        Element managerId6 = doc.createElement("managerId");
			        managerId6.appendChild(doc.createTextNode("004"));
			        employee6.appendChild(managerId6);
			       
			        
			        TransformerFactory transformerFactory = TransformerFactory.newInstance();
			         Transformer transformer = transformerFactory.newTransformer();
			         DOMSource source = new DOMSource(doc);
			         StreamResult result = new StreamResult(new File("company.xml"));
			         transformer.transform(source, result);
			        
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
