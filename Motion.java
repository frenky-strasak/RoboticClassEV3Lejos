package pack;

import lejos.hardware.port.Port;
import lejos.hardware.motor.Motor;
import lejos.utility.Delay;


public class Motion {

	public Motion(){
		// Muze byt prazdne.
	}
	
	public void goForward(int time) {  
		// Jed dopredu 
        Motor.A.forward();
        Motor.B.forward();
        Delay.msDelay(time);
        Motor.A.stop();
        Motor.B.stop();
    }

}
