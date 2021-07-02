package edu.utn.meter.measurementsender;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="receiver" , url = "http://localhost:8080")
public interface MeasurementClient {

    @RequestMapping(method = RequestMethod.POST, value = "/api/receiver")
    @Headers("Content-Type: application/json")
    void create(MeasurementDto dto);
}
