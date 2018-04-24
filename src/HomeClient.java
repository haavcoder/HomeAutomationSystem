
public class HomeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
 TubeLight light= new TubeLight(1);
 light.setLight(light);
 
 AirConditoner AC=new AirConditoner(1,1); // 0=OFF 1=ON  AC is On and temperature up by 1
 AC.SetAc(AC);
 AC.SetTemp(AC);
 
 WashingMachine WM =new WashingMachine(1,1); //0=OFF 1=On Washing machine is on and it set to Rinse
 WM.SetWM(WM);
 WM.Wash(WM);
 
 TV tv =new TV(1,1,1);  // 0=OFF and 1=On TV is on channel and volume set to up i.e 1
 tv.SetTv(tv);
 tv.SetChannel(tv);
 tv.SetVolume(tv);
 
 
 
	}

}
