package com.submission.common.ext

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.submission.common.entity.source.Source

object Constants {
    const val DEFAULT_PAGE_SIZE = 10
    const val BASE_URL = "https://newsapi.org/v2/"
    const val API_KEY = "0041ac92533c4e2994c7ba22acb4e256"
    const val API_KEY2 = "632252ee12964e3f9fa232461418625c"
    fun getImageFromUrl(source: Source) =
        "https://t0.gstatic.com/faviconV2?client=SOCIAL&type=FAVICON&fallback_opts=TYPE,SIZE,URL&url= ${source.url} &size=128"


    fun ImageView.loadImageFromUrl(url: String) {
        Glide.with(this).load(url).into(this)
    }
}