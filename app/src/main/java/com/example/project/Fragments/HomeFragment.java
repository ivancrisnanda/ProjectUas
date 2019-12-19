package com.example.project.Fragments;


import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        CardView cardView1 = (CardView) view.findViewById(R.id.cardviewdaerah2);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                ThaiFragment f = new ThaiFragment();
                f.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, f)
                        .addToBackStack(null)
                        .commit();
            }
        });


        CardView cardView2 = (CardView) view.findViewById(R.id.cardviewindonesia);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                IndoFragment f = new IndoFragment();
                f.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, f)
                        .addToBackStack(null)
                        .commit();
            }
        });

        CardView cardView3 = (CardView) view.findViewById(R.id.cardviewitaly);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                ItalyFragment f = new ItalyFragment();
                f.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, f)
                        .addToBackStack(null)
                        .commit();
            }
        });
        CardView cardView4 = (CardView) view.findViewById(R.id.cardviewspanyol);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                SpanyolFragment f = new SpanyolFragment();
                f.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, f)
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }

}
