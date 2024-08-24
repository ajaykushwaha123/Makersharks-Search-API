package com.makersharks.Makersharks.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makersharks.Makersharks.entity.ManufacturingProcess;
import com.makersharks.Makersharks.entity.NatureOfBusiness;
import com.makersharks.Makersharks.entity.Supplier;
import com.makersharks.Makersharks.repository.SupplierRepository;

@Service
public class SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;

	public List<Supplier> searchSuppliers(String location, NatureOfBusiness natureOfBusiness,
			Set<ManufacturingProcess> manufacturingProcesses) {
		return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(location,
				natureOfBusiness, manufacturingProcesses);
	}
}
