# product-pricing-service

Please find the instructions as follows:
1.First run the file product-pricing-service.jar in the command prompt with the command "java -Dserver.port=8082 -jar product-pricing-service.jar" 
2.Next run the file product-service.jar in the command prompt with the command "java -Dserver.port=8081 -jar product-service.jar" 
3.Please find the REST API call details as follows 

	A.Get Product related information using productId
	URL: localhost:8081/products/{productId}
	Method: GET
	Request: Pass productId in the path parameter
	Response:
	{
		"id": 13860428,
		"name": "The Big Lebowski (Blu-ray)",
		"current_price": {
			"value": 13.49,
			"currency_code": "USD"
		}
	}
	
	
	B.Update pricing information of product using productId
	URL: localhost:8081/products/{productId}
	Method: POST
	Request: Pass productId in the path parameter and pass the request json in the request body.
	{
		"id": 13860428,
		"name": "The Big Lebowski (Blu-ray)",
		"current_price": {
			"value": 40.49,
			"currency_code": "INR"
		}
	}
	Response:
	Product's price is updated successfully
	Once after getting the response, you can call GET API(A) by passing same productId to check the updated pricing values.
	
	C.Update pricing information of product using productId
	URL: localhost:8081/products/{productId}
	Method: PUT
	Request: Pass productId in the path parameter and pass the request json in the request body.
	{
		"id": 13860428,
		"name": "The Big Lebowski (Blu-ray)",
		"current_price": {
			"value": 50.49,
			"currency_code": "EUR"
		}
	}
	Response:
	Product's price is updated successfully
	Once after getting the response, you can call GET API(A) by passing same productId to check the updated pricing values.
