package technology.purser.appkveld_android_1516_4;

import android.graphics.Color;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onTouchEvent(MotionEvent event){
        int action = MotionEventCompat.getActionMasked(event);

        System.out.println(event.toString());

        switch(action){
            case(MotionEvent.ACTION_DOWN):
                findViewById(R.id.container).setBackgroundColor(Color.CYAN);
                break;
            case(MotionEvent.ACTION_UP):
                findViewById(R.id.container).setBackgroundColor(Color.RED);
                break;
            case(MotionEvent.ACTION_MOVE):
                findViewById(R.id.container).setBackgroundColor(Color.BLUE);
                break;
        }
        System.out.println(action);
        return true;
    }
}
