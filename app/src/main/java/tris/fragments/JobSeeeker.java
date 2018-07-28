package tris.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import tris.jobme.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class JobSeeeker extends Fragment {
//Spinner Spinner1,Spinner2,Spinner3;
    public JobSeeeker() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_job_seeeker,container,false);

        String [] values = {"Select Job type","Full Time","Part Time"};
        String [] values1 = {"Select Job Title","Accountant","CA","CS","Manager","Other","Etc"};
        String [] values2 = {"Select State","Arunachal Pradesh","Assam ","CS","Bihar ",
                "Chhattisgarh ","Goa ","Gujarat","Haryana","Himachal Pradesh","Jammu & Kashmir"};
        String [] values3 = {"Select City","Delhi","Lucknow","jaipur","udaypur","Punji","madras"};


        Spinner spinner = (Spinner) v.findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),
                android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        Spinner spinner2 = (Spinner) v.findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this.getActivity(),
                android.R.layout.simple_spinner_item, values1);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(adapter2);

        Spinner spinner3 = (Spinner) v.findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this.getActivity(),
                android.R.layout.simple_spinner_item, values2);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner3.setAdapter(adapter3);

        Spinner spinner4 = (Spinner) v.findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this.getActivity(),
                android.R.layout.simple_spinner_item, values3);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner4.setAdapter(adapter4);

        Button  MovetoNext=(Button)v.findViewById(R.id.next);
        MovetoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.mainlayout, new JobSeekerFurtherDetails())
                        .addToBackStack("JobSeeeker")
                        .commit();
            }
        });

        //  return inflater.inflate(R.layout.fragment_job_seeeker, container, false);
return  v;

    }

}
