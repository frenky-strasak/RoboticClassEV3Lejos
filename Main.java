package pack;

import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.Motor;
import lejos.utility.Delay;

// gyro sensor
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.port.SensorPort;
import lejos.robotics.SampleProvider;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//			
//		LCD.drawString("Karel chodi po schodech a smrdi.", 0, 4);
//		Delay.msDelay(5000);
//		
////		Motor.A.forward();
////		Delay.msDelay(5000);
////		Motor.A.stop();
//		
//		EV3GyroSensor gyroSensor = new EV3GyroSensor(SensorPort.S1);
//		
//		final SampleProvider sp = gyroSensor.getAngleMode();
		
		
		DriveRobot d = new DriveRobot();
		d.go();
		
		
	}

}
