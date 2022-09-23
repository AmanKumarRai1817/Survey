package com.example.survey;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.survey.Dashboardadapter;
import com.example.survey.Dashboardadapter;
import com.example.survey.R;
import com.example.survey.User;
import com.example.survey.User;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView dashbor;
    ArrayList<User.Dashbordmodel> modellist;


    public HomeFragment() {
        // Required empty public constructor
    }



    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        dashbor = view.findViewById(R.id.dashbor);
        modellist = new ArrayList<>();
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Rai",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));

        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Rai",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));

        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Rai",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));

        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Rai",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));

        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Rai",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));

        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Rai",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));

        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Rai",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));

        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Rai",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));

        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Rai",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));

        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Rai",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));

        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));
        modellist.add(new User.Dashbordmodel(R.drawable.garments,R.drawable.profile, "Aman Kumar",
                "Manufactural","30","12","20"));

        Dashboardadapter dashboardadapter = new Dashboardadapter(modellist,getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        dashbor.setLayoutManager(linearLayoutManager);

        dashbor.setAdapter(dashboardadapter);
        return view;

        /*return inflater.inflate(R.layout.fragment_home, container, false);*/
    }
}