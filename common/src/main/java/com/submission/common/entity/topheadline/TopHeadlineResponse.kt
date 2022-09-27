package com.submission.common.entity.topheadline


import com.google.gson.annotations.SerializedName

data class TopHeadlineResponse(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)