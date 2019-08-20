package com.example.fragmentsapp;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeadlinesFragment extends Fragment implements AdapterView.OnItemClickListener {

    ListView headlinesListView;
    OnHeadlineSelectedListener callback;
    public static String TAG = HeadlinesFragment.class.getSimpleName();

    public interface OnHeadlineSelectedListener {
        public void onArticleSelected(String headline);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        callback = (OnHeadlineSelectedListener) getActivity();
        Log.i(TAG,"onAttach"+"  Rohith");
    }

    public HeadlinesFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"onCreate"+"  Rohith");

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_headlines, container, false);//3
        headlinesListView = view.findViewById(R.id.headlineslistview);
        Log.i(TAG,"onCreateView"+"  Rohith");


        headlinesListView.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
        callback.onArticleSelected(item);//a

        //  Toast.makeText(getContext(), item, Toast.LENGTH_SHORT).show();
    }
}
