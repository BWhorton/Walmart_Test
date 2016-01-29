package com.interview.api;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.interview.model.Product;
import com.interview.model.Recomend.Recommendations;

//jackson databind
public class ProductRecAPI {

	public List<Recommendations> retriveProductRec(Product item) {

		URL url;
		try {
			url = new URL("http://api.walmartlabs.com/v1/nbp?apiKey=6m57xwx8hb3bs7n5hn7w5sf5&itemId="+ item.getItemId());
			
			ObjectMapper mapper = new ObjectMapper();
			List<Recommendations> recs = Arrays.asList(mapper.readValue(url, Recommendations[].class));
		return recs;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
