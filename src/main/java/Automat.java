public class Automat extends Weapon{
    public Automat(int slot, String gunName) {
        super(slot, gunName);
    }

    @Override
    public void shot() {
        System.out.println("* Звуки автомата *");;
    }
}
