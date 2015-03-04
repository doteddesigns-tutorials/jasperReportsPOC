package com.dotedlabs.reports;

import java.util.Collection;
import java.util.Vector;

/**
 * Factory class for creating the data
 * 
 * @author Sandeep K Nair
 * 
 */
public class DataBeanFactory {
	/**
	 * Method that creates the data for the report
	 * 
	 * @return
	 */
	public static Collection<DataBean> getDateBeans() {
		Vector<DataBean> allbeans = new Vector<DataBean>();
		try {
			allbeans.add(new DataBean("Albert Einstein", "Engineer", "Ulm",
					"Germany"));
			allbeans.add(new DataBean("Alfred Hitchcock", "Movie Director",
					"London", "UK"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allbeans;
	}

}
