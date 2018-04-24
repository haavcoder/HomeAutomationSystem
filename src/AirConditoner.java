
public class AirConditoner {
	int OnOff;
	int TempUpDown;
	int defaulttemp=25;
	int currenttemp=0;

	public int getOnOff() {
		return OnOff;
	}

	public void setOnOff(int onOff) {
		OnOff = onOff;
	}

	public int getTempUpDown() {
		return TempUpDown;
	}

	public void setTempUpDown(int tempUpDown) {
		TempUpDown = tempUpDown;
	}

	
	
	
	
	public AirConditoner(int OnOff,int TempUpDown){
		this.OnOff=OnOff;
		this.TempUpDown=TempUpDown;
		
		
	}

	public void SetAc(AirConditoner AC){
		if(this.OnOff==1)
		{
			System.out.println("AC is ON");
		}
	}
	public void SetTemp(AirConditoner AC){
		if(this.OnOff==0)
		{
			System.out.println("AC is Off,please turn on the AC first to adjust the temperature\n\n");
		}
		if(this.OnOff==1)
		{
			currenttemp=defaulttemp+this.getTempUpDown();
			System.out.println("AC temperature is "+currenttemp+"\n\n");
		}
	}
		
	
}
