
public class TV {
	 	int OnOff;
		int ChannelUpDown;
		int VolumeUpDown;
		int defaultchannel=50;
		int defaultvolume=20;
		int channel=0;
		int volume=0;
		
	public int getOnOff() {
		return OnOff;
	}
	public void setOnOff(int onOff) {
		OnOff = onOff;
	}
	public int getChannelUpDown() {
		return ChannelUpDown;
	}

	public void setChannelUpDown(int channelUpDown) {
		ChannelUpDown = channelUpDown;
	}
	public int getVolumeUpDown() {
		return VolumeUpDown;
	}

	public void setVolumeUpDown(int volumeUpDown) {
		VolumeUpDown = volumeUpDown;
	}

  






	
	
	public TV(int OnOff,int ChannelUpDown,int VolumeUpDown){
	
		this.OnOff=OnOff;
		this.ChannelUpDown=ChannelUpDown;
		this.VolumeUpDown=VolumeUpDown;
		
	}
	

	public void SetTv(TV tv)
	{
		if(this.OnOff==1)
		{
			System.out.println("TV is ON");
		}
		else
		{
			System.out.println("TV  is OFF");
		}
	}
	
	public void SetChannel(TV tv)
	{

		if(this.OnOff==0)
		{
			System.out.println("TV  is OFF , switch on the TV first \n");
		}
		else
		{
			channel=this.getChannelUpDown()+defaultchannel;
			System.out.println("You are on channel number "+channel);
		}
	}
	
	public void SetVolume(TV tv)
	{

		if(this.OnOff==0)
		{
			System.out.println("TV  is OFF , switch on the TV first \n");
		}
		else
		{
			volume=this.getVolumeUpDown()+defaultvolume;
			System.out.println("Volume of TV is set to  "+volume);
		}
	}
	
	
}
