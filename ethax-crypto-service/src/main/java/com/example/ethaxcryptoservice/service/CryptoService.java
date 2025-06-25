package com.example.ethaxcryptoservice.service;




import com.example.ethaxcryptoservice.dto.CryptoPriceDTO;
import com.example.ethaxcryptoservice.model.CryptoPriceHistory;
import com.example.ethaxcryptoservice.repository.CryptoPriceHistoryRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class CryptoService {

    @Value("${crypto.api-url}")
    private String apiUrl;

    @Value("${crypto.vs-currency}")
    private String vsCurrency;

    @Value("${crypto.token-id}")
    private String tokenId;

    private final RestTemplate restTemplate = new RestTemplate();
    private final CryptoPriceHistoryRepository historyRepository;

    public CryptoService(CryptoPriceHistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

//    @Cacheable("ethax-price")
    public CryptoPriceDTO getEthaxPrice() {
        String url = String.format("%s?vs_currency=%s&ids=%s", apiUrl, vsCurrency, tokenId);
        CryptoPriceDTO[] response = restTemplate.getForObject(url, CryptoPriceDTO[].class);
        if (response != null && response.length > 0) {
            CryptoPriceDTO dto = response[0];

            // Save to DB
            CryptoPriceHistory entity = new CryptoPriceHistory();
            entity.setTokenId(dto.getId());
            entity.setSymbol(dto.getSymbol());
            entity.setCurrentPrice(dto.getCurrent_price());
            entity.setMarketCap(dto.getMarket_cap());
            entity.setPriceChangePercentage24h(dto.getPrice_change_percentage_24h());
            entity.setTimestamp(LocalDateTime.now());
            historyRepository.save(entity);

            return dto;
        }
        return null;
    }
}



