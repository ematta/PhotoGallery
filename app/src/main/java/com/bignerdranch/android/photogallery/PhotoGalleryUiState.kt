package com.bignerdranch.android.photogallery

import com.bignerdranch.android.photogallery.api.GalleryItem

data class PhotoGalleryUiState(
    val images: List<GalleryItem> = listOf(),
    val query: String = "",
    val isPolling: Boolean = false
)