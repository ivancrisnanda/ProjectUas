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
public class SpanyolFragment extends Fragment {


    public SpanyolFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_paella, container, false);

        CardView cardView1 = (CardView) view.findViewById(R.id.cardviewspanyol1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                PaellaFragment f = new PaellaFragment();
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
