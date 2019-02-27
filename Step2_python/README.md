When you run GradingScript.sh or Micro ANTLR will generate the all the needed files to run through the test cases, depending on the version this output some weird errors stating a line that doesn't exist.  After that it will run through the rest of the testbenchs no problem.

This script was made to run on Fedora ~28 (CSCI lab computers) and will run ANTLR4.5.2.  When running the GradingScript it will toss some weird messages when antlr4 is generating all of its component files from the Grammar file.  After that it will only run our Driver.py to run the scanner and parser.  When tested on teh lab computers we got a identical match for all test cases provided.

 
