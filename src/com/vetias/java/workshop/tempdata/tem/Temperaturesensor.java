package src.com.vetias.java.workshop.tempdata.tem;

public class Temperaturesensor implements Sensor{
    private float temperature;
    public Temperaturesensor(float aTemperature);{
        temperature=aTemperature;
    }
    @Override
    public float getReading(){
        return temperature;
    }
}
    

