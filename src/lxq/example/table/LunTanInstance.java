package lxq.example.table;

import android.content.Context;

public class LunTanInstance {
	private static LunTan lunTan;
	public static LunTan getLunTan()
	{
		if(lunTan==null)
		{
			lunTan=new LunTan();
		}
		return lunTan;
	}
	public static void setLunTan(LunTan l)
	{
		lunTan=l;
	}
}
