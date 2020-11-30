package Lesson1;
import java.awt.*;
import java.util.Random;

public class BackGround  {

    private static final Random random = new Random ();
    public Color getBackground(){

        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

}
