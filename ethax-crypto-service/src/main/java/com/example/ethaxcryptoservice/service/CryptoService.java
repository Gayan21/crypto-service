package com.example.ethaxcryptoservice.service;




import com.example.ethaxcryptoservice.dto.CryptoPriceDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CryptoService {

    @Value("${crypto.api-url}")
    private String apiUrl;

    @Value("${crypto.vs-currency}")
    private String vsCurrency;

    @Value("${crypto.token-id}")
    private String tokenId;

    private final RestTemplate restTemplate = new RestTemplate();

    public CryptoPriceDTO getEthaxPrice() {
        String url = String.format("%s?vs_currency=%s&ids=%s", apiUrl, vsCurrency, tokenId);
        CryptoPriceDTO[] response = restTemplate.getForObject(url, CryptoPriceDTO[].class);
        return (response != null && response.length > 0) ? response[0] : null;
    }
}

