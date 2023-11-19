package com.example.googleplay
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplay.R
import com.example.googleplay.CategoryAdapter
import com.example.googleplay.App
import com.example.googleplay.Category

class MainActivity : AppCompatActivity() {

    private lateinit var categoryRecyclerView: RecyclerView
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var categoryList: List<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryList = listOf(
            Category("Đặt vé máy bay", listOf(
                App("Traveloka", 4.5f, R.drawable.traveloka),
                App("Vietnam Airlines", 4.3f, R.drawable.vietnam_airlines),
                App("Bamboo Airways", 4.4f, R.drawable.bamboo_airways),
                App("Vietjet Air", 4.2f, R.drawable.vietjet_air),
                App("Skyscanner", 4.6f, R.drawable.skyscanner)
            )),
            Category("Ứng dụng phổ biến", listOf(
                App("Facebook", 4.2f, R.drawable.facebook),
                App("Instagram", 4.4f, R.drawable.instagram),
                App("TikTok", 4.5f, R.drawable.tiktok),
                App("Zalo", 4.3f, R.drawable.zalo),
                App("YouTube", 4.6f, R.drawable.youtube)
            )),
            Category("Ứng dụng học tập", listOf(
                App("Duolingo", 4.7f, R.drawable.duolingo),
                App("Coursera", 4.5f, R.drawable.coursera),
                App("Khan Academy", 4.6f, R.drawable.khan_academy),
                App("Quizlet", 4.8f, R.drawable.quizlet),
                App("TED", 4.7f, R.drawable.ted)
            ))
        )

        categoryRecyclerView = findViewById(R.id.category_recycler_view)
        categoryAdapter = CategoryAdapter(categoryList)
        categoryRecyclerView.adapter = categoryAdapter
        categoryRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}
