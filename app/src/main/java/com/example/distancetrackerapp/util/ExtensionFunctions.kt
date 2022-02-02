package com.example.distancetrackerapp.util

import android.view.View
import android.widget.Button
import androidx.core.view.isVisible

object ExtensionFunctions {

    fun View.show() {
//        this.visibility = View.VISIBLE
        this.isVisible = true
    }

    fun View.hide() {
//        this.visibility = View.INVISIBLE
        this.isVisible = false
    }

    fun Button.enable() {
        this.isEnabled = true
    }

    fun Button.disable() {
        this.isEnabled = false
    }

}