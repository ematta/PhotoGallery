package com.bignerdranch.android.photogallery.api

import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Response

private const val API_KEY: String = "2f646edeed67e1ec50a72f0cbd351bdd"
private const val SECRET: String = "e51938bbc21d46c1"

class PhotoInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalQuest = chain.request()

        val newHttp: HttpUrl = originalQuest.url.newBuilder()
            .addQueryParameter("api_key", API_KEY)
            .addQueryParameter("format", "json")
            .addQueryParameter("nojsoncallback", "1")
            .addQueryParameter("extras", "url_s")
            .addQueryParameter("safe_search", "1")
            .build()

        val newRequest = originalQuest.newBuilder()
            .url(newHttp)
            .build()

        return chain.proceed(newRequest)
    }
}