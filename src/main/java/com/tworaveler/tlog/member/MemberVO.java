package com.tworaveler.tlog.member;

import java.util.HashMap;
import java.util.List;

import com.tworaveler.tlog.log.LogVO;

public class MemberVO {
	//user
	private int userNum;
	private String idKakao;
	private String idGoogle;
	private String userNick;
	private String profileImg;
	private String registerDate;
	private int status;
	
	//tag
	private List<LogVO> tagList;
	private int tagNum;
	private String tagName;
	private int tagCount;
	
	//follow
	private int followingNum;
	private int followerNum;
	
	/*
	 * //카카오 public MemberVO(HashMap<String, String> kakaoInfo) { idKakao =
	 * kakaoInfo.get("id"); userNick = kakaoInfo.get("nickname"); profileImg =
	 * kakaoInfo.get("profile"); }
	 */
	
	public List<LogVO> getTagList() {
		return tagList;
	}

	public void setTagList(List<LogVO> tagList) {
		this.tagList = tagList;
	}

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}

	public String getIdKakao() {
		return idKakao;
	}

	public void setIdKakao(String idKakao) {
		this.idKakao = idKakao;
	}

	public String getIdGoogle() {
		return idGoogle;
	}

	public void setIdGoogle(String idGoogle) {
		this.idGoogle = idGoogle;
	}

	public String getUserNick() {
		return userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTagNum() {
		return tagNum;
	}

	public void setTagNum(int tagNum) {
		this.tagNum = tagNum;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public int getFollowingNum() {
		return followingNum;
	}

	public void setFollowingNum(int followingNum) {
		this.followingNum = followingNum;
	}

	public int getFollowerNum() {
		return followerNum;
	}

	public void setFollowerNum(int followerNum) {
		this.followerNum = followerNum;
	}

	public int getTagCount() {
		return tagCount;
	}

	public void setTagCount(int tagCount) {
		this.tagCount = tagCount;
	}
	
	
}
