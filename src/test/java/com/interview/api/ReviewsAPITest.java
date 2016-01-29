package com.interview.api;

import static org.junit.Assert.*;

import org.junit.Test;

import com.interview.model.Product;

public class ReviewsAPITest {

	@Test
	public void testRetriveReview() {
        Product item = new Product();
        item.setItemName("ipod");
		SearchAPI search = new SearchAPI();
		ReviewsAPI review = new ReviewsAPI();
		assertNotNull(review.retriveReview(search.retriveItemId(item)));
	}

}
