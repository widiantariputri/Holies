package com.example.cactushome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.Switch;

import java.util.ArrayList;

public class BlogActivity extends AppCompatActivity {

    private RecyclerView rvBlog;
    private ArrayList<Blog> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        Switch blogSwitch;
        blogSwitch = (Switch) findViewById(R.id.mySwitch);
        blogSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    showRecyclerGrid();
                } else {
                    showRecyclerList();
                }

            }
        });

        rvBlog = findViewById(R.id.rv_heroes);
        rvBlog.setHasFixedSize(true);

        list.addAll(BlogData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvBlog.setLayoutManager(new LinearLayoutManager(this));
        ListBlogAdapter listBlogAdapter = new ListBlogAdapter(list);
        rvBlog.setAdapter(listBlogAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    private void showRecyclerGrid(){
        rvBlog.setLayoutManager(new GridLayoutManager(this, 2));
        GridBlogAdapter gridHeroAdapter = new GridBlogAdapter(list);
        rvBlog.setAdapter(gridHeroAdapter);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_home:
                Intent intent = new Intent(BlogActivity.this, BlogActivity.class);
                startActivity(intent);
                break;
            case R.id.action_about:
                Intent intent_about = new Intent(BlogActivity.this, AboutActivity.class);
                startActivity(intent_about);
                break;
        }
    }
}
