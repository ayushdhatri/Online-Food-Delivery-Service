############### Functional and Non-functional Requirements #########################

First understand what is online food delivery service:

-> Consider yourself as user of system and try to think the flow:

-> Open the app, browse through the restaurant either by name, or system gets your location and maybe show all the restaurants within radius of 5KM

-> You open the restaurants browse the menu, select menu-item, add the quantity and addToYourOrder:

-> Once decided , you pay and system receives your order.

-> System informs the restaurant about your order.

-> Then onwards Restaurant will manage your order, its status

-> Meanwhile system will assign a deliveryAgent to pick your order and delivery to your location

-> Once order is delivered it will mark as complete.

Question which I will ask interviewer:

-> Do we need to manage user , deliveryAgent and Restaurant registration in your system?

-> How customer will browser through restaurant? Based on city or proximity or name?

-> Can user select multiple items from a menu of restaurant?

-> On what basis system will assign the nearby driver?

-> Can user cancel their order?

<--------------------------- Functional Requirements ------------------------------->

1. Allow system to onboard restaurant, delivery agent, customer.
2. Allow customer to search for restaurant based on name, city, food-Item
3. Allow customer to place order containing multiple items from a specific restaurant
4. Allow customers to cancel an order while the restaurant has not started preparing it (status still PENDING or CONFIRMED).
5. Notify restaurant about the incoming order and let them manage the status of the order
6. Auto-assign the delivery partner 
7. Notify relevant party such as customer, delivery agent, restaurant about the status of the order
8. Maintain the orderHistory of the customer.


<--------------------------- Non-Functional Requirements ------------------------------>
1. Code should be modular and extensible
2. System should not assign two or more delivery agent for the same order.






