package com.home.androidkotlincoroutinesdemo2.user.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.home.androidkotlincoroutinesdemo2.R
import com.home.androidkotlincoroutinesdemo2.databinding.ActivityZooBinding
import com.home.androidkotlincoroutinesdemo2.user.adapter.ZooAdapter
import com.home.androidkotlincoroutinesdemo2.user.viewmodel.ZooViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ZooActivity : AppCompatActivity() {

    private val viewModel by viewModel<ZooViewModel>()
    private val binding by lazy {
        DataBindingUtil.setContentView<ActivityZooBinding>(this, R.layout.activity_zoo)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this // 讓DataBinding具有lifecycle-aware性質
        observeOneHundredAnimal()
        observeError()
        setupRecyclerView()
    }

    override fun onResume() {
        super.onResume()
        viewModel.getOneHundredAnimal()
    }

    private fun setupRecyclerView() {
        val dividerItemDecoration = DividerItemDecoration(
            binding.recyclerView.context,
            (binding.recyclerView.layoutManager as LinearLayoutManager).orientation
        )
        binding.recyclerView.addItemDecoration(dividerItemDecoration)
    }

    private fun observeOneHundredAnimal() {
        viewModel.oneHundredAnimal().observe(this,
            Observer { response ->
                if (response != null) {
                    binding.recyclerView.adapter = ZooAdapter(response)
                }
            }
        )
    }

    private fun observeError() {
        viewModel.error().observe(this,
            Observer { t -> Log.e("more", "$t") })
    }
}