public class Box {
    double width;
    double height;
    double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box (double size) {
        width = size;
        height = size;
        length = size;
    }
    Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double volume () {
        return width * height * length;
            }

     void showVolume() {
        System.out.println(volume());
     }

     void compare(Box box){
        double thisVolume = volume();
        double boxVolume = box.volume();
        if (thisVolume > boxVolume) {
            System.out.println("Our`s Box is bigger");
        }   else if (thisVolume < boxVolume) {
                System.out.println("Our`s Box is smaller");
        }   else {
            System.out.println("The boxes are equal");
        }
     }
}
