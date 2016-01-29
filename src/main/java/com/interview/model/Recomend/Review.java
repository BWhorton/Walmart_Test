package com.interview.model.Recomend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Review {
	
	private String averageOverallRating;
	private String overallRatingRange;
	private String totalReviewCount;
	
	public String getAverageOverallRating() {
		return averageOverallRating;
	}
	public void setAverageOverallRating(String averageOverallRating) {
		this.averageOverallRating = averageOverallRating;
	}
	public String getOverallRatingRange() {
		return overallRatingRange;
	}
	public void setOverallRatingRange(String overallRatingRange) {
		this.overallRatingRange = overallRatingRange;
	}
	public String getTotalReviewCount() {
		return totalReviewCount;
	}
	public void setTotalReviewCount(String totalReviewCount) {
		this.totalReviewCount = totalReviewCount;
	}
	
	
}
