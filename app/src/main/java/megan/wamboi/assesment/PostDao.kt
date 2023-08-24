package megan.wamboi.assesment

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy


@Dao

interface PostDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPost(post: Post)

    @Query("SELECT * FROM Contacts ORDER BY dislayName")
    fun getAllPost(): LiveData<List<Post>>

    @Query("SELECT*FROM Contacts WHERE contactId= :contactId")
    fun getPostId(postId: Int): LiveData<Post>

}

annotation class Dao

annotation class Query(val value: String)


