package com.spring.chatgpt.dto;

import java.util.List;
import java.util.ArrayList;
import lombok.Data;

@Data
public class ChatGptRequest {
	
	
	private String model;
	private List<Message> messages;
	
	public ChatGptRequest(String model, String prompt) {
		super();
		this.model = model;
		this.messages = new ArrayList<>();
        this.messages.add(new Message("user",prompt));
	}

}
