package com.example.nybooks.presetation.books

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nybooks.R
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolBarBooks.title = resources.getString(R.string.title_books)
        setSupportActionBar(toolBarBooks)

        val viewModel: BooksViewModel = ViewModelProviders.of(this).get(BooksViewModel::class.java)

        viewModel.booksLiveData.observe(this, Observer {
            it?.let { books ->
                with(recycleBooks){
                    layoutManager = LinearLayoutManager(this@BooksActivity ,RecyclerView.VERTICAL,false)
                    setHasFixedSize(true)
                    adapter = BooksAdapter(books)
                }
            }
        })

        viewModel.getBooks()
    }


}