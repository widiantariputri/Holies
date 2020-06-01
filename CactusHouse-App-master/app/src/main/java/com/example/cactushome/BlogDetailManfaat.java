package com.example.cactushome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class BlogDetailManfaat extends AppCompatActivity {

    private RecyclerView rvBlog;
    private ArrayList<Blog> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog_detail_manfaat);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ImageView like      = (ImageView) findViewById(R.id.like);
        final ImageView dislike   = (ImageView) findViewById(R.id.dislike);
        final ImageView comment   = (ImageView) findViewById(R.id.comment);
        final ImageView share     = (ImageView) findViewById(R.id.share);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Artikel blog disukai", Toast.LENGTH_LONG).show();
                like.setColorFilter(getResources().getColor(R.color.colorPrimary));
            }
        });
        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Artikel blog tidak disukai", Toast.LENGTH_LONG).show();
                dislike.setColorFilter(getResources().getColor(R.color.colorPrimary));
            }
        });
        comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Anda mengomentari artikel blog ini", Toast.LENGTH_LONG).show();
                comment.setColorFilter(getResources().getColor(R.color.colorPrimary));
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Anda membagikan artikel blog ini", Toast.LENGTH_LONG).show();
                share.setColorFilter(getResources().getColor(R.color.colorPrimary));
            }
        });

        rvBlog = findViewById(R.id.rv_heroes);
        rvBlog.setHasFixedSize(true);

        list.addAll(BlogData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvBlog.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        CardViewBlogAdapter cardBlogAdapter = new CardViewBlogAdapter(list);
        rvBlog.setAdapter(cardBlogAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_home:
                Intent intent = new Intent(BlogDetailManfaat.this, BlogActivity.class);
                startActivity(intent);
                break;
            case R.id.action_about:
                Intent intent_about = new Intent(BlogDetailManfaat.this, AboutActivity.class);
                startActivity(intent_about);
                break;
        }
    }
}
