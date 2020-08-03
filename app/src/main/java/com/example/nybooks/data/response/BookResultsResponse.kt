package com.example.nybooks.data.response

import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class BookResultsResponse (
    @SerializedName("book_details")
    val bookDetails: List<BookDetailsResponse>
)