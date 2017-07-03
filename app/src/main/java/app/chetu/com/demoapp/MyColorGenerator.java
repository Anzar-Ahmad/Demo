package app.chetu.com.demoapp;

import android.graphics.Color;

import com.manolovn.trianglify.generator.color.ColorGenerator;

import java.util.Random;

/**
 * Created by anzara on 7/3/2017.
 */

public class MyColorGenerator implements ColorGenerator {
    private Random rand = new Random();

    @Override
    public int nextColor() {
        rand.setSeed(rand.nextInt(this.hashCode()));
        int r = rand.nextInt(128);
        int g = rand.nextInt(128);
        int b = rand.nextInt(128);
        return Color.argb(255, r, g, b);
    }

    @Override
    public void setCount(int count) {

    }
}
