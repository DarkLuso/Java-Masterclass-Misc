public class Carpet {

    private boolean isDirty;

    public void cleanCarpet (){
        if (isDirty){
            isDirty = false;
            System.out.println("Carpet is clean now");
        }

        else System.out.println("Carpet is already clean");
    }

    public void soiling (){
        isDirty = true;
        System.out.println("your soiling the carpet");
    }

    public boolean isClean (){
        if (isDirty) {
            System.out.println("The carpet is dirty");
            return false;
        }

        System.out.println("The carpet is clean");
        return true;
    }
}
