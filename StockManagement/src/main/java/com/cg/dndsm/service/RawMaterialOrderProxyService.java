package com.cg.dndsm.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.dndsm.model.RawMaterialOrderModel;

public interface RawMaterialOrderProxyService {
	

	@GetMapping("/{orderId}")
	public RawMaterialOrderModel getRawMaterialOrder(@PathVariable(name="orderId") String orderId);
}
