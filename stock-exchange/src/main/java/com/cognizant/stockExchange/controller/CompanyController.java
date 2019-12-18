package com.cognizant.stockExchange.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.stockExchange.exception.CompanyNotFoundException;
import com.cognizant.stockExchange.model.CompanyEntity;
import com.cognizant.stockExchange.service.StockExchangeService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private StockExchangeService stockExchangeService;
	

	@PostMapping("/addCompany")
	public void addCompaniesList(@RequestBody @Valid CompanyEntity company) throws Exception {
		stockExchangeService.addCompaniesList(company);
	}
	
	@GetMapping()
	public List<CompanyEntity> getCompaniesList () throws CompanyNotFoundException {
			return stockExchangeService.getCompaniesList();
	}	
	
	@GetMapping("/{id}")
	public List<CompanyEntity> getCompanyById (@PathVariable int id) throws Exception {
			return stockExchangeService.getCompanyById(id);
	}
	
	
	@PutMapping
	public void modifyCompany(@RequestBody CompanyEntity company) {
		stockExchangeService.modifyCompany(company);
	}
}
