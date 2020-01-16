package com.simplemobiletools.gallery.pro.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "favorites", indices = [Index(value = ["full_path"], unique = true)])
data class Favorite(
        @PrimaryKey(autoGenerate = true) var id: Int?,
        @ColumnInfo(name = "full_path") var fullPath: String,
        @ColumnInfo(name = "file_name") var fileName: String,
        @ColumnInfo(name = "parent_path") var parentPath: String)
