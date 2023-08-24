package megan.wamboi.assesment

import android.content.Context



@Database(entities = arrayOf(Post::class), version = 1)
abstract class PostDb:RoomDatabase() {
    abstract fun getPostDao():PostDao
    companion object{
        private var database: PostDb? = null

        fun getDatabase(context: Context): PostDb{
            if (database==null){
                database = Room
                    .databaseBuilder(context, PostDb::class.java, "PostDb")
                    .build()
            }
            return database as PostDb
        }
    }
}