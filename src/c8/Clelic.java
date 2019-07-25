package c8;

public class Clelic {
    String name = "";
    int hp = 0;
    final int MAX_HP = 50;
    int mp = 0;
    final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.toString());
        this.mp -= 5;
        this.hp = this.MAX_HP;
    }

    public int play() {
        System.out.println(this.toString());
        return 1;
    }

}
