package com.eldencare.appoimentsystem.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@FeignClient(name = "patient-service")
public interface PatientClient {


    @GetMapping("/api/patients/{id}/exists")
    Boolean patientExists(@PathVariable UUID id);

}
