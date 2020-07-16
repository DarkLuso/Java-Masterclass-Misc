public class Windows {

    private boolean isOpen;

    public void openWindow (){
        if (isOpen)
            System.out.println("Is already open");
        isOpen = true;
    }

    public void closeWindow (){
        if (!isOpen)
            System.out.println("Is already close");
        isOpen = false;
    }

}
