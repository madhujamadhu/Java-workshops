package src.com.vetias.java.workshop.tempdata.beans;

public class Sensor {
    private String censorid;
    private String name;
    private float tem;
    public void censorid(String acensorid){
        censorid=acensorid;
    }
    public String censorid(){
        return censorid;
    }
    public void Name(String aName){
        name=aName;
    }
    public String getName(){
        return name;
    }
    public void tem(float atem){
        tem=atem;
    }
    public float gettem(){
        return tem;
    }
    
}
