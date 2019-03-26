/*
Numaan Cheema
CSC 220 - 01
Lab 4
 */
import doodlepad.*;
import java.util.*;

public class Lab4 {
    static Oval o;
    static Oval enemy1, enemy2, enemy3, enemy4, enemy5;
    static Oval target;

    public static void main(String[] args) {
        Random r = new Random();
        Pad p = new Pad(1000, 1000);

        //KeyPressedHandler and KeyReleaseadHandler allows for quicker maneuvering
        p.setKeyPressedHandler(Lab4::onKeyPressed);
        p.setKeyReleasedHandler(Lab4::onKeyPressed);
        o = new Oval(r.nextInt(900), r.nextInt(900), 100, 100);
            o.setFillColor(0,0,255); //color set for player 1

        //Enemy spawning and properties
        enemy1 = new Oval(r.nextInt(800), r.nextInt(800), 100, 100);
            enemy1.setFillColor(255,0,0);
        enemy2 = new Oval(r.nextInt(800), r.nextInt(800), 100, 100);
            enemy2.setFillColor(255,0,0);
        enemy3 = new Oval(r.nextInt(800), r.nextInt(800), 100, 100);
            enemy3.setFillColor(255,0,0);
        enemy4 = new Oval(r.nextInt(800), r.nextInt(800), 100, 100);
            enemy4.setFillColor(255,0,0);
        enemy5 = new Oval(r.nextInt(800), r.nextInt(800), 100, 100);
            enemy5.setFillColor(255,0,0);

        target = new Oval(r.nextInt(900), r.nextInt(900), 100, 100);
            target.setFillColor(255,255,0);
    }

    public static void onKeyPressed(Pad pad, String keyText, String km) {
        switch (keyText) {
            case "A":
                //o.translate(-10, 0);
                o.setCenter(o.getCenter().getX()-10,o.getCenter().getY());
                break;
            case "S":
                o.setCenter(o.getCenter().getX(),o.getCenter().getY()+10);
                //o.translate(0, 10);
                break;
            case "W":
                o.setCenter(o.getCenter().getX(),o.getCenter().getY()-10);
                break;
            case "D":
                o.setCenter(o.getCenter().getX()+10,o.getCenter().getY());
                break;
        }
        if (o.intersects(enemy1)) {
            o.setVisible(false);
            Text loss = new Text("Sorry, You Lost!", 300,400, 50);
        } else if (o.intersects(enemy2)) {
            o.setVisible(false);
            Text loss = new Text("Sorry, You Lost!", 300,400, 50);
        } else if (o.intersects(enemy3)) {
            o.setVisible(false);
            Text loss = new Text("Sorry, You Lost!", 300,400, 50);
        } else if (o.intersects(enemy4)) {
            o.setVisible(false);
            Text loss = new Text("Sorry, You Lost!", 300,400, 50);
        } else if (o.intersects(enemy5)) {
            o.setVisible(false);
            Text loss = new Text("Sorry, You Lost!", 300,400, 50);
        }

        if (o.intersects(target)){
            o.setVisible(false);
            Text win = new Text("Congrats, You Won!", 300,400, 50);
        }
    }
}
