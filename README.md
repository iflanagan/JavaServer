
Clone the repo 
OPen the repo in intellij (may differe slightly if you use eclipse) 
Open main.java 
right click on the window and click Run 'Main'

This will start the server 

Note: The bug is caused by a sleep in line 33 of Echoer.java (the client timeout is set to 2 sec and the sleep was left accidently on the server-side which causes the error


Then start the client. This is a multi-threaded app so the server will not shutdown and needs to be shutdown manually.


