# 🚀 Mühendis Yönetim Sistemi (Engineer Management System)

Bu proje, Spring Boot mimarisi kullanılarak geliştirilmiş, uçtan uca (Full Stack) bir personel yönetim sistemidir. Veritabanı olarak PostgreSQL kullanılmış, Clean Architecture prensiplerine dikkat edilmiştir.

## 🛠️ Kullanılan Teknolojiler

* **Backend:** Java 17, Spring Boot 3.3.0
* **Veritabanı:** PostgreSQL
* **ORM:** Hibernate / Spring Data JPA
* **Frontend:** HTML5, Bootstrap 5, JavaScript (Fetch API)
* **Dokümantasyon:** Swagger UI (OpenAPI)
* **Araçlar:** Maven, Postman, Lombok

## ✨ Proje Özellikleri

* **CRUD İşlemleri:** Mühendis ekleme, listeleme ve silme fonksiyonları.
* **Validation:** `@NotBlank`, `@Size` gibi anotasyonlarla sunucu taraflı veri doğrulama.
* **Global Exception Handling:** Hataların (Validation vb.) merkezi bir yerden yakalanıp kullanıcı dostu mesajlara çevrilmesi.
* **Swagger Entegrasyonu:** API uçlarının `/swagger-ui/index.html` üzerinden test edilebilmesi.
* **CORS:** Frontend ve Backend arasındaki haberleşme ayarları.

## 📷 Ekran Görüntüleri

| Personel Listesi | Swagger UI | Yeni Kayıt Ekrani |
|------------------|------------|-------------------|
| ![Liste](screenshots/list-page.png) | ![Swagger](screenshots/swagger-ui.png) | ![Yeni Kayıt](screenshots/yeni-kayit.png) |

## 🚀 Nasıl Çalıştırılır?

1.  Bu repoyu klonlayın:
    ```bash
    git clone [https://github.com/rumeysaozdag/havelsan-muhendis-yonetimi.git](https://github.com/rumeysaozdag/havelsan-muhendis-yonetimi.git)
    ```
2.  PostgreSQL'de `muhendis_db` adında bir veritabanı oluşturun.
3.  `application.properties` dosyasındaki veritabanı kullanıcı adı ve şifresini güncelleyin.
4.  Projeyi IDE üzerinden veya terminalden başlatın:
    ```bash
    mvn spring-boot:run
    ```
5.  Tarayıcıda şuraya gidin: `http://localhost:8080`

---
👨‍💻 **Geliştirici:** Rumeysa Özdağ