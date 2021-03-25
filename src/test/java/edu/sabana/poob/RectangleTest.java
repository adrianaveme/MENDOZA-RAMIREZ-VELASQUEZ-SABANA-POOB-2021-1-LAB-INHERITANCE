package edu.sabana.poob;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    private static Rectangle r1;
    private static Rectangle r2;
    private static Rectangle r3;
    private static Rectangle r4;

    @BeforeAll
    public static void setUp() {
        r1 = new Rectangle();
        r2 = new Rectangle("blue");
        r3 = new Rectangle(2.0, 3.0);
        r4 = new Rectangle("red", 5.0,6.0);
    }

    @Test
    public void shouldCalculateArea() {

        assertEquals(1, (int) r1.getArea());
        assertEquals(1, (int) r2.getArea());
        assertEquals(6, (int) r3.getArea());
        assertEquals(30, (int) r4.getArea());

    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(4, (int) r1.getPerimeter());
        assertEquals(4, (int) r2.getPerimeter());
        assertEquals(10, (int) r3.getPerimeter());
        assertEquals(22, (int) r4.getPerimeter());

    }

    @Test
    public void shouldCalculateDiagonal() {

        assertEquals(1, r1.getDiagonal());
        assertEquals(1, r2.getDiagonal());
        assertEquals(3.6 , r3.getDiagonal());
        assertEquals(7.8, r4.getDiagonal());

    }

    @Test
    public void shouldPrintRectangle() {

        assertEquals("This is a Rectangle with color NONE, length 1.0 and width 1.0", r1.toString());
        assertEquals("This is a Rectangle with color NONE, length 1.0 and width 1.0", r2.toString());
        assertEquals("This is a Rectangle with color NONE, length 2.0 and width 3.0", r3.toString());
        assertEquals("This is a Rectangle with color NONE, length 5.0 and width 6.0", r4.toString());


    }


}
