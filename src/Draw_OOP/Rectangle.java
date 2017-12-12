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
public class Rectangle extends Shape {

    //Create constructor call Super Constructor
    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(this.getColor());
        gr.drawRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

}
