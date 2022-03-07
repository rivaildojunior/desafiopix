package com.example.pix.http;

import com.example.pix.model.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://run.mocky.io/v3/85c286b6-e483-420f-9f2b-1ca57ae06c52", name = "cliente")
public interface ClienteHttp {

    @GetMapping
    List<Cliente> getAll();
}
