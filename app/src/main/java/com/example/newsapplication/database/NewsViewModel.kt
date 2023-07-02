package com.example.newsapplication.database

import androidx.lifecycle.ViewModel
import com.example.newsapplication.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}