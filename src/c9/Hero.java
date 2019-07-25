package c9;

public class Hero {
    String name;
    int hp;

    Hero() {
        this("dammy", 100);
    }

    Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
}