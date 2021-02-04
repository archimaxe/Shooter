public class Slingshot extends Weapon{
    public Slingshot(int slot, String gunName) {
        super(slot, gunName);
    }

    @Override
    public void shot() {
        System.out.println("* Звуки рогатки *");;
    }
}
