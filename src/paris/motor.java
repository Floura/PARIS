package paris;

import java.util.Date;

public class motor {
	private String ket = "";
	private String[][] NOPOL = new String[5][2];
	
	public motor(String plat, int ke) {
		// TODO Auto-generated constructor stub
		if (ke < 5)
		{
		NOPOL[ke][0]= plat;
		NOPOL[ke][1]= new Date().toString();
		setKet("Tersimpan : "+NOPOL[ke][0]+" ; "+NOPOL[ke][1]);
		}
		else
		{
			setKet("Maaf Parkir Penuh!");
		}
	}

	public String getKet() {
		return ket;
	}

	public void setKet(String ket) {
		this.ket = ket;
	}
}
