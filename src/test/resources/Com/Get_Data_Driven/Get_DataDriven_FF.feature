Feature: Validate book store data

Scenario:  Validate data from JSON response
Given Hit the book store api
Then Validate status code 
Then validate data <ExpValue> from <jsonPath> response
Examples:
| ExpValue                  | jsonPath              |
| 'Git Pocket Guide'        | 'books[0].title'      |
| 'A Working Introduction'  | 'books[0].subTitle'   |
| 'Richard E. Silverman'    | 'books[0].author'     |



#|'O'Reilly Media'          |'books[0].publisher'  |
