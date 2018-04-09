This is the readme file for my version of Surly. The contents of this file are basically instructions on how to use this version of Suurly. 
Some sections of this release is static; meaning it does processing based on the structure of some important files in the package. 
These files are as listed below:

- xanadu.txt (contains structure of relation and relations.)
- insert.txt (contains insert command and values to be inserted.)


******************INSTALLING SURLY**********************

1. Simply unzip the zip file Surly.zip and its contents to the classpath location on your machine. 

2. Lunch command prompt and change directory to your classpath location and type the follow syntax

		"java Surly xanadu.txt"

This basically completes the installation of this version of Surly. 
 

*****************COMMANDS AND COMMAND STRUCTURE****************
Once lunched the program goes to read the contents of xanadu.txt and populates the Database with it.
It initially builds the relations and the attributes list and lets you know the status of the database by 
printing a message to the screen to inform the user of the state of the database. 
One caution here is that once these are done it does not have the correct structure of the columns in the respective 
relations well represented. 

To get this the user will have to initiate the print command to build the right structure of the columns in the database.
Due to its static nature the command in surly will have to be entered in the following manner to avoid the generation of error messages.

<<<<<<<<<<IMPORTANT>>>>>>>>>>>>>

	ALL COMMANDS CAN START WITH EITHER UPPER OR LOWER CASE LETTERS. 
	ALL RELATION NAMES ARE CASE SENSITIVE AND SO MUST BE ENTERED IN UPPER CASE FORMATS.
	FAILURE TO COMPLY WITH THESE WILL RESULT IN THE GENERATION ERROR MESSAGES THAT ARE QUITE.

**********COMMANDS******************
1. print (relation name) eg OFFERING 

2. insert (relation name) eg OFFERING

3. print (relation name) eg OFFERING <to see the effect of the insert command>

4. *(Optional) You can decide to initiate the DESTROY command to destroy the specified relation or wait till all the commands are exhausted.

5.  Project command
 - after seeing what is in the relation, you can project out one column and its contents with the project command. It works like this.

  - project *any column name* from *relation which is active*
	- eg project CNUM from  OFFERING
 5(a). *******	In this version, a different command processing line is initiated for command syntaxes of more than two strings. After hitting the carriage return <Mac> or 
	enter <Windows>, the program presents another prompt. Simply hit the up arrow key to bring back the last command and hit return or enter as the case 
	may be to execute you command. *******

6. You can also test the use of the index command with the following line of command.

   - INDEX OFFERERING ON OFFERING ORDER ( CNUM INSTRUCTOR ) STORAGE STRUCTURE TREE 
 	if presented with another prompt, do as in 5(a).

The user can also alternate the fields to create indexes as desired

7. You can then export your relation, its tuples and indexes into an XML formatted file called export which you can retrieve from your classpath location 
   and open in notepad to have a look at your exported file.

	THE SYNTAX FOR THE EXPORT COMMAND IS AS FOLLOWS:
	
	EXPORT *RELATION NAME*
	eg EXPORT OFFERING 

8. The user can also import the export file into memory but using the import command.

		SYNTAX IS AS FOLLOWS

	IMPORT export.xml

9. You can exit Surly by typing at the prompt the following syntax

		KILL SURLY

10. The user can have an idea of the relations and their structure by using the following syntax.
      
  				DESCRIBE DATA
  

			<<<<<<<<<<<<<IMPORTANT>>>>>>>>>>>>>>>>


		ALL COMMANDS ARE CASE INSENSITIVE SO THE USER IS PROBABLY BETTER-OFF USING UPPER CASE LETTERS IN THE SURLY COMMAND PROMPT.


^^^^^^^^^^^^^^^^^^^^^^  FOR OBTAINING HELP IN THE COMMAND LINE, SIMPLY TYPE "HELP ME" AND HELP WILL BE ON THE WAY ^^^^^^^^^^^^^^^^^^^^^^^

	GOOD LUCK!!!!, HOPE YOU FOLLOW THE INSTRUCTIONS HERE AND ENJOY YOUR SURLY EXPERIENCE. 