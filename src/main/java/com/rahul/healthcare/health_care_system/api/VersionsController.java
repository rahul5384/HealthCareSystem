package com.rahul.healthcare.health_care_system.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.rahul.healthcare.healthcare_api_server.api.VersionsApi;
import com.rahul.healthcare.healthcare_api_server.api.dto.VersionDto;

@Controller
public class VersionsController implements VersionsApi{

	@Override
	public ResponseEntity<VersionDto> getVersion() {
		VersionDto version = new VersionDto();
		
		version.setName("HealthCare system");
		version.setVersion("0.0.1");
		
		return ResponseEntity.ok(version);
	}
}