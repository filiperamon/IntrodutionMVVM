package com.example.nybooks.data.response

import com.google.gson.annotations.SerializedName

data class BookResultsResponse(
    @SerializedName("book_details")
    val bookDetails: List<BookDetailsResponse>
)