package com.example.googleplay

// AppAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplay.R
import com.example.googleplay.App

class AppAdapter(private val appList: List<App>) : RecyclerView.Adapter<AppAdapter.AppViewHolder>() {

    class AppViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val appIcon: ImageView = itemView.findViewById(R.id.app_icon)
        val appName: TextView = itemView.findViewById(R.id.app_name)
        val appRating: RatingBar = itemView.findViewById(R.id.app_rating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_app, parent, false)
        return AppViewHolder(view)
    }

    override fun getItemCount(): Int {
        return appList.size
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        val app = appList[position]
        holder.appIcon.setImageResource(app.icon)
        holder.appName.text = app.name
        holder.appRating.rating = app.rating
    }
}
