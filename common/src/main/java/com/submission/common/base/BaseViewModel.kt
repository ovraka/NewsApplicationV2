package com.submission.common.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.navigation.NavDirections
import com.submission.common.ext.SingleLiveEvent

open class BaseViewModel(application: Application) : AndroidViewModel(application) {
    val navigationtEvent = SingleLiveEvent<NavDirections>()
    val popBackStackEvent = SingleLiveEvent<Any>()
    var parent:BaseViewModel? = null

    fun navigate(nav: NavDirections) {
        navigationtEvent.postValue(nav)
    }

    fun popBackStack(){
        popBackStackEvent.postValue(Any())
    }
}