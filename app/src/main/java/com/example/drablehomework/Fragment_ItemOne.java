package com.example.drablehomework;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.drablehomework.adapter.FragmentAdapter1;
import com.example.drablehomework.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class Fragment_ItemOne extends Fragment {
    private FragmentAdapter1 adapter;
    private List<ItemModel> modelList;
    private ListView listViewFrag1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_item1,container,false);

        listViewFrag1 = v.findViewById(R.id.lv_frag1);
        modelList = new ArrayList<>();

        String[] pic = {"drawable/rfa_logo", "drawable/rfi_logo", "drawable/voa_logo", "drawable/abc_logo", "drawable/bayon_logo"};
        int[] image_id = new int[5];
        for(int i = 0; i < 5; i++){
            image_id[i] = getResources().getIdentifier(pic[i], null, "com.example.drablehomework");
        }
        String[] title = {"វិទ្យុអាស៊ីសេរី", "វិទ្យុបារាំងអន្តរជាតិ", "វិទ្យុសម្លេងសហរដ្ឋអាមេរិក", "វិទ្យុអេប៊ីស៊ីកម្ពុជា", "វិទ្យុបាយ័ន"};
        String[] description = {"RFA", "RFI", "VOA", "FM107.5", "FM95.0"};
        for(int i = 0; i < 5; i++){
            ItemModel model = new ItemModel();
            model.setTitle(title[i]);
            model.setDescription(description[i]);
            model.setImgID(image_id[i]);
            modelList.add(model);
        }

        adapter = new FragmentAdapter1(v.getContext(),modelList);
        listViewFrag1.setAdapter(adapter);

        return v;
    }
}
