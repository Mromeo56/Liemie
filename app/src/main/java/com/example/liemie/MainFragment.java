package com.example.liemie;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.firebase.ui.auth.AuthUI;

import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    EditText usernmae;
    EditText password;

    Button send;

    View view;



    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        send = (Button)view.findViewById(R.id.btn_login);
        usernmae = (EditText)view.findViewById(R.id.username);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //send.findViewById(R.id.btn_login);
        return view;
    }


}
