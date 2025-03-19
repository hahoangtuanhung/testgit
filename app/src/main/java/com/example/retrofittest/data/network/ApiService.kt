package com.example.data.network

import com.example.data.model.Article
import retrofit2.http.GET

interface ApiService {
    @GET("articles")
    suspend fun getArticles(): List<Article>
}