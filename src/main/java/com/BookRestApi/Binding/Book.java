package com.BookRestApi.Binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Book {

    private Integer bookId;
	
	private String bookName;
	
	private Double bookPrice;

}
