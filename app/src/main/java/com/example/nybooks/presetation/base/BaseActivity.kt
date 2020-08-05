package com.example.nybooks.presetation.base

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

open class BaseActivity : AppCompatActivity() {

    protected fun setupToolbar(toolbarCustom: Toolbar, titleIdRes: Int) {
        toolbarCustom.title = getString(titleIdRes)
        this.setSupportActionBar(toolbarCustom)

    }
}