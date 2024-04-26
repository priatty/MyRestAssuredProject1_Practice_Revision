Feature: Validate book store data

Scenario:  Validate data from JSON response
Given Hit the book store API
Then Validate status code 
Then Validate data from response
| Git Pocket Guide			 	| books[0].title    |
| A Working Introduction	| books[0].subTitle |
| Richard E. Silverman	  | books[0].author   |
