#running in python3.6

#echo "making sure antlr4 runtime is installed for python 3"
pip install antlr4-python3-runtime

#echo "running ANTLR4 for python 3 on Little.g"
antlr4 -Dlanguage=Python3 Little.g

#echo "Now Parsing files with Driver.py"
#echo " "

#can feed in multiple files to parse.  will now seperate files sections
for FILE1 in "$1"
do
python Driver.py $FILE1
echo " "
done

