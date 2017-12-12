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
public abstract class Shape {

    private int x, y;
    private int height, width;
    private Color color;

    public Shape(int x, int y, int width, int heigth, Color color) {
        this.x = x;
        this.y = y;
        this.height = heigth;
        this.width = width;
        this.color = color;
    }

    public Shape() {
    }

    public abstract void draw(Graphics2D gr);

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int heigth) {
        this.height = heigth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
