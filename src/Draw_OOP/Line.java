/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Draw_OOP;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author rs
 */
public class Line extends Shape {

    public Line(int x, int y, int w, int h, Color color) {
        super(x, y, w, h, color);
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.drawLine(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

}
