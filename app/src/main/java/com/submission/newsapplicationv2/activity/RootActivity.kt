package com.submission.newsapplicationv2.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.submission.newsapplicationv2.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RootActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.root)
    }
}