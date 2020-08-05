package com.example.nybooks.presetation.details

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nybooks.R
import com.example.nybooks.presetation.base.BaseActivity
import kotlinx.android.synthetic.main.activity_books_details.*
import kotlinx.android.synthetic.main.include_toolbar.*

class BooksDetailsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books_details)

        this.setupToolbar(toolBarBooks, R.string.title_books_detail)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val description = intent.getStringExtra(EXTRA_DESCRIPTION)

        book_label_title.text = title
        book_label_detail.text = description
    }

    companion object {
        private const val EXTRA_TITLE = "extra_title"
        private const val EXTRA_DESCRIPTION = "extra_description"

        fun getStartIntent(context: Context, title: String, description: String): Intent {
            return Intent(context, BooksDetailsActivity::class.java).apply {
                putExtra(EXTRA_TITLE, title)
                putExtra(EXTRA_DESCRIPTION, description)
            }
        }
    }
}