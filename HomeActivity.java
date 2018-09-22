package com.example.asd.androidbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class HomeActivity extends AppCompatActivity {
    String[] Names ={
                     "About Android",
            "History","Architecture",
            "LifeCycle","ViewGroups",
            "Views"
    };
    Integer [] images = { R.drawable.ab1,
            R.drawable.h1, R.drawable.arc4,
            R.drawable.lyf2,R.drawable.arc3,
            R.drawable.arc2

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        GridView gridView= findViewById(R.id.grid);
        MyAdapter myAdapter = new MyAdapter(this,Names,images);
        gridView.setAdapter(myAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                    { Intent intent1=new Intent(HomeActivity.this,AboutAndroid.class);
                        startActivity(intent1);
                    break;}
                    case 1:
                    {
                        Intent intent2=new Intent(HomeActivity.this,History.class);
                        startActivity(intent2);
                        break;
                    }
                    case 2:
                    {
                        Intent intent3=new Intent(HomeActivity.this,Architecture.class);
                        startActivity(intent3);
                        break;
                    }
                    case 3:
                    {
                        Intent intent4=new Intent(HomeActivity.this,LifeCycle.class);
                        startActivity(intent4);
                    break;
                    }
                    case 4:
                    {
                        Intent intent5=new Intent(HomeActivity.this,ViewGroups.class);
                        startActivity(intent5);
                    break;
                    }
                    case 5:
                    {
                        Intent intent6=new Intent(HomeActivity.this,Views.class);
                        startActivity(intent6);
                    break;
                    }
                }
            }
        });

    }
}
