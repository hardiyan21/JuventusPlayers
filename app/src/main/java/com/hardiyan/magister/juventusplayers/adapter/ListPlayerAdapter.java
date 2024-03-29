package com.hardiyan.magister.juventusplayers.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.hardiyan.magister.juventusplayers.Aaron_Ramsey;
import com.hardiyan.magister.juventusplayers.Adrien_Rabiot;
import com.hardiyan.magister.juventusplayers.Alex_Sandro;
import com.hardiyan.magister.juventusplayers.Christiano_Ronaldo;
import com.hardiyan.magister.juventusplayers.Federico_Bernardeschi;
import com.hardiyan.magister.juventusplayers.Gigi_Buffon;
import com.hardiyan.magister.juventusplayers.Juan_Cuadrado;
import com.hardiyan.magister.juventusplayers.Leonardo_Bonucci;
import com.hardiyan.magister.juventusplayers.Luca_Pellegrini;
import com.hardiyan.magister.juventusplayers.MainActivity;
import com.hardiyan.magister.juventusplayers.Matthijs_Delight;
import com.hardiyan.magister.juventusplayers.Paulo_Dybala;
import com.hardiyan.magister.juventusplayers.R;
import com.hardiyan.magister.juventusplayers.model.Player;

import java.util.ArrayList;

public class ListPlayerAdapter extends RecyclerView.Adapter<ListPlayerAdapter.ListViewHolder>{
    private ArrayList<Player> listPlayer;

    public ListPlayerAdapter(ArrayList<Player> list) {
        this.listPlayer = list;
    }


    @NonNull
    @Override
    public ListPlayerAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_juve, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Player player = listPlayer.get(position);

        Glide.with(holder.itemView.getContext())
                .load(player.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(player.getName());
        holder.tvFrom.setText(player.getFrom());

    }

    @Override
    public int getItemCount() { return listPlayer.size(); }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvFrom;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFrom = itemView.findViewById(R.id.tv_item_from);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    switch (getAdapterPosition()) {
                        case 0 :
                            intent = new Intent(view.getContext(), Paulo_Dybala.class);
                            break;
                        case 1 :
                            intent = new Intent(view.getContext(), Adrien_Rabiot.class);
                            break;
                        case 2 :
                            intent = new Intent(view.getContext(), Leonardo_Bonucci.class);
                            break;
                        case 3 :
                            intent = new Intent(view.getContext(), Aaron_Ramsey.class);
                            break;
                        case 4 :
                            intent = new Intent(view.getContext(), Luca_Pellegrini.class);
                            break;
                        case 5 :
                            intent = new Intent(view.getContext(), Christiano_Ronaldo.class);
                            break;
                        case 6 :
                            intent = new Intent(view.getContext(), Alex_Sandro.class);
                            break;
                        case 7 :
                            intent = new Intent(view.getContext(), Matthijs_Delight.class);
                            break;
                        case 8 :
                            intent = new Intent(view.getContext(), Federico_Bernardeschi.class);
                            break;
                        case 9 :
                            intent = new Intent(view.getContext(), Juan_Cuadrado.class);
                            break;
                        case 10 :
                            intent = new Intent(view.getContext(), Gigi_Buffon.class);
                            break;
                    }
                    view.getContext().startActivity(intent);
                }
            });
        }
    }
}
