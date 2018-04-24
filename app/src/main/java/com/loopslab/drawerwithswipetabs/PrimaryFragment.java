package com.loopslab.drawerwithswipetabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by sadmansamee on 7/29/2015.
 */
public class PrimaryFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.primary_layout, container, false);
        String[] day1array = {
                "CODEJAM",
                "HACKATHON",
                "ROBOWAR",
                "BUG HUNTER",

        };
        ListView lv1 = (ListView) rootView.findViewById(R.id.day1list);
        ArrayAdapter<String> lva = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, day1array);

        lv1.setAdapter(lva);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Codejam.class);
                    startActivityForResult(myIntent, 0);
                }

            }
        });


        return rootView;


    }
    }
