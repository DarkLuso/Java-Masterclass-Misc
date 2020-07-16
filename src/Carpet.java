public class Carpet {

    private int width;
    private int length;
    private String texture;
    private boolean isDirty;

    public Carpet(int width, int length, String texture) {
        this.width = width;
        this.length = length;
        this.texture = texture;
    }

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
}
