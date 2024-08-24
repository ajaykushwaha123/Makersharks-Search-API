package com.makersharks.Makersharks.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.makersharks.Makersharks.entity.ManufacturingProcess;
import com.makersharks.Makersharks.entity.NatureOfBusiness;
import com.makersharks.Makersharks.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

	List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(String location,
			NatureOfBusiness natureOfBusiness, Set<ManufacturingProcess> manufacturingProcesses);
}

