package ticket.modernland.co.id.fragment;


import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import ticket.modernland.co.id.MainActivity;
import ticket.modernland.co.id.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewTicketFragment extends Fragment {

    Spinner spnKategori, spnSubKategori;


    public NewTicketFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View x = inflater.inflate(R.layout.fragment_new_ticket, container, false);

        spnKategori = x.findViewById(R.id.spnKategori);
        spnSubKategori = x.findViewById(R.id.spnSubKategori);

        final String pilihkategori [] = {"Pilih Kategori Masalah", "DATA", "SYSTEM"};
        final String nokategori [] = {"Pilih Sub Kategori"};
        final String data [] = {"BUGS FORM", "REQUEST FORM", "REQUEST REPORT"};
        final String system [] = {"DATA ERROR"};

        spnKategori.setAdapter(new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_dropdown_item,pilihkategori));

        spnKategori.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemSelect = pilihkategori[position];

                if (position == 0){
                    spnSubKategori.setAdapter(new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_dropdown_item,nokategori));
                }

                if (position == 1){
                    spnSubKategori.setAdapter(new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_dropdown_item,data));
                }

                if (position == 2){
                    spnSubKategori.setAdapter(new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_dropdown_item,system));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button bSubmit = (Button) x.findViewById(R.id.btn_submit);
        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),
                        "New Submit Sukses",
                        Toast.LENGTH_LONG).show();
            }
        });

        Button bCancel = (Button) x.findViewById(R.id.btn_cancel);
        bCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager()
                        .popBackStackImmediate();
            }
        });

        Button bGallery = (Button) x.findViewById(R.id.btn_gallery);
        ImageView imgFoto = (ImageView) x.findViewById(R.id.img_foto);
        bGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        return x;
    }


}
