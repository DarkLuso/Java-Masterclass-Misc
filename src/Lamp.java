public class Lamp {

    private boolean lampIsOn;

    public void turnOn (){
        if (lampIsOn)
            System.out.println("Is already on");
        lampIsOn = true;
    }

    public void turnOff (){
        if (lampIsOn)
            System.out.println("Is already off");
        lampIsOn = false;
    }

}
