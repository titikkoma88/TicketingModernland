package ticket.modernland.co.id.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import ticket.modernland.co.id.R;

public class TicketAdapter extends RecyclerView.Adapter<TicketViewHolder> {

    public ArrayList<ticket> data;

    @NonNull
    @Override
    public TicketViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View x = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_ticket, viewGroup,
                        false);

        TicketViewHolder r = new TicketViewHolder(x);

        return r;
    }

    @Override
    public void onBindViewHolder(@NonNull TicketViewHolder ticketViewHolder, int i) {

        ticket r = data.get(i);
        ticketViewHolder.et_reported.setText(r.reported);
        ticketViewHolder.et_prosummary.setText(r.problem_summary);
        ticketViewHolder.et_idticket.setText(r.id_ticket+ "");

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
