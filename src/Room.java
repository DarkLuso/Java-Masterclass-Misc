public class Room {

    private boolean isDirty;
    private Carpet carpet;
    private Windows windows;
    private Lamp lamp;

    public Room(Windows windows, Lamp lamp) {

        this.windows = windows;
        this.lamp = lamp;
    }
    
    public void layingCarpet (Carpet carpet){
        this.carpet = carpet;
    }

    public void removingCarpet (){
        if (carpet == null)
            System.out.println("There's no carpet");
        else this.carpet = null;
    }

    public void cleanRoom (){
        if (!isDirty){
            System.out.println("Its already clean");
        }
        isDirty = false;
        carpet.cleanCarpet();
    }

    public void nightMode (){
        lamp.turnOn();
        windows.closeWindow();
    }

    public void dayMode (){
        lamp.turnOff();
        windows.openWindow();
    }
    
}
