package pack;
 
import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;
import lejos.hardware.motor.Motor;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.port.SensorPort;
import lejos.robotics.SampleProvider;
import lejos.hardware.port.Port;
 
 
public class DriveRobot {
 
    public void showText(String text, int time, int positionX, int positionY) {
        LCD.drawString(text, positionX, positionY);
        Delay.msDelay(time);
    }
   
    public void go() {
       
    	// Nejdriv nastavim, ktere porty jsou pro jake sensory a motory.
//    	Port colorSensorPort = SensorPort.S1;
//    	Port gyroSensorPort = SensorPort.S2;
    	
    	// Inicializuji sensory.
    	// Inicializuji color sensor.
//    	ColorSensor colorSensor = new ColorSensor(colorSensorPort);
    	// Inicializuji gyro sensor.
//    	GyroSensor gyroSensor = new GyroSensor(gyroSensorPort);
    	
    	Motion motory = new Motion();
    	motory.goForward(1000);
    	   
       
    }
   
 
}
