public class Worker {
    String name;
    String position;
    int salary;

    public Worker(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String info(int i){

        int sum = i * salary;
        return name + " " + position + " " + sum;

    }
}
