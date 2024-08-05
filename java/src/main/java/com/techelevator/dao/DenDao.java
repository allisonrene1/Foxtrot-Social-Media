package com.techelevator.dao;

import com.techelevator.model.DenDto;
import com.techelevator.model.PostDto;
import com.techelevator.model.ResponseDto;

import java.util.List;

public interface DenDao {

    List<DenDto> retrieveAllDens();

    List<PostDto> retrievePostsByDenName(String denName);

    List<ResponseDto> retrieveResponsesByPost(String denName, int postId);

    List<String> retrieveCategoriesForDen(int denId);

    DenDto createNewDen(DenDto newDen);

}
