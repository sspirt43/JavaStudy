public class Rect {
    double length;
    double width;

    void setRect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double Perimetr() {
        return 2 * length + 2 * width;
    }
    double Square(){
        return length * width;
    }
}
