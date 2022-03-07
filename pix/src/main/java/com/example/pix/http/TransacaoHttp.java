package com.example.pix.http;

import com.example.pix.model.Transacao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://run.mocky.io/v3/c3bdfbf6-d789-4e52-829c-bddbb886c3be", name = "transacao")
public interface TransacaoHttp {

    @GetMapping
    List<Transacao> getContigencias();
}
