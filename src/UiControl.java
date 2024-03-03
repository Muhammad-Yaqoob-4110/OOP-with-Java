public abstract class UiControl {
    public void enable(){
        System.out.println("Enabled");
    }
    public void disable(){
        System.out.println("Diabbled");
    }

    public abstract void draw();
}
