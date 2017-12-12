/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Draw_OOP;

import java.awt.Color;

/**
 *
 * @author rs
 */
public class ShapeMaker {

    public static Shape createRectangle(int x, int y, int w, int h, Color color) {
        return new Rectangle(x, y, w, h, color);
    }
//    public static 

    public static Shape createSquare(int x, int y, int w, int h, Color color) {
        return new Square(x, y, w, h, color);
    }
    public static Shape createLine(int x, int y, int w, int h, Color color) {
        return new Line(x, y, w, h, color);
    }
    
    
}
