# SwingExamples

Modernleştirilmiş ve eğitim odaklı **Java Swing** örnekleri koleksiyonu.

Bu repo, temel olay dinleme örneklerinin yanında güncel masaüstü arayüz ihtiyaçlarına yönelik yeni demolar da içerir.

## Öne Çıkanlar

- Swing bileşenleri ve event handling örnekleri
- NetBeans form tabanlı klasik örnekler
- Güncel kullanım senaryoları için yeni, sade demo uygulamalar
- Komut satırından hızlı derleme/çalıştırma akışı

## Gereksinimler

- **Java 8+**
- GUI destekli bir işletim sistemi ortamı (headless sunucularda çalışmaz)

## Proje Yapısı

```text
SwingExamples/
├── README.md
└── EventHandlingSwing/
    ├── Istatistik.java
    ├── JLabel.java
    ├── JtextArea.java
    ├── MouseListener.java
    ├── KeyListener.java
    ├── TodoListDemo.java
    ├── FormValidationDemo.java
    └── TableSearchDemo.java
```

## Mevcut Örnekler

### Klasik Örnekler

1. **JLabel.java**
   - Basit giriş ekranı ve temel doğrulama
2. **JtextArea.java**
   - Çok satırlı metin girişi ve ekranda gösterim
3. **Istatistik.java**
   - Ortalama, standart sapma, değişim katsayısı ve mod hesaplama
4. **MouseListener.java**
   - Mouse olaylarıyla etkileşim
5. **KeyListener.java**
   - Klavye olayları ve input yakalama

### Yeni/Güncel Örnekler

1. **TodoListDemo.java**
   - `JList` + `DefaultListModel` ile görev ekleme/silme
2. **FormValidationDemo.java**
   - Form alanı doğrulama (isim/e-posta) ve kullanıcı geri bildirimi
3. **TableSearchDemo.java**
   - `JTable` üzerinde canlı arama/filtreleme (`TableRowSorter`)

## Derleme ve Çalıştırma

### 1) Tüm örnekleri derle

```bash
javac EventHandlingSwing/*.java
```

### 2) İstediğin örneği çalıştır

```bash
# Klasik örnekler
java EventHandlingSwing.JLabel
java EventHandlingSwing.JtextArea
java EventHandlingSwing.Istatistik
java EventHandlingSwing.MouseListener
java EventHandlingSwing.KeyListener

# Yeni örnekler
java EventHandlingSwing.TodoListDemo
java EventHandlingSwing.FormValidationDemo
java EventHandlingSwing.TableSearchDemo
```

## Notlar

- Uygulamalar eğitim amaçlıdır ve örnekler bağımsız çalışır.
- Yeni eklenen örneklerde sistem Look & Feel ayarı kullanılarak daha modern bir görünüm hedeflenmiştir.

## Katkı

Katkı vermek istersen:

- Yeni Swing örneği ekleyebilir
- Mevcut örnekleri iyileştirebilir
- README’yi geliştirebilir

## Yazar

[@halilozel1903](https://github.com/halilozel1903)
