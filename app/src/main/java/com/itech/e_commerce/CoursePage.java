package com.itech.e_commerce;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CoursePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);

//        ConstraintLayout courseBg = findViewById(R.id.coursePageBg);
//        ImageView courseImage = findViewById(R.id.coursePageImage);
//        TextView courseTitle = findViewById(R.id.coursePageTitle);
//        TextView courseDate = findViewById(R.id.courseDate);
//        TextView courseLevel = findViewById(R.id.courseLevel);
//        TextView courseText = findViewById(R.id.coursePageText);
//
//        courseBg.setBackgroundColor(getIntent().getIntExtra("courseBg", 0));
//        courseImage.setImageResource(getIntent().getIntExtra("courseImage",0));
//        courseTitle.setText(getIntent().getStringExtra("courseTitle"));
//        courseDate.setText(getIntent().getStringExtra("courseDate"));
//        courseLevel.setText(getIntent().getStringExtra("courseLevel"));
//        courseText.setText(getIntent().getStringExtra("courseText"));
    }
}