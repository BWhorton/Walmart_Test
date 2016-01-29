package com.interview.api;

import static org.junit.Assert.*;

import org.junit.Test;

import com.interview.model.Product;

public class ProductRecAPITest {

	@Test
	public void testRetriveProductRec() {
        Product item = new Product();
        item.setItemName("ipod");
		SearchAPI search = new SearchAPI();
		item.setItemId(search.retriveItemId(item));
		ProductRecAPI rec = new ProductRecAPI();
		assertNotNull(rec.retriveProductRec(item));
	}

}
