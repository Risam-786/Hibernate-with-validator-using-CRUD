package com.model;


import java.util.*;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.CreditCardNumber;

import org.hibernate.validator.constraints.Range;

import org.hibernate.validator.constraints.URL ;

import jakarta.persistence.*;

@Entity

@Table(name="NewEmpData")

public class User {

	@Id

	@GeneratedValue(strategy=GenerationType.AUTO)

	@NotNull(message="Invalid ID. Please enter your ID.")

	private Long userId;

	

	@Size(max=20, min=3, message="Invalid name. Size should be between 3 to 20.")

	@NotEmpty(message="Please enter your name.")

	private String userName;

	

	@Email(message="Invalid email address. Please enter a proper email ID.")

	@NotEmpty(message="Please enter your email ID.")

	private String userEmailId;

	

	@Digits(integer=3, fraction=0, message="Invalid age. Maximum valid number")

	private int age;

	

	@Max(value=5, message="Invalid number of articles. Maximum allowed is 5.")

	private String currentTimeOfWritingArticles;

	

	@Min(value=3, message="Invalid number of articles. Minimum should")

	private String allowedForArticleReviewing;

	

	@NotBlank(message="Proficiency level 3 should not be blank.")

	private String proficiency3;

	

	@Null(message="Proficiency level 4 should be null.")

	private String proficiency4;

	

	@Pattern(regexp="YN", flags= {

			Pattern.Flag.CASE_INSENSITIVE

	}, message= "Invalid proficiency level 5.Enter Y or N.")

	private String proficiency5;

	

	@Positive(message="Invalid rating. Value should be positive.")

	private int rating;

	

	@NegativeOrZero(message = "Invalid blocklisted status. Input number should be")

	private int blocklisted;

	

	@Future(message="Invalid date. It should be provided as a future date.")

	private Date futureDate;

	

	@FutureOrPresent(message="Invalid date. It should be provided as a future or present date.")

	private Date futureOrPresent;

	

	@PastOrPresent(message="Invalid date. It should be provided as a past or present date.")

	private Date pastOrPresent;

	

	@Range(min=1, max=3, message="Invalid range. Range should be within 1 to 3.")

	private int rangeExample;

	

	@URL(message="Invalid URL. Please provide a valid URL.")

	private String urlExample;

	

	@CreditCardNumber(message="Invalid credit card number. It should not contain")

	private String creditcardExample;



	public Long getUserId() {

		return userId;

	}







	public void setUserId(Long userId) {

		this.userId = userId;

	}







	public String getUserName() {

		return userName;

	}







	public void setUserName(String userName) {

		this.userName = userName;

	}







	public String getUserEmailId() {

		return userEmailId;

	}







	public void setUserEmailId(String userEmailId) {

		this.userEmailId = userEmailId;

	}







	public int getAge() {

		return age;

	}







	public void setAge(int age) {

		this.age = age;

	}







	public String getCurrentTimeOfWritingArticles() {

		return currentTimeOfWritingArticles;

	}







	public void setCurrentTimeOfWritingArticles(String currentTimeOfWritingArticles) {

		this.currentTimeOfWritingArticles = currentTimeOfWritingArticles;

	}







	public String getAllowedForArticleReviewing() {

		return allowedForArticleReviewing;

	}







	public void setAllowedForArticleReviewing(String allowedForArticleReviewing) {

		this.allowedForArticleReviewing = allowedForArticleReviewing;

	}







	public String getProficiency3() {

		return proficiency3;

	}







	public void setProficiency3(String proficiency3) {

		this.proficiency3 = proficiency3;

	}







	public String getProficiency4() {

		return proficiency4;

	}







	public void setProficiency4(String proficiency4) {

		this.proficiency4 = proficiency4;

	}







	public String getProficiency5() {

		return proficiency5;

	}







	public void setProficiency5(String proficiency5) {

		this.proficiency5 = proficiency5;

	}


	public int getRating() {

		return rating;

	}

	public void setRating(int rating) {

		this.rating = rating;

	}

	public int getBlocklisted() {

		return blocklisted;

	}


	public void setBlocklisted(int blocklisted) {

		this.blocklisted = blocklisted;

	}

	public Date getFutureDate() {

		return futureDate;

	}
	public void setFutureDate(Date futureDate) {

		this.futureDate = futureDate;

	}

	public Date getFutureOrPresent() {

		return futureOrPresent;

	}


	public void setFutureOrPresent(Date futureOrPresent) {

		this.futureOrPresent = futureOrPresent;

	}
	public Date getPastOrPresent() {

		return pastOrPresent;

	}

	public void setPastOrPresent(Date pastOrPresent) {

		this.pastOrPresent = pastOrPresent;

	}

	public int getRangeExample() {

		return rangeExample;

	}

	public void setRangeExample(int rangeExample) {

		this.rangeExample = rangeExample;

	}

	public String getUrlExample() {

		return urlExample;

	}

	public void setUrlExample(String urlExample) {

		this.urlExample = urlExample;

	}

	public String getCreditcardExample() {

		return creditcardExample;

	}

	public void setCreditcardExample(String creditcardExample) {

		this.creditcardExample = creditcardExample;

	}

	public User(Long userId, String userName, String userEmailId, int age, String currentTimeOfWritingArticles,

			String allowedForArticleReviewing, String proficiency3, String proficiency4, String proficiency5,

			int rating, int blocklisted, Date futureDate, Date futureOrPresent, Date pastOrPresent, int rangeExample,

			String urlExample, String creditcardExample) {

		super();

		this.userId = userId;

		this.userName = userName;

		this.userEmailId = userEmailId;

		this.age = age;

		this.currentTimeOfWritingArticles = currentTimeOfWritingArticles;

		this.allowedForArticleReviewing = allowedForArticleReviewing;

		this.proficiency3 = proficiency3;

		this.proficiency4 = proficiency4;

		this.proficiency5 = proficiency5;

		this.rating = rating;

		this.blocklisted = blocklisted;

		this.futureDate = futureDate;

		this.futureOrPresent = futureOrPresent;

		this.pastOrPresent = pastOrPresent;

		this.rangeExample = rangeExample;

		this.urlExample = urlExample;

		this.creditcardExample = creditcardExample;

	}

	public User() {

	}

}