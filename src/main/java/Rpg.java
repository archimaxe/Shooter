public class Rpg extends Weapon{
    public Rpg(int slot, String gunName) {
        super(slot, gunName);
    }

    @Override
    public void shot() {
        System.out.println("* Звуки РПГ *");;
    }
}
