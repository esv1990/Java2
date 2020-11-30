package Lesson1;

import javax.swing.*;
import java.awt.*;

public class MainCircles extends JFrame { //объявляем класс MainCircles задаем границы

    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    Sprite[] sprites = new Sprite[10]; // создаем массив c объектов класса Sprite, 10 шт

    private final BackGround backGround;
    private final GameCanvas canvas;

    public static void main(String[] args) {
        new MainCircles();// точка старта программы)))
    }

    private MainCircles() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// закрываем окно по крестику
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);// границы окна
        setTitle("Circles");// заголовок
        canvas = new GameCanvas(this);// новый обьект класса GameCanvas
        backGround = new BackGround();
        initApplication();// запуск метода initApplication
        add(canvas);// добавляем канву
        setVisible(true);// делаем окно видимым
    }

    private void initApplication() { // заполняем массив объектами класса Ball

        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new Ball();// не до конца понимаю что происходит, если удалить данный цикл, то цвет фона устанавливается! А вместе не работает.

        }
    }

    public void onDrawFrame(GameCanvas canvas, Graphics g, float deltaTime) {// метод, в который передаем канву, графику и время
        canvas.setBackground(backGround.getBackground());
        update(canvas, deltaTime);// перемещение шариков
        render(canvas, g);// отрисовка шариков
    }

    private void update(GameCanvas canvas, float deltaTime) {// метод перемещения шариков
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas, deltaTime);
        }
    }

    private void render(GameCanvas canvas, Graphics g) {//метод отрисовки шариков
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }
    }
}