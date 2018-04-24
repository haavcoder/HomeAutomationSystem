
public class TubeLight {
	TubeLightData data = new TubeLightData();



	public int getOnOff() {
		return data.OnOff;
	}



	public void setOnOff(int onOff) {
		data.OnOff = onOff;
	}



	public TubeLight(int OnOff){
		this.data.OnOff=OnOff;
	}
		
	
	
	public void setLight(TubeLight light)
	{
		if(this.data.OnOff==1)
		{
			System.out.println("Light is ON\n\n");
		}
		else
		{
			System.out.println("Light  is OFF\n\n");
		}
	}
}
