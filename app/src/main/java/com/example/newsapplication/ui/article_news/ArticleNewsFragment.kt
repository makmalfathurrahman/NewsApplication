package com.example.newsapplication.ui.article_news

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.newsapplication.MainActivity
import com.example.newsapplication.R
import com.example.newsapplication.database.NewsViewModel

class ArticleNewsFragment: Fragment(R.layout.fragment_article_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }

}