import java.util.Scanner;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    Weapon automat1 = new Automat(1, "Автомат");
    Weapon gun1 = new Gun(2, "Пистолет");
    Weapon rpg1 = rpg1 = new Rpg(3, "RPG");
    Weapon sling1 = new Slingshot(4, "Рогатка");
    Weapon waterGun1 = new Watergun(5, "Водяной пистолет");

    //пробуем иначе, нежели в инсторукции
    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{automat1, gun1, rpg1, sling1, waterGun1};
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }
        //не понял, как сделать
    public void shotWithWeapon(int slot) throws Exception {
        // TODO проверить на выход за границы
        // выбросить IllegalArgumentException,
        // если значение slot некорректно
        if (slot > weaponSlots.length-1){
            System.out.println("Введенное значение некорректно! Введите число от 1 до " + weaponSlots.length);
            return;
        } else if (slot <= -1) {
            System.out.println("Введенное значение некорректно! Введите число от 1 до " + weaponSlots.length);
            return;
        }
        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}
