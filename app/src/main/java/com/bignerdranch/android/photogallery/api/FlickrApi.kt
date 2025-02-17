package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET

private const val TAG: String = "PhotoRepository"
private const val API_KEY: String = "2f646edeed67e1ec50a72f0cbd351bdd"
private const val SECRET: String = "e51938bbc21d46c1"

interface FlickrApi {
    @GET("/")
    suspend fun fetchContents(): String

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
        "&api_key=$API_KEY" +
        "&format=json" +
        "&nojsoncallback=1" +
        "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}