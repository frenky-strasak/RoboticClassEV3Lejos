package pack;

import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.utility.Delay;
import lejos.robotics.Color;
import lejos.hardware.port.Port;

public class ColorSensor {
	
	private EV3ColorSensor colorSensor;
    private SensorMode sensorMode;
    private float[] sample;
    
    public ColorSensor(Port myPort){
    	// Nastav a spoj se s robotem.
    	this.colorSensor = new EV3ColorSensor(myPort);
        this.sensorMode = colorSensor.getRedMode();
        this.sample = new float[sensorMode.sampleSize()];
    }
    
    public float get_white_black() {
    	// Zeptej se color sensora na aktualni barvu, kterou vidi.
    	this.sensorMode.fetchSample(this.sample, 0);
    	return sample[0];
    }
}
