package data;

import java.awt.geom.Line2D;

/**
 *
 * @author Roland
 */
public class Line extends Line2D.Double {
    Point pFrom;
    Point pTo;

    public Line(Point pFrom, Point pTo) {
        super(pFrom, pTo);
        this.pFrom = pFrom;
        this.pTo = pTo;
    }
    
    @Override
    public Point getP1() {
        return pFrom;
    }
    
    @Override
    public Point getP2() {
        return pTo;
    }
}
