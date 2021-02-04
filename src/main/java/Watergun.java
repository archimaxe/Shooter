public class Watergun extends Weapon{
    public Watergun(int slot, String gunName) {
        super(slot, gunName);
    }

    @Override
    public void shot() {
        System.out.println("* Звуки водяного пистолета *");;
    }
}
