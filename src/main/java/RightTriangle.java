public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, Base: " + firstLeg + " units, Height: " + secondLeg
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}