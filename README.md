# tugas-alpro_Kalkulator-BMI
TUGAS INDIVIDU: Program Kalkulator BMI dengan JOptionPane

## 👤 Identitas
- **Nama:** [Muhamad Harshal Azmi]  
- **NIM:** [I.2510511]  
- **Mata Kuliah:** Algoritma dan Pemrograman

---
## 🧠 Deskripsi
Kalkulator BMI yaitu menghitung Indeks Massa Tubuh (BMI) berdasarkan berat badan (kg) dan tinggi badan (cm). 
Program ini akan mengkategorikan seseorang tersebut kurus, normal, gemuk, obesitas. 
Langkah program:
1. Pengguna memasukkan Berat badan (kg)
2. Pengguna memasukkan Tinggi badan (cm)
3. Program mengkalkulasi 
4. Hasil ditampilkan dalam kotak dialog

---
## 💻 Cuplikan Kode
```java
import javax.swing.JOptionPane;

public class KalkulatorBMI {
	public static void main(String[] args) {
		
		String inputBeratBadan = JOptionPane.showInputDialog("Masukan Berat Badan (kg):");
		String inputTinggiBadan = JOptionPane.showInputDialog("Masukan Tinggi Badan (cm):");
		
		double BeratB = Double.parseDouble(inputBeratBadan);
		double TinggiB_cm = Double.parseDouble(inputTinggiBadan);
		
		double TinggiB_m =TinggiB_cm /100.0;
		
		double nilaibmi = BeratB / (TinggiB_m * TinggiB_m);
		
		String Kategori = "";
		if (nilaibmi < 18.5){
			Kategori = "Kurus";
		} else if (nilaibmi <= 24.9) {
			Kategori = "Normal";
		} else if (nilaibmi <= 29.9) {
			Kategori = "Gemuk";
		} else if (nilaibmi > 30.0) {
			Kategori = "Obesitas";
		}
		
		String hasil = "Nilai BMI : " + nilaibmi +
				"\nKategori : " + Kategori;
		JOptionPane.showMessageDialog(null, hasil, "Hasil BMI", JOptionPane.INFORMATION_MESSAGE);
	}
}
```

---
## 🔍 Hasil Uji Coba

### 💡 Input
![Input Dialog]()

### 📊 Output
![Output Dialog]()

---
## ✅ Kesimpulan
Program berhasil dijalankan dan menampilkan hasil BMI dan kategori BMI .  
Penggunaan **JOptionPane** mempermudah interaksi dengan pengguna tanpa console.

---

