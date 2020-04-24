package com.company;

public interface Airplane {
    public void toTakeOff();
    public void toLand();
    public void refull();
    public void setPilot(Pilot pilotOfThePlane);
    public String getFuelCapacity();
    public String getFuelLevel();
    public String toString();


}
