package com.example.dz4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {
    TextView txtValueSecond;



    private static final String ARG_PARAM1 = "text1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;





    public SecondFragment() {


    }



    public static SecondFragment newInstance(String text) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();

        args.putString(ARG_PARAM1, text);


        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        txtValueSecond = view.findViewById(R.id.txt_value_second);
        txtValueSecond.setText(mParam1);
        return view;

    }
}