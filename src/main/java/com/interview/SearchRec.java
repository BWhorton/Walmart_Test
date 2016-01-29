package com.interview;

import java.util.Collections;
import java.util.Scanner;

import com.interview.api.ProductRecAPI;
import com.interview.api.ReviewsAPI;
import com.interview.api.SearchAPI;
import com.interview.model.Product;
import com.interview.model.Recomend.Recommendations;

public class SearchRec {

	//TODO: Find something to do about api key.
	
	public static void main(String[] args) {
		Product item = new Product();
		Scanner scan = new Scanner(System.in);
		ReviewsAPI reviewsA = new ReviewsAPI();
		SearchAPI searchA = new SearchAPI();
		ProductRecAPI productA = new ProductRecAPI();
		
		System.out.println("Welcome! Please Provide your search: ");
        item.setItemName(scan.nextLine());
        
       if (item.getItemName().isEmpty()){
        	System.out.println("Are you sure you want me to search nothing? (Y/N)");
        	String answer = scan.nextLine();
        	if (!(answer.equals("Y"))){
        		System.out.println("Closeing the app");
        		scan.close();
        		return;
        	}
        }
        scan.close();
        
        System.out.println("Finding your item");
        item.setItemId(searchA.retriveItemId(item));  
        System.out.println("Grabbing Recommendations");
        item.setRecommendations(productA.retriveProductRec(item));
        System.out.println("Grabbing the Reviews:");
        int i=0;
        for (Recommendations rec: item.getRecommendations()){
        	rec.setReview(reviewsA.retriveReview(rec.getItemId()));
        	i++;
        	System.out.print(i+" ");
        }
        Collections.sort(item.getRecommendations());
        System.out.println();
        System.out.println("Reviews for "+ item.getItemName()+":");
        for(i = 0; i < 10 ; i++){
        	Recommendations rec = item.getRecommendations().get(i);
        	System.out.println("	"+rec.getName()+" has a review rating of "+ rec.getReview().getAverageOverallRating());
        }
	}

}
