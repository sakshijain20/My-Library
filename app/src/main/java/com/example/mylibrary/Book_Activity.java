package com.example.mylibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {
    TextView tvTitle,tvDescription,tvCategory;
    ImageView ivImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        tvTitle=findViewById(R.id.tvTitle);
        tvCategory=findViewById(R.id.tvCategory);
        tvDescription=findViewById(R.id.tvDescription);
        ivImage=findViewById(R.id.ivImage);

        Intent intent=getIntent();
        String Title=intent.getExtras().getString("Title");
        String Description=intent.getExtras().getString("Description");
        String Category=intent.getExtras().getString("Category");
        int Image=intent.getExtras().getInt("Book Image");

        tvDescription.setText(Description);
        tvCategory.setText(Category);
        tvTitle.setText(Title);
        ivImage.setImageResource(Image);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id=item.getItemId();
        if(id==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
