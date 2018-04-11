package com.firstapps.madhura.memifyit;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.widget.Toast;


public class SwipedRight extends AppCompatActivity implements GestureDetector.OnGestureListener{

    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiped_right);

        this.gestureDetector = new GestureDetectorCompat(this,this);
    }


    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float v, float v1) {

        Context context = getApplicationContext();

        float diffX = e2.getX() - e1.getX();
        float diffY = e2.getY() - e1.getY();


        if(Math.abs(diffX) > Math.abs(diffY)) {
            if(diffX > 0){

                Intent rightSwipe = new Intent(this,MainActivity.class);
                startActivity(rightSwipe);

            }
            else{

                Toast.makeText(context,"Only one option *LEFT* !",Toast.LENGTH_LONG).show();
            }
        }
        else{
            if(diffY > 0){

            }
            else{

            }

        }
        return true;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        gestureDetector.onTouchEvent(event);

        return super.onTouchEvent(event);
    }
}
