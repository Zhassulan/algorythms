package kz.tele2.learning.algorythms.swapping;

/**
 * Поменять местами значения переменных без доп переменной
 */
public class Swapper {

    private int x;
    private int y;

    public Swapper(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void print() {
        System.out.println("x = " + x + ", y = " + y);
    }

    public void swap1() {
        x = x + y;
        y = x - y;
        x = x - y;
    }

    public void swap2() {
        x = x * y;
        y = x / y;
        x = x / y;
    }

}
