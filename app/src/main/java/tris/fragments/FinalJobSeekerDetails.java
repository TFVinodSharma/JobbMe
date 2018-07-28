package tris.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import tris.jobme.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FinalJobSeekerDetails extends Fragment {


    public FinalJobSeekerDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_final_job_seeker_details,container,false);

        Button MovetoNext=(Button)v.findViewById(R.id.submit);
        MovetoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.mainlayout, new JobSeekerCongratulation())
                        .addToBackStack("FinalJobSeekerDetails")
                        .commit();
            }
        });

return  v;

        // Inflate the layout for this fragmentzz
      //  return inflater.inflate(R.layout.fragment_final_job_seeker_details, container, false);
    }

}
