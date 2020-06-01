package com.example.cactushome;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewBlogAdapter extends RecyclerView.Adapter<CardViewBlogAdapter.CardViewViewHolder> {
    private ArrayList<Blog> listBlog;

    public CardViewBlogAdapter(ArrayList<Blog> list) {
        this.listBlog = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

        Blog blog = listBlog.get(position);
        Glide.with(holder.itemView.getContext())
                .load(blog.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvName.setText(blog.getName());
    }

    @Override
    public int getItemCount() {
        return listBlog.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        Button btnMark, btnRead;
        Context context;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            btnMark = itemView.findViewById(R.id.item_btn_mark);
            btnRead = itemView.findViewById(R.id.item_btn_read);
            context = itemView.getContext();

            btnMark.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Post telah ditandai dan masuk dalam list daftar yang akan dibaca", Toast.LENGTH_LONG).show();
                }
            });
            btnRead.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (getAdapterPosition()) {
                        case 0:
                            Intent intent = new Intent(context, BlogDetail.class);
                            context.startActivity(intent);
                            break;
                        case 1:
                            Intent intentJenis = new Intent(context, BlogDetailJenis.class);
                            context.startActivity(intentJenis);
                            break;
                        case 2:
                            Intent intentBegini = new Intent(context, BlogDetailBegini.class);
                            context.startActivity(intentBegini);
                            break;
                        case 3:
                            Intent intentManfaat = new Intent(context, BlogDetailManfaat.class);
                            context.startActivity(intentManfaat);
                            break;
                        case 4:
                            Intent intentDesain = new Intent(context, BlogDetailDesain.class);
                            context.startActivity(intentDesain);
                            break;
                        case 5:
                            Intent intentTips = new Intent(context, BlogDetailTips.class);
                            context.startActivity(intentTips);
                            break;
                        case 6:
                            Intent intentLangkah = new Intent(context, BlogDetailLangkah.class);
                            context.startActivity(intentLangkah);
                            break;
                        case 7:
                            Intent intentTipsMerawat = new Intent(context, BlogDetailTipsMerawat.class);
                            context.startActivity(intentTipsMerawat);
                            break;
                        case 8:
                            Intent intentTanaman = new Intent(context, BlogDetailTanaman.class);
                            context.startActivity(intentTanaman);
                            break;
                        case 9:
                            Intent intentKaktus = new Intent(context, BlogDetailKaktus.class);
                            context.startActivity(intentKaktus);
                            break;
                        default:
                            Toast.makeText(v.getContext(), "Silahkan klik list 1-10", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
