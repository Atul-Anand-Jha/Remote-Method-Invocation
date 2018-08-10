# Remote-Method-Invocation

**RMI** stands for **Remote Method Invocation**. It is a mechanism that allows an object residing in one system **(JVM)** to access/invoke an object running on another JVM. RMI is used to build **distributed** applications; it provides remote communication between Java programs.

# RMI Protocol
Java Remote Method Protocol or **JRMP** is the Java technology-specific protocol for looking up and referencing remote objects. It is a wire level protocol running at the level under Java remote method invocation **(RMI)** and over **TCP/IP**


# Note:
This is a simple RMI implementation program to find sum of two numbers.

Source code and supporting files are given in src folder.

Screenshots given in screenshot folder.


# Steps to execute this application ( on command Line).

>> step 1

```

javac RemoteInterface.java
javac ServerImplements.java

```

>> step 2

```

rmic ServerImplements
this step creates stub/skeleton

```

>> step3 

```

javac Server.java
javac client.java

```

>> step 4 

open two more command prompts by writing 'start' twice.

>> step 5

on first console:

```
rmiregistry

```

>> step 6

on Second console:

```
java Server

```

>> step 7
on third console:

```
java client

```

**for local PC:**
USe loopaddress/LocalHost Address;;;;


**:-)**

# Screenshots:

![alt text](https://raw.githubusercontent.com/Atul-Anand-Jha/Remote-Method-Invocation/master/screenshots/Screenshot%20(339).png)
![alt text](https://raw.githubusercontent.com/Atul-Anand-Jha/Remote-Method-Invocation/master/screenshots/Screenshot%20(340).png)
