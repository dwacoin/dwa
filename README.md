----
# Welcome to Dwa! #

----
## What is Dwa? ##
Dwa is a modern economic system based on cryptography and blockchain technology.

With Dwa, you can manage and interact with

 - your **assets**
 - your **businesses**
 - your **customers**

in such a way that no trusted third parties are required anymore.

----
## Get it! ##

  - *dependencies*:
    - *general* - Java 8
    - *Ubuntu* - `http://www.webupd8.org/2012/09/install-oracle-java-8-in-ubuntu-via-ppa.html`
    - *Debian* - `http://www.webupd8.org/2014/03/how-to-install-oracle-java-8-in-debian.html`
    - *FreeBSD* - `pkg install openjdk8`

  - *repository* - `git clone https://bitbucket.org/Jelurida/dwa.git`
  
----
## Run it! ##

  - click on the Dwa icon, or start from the command line:
  - Unix: `./start.sh`
  - Mac: `./run.command`
  - Window: `run.bat`

  - wait for the JavaFX wallet window to open
  - on platforms without JavaFX, open http://localhost:2876/ in a browser

----
## Compile it! ##

  - if necessary with: `./compile.sh`
  - you need jdk-8 as well

----

## Troubleshooting the DWA ##

  - How to Stop the NRS Server?
    - click on Dwa Stop icon, or run `./stop.sh`
    - or if started from command line, ctrl+c or close the console window

  - UI Errors or Stacktraces?
    - report on BitBucket

  - Permissions Denied?
    - no spaces and only latin characters in the path to the NRS installation directory
    - known jetty issue

----

