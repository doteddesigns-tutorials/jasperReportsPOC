package com.dotedlabs.reports;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 * This class will run the reporting engine
 * to create the report that is specified
 * 
 * @author Sandeep K Nair
 *
 */
public class Reporter {

	public static void main(String[] args) throws Exception {
		// Import the jxml file for creating the template
		InputStream inputStream = new FileInputStream("sampleJR.jrxml");

		//Get the data from the bean factory
		Collection<DataBean> dataBeanList = DataBeanFactory.getDateBeans();

		// Create a bean collection data-source to populate in the report
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(
				dataBeanList);
		Map<Object, Object> parameters = new HashMap<Object, Object>();

		JasperDesign jasperDesign = JRXmlLoader.load(inputStream);

		JasperReport jasperReport = JasperCompileManager
				.compileReport(jasperDesign);

		// Compiling the Jasper report to jasper file
		JasperCompileManager.compileReportToFile("sampleJR.jrxml",
				"sampleJR_compiled.jasper");

		// Create the Jasper print object that is used to create the file
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
				parameters, beanColDataSource);

		// Saving the Jasper report as PDF
		JasperExportManager.exportReportToPdfFile(jasperPrint,
				"test_jasper.pdf");

		// GUI Jasper viewer to show the report generated
		JasperViewer.viewReport(jasperPrint);

		System.out.println("Report has been generated!!!");
	}
}
