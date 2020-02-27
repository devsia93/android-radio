package ru.qbitmobile.qbitstation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import ru.qbitmobile.qbitstation.R;
import ru.qbitmobile.qbitstation.adapter.RecyclerStationAdapter;
import ru.qbitmobile.qbitstation.baseObject.Radio;

/**
 * A simple {@link Fragment} subclass.
 */
public class StationsFragment extends Fragment {

    private Radio mRadio;

    private Context mContext;

    public RecyclerView mRecyclerView;
    private RecyclerStationAdapter mRecyclerStationAdapter;

    public StationsFragment(Context context, Radio radio) {
        mRadio = radio;
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_stations, container, false);

        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerStationAdapter = new RecyclerStationAdapter(mContext, mRadio);
        mRecyclerView.setAdapter(mRecyclerStationAdapter);

        return view;
    }
}
