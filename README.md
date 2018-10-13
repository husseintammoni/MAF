# MAF-Assignment

READ ME File :

Step 1
•	Maven : used to build the environment and manage compilation process, to download and configure maven follow the below steps: 
                     -  Maven 3.3.3 download link Maven.
                     -  Adding Maven to the Environment Path on MAC:
                                1. nano $HOME/.profile
                                2. export M2_HOME=/usr/local/apache-maven/apache-maven-3.3.3
                                3. export PATH=$PATH:/opt/apache-maven/bin 
                                4. To check maven download, close terminal and open it again and write mvn -version
                                5. For more information follow this link here         

Step 2
•	Java Development Kit :  needed for writing Java programs, to download and configure JAVA follow the below steps
                      - Download Java Development Kit 1.8 version link JAVA.
                      - Adding Java to the Environment Path for mac:
                                1. JAVA_HOME=/Library/Java/Home
                                2. export JAVA_HOME=/Library/Java/Home
3. To check Java download, close terminal and open it again and write java -version
                                4. For more information follow this link here   

Step 3
   
•	IntelliJ IDEA : Tool to write our script, download IntelliJ IDEA.
•	Clone our framework https://github.com/husseintammoni/MAF-Assignment.git through run the below command on terminal 
                    git clone https://github.com/husseintammoni/MAF-Assignment.git
Note:If you do not have git installed on your machine, you can install it through click on this link here.

Step 4
•	Open IntelliJ IDEA and import framework project to start work on it

Step 5
•	Now Time to run the scenarios , please use the below command in your terminal :

mvn clean install

•	After the run Completed , you can find the full report (with all run cases ) under the below bath :

*/target/cucumber-reports/cucumber-html-reports/feature-overview.html
