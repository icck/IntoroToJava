package c10;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.getWand().getPower());

        h.setHp(h.getHp() + recovPoint);

        System.out.println(h.getName() + "のHPを" + recovPoint + "回復");

    }

    public int getHp() {
        return hp;

    }

    public void setHp(int hp) {

        if (hp < 0) {
            this.hp = 0;
            return;

        }

        this.hp = hp;

    }

    public int getMp() {
        return mp;

    }

    public void setMp(int mp) {

        if (mp < 0) {
            this.mp = 0;
            return;

        }

        this.mp = mp;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {

        if (name == null ) {
            throw new IllegalArgumentException("nameにNullは設定できません");

        }

        if (name.length() < 3 ) {
            throw new IllegalArgumentException("nameは3文字以上を設定してください");

        }

        this.name = name;

    }

    public Wand getWand() {
        return wand;

    }

    public void setWand(Wand wand) {

        if (wand == null) {
            throw new IllegalArgumentException("Wand is not null");

        }

        this.wand = wand;
    }

}
