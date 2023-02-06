package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	
	public static void generateJvmReport(String jsonPath) {
		
		//1.Mention the target folder location where u want cucumber report
		File f = new File(System.getProperty("user.dir")+"\\target\\Reports\\JVMReport");
		
		//2.Add details to the report using Configuration Class
		Configuration con = new Configuration(f, "Facebook Project");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "102");
		con.addClassifications("OS Name", "Windows");
		con.addClassifications("OS Version", "11");
		con.addClassifications("Sprint Name", "21");
		
		//3..Add json file paths into List<String> 
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);	
		
		//4.Create object for ReportBuilder class
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
	}

}
