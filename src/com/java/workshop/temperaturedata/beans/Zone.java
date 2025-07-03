package src.com.java.workshop.temperaturedata.beans;

public class Zone {
    private String name;
    private int zoneid;
    private String stringtype;
    private double area;
    public void setName(String aName){
        name=aName;
    }
    public String getName(){
        return name;
    }
    public void setZoneid(int aZoneid){
        zoneid=aZoneid;
    }
    public int getZoneid(){
        return zoneid;
    }
    public void setStringtype(String aStringtype){
        stringtype=aStringtype;
    }
    public String getStringtype(){
        return stringtype;
    }
    public void setArea(double aArea){
        area=aArea;
    }
    public double getArea(){
        return area;
    }
}
