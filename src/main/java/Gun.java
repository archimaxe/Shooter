public class Gun extends Weapon{
    public Gun(int slot, String gunName) {
        super(slot, gunName);
    }

    @Override
    public void shot() {
        System.out.println("* Звуки пистолета *");;
    }
}
