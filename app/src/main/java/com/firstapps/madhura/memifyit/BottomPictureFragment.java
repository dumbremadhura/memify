package com.firstapps.madhura.memifyit;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.app.Activity;

/**
 * Created by Madhura on 3/28/2018.
 */

public class BottomPictureFragment extends Fragment{

    private static TextView topTextView ;
    private static TextView bottomTextView ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_pic_fragment,container,false);

        topTextView = (TextView)v.findViewById(R.id.topTextView);
        bottomTextView = (TextView)v.findViewById(R.id.bottomTextView);
        return v;
    }

    public void setMemeText(String topText,String bottomText){
        topTextView.setText(topText);
        bottomTextView.setText(bottomText);
    }
}
