import java.util.Scanner;

public class Musteri implements IMusteri
{
	private String TC;
	private String ad;
	private String soyad;
	private String telefon;
	private int yas;
	private String cinsiyet;
	private String engel;

	public void musteriOlustur()
	{
		Scanner scanner = new Scanner(System.in);
		
	    do
	    {
	        System.out.print("TC Kimlik Numarinizi giriniz: ");
	        TC = scanner.nextLine();
	    } while (TC.length() != 11 || !TC.matches("\\d+"));
	
	    System.out.print("Adinizi giriniz: ");
	    ad = scanner.nextLine();
	
	    System.out.print("Soyadinizi giriniz: ");
	    soyad = scanner.nextLine();
	
	    do
	    {
	        System.out.print("Telefon Numaranizi giriniz: ");
	        telefon = scanner.nextLine();
	    } while (telefon.length() != 11 || !telefon.matches("\\d+"));
	
	    do
	    {
	        System.out.print("Yasinizi giriniz: ");
	
	        try
	        {
	            yas = Integer.parseInt(scanner.nextLine());
	        } catch (Exception e) {}
	    } while (!(yas > 0 && yas < 101) || !Integer.toString(yas).matches("\\d+"));
	
	    int cSecim = 0;
	
	    do
	    {
	        System.out.println("1) Erkek");
	        System.out.println("2) Kadin");
	        System.out.print("Cinsiyetinizi giriniz (1, 2): ");
	        cinsiyet = scanner.nextLine();
	        try
	        {
	            cSecim = Integer.parseInt(cinsiyet);
	        } catch (Exception e) {}
	    } while (!(cSecim == 1 || cSecim == 2) || !Integer.toString(cSecim).matches("\\d+"));
	
	    switch (cinsiyet)
	    {
	        case "1":
	            cinsiyet = "Erkek";
	            break;
	        case "2":
	            cinsiyet = "Kadin";
	            break;
	    }
	
	    int eSecim = 0;
	
	    do
	    {
	        System.out.println("1) Var");
	        System.out.println("2) Yok");
	        System.out.print("Engel durumunuzu giriniz (1, 2): ");
	        engel = scanner.nextLine();
	
	        try
	        {
	            eSecim = Integer.parseInt(engel);
	        } catch (Exception e) {}
	    } while (!(eSecim == 1 || eSecim == 2) || !Integer.toString(eSecim).matches("\\d+"));
	
	    switch (engel)
	    {
	        case "1":
	            engel = "Var";
	            break;
	        case "2":
	            engel = "Yok";
	            break;
	    }
	}
	
	public String getTC()
	{
	    return TC;
	}
	
	public void setTC(String TC)
	{
	    this.TC = TC;
	}
	
	public String getAd()
	{
	    return ad;
	}
	
	public void setAd(String ad)
	{
	    this.ad = ad;
	}
	
	public String getSoyad()
	{
	    return soyad;
	}
	
	public void setSoyad(String soyad)
	{
	    this.soyad = soyad;
	}
	
	public String getTelefon()
	{
	    return telefon;
	}
	
	public void setTelefon(String telefon)
	{
	    this.telefon = telefon;
	}
	
	public int getYas()
	{
	    return yas;
	}
	
	public void setYas(int yas)
	{
	    this.yas = yas;
	}
	
	public String getCinsiyet()
	{
	    return cinsiyet;
	}
	
	public void setCinsiyet(String cinsiyet)
	{
	    this.cinsiyet = cinsiyet;
	}
	
	public String getEngel()
	{
	    return engel;
	}
	
	public void setEngel(String engel)
	{
	    this.engel = engel;
	}
}