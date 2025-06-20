package com.example.ethaxcryptoservice.dto;



import lombok.Data;

@Data
public class CryptoPriceDTO {
    private String id;
    private String symbol;
    private String name;
    private double current_price;
    private double market_cap;
    private double price_change_percentage_24h;
}

