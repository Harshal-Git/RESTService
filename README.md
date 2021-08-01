# RESTService
a program to integrate REST service response and execute queries


## a sample application to read & process json based objects

2 sources for providing json data will be there.

1. via URL

2. If URL fails, then from text file.

###

Process the JSON data returned from API calling and then process given queries on the same data.

1. At max; query will have 2 level nested objects for the question purpose.

2. There will be 2 operations given:

	EQUALS : needs to match the single value
	IN : needs to match multiple values
	
3. There are 2 clients to run:

	Client1.java -> to process given search queries by keeping the JSON data into String/Object mapping only.
	
	Client2.java -> to process the response from API and convert into an array of users to process it like actual java objects.
		[This would be possible with appropriate POJO classes with field names & their getter-setter methods.]