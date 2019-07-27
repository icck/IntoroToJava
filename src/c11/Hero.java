package c11;

public class Hero extends Character{

    public Hero() {
        System.out.println("Hero new");

    }

    public final void sleep() {
        System.out.println("sleep");

    }

    public void run() {
        System.out.println("run");

    }

    @Override
    public void atarck() {
        System.out.println("atarck");

    }

}
