package com.concordia.cejv669.lab10_2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ReceiverFragment extends Fragment {

    TextView myTextView;

    public ReceiverFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_receiver, container, false);

        myTextView = v.findViewById(R.id.edit_receiver_text);


        // Inflate the layout for this fragment
        return v;
    }

    public void displayText(String text){
        myTextView.setText(text);
    }

}
