import java.util.HashMap;

public class HW5 {
    public static void main(String[] args) {

        // Создать множество, ключ и значение строки. Добавить шесть элементов. Вывести в консоль значения.
        HashMap<Integer, String> heroes = new HashMap<>();
        heroes.put(4, "Петух");
        heroes.put(8, "Корова");
        heroes.put(16, "Лев");
        heroes.put(32, "Капибара");
        heroes.put(64, "Слон");
        heroes.put(128, "Белка");
        heroes.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(heroes);

        // Добавить ко всем значениям символ "!".
        heroes.computeIfPresent(4, (k, v) -> v + '!');
        heroes.computeIfPresent(8, (k, v) -> v + '!');
        heroes.computeIfPresent(16, (k, v) -> v + '!');
        heroes.computeIfPresent(32, (k, v) -> v + '!');
        heroes.computeIfPresent(64, (k, v) -> v + '!');
        heroes.computeIfPresent(128, (k, v) -> v + '!');
        System.out.println(heroes);
        heroes.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(heroes);

        // Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключами первого.
        HashMap<Integer, String> heroesSec = new HashMap<>();
        heroesSec.put(2, "Жираф");
        heroesSec.put(1, "Медведь");
        heroesSec.put(16, "Львица");
        heroesSec.put(8, "Бык");
        heroesSec.put(4, "Курица");
        heroesSec.put(6, "Кошка");
        System.out.println(heroesSec);

        // Объединить значения во втором множестве и первом, если ключи совпадают. Вывести результат в консоль.
        for (Integer item : heroes.keySet()) {
            heroes.merge(item, heroesSec.getOrDefault(item, ""), (newVal, tempVal) -> newVal + tempVal);
        }
        System.out.println(heroes);
        heroes.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
