public class Main {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        Monster monster2 = new Monster(7);
        Monster monster3 = new Monster(5, 6);
        Monster monster4 = new Monster (7, 8, 9);

        //monster1.voice();
        //monster2.voice(4);
        monster3.voice(3, "ЖОПА");
    }
}
