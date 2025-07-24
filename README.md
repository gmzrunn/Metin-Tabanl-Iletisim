#  Merkezi Mesajlaşma Sistemi

Bu Java projesi, farklı türden iletişimcilerin tek bir merkez nesnesi aracılığıyla birbirleriyle mesajlaştığı bir sistemdir.

## 📌 Proje Amacı

Bu proje, nesne tabanlı programlama ilkelerini kullanarak:
- Merkezi kontrolle mesajlaşma,
- Soyut sınıf ve kalıtım,
- Dosyaya yazma/okuma,
- Benzersiz ID üretme gibi kavramları pratiğe dökmeyi amaçlar.

## 🧱 Proje Yapısı

- `Main.java`: Uygulamanın başlangıç noktası.
- `Center.java`: Tüm iletişimleri yöneten merkezi kontrol birimi.
- `ID.java`: Her yeni nesneye benzersiz ID sağlayan sınıf.
- `Iletisimci.java`: Ortak özellikleri tanımlayan soyut sınıf.
- `Cat.java`, `Car.java`, `Cloud.java`, `Cup.java`: Farklı iletişimci türleri.

## 💬 Mesaj Formatı

```bash
gönderenID:alıcıID:mesaj
```
- Belirli bir kullanıcıya mesaj: `1:2:selam`
- Tüm kullanıcılara mesaj: `1:all:quote`
- Sadece bazı kullanıcılara mesaj: `1:2,3,4:quote`

## 📁 Log Dosyaları

Her iletişimci, kendi adını taşıyan bir `.txt` dosyasında aldığı ve gönderdiği mesajları saklar.

## 📌 Örnek Özellikler

- `quote` mesajı gönderilirse, iletişimci 4 alıntı içinden rastgele birini gönderir.
- Yeni iletişimciler oluşturulduğunda sistemdeki diğerlerine haber verilir.
- İletişimciler istediklerinde merkezden kaydını sildirebilir.

## 🧪 Çalıştırmak için

```bash
javac *.java
java Main
```

