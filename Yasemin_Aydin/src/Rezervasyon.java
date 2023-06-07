import java.text.SimpleDateFormat;
import java.util.*;

public class Rezervasyon implements IRezervasyon
{
	private int biletNo;
	private int ucret;
	private Date ucusTarihi;
	private int koltukNumarasi;

	public Random rastgele = new Random();
	
	public Date[] tarihler = new Date[14];
	
	public void biletOlustur(int kapasite)
	{
	    biletNo = rastgele.nextInt(kapasite) + 1;
	}
	
	public void ucretOlustur(int yas, String engel)
	{
	    int ucret = rastgele.nextInt(1000);
	
	    if (yas > 50 && yas < 100)
	        ucret = (int) (ucret * 0.5);
	
	    if (engel.equals("Var"))
	        ucret = (int) (ucret * 0.5);
	
	    this.ucret = ucret;
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void tarihOlustur()
	{
	    int tarih = Calendar.getInstance().get(Calendar.YEAR);
	
	    for (int sayac = 0; sayac < tarihler.length; sayac++)
	    {
	        Calendar rastgeleTarih = Calendar.getInstance();
	        rastgeleTarih.set(rastgele.nextInt(tarih + 1 - tarih) + tarih, rastgele.nextInt(12), rastgele.nextInt(28) + 1);
	
	        if (!Arrays.asList(tarihler).contains(rastgeleTarih.getTime()) && (rastgeleTarih.get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) && (rastgeleTarih.get(Calendar.MONTH) > Calendar.getInstance().get(Calendar.MONTH)))
	            tarihler[sayac] = rastgeleTarih.getTime();
	        else
	            sayac--;
	    }
	
	    Arrays.sort(tarihler);
	
	    for (int sayac = 1; sayac <= tarihler.length; sayac++)
	    {
	        System.out.println(sayac + ") " + new SimpleDateFormat("dd/MM/yyyy").format(tarihler[sayac - 1]));
	    }

	    int sira = 0;
	
	    do
	    {
	        System.out.print("Tarih Seciniz: ");
	        try
	        {
	            sira = Integer.parseInt(scanner.nextLine());
	        } catch (Exception e) {}
	    } while (!(sira > 0 && sira < tarihler.length + 1) || !Integer.toString(sira).matches("\\d+"));
	
	    ucusTarihi = tarihler[sira - 1];
	}
	
	public void koltukOlustur(int kapasite)
	{
	    int[] koltuklar = new int[kapasite];
	
	    int[] artisDeger = new int[] { 2, 3, 4, 5 };
	    int artis = artisDeger[rastgele.nextInt(4)];
	    int siraArtis = 1;
	
	    for (int sayac = 1; sayac <= kapasite; sayac += artis)
	    {
	        System.out.println(siraArtis + ") " + sayac);
	        koltuklar[siraArtis] = sayac;
	        siraArtis++;
	    }
	
	    int sira = 0;
	
	    do
	    {
	        System.out.print("Koltuk Seciniz: ");
	        try
	        {
	            sira = Integer.parseInt(scanner.nextLine());
	        } catch (Exception e) {}
	    } while (!(sira > 0 && sira < siraArtis) || !Integer.toString(sira).matches("\\d+"));
	
	    koltukNumarasi = koltuklar[sira];
	}

	public int getBiletNo()
	{
	    return biletNo;
	}
	
	public void setBiletNo(int biletNo)
	{
	    this.biletNo = biletNo;
	}
	
	public int getUcret()
	{
	    return ucret;
	}
	
	public void setUcret(int ucret)
	{
	    this.ucret = ucret;
	}
	
	public Date getUcusTarihi()
	{
	    return ucusTarihi;
	}
	
	public void setUcusTarihi(Date ucusTarihi)
	{
	    this.ucusTarihi = ucusTarihi;
	}
	
	public int getKoltukNumarasi()
	{
	    return koltukNumarasi;
	}
	
	public void setKoltukNumarasi(int koltukNumarasi)
	{
	    this.koltukNumarasi = koltukNumarasi;
	}
}