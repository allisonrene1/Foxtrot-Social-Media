package com.techelevator.model;

public class ResponseDto {

    private int responseId;
    private String responseDesc;
    private int postId;
    private int creatorId;
    private String creatorName;
    private String denName;
    private int upvotes;
    private int downvotes;

    private boolean pinned;
    public ResponseDto(){

    }

    public ResponseDto(int responseId, String responseDesc, int postId, int creatorId, String creatorName, String denName, int upvotes, int downvotes, boolean pinned) {
        this.responseId = responseId;
        this.responseDesc = responseDesc;
        this.postId = postId;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.denName = denName;
        this.upvotes = upvotes;
        this.downvotes = downvotes;
        this.pinned = pinned;

    }


    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }

    public int getResponseId() {
        return responseId;
    }

    public void setResponseId(int responseId) {
        this.responseId = responseId;
    }

    public String getResponseDesc() {
        return responseDesc;
    }

    public void setResponseDesc(String responseDesc) {
        this.responseDesc = responseDesc;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getDenName() {
        return denName;
    }

    public void setDenName(String denName) {
        this.denName = denName;
    }
}
