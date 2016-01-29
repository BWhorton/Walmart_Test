package com.interview.api;

import static org.junit.Assert.*;

import org.junit.Test;

import com.interview.model.Product;

public class SearchAPITest {

	@Test
	public void testRetriveItemId() {
        Product item = new Product();
        item.setItemName("ipod");
		SearchAPI search = new SearchAPI();
		assertNotNull(search.retriveItemId(item));
	}

}
