package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET
import retrofit2.http.Query


interface FlickrApi {
    @GET("/")
    suspend fun fetchContents(): String

    @GET("services/rest/?method=flickr.interestingness.getList")
    suspend fun fetchPhotos(): FlickrResponse

    @GET("services/rest/?method=flickr.photos.search")
    suspend fun searchPhotos(@Query("text") query: String): FlickrResponse
}