Feature: Validate book store data

Scenario:  1test Git Pocket Guide is present in response JSON
Given Hit the book store API
Then Validate status code 
Then check Git Pocket Guide title is present 
Then Learning JavaScript Design Patterns title is present 


Scenario: 2test title is present in response JSON
Given Hit the book store API
Then Validate status code
Then Validate "Git Pocket Guide" is present at json path "books[0].title"
Then Validate "Learning JavaScript Design Patterns" is present at json path "books[1].title"
Then Validate "Designing Evolvable Web APIs with ASP.NET" is present at json path "books[2].title"

Scenario:  1test page number is present in response JSON
Given Hit the book store API
Then Validate status code 
Then validate page number "234" is prensent at json response "books[0].pages"

