package com.itech.e_commerce;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.itech.e_commerce.adapter.CategoryAdapter;
import com.itech.e_commerce.adapter.CourseAdapter;
import com.itech.e_commerce.model.Category;
import com.itech.e_commerce.model.Course;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter categoryAdapter;
    static CourseAdapter courseAdapter;
    static List<Course> courseList = new ArrayList<>();
    static List<Course> fullCourseList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Games"));
        categoryList.add(new Category(2, "Websites"));
        categoryList.add(new Category(3, "Languages"));
        categoryList.add(new Category(4, "Others"));

        setCategoryRecycler(categoryList);

        courseList.add(new Course(
                1,
                3,
                "java_2_2_",
                "Java",
                "10.12.2022",
                "starter",
                "#424345",
                "It is a good course to learn java developing")
        );
        courseList.add(new Course(
                2,
                3,
                "python_3",
                "Python",
                "11.12.2022",
                "beginner",
                "#9FA52D",
                "It is a good course to learn python developing")
        );

        fullCourseList.addAll(courseList);

        setCourseRecycler(courseList);
    }

    public void openShoppingCart(View view) {
        Intent intent = new Intent(this, OrderPage.class);
        startActivity(intent);

    }

    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                this,
                RecyclerView.HORIZONTAL,
                false
        );

        courseRecycler = findViewById(R.id.courseRecycler);
        courseRecycler.setLayoutManager(layoutManager);
        courseAdapter = new CourseAdapter(this, courseList);
        courseRecycler.setAdapter(courseAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                this,
                RecyclerView.HORIZONTAL,
                false
        );

        categoryRecycler = findViewById(R.id.categoryRecyclerView);
        categoryRecycler.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }

    public static void showCoursesByCategory(int category) {
        courseList.clear();
        courseList.addAll(fullCourseList);

        List<Course> filterCourses = new ArrayList<>();

        for (Course c : courseList) {
            if (c.getCategory() == category)
                filterCourses.add(c);
        }

        courseList.clear();
        courseList.addAll(filterCourses);

        courseAdapter.notifyDataSetChanged();
    }
}
