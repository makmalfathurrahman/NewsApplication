package com.example.newsapplication.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.newsapplication.model.Article


@Database(
    entities = [Article::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class ArticleDatabase: RoomDatabase() {

    abstract fun dao(): ArticleDao

    companion object {
        private var instance: ArticleDatabase? = null

        fun getInstance(context: Context): ArticleDatabase {
            if (instance == null) {
                synchronized(ArticleDatabase::class.java) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ArticleDatabase::class.java,
                        "new_article"
                    ).build()
                }
            }
            return instance as ArticleDatabase
        }
    }

}