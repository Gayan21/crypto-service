package com.example.ethaxcryptoservice.repository;



import com.example.ethaxcryptoservice.model.CryptoPriceHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CryptoPriceHistoryRepository extends JpaRepository<CryptoPriceHistory, Long> {
}
