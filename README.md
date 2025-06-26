# 💱 ETHAX Crypto Microservice

A simple Spring Boot microservice that fetches real-time ETHAX cryptocurrency data from the CoinGecko API and exposes it through a REST endpoint. It also integrates with **Redis** for caching and **PostgreSQL** for persistent storage.

---

## 🚀 Features

- ✅ REST API to fetch live ETHAX price data
- ✅ Data cached using **Redis** for performance
- ✅ Fetched data persisted in **PostgreSQL**
- ✅ Built with Java 17 and Spring Boot
- ✅ Docker-ready setup

---

## 📦 Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Cache
- Redis
- PostgreSQL
- Lombok
- Maven
- CoinGecko API

---

## 🔧 Setup Instructions

### 1️⃣ Clone the Project

```bash
git clone https://github.com/your-username/ethax-crypto-service.git
cd ethax-crypto-service

# Run Redis
docker run --name redis -p 6379:6379 -d redis

# Run PostgreSQL
docker run --name postgres -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=ethax_db -p 5432:5432 -d postgres
