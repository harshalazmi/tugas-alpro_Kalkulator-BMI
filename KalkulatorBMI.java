import javax.swing.JOptionPane;

public class KalkulatorBMI {
	public static void main(String[] args) {
		//Memunculkan Kotak pesan
		String inputBeratBadan = JOptionPane.showInputDialog("Masukan Berat Badan (kg):");
		String inputTinggiBadan = JOptionPane.showInputDialog("Masukan Tinggi Badan (cm):");
		
		//Mengubah nilai string ke double (desimal)
		double BeratB = Double.parseDouble(inputBeratBadan);
		double TinggiB_cm = Double.parseDouble(inputTinggiBadan);
		
		// Konversi Niai cm ke meter
		double TinggiB_m =TinggiB_cm /100.0;
		
		//Rumus BMI
		double nilaibmi = BeratB / (TinggiB_m * TinggiB_m);
		
		//Membuat kategori
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
		
		//Hasil kalkulasi
		String hasil = 
				"Berat Badan : " + BeratB + "\nTinggi Badan : " + TinggiB_cm +
				"\nNilai BMI : " + nilaibmi +
				"\nKategori : " + Kategori;
		JOptionPane.showMessageDialog(null, hasil, "Hasil BMI", JOptionPane.INFORMATION_MESSAGE);
	}
}
