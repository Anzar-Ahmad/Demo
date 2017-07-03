package app.chetu.com.demoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.manolovn.trianglify.TrianglifyView;

public class MainActivity extends AppCompatActivity {
    private Toolbar mAppToolbar;
    private TrianglifyView trianglifyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_theme_two);
//        mAppToolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(mAppToolbar);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //user theme one
//        KenBurnsView kbv = (KenBurnsView) findViewById(R.id.image_bike);
//        RandomTransitionGenerator generator = new RandomTransitionGenerator(10000, new AccelerateDecelerateInterpolator());
//        kbv.setTransitionGenerator(generator);
//        kbv.setTransitionListener(new KenBurnsView.TransitionListener() {
//            @Override
//            public void onTransitionStart(Transition transition) {
//                Log.e("Anzar","start "+transition.getDuration());
//            }
//
//            @Override
//            public void onTransitionEnd(Transition transition) {
//                Log.e("Anzar","end "+transition.getDuration());
//            }
//        });


        /////user theme two

    }
}
