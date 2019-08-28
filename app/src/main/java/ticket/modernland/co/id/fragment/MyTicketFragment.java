package ticket.modernland.co.id.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ticket.modernland.co.id.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyTicketFragment extends Fragment {


    public MyTicketFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_ticket, container, false);
    }

}
