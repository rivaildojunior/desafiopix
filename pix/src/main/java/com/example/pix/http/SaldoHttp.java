package com.example.pix.http;

import com.example.pix.model.Saldo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(url = "https://run.mocky.io/v3/576770e0-b798-4214-b0be-1e2d0e474368", name = "saldo")
public interface SaldoHttp {

    @GetMapping
    List<Saldo> getSaldo();
}
