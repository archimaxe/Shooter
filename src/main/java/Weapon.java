public class Weapon {
    private int slot;
    private String gunName;


    public Weapon(int slot, String gunName) {
        this.slot = slot;
        this.gunName = gunName;
    }

    public int getSlot() {
        return slot;
    }

    public String getGunName() {
        return gunName;
    }

    public void shot() {
        System.out.println("Пиф-паф!");
    }
}