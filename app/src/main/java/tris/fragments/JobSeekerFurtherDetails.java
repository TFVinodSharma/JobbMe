package tris.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import tris.jobme.R;

public class JobSeekerFurtherDetails extends Fragment {

    public JobSeekerFurtherDetails() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_job_seeker_further_details,container,false);
        Button Movetonexttonext=(Button)v.findViewById(R.id.next1);
        Movetonexttonext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.mainlayout, new FinalJobSeekerDetails())
                        .addToBackStack("JobSeekerFurtherDetails")

                        .commit();

            }
        });
        return v;
        ///Button MoveToNextToNext=(Button)
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_job_seeker_further_details, container, false);
    }

   }
