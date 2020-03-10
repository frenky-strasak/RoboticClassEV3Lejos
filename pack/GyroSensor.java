package pack;

import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.robotics.SampleProvider;


public class GyroSensor {
	
	private EV3GyroSensor gyroSensor;
	private SampleProvider sp;
	private float [] sample;
	private Port myPort; 
	
	public GyroSensor(Port myPort){
		this.myPort = myPort;
		this.gyroSensor = new EV3GyroSensor(myPort);
		this.sp = gyroSensor.getAngleAndRateMode();
		this.sample = new float[this.sp.sampleSize()];
	}
	
	public float getCurrentDegree(){
		this.sp.fetchSample(sample, 0);
		return sample[0];
	}
	
	public void resetGyroSesor(){
		this.gyroSensor = new EV3GyroSensor(this.myPort);
		this.sp = gyroSensor.getAngleAndRateMode();
		this.sample = new float[this.sp.sampleSize()];
	}
	
}
