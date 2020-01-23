package ru.qbitmobile.qbitstation.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ru.qbitmobile.qbitstation.Adapter.RecyclerStationAdapter;
import ru.qbitmobile.qbitstation.BaseObject.Radio;
import ru.qbitmobile.qbitstation.BaseObject.Station;
import ru.qbitmobile.qbitstation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RadiosFragment extends Fragment {

    private List<Station> mStations;
    private Radio mRadio;

    Context mContext;

    RecyclerView mRecyclerView;
    RecyclerStationAdapter mRecyclerStationAdapter;

    public RadiosFragment(Context context, Radio radio) {
        mStations = radio.getStations();
        mRadio = radio;
        mContext = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_radios, container, false);

        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerStationAdapter =  new RecyclerStationAdapter(mContext, mRadio.getStations());
        mRecyclerView.setAdapter(mRecyclerStationAdapter);
        return view;
    }
}