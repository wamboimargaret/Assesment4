package megan.wamboi.assesment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


class PostViewModel: ViewModel() {
    val postRepo= PostRepository

    fun savePost(post:Post){
        viewModelScope.launch {
            postRepo.savePost(post)
        }
    }
    fun getPost():LiveData<List<Post>>{
        return postRepo.getAllPost()
    }
    fun getPostById(postId: Int):LiveData<Post>{
        return PostRepository.getPostById(postId)
    }


}
