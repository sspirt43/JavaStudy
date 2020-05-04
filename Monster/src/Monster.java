public class Monster {
    int eyes;
    int arms;
    int legs;

    Monster() {
        this.eyes = 2;
        this.arms = 2;
        this.legs = 2;
    }

    Monster(int legs) {
        this.eyes = 2;
        this.arms = 2;
        this.legs = legs;
    }

    public Monster(int arms, int legs) {
        this.eyes = 2;
        this.arms = arms;
        this.legs = legs;
    }

    public Monster(int eyes, int arms, int legs) {
        this.eyes = eyes;
        this.arms = arms;
        this.legs = legs;
    }

    void describe() {
        System.out.println("Eyes: " + eyes);
        System.out.println("Arms: " + arms);
        System.out.println("Legs: " + legs);
    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println("Голос");
        }
    }
    void voice(int i, String word){
        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }
    }

}
