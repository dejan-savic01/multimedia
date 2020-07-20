/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia.dejan.savic;

/**
 *
 * @author Home
 */
public class Television {
    
    private int volume = 0;
    private int curentProgram = 1;
    private boolean turnOn = false ;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCurentProgram() {
        return curentProgram;
    }

    public void setCurentProgram(int curentProgram) {
        this.curentProgram = curentProgram;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
    
    
    
    
}
