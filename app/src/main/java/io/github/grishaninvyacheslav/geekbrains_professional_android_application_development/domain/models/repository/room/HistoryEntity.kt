package io.github.grishaninvyacheslav.geekbrains_professional_android_application_development.domain.models.repository.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(indices = arrayOf(Index(value = arrayOf("word"), unique = true)))
class HistoryEntity(
    @field:PrimaryKey
    @field:ColumnInfo(name = "word")
    var word: String,
    @field:ColumnInfo(name = "phonetic")
    var phonetic: String?
)