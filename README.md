# Car shop
Spring boot application for sale cars.

There are 2 main roles:
* Anonymous user - can see all cars and sort it;
* User - can add new car and manege car witch he added;

There are below routes for User:
* `/users/{usersId}/newCar` - (POST) add new car.
```json
{	
	"mark": "XXX",
	"model": "XXX",
	"type": "XXX",
	"price": "XXX",
	"year": "XXX",
	"countryOfRegistration": "XXX",
	"description": "XXX"
}
```
* `/users/{userId}/car/{carId}/update` - (PUT) update car info.
```json
{	
	"mark": "XXX",
	"model": "XXX",
	"type": "XXX",
	"price": "XXX",
	"year": "XXX",
	"countryOfRegistration": "XXX",
	"description": "XXX"
}
```
* `/users/{userId}/car/{carId}/delete` - (DELETE) delete car.
* `/users/{userId}/cars` - (GET) all user car.

Also user have all routes that have anonymous user.

There are below routes for anonymous user:

* `/cars` - (GET) get all car.
* `/cars?sort=XXX,YYY` - (GET) sort car by(year, price, country of registration) and by (desc,asc).
* `/sign-up`-(POST) register new User.
```json
{
	"firstName": "XXX",
	"lastName": "XXX",
	"email": "XXX",
	"password": "XXX",
	"mobileNumber": "XXX"
}
```

#### Prerequisites:
- app should be run with "dev" profile
