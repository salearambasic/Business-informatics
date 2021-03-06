package com.project.Businessinformatics.service;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import com.project.Businessinformatics.model.AnalyticalStatement;

import net.sf.jasperreports.engine.JRException;

public interface AnaltyicalStatementService {

	Collection<AnalyticalStatement> getAnalyticalStatements();
	AnalyticalStatement getAnalyticalStatement(Long id);
	
	Collection<AnalyticalStatement> createAnalyticalStatement(String currencyId, 
			  String cityId,
			  String dateOfReceipt,
			  String currencyDate,
			  AnalyticalStatement analyticalStatement) throws DatatypeConfigurationException, JAXBException, ParseException;
	
	Collection<AnalyticalStatement> doTransaction(AnalyticalStatement analyticalStatement) throws JAXBException, DatatypeConfigurationException, ParseException;

	void exportToPdf(Long accountId,Date startDate,Date endDate,HttpServletResponse response) throws  SQLException, IOException, JRException;
	
	void exportToXml(Long accountId,Date start,Date end,HttpServletResponse response) throws  SQLException, IOException, JRException, ParseException;
	
	void delete(Long id);
}
