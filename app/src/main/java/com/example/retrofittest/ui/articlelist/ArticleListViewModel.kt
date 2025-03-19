package com.example.ui.articlelist

import androidx.lifecycle.*
import com.example.data.model.Article
import com.example.data.network.RetrofitClient
import kotlinx.coroutines.launch

class ArticleListViewModel : ViewModel() {
    private val _articles = MutableLiveData<List<Article>>()
    val articles: LiveData<List<Article>> = _articles

    fun fetchArticles() {
        viewModelScope.launch {
            try {
                _articles.value = RetrofitClient.apiService.getArticles()
            } catch (e: Exception) {
                // handle error
            }
        }
    }
}