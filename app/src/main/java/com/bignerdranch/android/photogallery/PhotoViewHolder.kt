package com.bignerdranch.android.photogallery

import android.net.Uri
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.bignerdranch.android.photogallery.api.GalleryItem
import com.bignerdranch.android.photogallery.databinding.ListItemGalleryBinding

class PhotoViewHolder(
    private val binding: ListItemGalleryBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(galleryItem: GalleryItem, onItemClicked: (Uri) -> Unit) {
        binding.itemImageView.load(galleryItem.url) {
            placeholder(R.drawable.bill_up_close)
        }
        binding.root.setOnClickListener { onItemClicked(galleryItem.photoPageUri) }
    }
}