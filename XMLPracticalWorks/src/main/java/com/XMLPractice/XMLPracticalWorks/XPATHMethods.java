package com.XMLPractice.XMLPracticalWorks;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XPATHMethods {

	public static void main(String[] args) {
	try {
		File inputFile = new File("company.xml");
	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder dBuilder;
	
	    dBuilder = dbFactory.newDocumentBuilder();
	
	    Document doc = dBuilder.parse(inputFile);
	    doc.getDocumentElement().normalize();
	
	    XPath xPath =  XPathFactory.newInstance().newXPath();
	    
	    String expression = "company/department/employee[@empId = '005']";
	    
	    tagPresence(expression,xPath,doc);
	   
	
	}catch (ParserConfigurationException e) {
        e.printStackTrace();
     } catch (SAXException e) {
        e.printStackTrace();
     } catch (IOException e) {
        e.printStackTrace();
     } catch (XPathExpressionException e) {
        e.printStackTrace();
     }
}
	
	
	public static void  tagPresence(String expression, XPath xPath, Document doc) throws XPathExpressionException {
	
			NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(
		doc, XPathConstants.NODESET);
		
		    for (int i = 0; i < nodeList.getLength(); i++) {
	            Node nNode = nodeList.item(i);
	            System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("EmployeeId: " 
	                  + eElement.getAttribute("empId"));
	               System.out.println("First Name : " 
	                  + eElement
	                  .getElementsByTagName("firstName")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Last Name : " 
	                  + eElement
	                  .getElementsByTagName("lastName")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("BirthDate : " 
	                  + eElement
	                  .getElementsByTagName("birthDate")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("Position : " 
	                  + eElement
	                  .getElementsByTagName("position")
	                  .item(0)
	                  .getTextContent());
	               for(int temp3 = 0; temp3 < eElement.getElementsByTagName("skill").getLength(); temp3++) {
	      			 System.out.println("Skills: " + eElement.getElementsByTagName("skill").item(temp3).getTextContent());
	      		 }
	            }
	         }
	}
}