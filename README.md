# firstlab_java
Create a Restaurant class that will have the following fields:
name: name of the restaurant;
rating: restaurant rating on a 10-point scale;
maxCapacity: the maximum number of guests that the restaurant can serve at the same time;
currentCapacity: the current number of guests served by the restaurant.

The Restaurant class must have the following public methods:
acceptReservation(int numOfGuests): a method that checks whether the restaurant can accept a reservation for the given number of guests and, in case of a positive answer, adds this number to the current number of guests;
removeReservation(int numOfGuests): method that removes the number of guests from the current number of guests served;
