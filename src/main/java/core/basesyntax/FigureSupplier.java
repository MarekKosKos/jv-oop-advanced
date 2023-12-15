package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int figuresNumber = 5;
    static final double defaultRadius = 10;
    static Random random = new Random();

    static ColorSupplier colorSupplier = new ColorSupplier();

    public static Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), defaultRadius);
    }

    public static Figure getRandomFigure() {
        int randomFigure = random.nextInt(figuresNumber);
        return switch (randomFigure) {
            case 0 -> new Square(colorSupplier.getRandomColor(), random.nextDouble());
            case 1 -> new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(),
                    random.nextDouble());
            case 2 -> new Circle(colorSupplier.getRandomColor(), random.nextDouble());
            case 3 -> new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(),
                    random.nextDouble());
            default -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(),
                    random.nextDouble(), random.nextDouble());
        };
    }
}
