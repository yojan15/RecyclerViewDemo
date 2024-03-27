package com.example.recyclerviewdemo
//fun bind(data: Data) {
//    itemView.titleTextView.text = data.title
//    itemView.descriptionTextView.text = data.description
//
//    // Handling different types of media
//    if (data.mediaName.isNotEmpty()) {
//        val media = data.mediaName[0]
//        when (media.type) {
//            "png" -> {
//                Glide.with(itemView.context).load(media.name).into(itemView.imageView)
//            }
//            "pdf" -> {
//                // Show PDF icon or load PDF thumbnail
//                itemView.imageView.setImageResource(R.drawable.pdf_icon)
//            }
//            "mp4" -> {
//                itemView.imageView.setImageResource(R.drawable.video_icon)
//            }
//            "xml" -> {
//                itemView.imageView.setImageResource(R.drawable.xml_icon)
//            }
//            else -> {
//                // Handle other types of media if necessary
//            }
//        }
//    }
//}
