package com.leuw.neuedareview.service;

import com.leuw.neuedareview.model.Company;
import com.leuw.neuedareview.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> findAllCompanies(){
        return this.companyRepository.findAll();
    }
    public Company saveCompany(Company company){
        return this.companyRepository.save(company);
    }
    public List<Company> findAllCompaniesOrderedBySales(){
        return this.companyRepository.findAllByOrderBySalesDesc();
    }
}
