package com.example.data.model

import android.R
import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Article(
 val id: Int,
 val title: String,
 val content: String,
 val imageUrl: String,
 val abc: String
) : Parcelable {
 override fun describeContents(): Int {
  TODO("Not yet implemented")
 }

 override fun writeToParcel(p0: Parcel, p1: Int) {
  TODO("Not yet implemented")
 }
}