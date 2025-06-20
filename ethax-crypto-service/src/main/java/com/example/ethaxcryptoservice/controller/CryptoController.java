package com.example.ethaxcryptoservice.controller;


import com.example.ethaxcryptoservice.dto.CryptoPriceDTO;
import com.example.ethaxcryptoservice.service.CryptoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/crypto")
public class CryptoController {

    private final CryptoService cryptoService;

    public CryptoController(CryptoService cryptoService) {
        this.cryptoService = cryptoService;
    }

    @GetMapping("/ethax")
    public CryptoPriceDTO getEthaxPrice() {
        return cryptoService.getEthaxPrice();
    }
}

