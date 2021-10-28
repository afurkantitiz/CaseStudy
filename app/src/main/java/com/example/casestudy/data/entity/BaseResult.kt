package com.example.casestudy.data.entity

import com.google.gson.annotations.SerializedName

data class BaseResult(
    @SerializedName("artistName")
    val artistName: String?,
    @SerializedName("artworkUrl100")
    val artworkUrl100: String?,
    @SerializedName("currency")
    val currency: String?,
    @SerializedName("trackName")
    val trackName: String?,
    @SerializedName("kind")
    val kind: String?,
    @SerializedName("releaseDate")
    val releaseDate: String?,
    @SerializedName("collectionPrice")
    val collectionPrice: String?,
    @SerializedName("price")
    val price: String?,
    @SerializedName("collectionName")
    val collectionName: String?,
)