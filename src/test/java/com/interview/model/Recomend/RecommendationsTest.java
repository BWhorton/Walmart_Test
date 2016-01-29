package com.interview.model.Recomend;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class RecommendationsTest {

	@Test
	public void testCompareTo() {
		ArrayList<Recommendations> testList = new ArrayList<Recommendations>();
		Recommendations better = new Recommendations();
		Review betterReview = new Review();
		betterReview.setAverageOverallRating("4.5");
		better.setReview(betterReview);
		Recommendations worse = new Recommendations();
		Review worseReview = new Review();
		worseReview.setAverageOverallRating("3.5");
		worse.setReview(worseReview);
		testList.add(0, worse);
		testList.add(1, better);
		Collections.sort(testList);
		assertSame(better, testList.get(0));
	}

}
