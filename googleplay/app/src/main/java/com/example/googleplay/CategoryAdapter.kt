package com.example.googleplay
// CategoryAdapter.kt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplay.R
import com.example.googleplay.Category

class CategoryAdapter(private val categoryList: List<Category>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryName: TextView = itemView.findViewById(R.id.category_name)
        val appRecyclerView: RecyclerView = itemView.findViewById(R.id.app_recycler_view)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoryViewHolder(view)
    }
    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categoryList[position]
        holder.categoryName.text = category.name
        holder.appRecyclerView.adapter = AppAdapter(category.apps)
        holder.appRecyclerView.layoutManager = LinearLayoutManager(holder.itemView.context, LinearLayoutManager.HORIZONTAL, false)
    }
}
