package com.makersharks.Makersharks.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.makersharks.Makersharks.entity.ManufacturingProcess;
import com.makersharks.Makersharks.entity.NatureOfBusiness;
import com.makersharks.Makersharks.entity.Supplier;
import com.makersharks.Makersharks.service.SupplierService;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

	@Autowired
	private SupplierService supplierService;

	@PostMapping("/query")
	public ResponseEntity<List<Supplier>> querySuppliers(@RequestParam String location,
			@RequestParam NatureOfBusiness natureOfBusiness,
			@RequestParam Set<ManufacturingProcess> manufacturingProcesses) {
		List<Supplier> suppliers = supplierService.searchSuppliers(location, natureOfBusiness, manufacturingProcesses);
		return ResponseEntity.ok(suppliers);
	}
}

