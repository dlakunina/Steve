package com.javacore.steve.common;

public class ConsoleCanvas extends Canvas {

    private char[][] pixels;
    private int width;
    private int height;

    public ConsoleCanvas(int width, int height) {
        this.width = width;
        this.height = height;
        init();
    }

    public void init() {
        pixels = new char[height][width];

    }

    public void reset() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                pixels[i][j] = '.';
            }

        }
    }

    public void draw() {
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print(pixels[row][col]);
            }

            System.out.print("\n");
        }
    }

    public void setSymbolAt(int x, int y, char symbol) {

    }

    @Override
    public void drawText(String text) {
        System.out.println(text);
    }


    public void drawSquare(int x, int y, int size) {
        drawLine(x, y, x, y + size);
        drawLine(x, y, x + size, y);
        drawLine(x + size, y, x + size, y + size);
        drawLine(x, y + size, x + size, y + size);
    }

    private void drawLine(int x, int y, int xend, int yend) {
        for (int row = x; row <= xend; row++) {
            for (int col = y; col <= yend; col++) {
                pixels[row][col] = '#';
            }
        }
    }

    public void drawCircleAt(int x, int y, int radius) {

    }
    /*public void drawSquare(int size) {
        if (size < 2) {
            System.out.println("No square of such size allowed");
        }
        System.out.print("\n");
        for (int i = 0; i < size; i++) {
            System.out.print("#");
        }

        for (int i = 0; i < size - 1; i++) {
            System.out.print("");
        }
    }*/

}