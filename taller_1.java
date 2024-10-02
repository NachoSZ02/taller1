import edu.princeton.cs.stdlib.StdDraw;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;
import javax.imageio.plugins.jpeg.JPEGQTable;
import java.awt.*;

public class taller_1 {
    public static void main(String[] args) {
        /*
        tamaño liezo
         */
        StdDraw.setCanvasSize(750,840);
        StdDraw.setXscale(-1, 50);
        StdDraw.setYscale(-1, 50);

        StdDraw.show();
        StdDraw.setTitle("minipaint");
        imprimirmenu();
        imprimirmenu2();
        /*
        con estas variables indicamos la tecla con su numero correspondiente
         */
        int codigoteclac = 67;
        int codigoteclas = 83;
        int codigoteclar = 82;
        int codigoteclag = 71;
        int codigoteclab = 66;
        int codigoteclamas = 107;
        int codigoteclamenos = 109;
        int codigotecla1 = 49;
        int codigotecla2 = 50;
        int codigotecla3 = 51;
        int codigotecla4 = 52;
        int codigotecla5 = 53;

        StdDraw.setPenColor(Color.black);
        StdDraw.setPenRadius(0.01);
        while (true) {
            if (StdDraw.isMousePressed()) {
                StdDraw.mouseX();
                StdDraw.mouseY();


                StdDraw.line(StdDraw.mouseX(), StdDraw.mouseY(), 1, 2);

            } else if (StdDraw.isKeyPressed(codigoteclac)) {
                StdDraw.clear();
                System.out.println("tecla c");
            } else if (StdDraw.isKeyPressed(codigoteclas)) {
                System.out.println("tecla s");
                StdDraw.save("MINIPAINT.png");
                System.out.println("guardando imagen");

            } else if (StdDraw.isKeyPressed(codigoteclag)) {
                StdDraw.setPenColor(Color.GREEN);
                System.out.println("tecla g");
            } else if (StdDraw.isKeyPressed(codigoteclab)) {
                System.out.println("PRESIONO LA TECLA B");
                StdDraw.setPenColor(Color.blue);

            } else if (StdDraw.isKeyPressed(codigoteclamas)) {
                StdDraw.setPenRadius(0.2);
                System.out.println("apreto la tecla +");

            } else if (StdDraw.isKeyPressed(codigoteclar)) {
                StdDraw.setPenColor(Color.RED);


            } else if (StdDraw.isKeyPressed(codigotecla1)) {
                StdDraw.circle(StdDraw.mouseX(), StdDraw.mouseY(), 1);

            } else if (StdDraw.isKeyPressed(codigotecla2)) {
                System.out.println("dibuja un cuadrado");
                StdDraw.square(StdDraw.mouseX(), StdDraw.mouseY(), 1);
            } else if (StdDraw.isKeyPressed(codigotecla3)) {
                System.out.println("dibuje un triangulo");

            } else if (StdDraw.isKeyPressed(codigotecla4)) {
                StdDraw.rectangle(StdDraw.mouseX(), StdDraw.mouseY(), 3, 2);
            } else if (StdDraw.isKeyPressed(codigotecla5)) {
                System.out.println("apreto la tecla 5");

            } else if (StdDraw.isKeyPressed(codigoteclamenos)) {
                System.out.println("apreto menos");
                StdDraw.setPenRadius(0.01);

            }

        }


    }

    /*
    menu de teclas para modificar el pincel o el lienzo
     */
    public static void imprimirmenu() {
        System.out.println("teclas funcion");
        System.out.println("C-limpíar lienzo");
        System.out.println("S-guardar dibujo como archivo a imagen");
        System.out.println("R-Cambiar el pincel a color rojo");
        System.out.println("G-Cambiar el color  del pincel a verde");
        System.out.println("B-cambiar el color del pincel a azul");
        System.out.println("+y-reducir o aumentar el grosor del pincel");


    }

    /*
    menu de figuras geometricas
     */
    public static void imprimirmenu2() {
        System.out.println("dibujar figuras geometricas");
        System.out.println("1-dibujar un circulo en la posicion del raton");
        System.out.println("2-dibujar  un cuadrado en la posicion del raton");
        System.out.println("3-dibujar un triagunlo en la posicion del raton");
        System.out.println("4-dibujar un rectangulo en la posicion del raton");
        System.out.println("5-dibujar un pentagono en la posicion del raton");

    }

}

