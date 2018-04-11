package com.firstapps.madhura.memifyit;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
/**
 * Created by Madhura on 3/28/2018.
 */

public class Top_Fragment extends Fragment{

    Button but1;
    private static EditText topText;
    private static EditText bottomText;


    TopFragmentListener activityCommander;

    public interface TopFragmentListener{
        public void memeIt(String topText,String bottomText);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (TopFragmentListener)context;
        }
        catch(ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.top_fragment,container,false);

        topText = (EditText)v.findViewById(R.id.topText);
        bottomText = (EditText)v.findViewById(R.id.bottomText);
        but1 = (Button)v.findViewById(R.id.but1);

        but1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        whenButtonClicked(view);
                    }
                }
        );

        return v;
    }

    public void whenButtonClicked(View view){
        activityCommander.memeIt(topText.getText().toString(),bottomText.getText().toString());
    }
}
