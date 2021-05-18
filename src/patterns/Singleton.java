package patterns;

final class Slark {

    private static Slark instance = null;
    private boolean weapon;

    private Slark() {
    }

    public boolean getWeapon() {
        return weapon;
    }

    public String setWeapon(boolean weapon) {
        if (this.weapon == true) {
            System.out.println("У Сларка есть оружие");
        } else {
            System.out.println("Сларк без оружия!");
        }
        return null;
    }

    public static synchronized Slark getInstance() {
        if (instance == null) {
            instance = new Slark();
        }
        return instance;
    }
}

public class Singleton {

    public static void main(String[] args) {
        System.out.println("Проверка сларка на наличие оружия:");
        System.out.println(Slark.getInstance().getWeapon());
        Slark.getInstance().setWeapon(false);
    }
}
