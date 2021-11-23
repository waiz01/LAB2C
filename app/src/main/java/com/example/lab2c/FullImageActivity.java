package com.example.lab2c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class FullImageActivity extends Activity {

@Override
public void onCreate(Bundle savedInstanceState){

    super.onCreate(savedInstanceState);
    setContentView(R.layout.full_image);

    Intent i = getIntent();

    int position = i.getExtras().getInt("id");
    ImageAdapter imageAdapter = new ImageAdapter(this);
    ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
    imageView.setImageResource(imageAdapter.thumbImages[position]);
}

}
