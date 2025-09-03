package com.eldencare.appoimentsystem.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@FeignClient(name = "doctor-service")
public interface DoctorClient {

    //http://DOCTOR-SERVICE/api/doctors/" + doctorId + "/availability?time=" + time

    @GetMapping("/api/doctors/{id}/availability?time=")
    Boolean doctorAvailable(@PathVariable UUID id, @RequestParam("time") Instant time);

}
