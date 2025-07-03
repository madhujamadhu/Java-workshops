package src.com.java.workshop.temperaturedata.beans;

public class Sensor {
    private double temperature;
    private String sensorname;
    private int sensorid;
    public void setTemperature(double  aTemperature){
        temperature=aTemperature;
    }
    public double getTemperature(){
        return temperature;
    }
    public void setSensorname(String  aSensorname){
        sensorname=aSensorname;
    }
    public String getSensorname(){
        return sensorname;
    }
    public void setSensorid(int aSensorid){
        sensorid=aSensorid;
    }
    public int getSensorid(){
        return sensorid;
    }
}
