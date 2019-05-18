# xchange
A terminal-based client-server exchange application for-you guessed it-simulating the trading of financial securities!


# How to Run the Application
1. Look for "XchangeForumClient.java" in the project source folder.
2. Copy the content of "XchangeForumClient.java" and paste it into a text editor. Save the file as XchangeForumClient.java (this is a very important step).
3. Open your terminal (if using a unix based system) or command prompt (if using a windows based system). Open your terminal/command prompt in fullscreen for the best experience.
4. cd into the directory where XchangeForumClient.java is saved (make sure you have the java JDK installed on your computer).
5. Type the command "javac XchangeForumClient.java"
6. Type the command "java XchangeForumClient"
7. You will get a welcome message and a request to enter your name. Once you do that, you may scroll down to the Commands section


# Commands (all commands must be prefixed with the symbol ">")

ASSET CLASS AND INSTRUMENT INFORMATION

1.	PRINT THE ENTIRE ASSET CLASS AND INSTRUMENT LIST IN Xchange: 
>15

2.	PRINT THE ENTIRE ASSET CLASS LIST IN Xchange: 
>16

3.	PRINT THE INSTRUMENT LIST OF A PARTICULAR ASSET CLASS:
>18,assetClass
e.g.
>18,equities

4.	PRINT ALL INSTRUMENTS TRADED ON Xchange:
>19


CASH MANAGEMENT

1.	UPDATE YOUR ACCOUNT BALANCE, OR CASH OUT: 
>9, newAmount 
e.g.
>9, 100 (will increase your account balance by $100)
>9, -100 (will decrease your account balance by $100)

2. PRINT YOUR CURRENT ACCOUNT BALANCE: 
>10 
e.g.
>10 (will display your current account balance)


INVENTORY MANAGEMENT

1.	CHECK THE INSTRUMENT QUANTITY YOUR ACCOUNT HAS: 
>42,instrument 
e.g.
>42,gold

2.	INCREASE/DECREASE YOUR ACCOUNT' INSTRUMENT QUANTITY: 
>43,instrument,quantity 
e.g.
>43,abc,10 (will increase abc's quantity in your account by 10 shares)
>43,abc,-10 (will decrease abc's qantity in your account by 10 shares)


TRADING

1.	SUBMIT BUY ORDER: 
>1, instrument, price, quantity, venue, executionType, limitPrice, stopPrice, marketIfTouchedPrice, allOrNothing, maxFill, fillOrKill, goodAfter, goodUntil, goodAfterDate, goodUntilDate, tickSensitivity, willingToTradeWith, disclosed
e.g.
>1,yen/usd,100,5,venue1,none,0,0,0,0,0,0,0,10/01/2019/00/00/00,0,null,1

2.	SUBMIT SELL ORDER:
>2, instrument, price, quantity, venue, executionType, limitPrice, stopPrice, marketIfTouchedPrice, allOrNothing, maxFill, fillOrKill, goodAfter, goodUntil, goodAfterDate, goodUntilDate, tickSensitivity, willingToTradeWith, disclosed
e.g.
>2,rice,600,450,venue2,none,50,25,40,0,0,0,01/18/2019/12/30/45,10/01/2019/00/00/00,3,null,0

3.	EDIT BUY ORDER
>3, orderId, parameterToEdit, newValue
e.g.
>3,1,2,4 (to edit order with ID=1 quantity to 4) 

4.	EDIT SELL ORDER
>4, orderId, parameterToEdit, newValue
e.g.
>4,2,1,30 (to edit order with ID=2 price to 30) 

5.	CANCEL BUY ORDER
>5, orderId
e.g.
>5,1

6.	CANCEL SELL ORDER
>6, orderId
e.g.
>6,2


ORDER INFORMATION

1.	DISPLAY THE ORDER BOOK OF A PARTICULAR INSTRUMENT:
>50,instrument
e.g.
>50,xyz (hint: do this right after you successfully submit an order).

2.	DISPLAY THE TRADE HISTORY OF A PARTICULAR INSTRUMENT:
>51,instrument
e.g.
>51,eur/gbp

3.	DISPLAY YOUR ENTIRE SUBMITTED ORDER HISTORY:
>13

4.	DISPLAY YOUR SUBMITTED ORDER HISTORY BY ID:
>14,orderId
e.g.
>14,1


# This page is still being updated...
