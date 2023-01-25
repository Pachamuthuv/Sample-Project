Feature:
 Automating the fuctionalities of Adactin
 @Regression
Scenario:
Tc-01: Verification of Adactin Login

Given user wants to open the Adactin application in chrome browser
Then user wants to verify weather the login page apear or not
When user wants to give valid username and password and click on the login button
Then  user wants to verify weather the search hotel page appear or not
#When user wants to give location,hotelName,roomType,no Of Rooms,bookingDate,adult and click to submit
#Then user  wants to verify the select the hotel page appear or not
#When user wants to click the select hotel 
#Then user wants to pay the booking  page appear or not
#When user wants to give deatails and pay using creditcard and click to book
#Then user wants to verify booking page confirm appear or not
#When user wants to check the booking confirmation id and click the Itinerary
#Then user wants to verify the booking cancel page appear or not 
#When user wants to select the all bookingHotel  click to cancel

#dry Run Examle        @SmokeOne,@Sanity And tag
@SmokeOne
Scenario:
Tc-02: Verification of Adactin Login

Given user wants to open the Adactin application in chrome browser
Then user wants to verify weather the login page apear or not
When user wants to give valid username and password and click on the login button
Then  user wants to verify weather the search hotel page appear or not
When user wants to give location,hotelName,roomType,no Of Rooms,bookingDate,adult and click to submit

@Sanity      
Scenario Outline:
Tc-03: Verification of Adactin Login

Given user wants to open the Adactin application in chrome browser
Then user wants to verify weather the login page apear or not
When user wants to give valid "<username>" and "<password>" and click on the login button
And user click login Button
Then  user wants to verify weather the search hotel page appear or not, user verify "<status>"is dislayed

Examples:
 |username | password  | status      |
 |Andrew07 |   UN45LL  |Welcome      |
 |Andrew07 |   UN45    |Invalid Login|
#|Andrew07 |           |Invalid Login|
#| Jocinthn| 123456    |Welcome      |
#|Andrew08 |   UN45LL  |Welcome      |
#|Andrew07 |   UN45    |Invalid Login|
#
@One-DWithoutHeader
Scenario:  Tc-04: Verification of Adactin Login               //  one dimension without header


Given user wants to open the Adactin application in chrome browser
Then user wants to verify weather the login page apear or not
When user wants to give valid username and password using DataTable without header one-D ,and click on the login button
|Andrew07   |
|   UN45LL  |

Then  user wants to verify weather the search hotel page appear or not

@Two-DWithoutHeader
Scenario:  Tc-05: Verification of Adactin Logi               //  two dimension without header


Given user wants to open the Adactin application in chrome browser
Then user wants to verify weather the login page apear or not
When user wants to give valid username and password using DataTable without header Two-D ,and click on the login button
 #Two-D without header
    | jocinthn | Andrew07 |
    | 123456   | UN45LL   |
Then  user wants to verify weather the search hotel page appear or not



@ONE-DWithHeader
Scenario:  Tc-06: Verification of Adactin Logi               //  one dimension with header


Given user wants to open the Adactin application in chrome browser
Then user wants to verify weather the login page apear or not
When user wants to give valid username and password using DataTable with header One-D ,and click on the login button
  #One-D with header
    | UserName | Andrew07 |
    | PassWord | UN45LL   |
Then  user wants to verify weather the search hotel page appear or not

#
#@TWO-DWithHeader
#Scenario:  Tc-07: Verification of Adactin Logi               //  two dimension with header
#
#
#Given user wants to open the Adactin application in chrome browser
#Then user wants to verify weather the login page apear or not
#When user wants to give valid username and password using DataTable with header Two-D ,and click on the login button
 #Two-D with header
    #| UserName | PassWord |
    #| jocinthn | 123456   |
    #| Andrew07 |UN45LL    |
#Then  user wants to verify weather the search hotel page appear or not


@Sanity1
Scenario:  Tc-08: Verification of Adactin Logi               // rerun example


Given user wants to open the Adactin application in chrome browser
Then user wants to verify weather the login page apear or not
When user wants to give valid username and password using DataTable with header Two-D ,and click on the login button
 #Two-D with header
    | UserName | PassWord |
    | jocinthn | 123456   |
    | Andrew07 |UN45LL    |
Then  user wants to verify weather the search hotel page appear or not


@Sanity1
Scenario:  Tc-09: Verification of Adactin Logi               // rerun example


Given user wants to open the Adactin application in chrome browser
Then user wants to verify weather the login page apear or not
When user wants to give valid username and password using DataTable with header Two-D ,and click on the login button
 #Two-D with header
    | UserName | PassWord |
    | jocinthn | 123456   |
    | Andrew07 |UN45LL    |
Then  user wants to verify weather the search hotel page appear or not

