import java.text.SimpleDateFormat;

public class mainClass
{
	public static void main(String[] args)
	{
		System.out.println("Rezervasyon Sistemi");

	    Ucak ucak = new Ucak();
	    ucak.ucakOlustur("Airbus A320", 200);

	    Lokasyon lokasyon = new Lokasyon();
	    lokasyon.lokasyonEkle();

	    Musteri musteri = new Musteri();
	    musteri.musteriOlustur();

	    lokasyon.lokasyonSec();

	    Rezervasyon rezervasyon = new Rezervasyon();
	    rezervasyon.biletOlustur(ucak.getKapasite());
	    rezervasyon.ucretOlustur(musteri.getYas(), musteri.getEngel());
	    rezervasyon.tarihOlustur();
	    rezervasyon.koltukOlustur(ucak.getKapasite());

	    System.out.println("Sayin, " + musteri.getAd() + " " + musteri.getSoyad());
	    System.out.println("AEB - " + rezervasyon.getBiletNo() + " numarali rezarvasyon bilgileriniz asagidaki gibidir:");
	    System.out.println("Kalkis yeriniz: " + lokasyon.getKalkisYeri());
	    System.out.println("Varis yeriniz: " + lokasyon.getVarisYeri());
	    System.out.println("Ucus tarihiniz: " + new SimpleDateFormat("dd / MM / yyyy").format(rezervasyon.getUcusTarihi()));
	    System.out.println("Koltuk numaraniz: " + rezervasyon.getKoltukNumarasi());
	    System.out.println("Ucus ucretiniz: " + rezervasyon.getUcret());

	    System.out.print("Iyi ucuslar dileriz.");
	}
}