Feature: Sample Rest API Test 
Scenario: Users List 
#https://ps.perfectomobile.com/services/users?operation=list&user=rajeshm@perfectomobile.com&password=Perfecto123
	Given I send request for the users list 
	Then I should see "rajeshm@perfectomobile.com"