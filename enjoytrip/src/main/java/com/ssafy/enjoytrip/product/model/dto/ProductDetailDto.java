package com.ssafy.enjoytrip.product.model.dto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;


public class ProductDetailDto {
	
	private int pid;
	private String ownerId;
	private String title;
	private String intro;
	private String content;
	private String warning;
	private String memo;
	private boolean isBooked;
	private int price;
	private int people;
	List<Image> images;


    public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public ProductDetailDto() {
    	
    }
    
	public ProductDetailDto(int pid, String ownerId, String title, String intro, String content, String warning, String memo, boolean isBooked,
			int price, int people) {
		super();
		this.pid = pid;
		this.ownerId = ownerId;
		this.title = title;
		this.intro = intro;
		this.content = content;
		this.warning = warning;
		this.memo = memo;
		this.isBooked = isBooked;
		this.price = price;
		this.people = people;
	}
	
	
	public String getOwnerId() {
		return ownerId;
	}


	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getPeople() {
		return people;
	}


	public void setPeople(int people) {
		this.people = people;
	}


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWarning() {
		return warning;
	}
	public void setWarning(String warning) {
		this.warning = warning;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public void mapping(RequestProductDetailDto requestProductDetailDto) throws IOException{
		this.pid = requestProductDetailDto.getPid();
		this.ownerId = requestProductDetailDto.getOwnerId();
		this.title = requestProductDetailDto.getTitle();
		this.intro = requestProductDetailDto.getIntro();
		this.content = requestProductDetailDto.getContent();
		this.warning = requestProductDetailDto.getWarning();
		this.memo = requestProductDetailDto.getMemo();
		this.price = requestProductDetailDto.getPrice();
		this.people = requestProductDetailDto.getPeople();
	}
	

}
