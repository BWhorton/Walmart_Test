package com.interview.api;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.interview.model.Recomend.Review;

//jackson tree model, SLOW
public class ReviewsAPI {
	
	public Review retriveReview(int itemId) {
		URL url;
		try {
			url = new URL("http://api.walmartlabs.com/v1/reviews/"+ itemId +"?apiKey=6m57xwx8hb3bs7n5hn7w5sf5");
			
			ObjectMapper mapper = new ObjectMapper();
			JsonNode rootNode = mapper.readTree(url);
			JsonNode revNode = rootNode.path("reviewStatistics");
			
			Review rev = mapper.treeToValue(revNode, Review.class);
			
			return rev;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
