package megan.wamboi.assesment

import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext



class PostRepository {
    val database = PostDb.getDatabase(MyPostApp.appContext)

    suspend fun saveContact(post:Post){
        withContext(Dispatchers.IO){
            database.getPostDao().insertPost(post)
        }
    }

    fun getAllPost(): LiveData<List<Post>> {
        return database.getPostDao().getAllPost()
    }
    fun getPostById(postId: Int): LiveData<Post> {
        return  database.getPostDao().getPostId(postId)
    }
}