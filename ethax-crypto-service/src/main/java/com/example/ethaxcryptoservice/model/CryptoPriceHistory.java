package com.example.ethaxcryptoservice.model;



import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class CryptoPriceHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tokenId;
    private String symbol;
    private double currentPrice;
    private double marketCap;
    private double priceChangePercentage24h;
    private LocalDateTime timestamp;
}

