package Lesson1;

import java.awt.*;
import java.util.Random;

public class Ball extends Sprite {//создаем класс Ball и наследуем его от Sprite
    Random rnd = new Random();

    private final Color color;
    private float vX;
    private float vY;

    Ball() {//Создаем конструктор Ball и определяем в нем размер
        halfHeight = 20 + (float) (Math.random() * 50f);//высота
        halfWidth = halfHeight;//ширина
        color = new Color(rnd.nextInt());//определение цвета рандомноЫ
        vX = (float) (100f + (Math.random() * 200f));//Определяем скорость по координате Х
        vY = (float) (100f + (Math.random() * 200f));// Определяем скорость по координате У
    }

    @Override
    void update(GameCanvas canvas, float deltaTime) {// перемещение шариков
        x += vX * deltaTime;
        y += vY * deltaTime;

        if (getLeft() < canvas.getLeft()) {
            setLeft(canvas.getLeft());
            vX = -vX;
        }
        if (getRight() > canvas.getRight()) {
            setRight(canvas.getRight());
            vX = -vX;
        }
        if (getTop() < canvas.getTop()) {
            setTop(canvas.getTop());
            vY = -vY;
        }
        if (getBottom() > canvas.getBottom()) {
            setBottom(canvas.getBottom());
            vY = -vY;
        }
    }

    @Override
    void render(GameCanvas canvas, Graphics g) {//метод отрисовки
        g.setColor(color);// устанавливаем цвет
        g.fillOval((int) getLeft(), (int) getTop(),// размеры и координаты
                (int) getWidth(), (int) getHeight());
    }
}