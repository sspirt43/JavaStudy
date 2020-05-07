package main;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Nick");
        employees.add("Nex");
        employees.add("Kick");
        employees.add("Brick");
        employees.add("Chuck");
        employees.add("Gek");
        employees.add("Vasya");

        employees.remove("Kick");

        for (int i = 0; i <employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }













        /*String[] employees = {
                "Nikita",
                "Igor",
                "Olga",
                "Vasiliy",
                "Maxim"
        };
        String[] second = new String[employees.length+1];
        for (int i = 0; i<employees.length; i++){
            second[i] = employees[i];
        }
        second[second.length - 1] = "Ivan";
        employees = second;
        employees[1] = null;
        String[] newNames = new String[employees.length-1];
        for (int i = 0, j = 0; i< employees.length; i++){
            if (employees[i] != null) {
                newNames[j] = employees[i];
                j++;
            }
        }
        employees = newNames;
        for (String name: employees) {
            System.out.println(name);
        }*/
    }
}
