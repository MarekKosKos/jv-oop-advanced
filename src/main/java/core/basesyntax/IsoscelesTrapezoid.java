package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstBase;
    private double secondBase;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass()
                + ", area: " + this.getArea() + " sq. units,"
                + " first base: " + this.firstBase + " units, "
                + " second base: " + this.secondBase + " units, "
                + " height: " + this.height + " units, "
                + "color: " + this.getColor());
    }

    @Override
    public void calculateArea() {
        this.setArea((firstBase * secondBase) * 0.5 * height);
    }
}
