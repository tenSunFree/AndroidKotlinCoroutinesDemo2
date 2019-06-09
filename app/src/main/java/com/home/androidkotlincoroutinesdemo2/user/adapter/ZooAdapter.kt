package com.home.androidkotlincoroutinesdemo2.user.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.facebook.drawee.generic.RoundingParams
import com.home.androidkotlincoroutinesdemo2.R
import com.home.androidkotlincoroutinesdemo2.databinding.ActivityZooRecyclerViewItemBinding
import com.home.androidkotlincoroutinesdemo2.user.data.response.OneHundredAnimalDataResponse

class ZooAdapter(
    private val response: OneHundredAnimalDataResponse
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ListUsersViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.activity_zoo_recycler_view_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as ListUsersViewHolder).binding
        val user = response.result.results[position]
        loadImage(binding, user)
        binding.user = user
    }

    /**
     * 加載頭像, 並設置成圓角
     */
    private fun loadImage(
        binding: ActivityZooRecyclerViewItemBinding,
        user: OneHundredAnimalDataResponse.Result.Result
    ) {
        val radius = 5f
        val roundingParams = RoundingParams.fromCornersRadius(radius)
        roundingParams.roundAsCircle = true
        binding.simpleDraweeView.hierarchy.roundingParams = roundingParams // 設置圓角
        binding.simpleDraweeView.setImageURI(user.imageUrl) // 設置頭像
    }

    override fun getItemCount() = response.result.results.size
}

class ListUsersViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val binding: ActivityZooRecyclerViewItemBinding = ActivityZooRecyclerViewItemBinding.bind(view)
}