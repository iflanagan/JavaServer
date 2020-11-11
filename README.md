
Clone the repo 
Open the repo in intellij (may differe slightly if you use eclipse) 
Open main.java 
right click on the window and click Run 'Main'

This will start the server 

Note: The bug is caused by a sleep in line 33 of Echoer.java (the client timeout is set to 2 sec and the sleep was left accidently on the server-side which causes the error


Then start the client. You will need to clone this repo https://github.com/iflanagan/JavaClient.git and read its README.txt 


NOTE: This is a multi-threaded app so the server will not shutdown and needs to be shutdown manually.


