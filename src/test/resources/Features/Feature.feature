Feature: facebook application 

Scenario Outline: vaild email 

	Given user is on Adactin 
	
	When user enter username and password click btn 
		|rajkumar123456789|RAJKUMAR04|
		
	When user should select LOCATION "<locations>" ,HOTELS "<hotels>", ROOMTYPE "<roomtype>",NUMBER OF ROOMS "<numberofrooms>",ADULTS PER ROOM "<adultsperroom>",CHILDRENS PER ROOM "<childrensperroom>" user should click search btn 
	
	When user should click select,user should click continue 
	
	And user should select first "<firstname>",last "<lastname>",add "<add>",card "<card>",cvv "<cvv>",cctype "<cctype>",expmonth "<expmonth>",expyear  "<expyear>" , user should click book 
	
	Then user should get the id in console
	
	Examples: 
		|locations|hotels|roomtype|numberofrooms|adultsperroom|childrensperroom|firstname|lastname|add|card|cvv|cctype|expmonth|expyear|
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|
		|Melbourne|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|
		|Brisbane|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|
		|Adelaide|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|
		|London|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|
		|New York|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|
		|Los Angeles|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Paris|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Sunshine|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Hervey|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Cornice|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Double|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Deluxe|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Super Deluxe|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|1 - One|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|2 - Two|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|3 - Three|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|4 - Four|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|6 - Six|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|7 - Seven|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|8 - Eight|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|9 - Nine|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|10 - Ten|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|2 - Two|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|3 - Three|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|4 - Four|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|1 - One|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|2 - Two|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|3 - Three|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|4 - Four|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
		|Sydney|Hotel Creek|Standard|5 - Five|1 - One|4 - Four|raj|kumar|38 nehnjkhkj|5544444444444444|765|American Express|April|2012|			
			
		
		
	