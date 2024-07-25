package com.example.dto;

public interface OAuth2Response {

	String getProvider(); // 제공자 (naver, google ...)
	String getProviderId(); // // 제공자가 각각의 유저에 대하여 발급한 아이디이다.
	String getEmail();
	String getName();
	String getMobile();
	
}
