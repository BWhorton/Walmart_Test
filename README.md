# Walmart_Test
Quick test program.

# build:
	mvn install

# run:
java -jar Walmart_Test-0.0.1-SNAPSHOT-jar-with-dependencies.jar

# Assumptions:
	Builder has Maven installed
	
# Overview:
	I was attempting to make the source easy to follow. The notable exception is the Recommendations object. As part of this test I decided to use a different parse for each call. Xpath xml for the search, Jackson Databind for the Product Recommendations, and Jackson Tree (didnt last long) for the Reviews. As part of the Databinding I had to build a complex object that mapped to the json returned which created GiftOps and ImageE. After I had this large object it was logical to attach the review of the recommendation to the recommended item. So Recommendations became a very large object. Finally I went back and attached it to Product for access.
	
# Tasks:
	Running multiple connections to speed up reviews
	Stubs