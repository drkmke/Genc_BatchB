package com.cognizant.stockExchange.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.stockExchange.exception.CompanyNotFoundException;
import com.cognizant.stockExchange.model.CompanyEntity;
import com.cognizant.stockExchange.model.StockEntity;
import com.cognizant.stockExchange.repository.CompanyRepository;
import com.cognizant.stockExchange.repository.StockRepository;
@Service
public class StockExchangeService {


	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	StockRepository stockRepository;
	
	public void addCompaniesList(CompanyEntity company) throws Exception {
		if(company.getName() == null ) {
			System.out.println("inside exception");
		throw new Exception();
		}
		else {
			System.out.println("outside exception");
			companyRepository.save(company);
		}
		
	}

	public void addStock(StockEntity stock) throws Exception {
		if(stock.getStockExchange() == null ) {
			System.out.println("inside exception");
			throw new Exception();
			}
			else {
				stockRepository.save(stock);
			}
			
		
	}

	public List<CompanyEntity> getCompaniesList()  throws CompanyNotFoundException{
		List<CompanyEntity> c =companyRepository.findAll();
		System.out.println(c);
		if (c.size() == 0) {
			
			System.out.println("inside exception");
			throw new CompanyNotFoundException();
			}
		else
		{
			System.out.println("outside exception");
			return c;
		}
	}

	public List<StockEntity> getStockList() throws Exception{
		List<StockEntity> c =stockRepository.findAll();
		System.out.println(c);
		if (c.size() == 0) {
			
			System.out.println("inside exception");
			throw new Exception();
			}
		else
		{
			System.out.println("outside exception");
			return c;
		}
	}

	public void modifyCompany(CompanyEntity company) {		
			companyRepository.save(company);

		}

	public List<CompanyEntity> getCompanyById(int id) throws Exception{
		List<CompanyEntity> c =companyRepository.findById(id);
		System.out.println(c);
		if (c.size() == 0) {
			
			System.out.println("inside exception");
			throw new CompanyNotFoundException();
			}
		else
		{
			System.out.println("outside exception in yhjy");
			return c;
		}
	}
		
	}


