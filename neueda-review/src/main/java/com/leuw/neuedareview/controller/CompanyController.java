package com.leuw.neuedareview.controller;

import com.leuw.neuedareview.model.Company;
import com.leuw.neuedareview.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping
    public Company createEmployee(@RequestBody Company employee) {
        return companyService.saveCompany(employee);
    }

    @GetMapping
    public List<Company> getAllEmployees() {
        return companyService.findAllCompanies();
    }

    @GetMapping("/orderedBySales")
    public List<Company> getEmployeeById() {
        return this.companyService.findAllCompaniesOrderedBySales();
    }
}
