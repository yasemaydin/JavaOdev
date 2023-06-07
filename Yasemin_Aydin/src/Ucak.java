public class Ucak implements IUcak
{
	private String kod; private int kapasite;

	public void ucakOlustur(String kod, int kapasite)
	{
	    this.kod = kod;
	    this.kapasite = kapasite;
	}
	
	public String getKod()
	{
	    return kod;
	}
	
	public void setKod(String kod)
	{
	    this.kod = kod;
	}
	
	public int getKapasite()
	{
	    return kapasite;
	}
	
	public void setKapasite(int kapasite)
	{
	    this.kapasite = kapasite;
	}
}