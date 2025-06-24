package com.example.ethaxcryptoservice.dto;




import lombok.Data;
import java.io.Serializable;

@Data
public class CryptoPriceDTO implements Serializable {
    private String id;
    private String symbol;
    private String name;
    private double current_price;
    private double market_cap;
    private double price_change_percentage_24h;
}

