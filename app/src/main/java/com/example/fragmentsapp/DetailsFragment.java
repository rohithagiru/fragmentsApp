package com.example.fragmentsapp;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {

    public static String TAG = DetailsFragment.class.getSimpleName();

    TextView detailsTextView;
    public DetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG,"onAttach"+"  Rohith");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"onCreate"+"  Rohith");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG,"onCreateView"+"  Rohith");
        // Inflate the layout for this fragment
        //FragmentDetailsScreen fragmentDetailsScreen = new FragmentDetailsScreen(getContext());
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        detailsTextView = view.findViewById(R.id.newsDetailsTextview);
        return view;

    }

    public void updateTextView(String headline) {//c
        detailsTextView.setText(headline);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG,"onActivityCreated"+"  abdul");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG,"onStart"+"  Rohith");


    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG,"onResume"+"  Rohith");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,"onPause"+"  Rohith");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG,"onStop"+"  Rohith");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG,"onDestroyView"+"  Rohith");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG,"onDetach"+"  Rohith");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy"+"  Rohith");

    }
}
