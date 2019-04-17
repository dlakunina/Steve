package com.javacore.steve.common;

public class ConsoleCanvas extends Canvas {

    private char [] [] pixes;
    private int width;
    private int height;

    public ConsoleCanvas(int width, int height){
        this.width = width;
        this.height = height;
        init();
    }
    public void init() {
        pixes = new char[height][width];

    }

    private void reset(){
        for (int i=0; i<height; i++){
            for (int j = 0; j<width; j++){
                pixes[i][j] = '.';
            }

        }
    }

    public void draw(){
        for (int i=0; i<height; i++){
            System.out.print("\n");
        }
            for (int j=0; j<width; j++){
                System.out.print(pixes[i],[j])

            }

    }
    public void setSymbolAt (int x, int y, char symbol){

    }

    @Override
    public void drawText(String text) {
        System.out.println(text);
    }




    @Override
    public void drawSquareAt (int x, int y, int size){


    }

    public void drawCircleAt (int x, int y, int radius){

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
