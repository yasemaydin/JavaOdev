import java.util.*;

public class Lokasyon implements ILokasyon
{
	private String kalkisYeri;
	private String varisYeri;
	public Lokasyon[] lokasyonlar = new Lokasyon[20];
	
	public Lokasyon lokasyonOlustur(String kalkisYeri, String varisYeri)
	{
	    Lokasyon lokasyon = new Lokasyon();
	
	    lokasyon.setKalkisYeri(kalkisYeri);
	    lokasyon.setVarisYeri(varisYeri);
	
	    return lokasyon;
	}
	
	public void lokasyonEkle()
	{
		lokasyonlar[0] = lokasyonOlustur("Turkiye - Ankara - Ankara Esenboga Havalimani", "Almanya - Dusseldorf - Dusseldorf Rhein Ruhr Uluslararasi Havalimani");
		lokasyonlar[1] = lokasyonOlustur("Almanya - Dusseldorf - Dusseldorf Rhein Ruhr Uluslararasi Havalimani", "Turkiye - Ankara - Ankara Esenboga Havalimani");

		lokasyonlar[2] = lokasyonOlustur("Turkiye - Ankara - Ankara Esenboga Havalimani", "ABD - Washington DC - Dulles Uluslararasi Havalimani");
		lokasyonlar[3] = lokasyonOlustur("ABD - Washington DC - Dulles Uluslararasi Havalimani", "Turkiye - Ankara - Ankara Esenboga Havalimani");

		lokasyonlar[4] = lokasyonOlustur("Turkiye - Ankara - Ankara Esenboga Havalimani", "Arjantin - Buenos Aires - Ministro Pistarini Uluslararasi Havalimani");
		lokasyonlar[5] = lokasyonOlustur("Arjantin - Buenos Aires - Ministro Pistarini Uluslararasi Havalimani", "Turkiye - Ankara - Ankara Esenboga Havalimani");

		lokasyonlar[6] = lokasyonOlustur("Turkiye - Ankara - Ankara Esenboga Havalimani", "Azerbeycan - Baku - Haydar Aliyev Uluslararasi Havalimani");
		lokasyonlar[7] = lokasyonOlustur("Azerbeycan - Baku - Haydar Aliyev Uluslararasi Havalimani", "Turkiye - Ankara - Ankara Esenboga Havalimani");

		lokasyonlar[8] = lokasyonOlustur("Turkiye - Ankara - Ankara Esenboga Havalimani", "Birlesik Krallik - Durham - Teesside Uluslararasi Havalimani");
		lokasyonlar[9] = lokasyonOlustur("Birlesik Krallik - Durham - Teesside Uluslararasi Havalimani", "Turkiye - Ankara - Ankara Esenboga Havalimani");

		lokasyonlar[10] = lokasyonOlustur("Turkiye - Ankara - Ankara Esenboga Havalimani", "Cin - Guangzhou - Guangzhou Baiyun Uluslararasi Havalimani");
		lokasyonlar[11] = lokasyonOlustur("Cin - Guangzhou - Guangzhou Baiyun Uluslararasi Havalimani", "Turkiye - Ankara - Ankara Esenboga Havalimani");

		lokasyonlar[12] = lokasyonOlustur("Turkiye - Ankara - Ankara Esenboga Havalimani", "Guney Kore - Seul - Incheon Uluslararasi Havalimani");
		lokasyonlar[13] = lokasyonOlustur("Guney Kore - Seul - Incheon Uluslararasi Havalimani", "Turkiye - Ankara - Ankara Esenboga Havalimani");

		lokasyonlar[14] = lokasyonOlustur("Turkiye - Ankara - Ankara Esenboga Havalimani", "Ispanya - Madrid - Madrid Barajas Uluslararasi Havalimani");
		lokasyonlar[15] = lokasyonOlustur("Ispanya - Madrid - Madrid Barajas Uluslararasi Havalimani", "Turkiye - Ankara - Ankara Esenboga Havalimani");

		lokasyonlar[16] = lokasyonOlustur("Turkiye - Ankara - Ankara Esenboga Havalimani", "Japonya - Tokyo - Narita Uluslararasi Havalimani");
		lokasyonlar[17] = lokasyonOlustur("Japonya - Tokyo - Narita Uluslararasi Havalimani", "Turkiye - Ankara - Ankara Esenboga Havalimani");

		lokasyonlar[18] = lokasyonOlustur("Turkiye - Ankara - Ankara Esenboga Havalimani", "Kanada - Ottawa - Ottawa Macdonald - Cartier Uluslararasi Havalimani");
		lokasyonlar[19] = lokasyonOlustur("Kanada - Ottawa - Ottawa Macdonald - Cartier Uluslararasi Havalimani", "Turkiye - Ankara - Ankara Esenboga Havalimani");
    }
	
	Scanner scanner = new Scanner(System.in);
	
	public void lokasyonSec()
	{
	    for (int sayac = 1; sayac <= lokasyonlar.length; sayac++)
	    {
	        System.out.println(sayac + ") " + lokasyonlar[sayac - 1].getKalkisYeri() + " " + lokasyonlar[sayac - 1].getVarisYeri());
	    }
	
	    int sira = 0;
	
	    do
	    {
	        System.out.print("Lokasyon Seciniz: ");
	        try
	        {
	            sira = Integer.parseInt(scanner.nextLine());
	        }
	        catch (Exception e) {}
	    } while (!(sira > 0 && sira < lokasyonlar.length + 1) || !Integer.toString(sira).matches("\\d+"));
	
	    setKalkisYeri(lokasyonlar[sira - 1].getKalkisYeri());
	    setVarisYeri(lokasyonlar[sira - 1].getVarisYeri());
	}
	
	public String getKalkisYeri()
	{
	    return kalkisYeri;
	}
	
	public void setKalkisYeri(String kalkisYeri)
	{
	    this.kalkisYeri = kalkisYeri;
	}
	
	public String getVarisYeri()
	{
	    return varisYeri;
	}
	
	public void setVarisYeri(String varisYeri)
	{
	    this.varisYeri = varisYeri;
	}
}