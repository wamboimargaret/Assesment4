package megan.wamboi.assesment

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao

interface PostDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPost(post: Post)

    @Query("SELECT * FROM Post ORDER BY dislayName")
    fun getAllPost(): LiveData<List<Post>>

    @Query("SELECT*FROM Post WHERE postId= :postId")
    fun getPostId(postId: Int): LiveData<Post>

}

//annotation class Dao
//
//annotation class Query(val value: String)


