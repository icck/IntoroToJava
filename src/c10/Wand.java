package c10;

public class Wand {
    private String Name;
    private double power;

    public String getName() {
        return Name;

    }

    public void setName(String name) {

        if (name == null ) {
            throw new IllegalArgumentException("nameにNullは設定できません");

        }

        if (name.length() < 3 ) {
            throw new IllegalArgumentException("nameは3文字以上を設定してください");

        }

        Name = name;
    }

    public double getPower() {
        return power;

    }

    public void setPower(double power) {

        if (power < 0.5 || power > 100) {
            throw new IllegalArgumentException("powerは0.5以上100以下を設定してください");

        }

        this.power = power;

    }

}
