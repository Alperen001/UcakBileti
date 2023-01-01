import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		int mesafe, yas, tip;
		double mesafeucret;
		Scanner inp = new Scanner(System.in);
		System.out.println("Yolculuðunuzun KM Cinsinden Mesafesini Giriniz: ");
		mesafe = inp.nextInt();
		System.out.println("Yaþýnýzý Giriniz: ");
		yas = inp.nextInt();
		System.out.println("Yolculuk Tipini Seçiniz:(1-Tek Yön, 2- Gidiþ-Dönüþ): ");
		tip = inp.nextInt();

		mesafeucret = mesafe*0.10;
		if (mesafe < 0 && yas < 0 && tip != 1 || tip != 2) {
			System.out.println("Hatalý Veri Girdiniz");

		} else {
			if (yas <12) {
				mesafeucret = mesafeucret *0.50;
			} else if (yas <= 24 && yas > 12) {
				mesafeucret *= 0.90;
			} else if (yas > 65) {
				mesafeucret *= 0.70;
			} else if (tip == 2) {
				mesafeucret *= 0.80;
			}
			System.out.println("Toplam Tutar =" + mesafeucret + "TL");

		}

	}
}
