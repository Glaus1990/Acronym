package com.example.acronym.util

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager

fun Activity.hideKeyboad() {
    (this.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager)?.let {
        it.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
    }
}