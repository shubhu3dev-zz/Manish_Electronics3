# Manish_Electronics3

About Manish Electronics: It’s a proprietor based Company having around 4 outlets in different suburbs of Mumbai. The Company trades
mainly different types of house hold electrical appliances like ceiling fans, mixer, grinder, water pumps. They have also added LCD and LED
TVs to their list. In the last few years they have been facing a problem of low
productivity of their sales-man. The sales-man is responsible to visit various individual vendors or retailers in suburbs and get orders from
them. Many a times it has come to notice of the proprietor that the sales man were taking orders on phone itself, without visiting vendor,
but claiming the travelling expenses and absconding from office too. This increased the credit* period of the payments too, eventually.
This problem is in fact very common to most of the traders and small manufacturing companies. These Companies could not afford
expensive technological solutions (till date) to keep track of their employees and logistics. But with the advent of Android phones and
open source app development, it is in fact a low cost and most effective way to keep track of salesman and increase productivity.

###### *credit means the billed amount which the retailer is supposed to pay Trader/Manufacturer, like Manish Electronics in this case.

## Requirement of this App

In Trading / manufacturing companies there can be problems like salesman not doing their job properly w.r.t <b>getting orders</b>.
Hence the company wants to <b>track their sales-man on their location</b> and actual order details using Android application.
So this App should do the job of location tracking of the salesman and saves the actual location of order placed.
The aim of the app is to <b>“Authenticate the salesman and to track down the actual location of the order placed”</b>.
With the help of Services, the app can track down the actual location of the order details without knowing the salesman.

## Specifications:

<b>1st Activity</b>: A login Screen, We have used <b>Firebase for Authentication</b> Purpose.
###### By Default <br> Full Name : Any Name <br> Email : <b>admin@gmail.com</b> </br> Password : password

<img src="https://raw.githubusercontent.com/shubhu3dev/Manish_Electronics3/master/Activity_ScreenShots/Activity%201.jpeg" width="35%"/>

2nd Activity: In this LocationDetailsActv , we will select the region and location of the order using 2 spinner views.
The Region and Location selected from the spinners will be passed to the 3rd Active, using the Bundle object.

<img src="https://raw.githubusercontent.com/shubhu3dev/Manish_Electronics3/master/Activity_ScreenShots/Activity%202.jpeg" width="35%"/>

3rd Activity: This is a OrderDetailsActv, In this Activity, we will select the vendor from the location, different products and we
enter the quantity of the products. Using Spinners and edittexts.

<img src="https://raw.githubusercontent.com/shubhu3dev/Manish_Electronics3/master/Activity_ScreenShots/Activity%203.jpeg" width="35%"/>

From OrderDetailsActv to OrderPlaced:

<img src="https://raw.githubusercontent.com/shubhu3dev/Manish_Electronics3/master/Activity_ScreenShots/Activity%204.jpeg" width="35%"/>

4th Activity: In this Actv, we will write the data into the text file on SD card. The data will be Vendor name, Products selected,
location details and the qty of each product with the payment details such as cash or credit with date of order placed. The
location is also stored in the text file.

<img src="https://raw.githubusercontent.com/shubhu3dev/Manish_Electronics3/master/Activity_ScreenShots/Activity%205.jpeg" width="35%"/>

Note: Here we use the Service in the background which will fetch the actual location of the user of this application (i.e.
Latitude and Longitude of the location using LocationManager ) On clicking “save” button the data should be saved and control
should go to the “Logout Actv”.The textfile stored in the phone will be like this shown below:

From OrderDetailsActv to OrderCancelled:

5th Activity: In this OrderCancelledActv, we will take the reason of order Cancelled along with the entire data such as
Vendor name, location , products selected , qty and Reason of Order cancelled. Here also we use the “Service” to get the actual location of the Order cancelled.The data is saved and on pressing Logout Button, the Control should go to the “LogoutActv”.

<img src="https://raw.githubusercontent.com/shubhu3dev/Manish_Electronics3/master/Activity_ScreenShots/Activity%206.jpeg" width="35%"/>

6th Activity: In this Logout Activity, there are 2 buttons, Logout and New order. On pressing “New order” button, the control should goto the 1stActivity. On pressing “Logout” button, the user should come out of the App.

<img src="https://raw.githubusercontent.com/shubhu3dev/Manish_Electronics3/master/Activity_ScreenShots/Activity%207.jpeg" width="35%"/>
