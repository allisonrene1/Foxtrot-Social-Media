package com.techelevator.dao;

import com.techelevator.model.CategoryDTO;
import com.techelevator.model.DenDto;
import com.techelevator.model.PostDto;
import com.techelevator.model.ResponseDto;

import java.util.List;

public interface DenDao {

    List<DenDto> retrieveAllDens();

    List<CategoryDTO> retrieveAllCategories();

    List<PostDto> retrievePostsByDenName(String denName);

    List<ResponseDto> retrieveResponsesByPost(String denName, int postId);

    ResponseDto createNewResponse(ResponseDto newResponse);

    List<String> retrieveCategoriesForDen(int denId);

    DenDto createNewDen(DenDto newDen);

    PostDto createNewPost(PostDto newPost);

    PostDto pinPost(PostDto postToPin);

    void deleteDenByDenName(String denName);

    void deletePostByPostId(int postId);

    void deleteCommentByCommentId(int responseId);


}
