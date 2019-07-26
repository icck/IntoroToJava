package c11;

public class SupperHero extends Hero {

    public SupperHero () {
        super();
        System.out.println("SupperHero new");

    }

    public void fly() {
        System.out.println("sleep");

    }

    @Override
    public void run() {
        super.run();
        System.out.println("run override");

    }

//    @Override
//	public void sleep() {
//        System.out.println("sleep..final");
//
//    }

}
