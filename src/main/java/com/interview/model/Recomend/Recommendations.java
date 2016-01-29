package com.interview.model.Recomend;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recommendations implements Comparable<Recommendations> {
	private int itemId;
	private int parentItemId;
	private String name;
	private float salePrice;
	private String upc;
	private String categoryPath;
	private String shortDescription;
	private String longDescription;
	private String thumbnailImage;
	private String mediumImage;
	private String largeImage;
	private String productTrackingUrl;
	private boolean ninetySevenCentShipping;
	private boolean marketplace;
	private boolean shipToStore;
	private boolean freeShipToStore;
	private String modelNumber;
	private String productUrl;
	private boolean bundle;
	private boolean clearance;
	private boolean preOrder;
	private String stock;
	private String addToCarUrl;
	private String affiliateAddToCartUrl;
	private boolean freeShippingOver50Dollars;
	private GiftOps giftOptions;
	private List<ImageE> imageEntities;
	private Review review;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getParentItemId() {
		return parentItemId;
	}

	public void setParentItemId(int parentItemId) {
		this.parentItemId = parentItemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getCategoryPath() {
		return categoryPath;
	}

	public void setCategoryPath(String categoryPath) {
		this.categoryPath = categoryPath;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getThumbnailImage() {
		return thumbnailImage;
	}

	public void setThumbnailImage(String thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public String getMediumImage() {
		return mediumImage;
	}

	public void setMediumImage(String mediumImage) {
		this.mediumImage = mediumImage;
	}

	public String getLargeImage() {
		return largeImage;
	}

	public void setLargeImage(String largeImage) {
		this.largeImage = largeImage;
	}

	public String getProductTrackingUrl() {
		return productTrackingUrl;
	}

	public void setProductTrackingUrl(String productTrackingUrl) {
		this.productTrackingUrl = productTrackingUrl;
	}

	public boolean isNinetySevenCentShipping() {
		return ninetySevenCentShipping;
	}

	public void setNinetySevenCentShipping(boolean ninetySevenCentShipping) {
		this.ninetySevenCentShipping = ninetySevenCentShipping;
	}

	public boolean isMarketplace() {
		return marketplace;
	}

	public void setMarketplace(boolean marketplace) {
		this.marketplace = marketplace;
	}

	public boolean isShipToStore() {
		return shipToStore;
	}

	public void setShipToStore(boolean shipToStore) {
		this.shipToStore = shipToStore;
	}

	public boolean isFreeShipToStore() {
		return freeShipToStore;
	}

	public void setFreeShipToStore(boolean freeShipToStore) {
		this.freeShipToStore = freeShipToStore;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public boolean isBundle() {
		return bundle;
	}

	public void setBundle(boolean bundle) {
		this.bundle = bundle;
	}

	public boolean isClearance() {
		return clearance;
	}

	public void setClearance(boolean clearance) {
		this.clearance = clearance;
	}

	public boolean isPreOrder() {
		return preOrder;
	}

	public void setPreOrder(boolean preOrder) {
		this.preOrder = preOrder;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getAddToCarUrl() {
		return addToCarUrl;
	}

	public void setAddToCarUrl(String addToCarUrl) {
		this.addToCarUrl = addToCarUrl;
	}

	public String getAffiliateAddToCartUrl() {
		return affiliateAddToCartUrl;
	}

	public void setAffiliateAddToCartUrl(String affiliateAddToCartUrl) {
		this.affiliateAddToCartUrl = affiliateAddToCartUrl;
	}

	public boolean isFreeShippingOver50Dollars() {
		return freeShippingOver50Dollars;
	}

	public void setFreeShippingOver50Dollars(boolean freeShippingOver50Dollars) {
		this.freeShippingOver50Dollars = freeShippingOver50Dollars;
	}

	public GiftOps getGiftOptions() {
		return giftOptions;
	}

	public void setGiftOptions(GiftOps giftOptions) {
		this.giftOptions = giftOptions;
	}

	public List<ImageE> getImageEntities() {
		return imageEntities;
	}

	public void setImageEntities(List<ImageE> imageEntities) {
		this.imageEntities = imageEntities;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	@Override
	public int compareTo(Recommendations rec) {
		float rating = Float.parseFloat(this.review.getAverageOverallRating());
		float otherRating = Float.parseFloat(rec.getReview().getAverageOverallRating());

		if (rating == otherRating) {
			int revCount = Integer.parseInt(this.review.getTotalReviewCount());
			int otherRevCount = Integer.parseInt(rec.getReview().getTotalReviewCount());
			if (revCount == otherRevCount) {
				return 0;
			}
			return revCount - otherRevCount;
		}
		return rating > otherRating ? -1 : 1;
	}
}
