#!/bin/sh

INPUTS=inputs/*
mkdir usertest
for i in $INPUTS
	do
		filename=${i%.*}
		name=${filename##*/}
		echo "Generating code for input file $i"
		output="${name}.out"
		./Micro $i > usertest/$output
	done

OUTPUTS=outputs/*
mkdir outtest
echo "creating tiny binary"
g++ -o tiny tinyNew.C

echo "creating tiny outputs"

for j in $OUTPUTS
        do
                filename=${j%.*}
                name=${filename##*/}
                echo "Expected output generated for $j"
                output2="${name}_o.out"
		if [[ $j == *"step4_testcase"* ]]
		then
			# echo "testing step4_testcase"
			echo 2 4 25 17 6 32 1 4 15 4 | ./tiny $j > outtest/$output2

		elif [[ $j == *"test_mult"* ]]
		then
			echo 3 2 | ./tiny $j > outtest/$output2
		else
			./tiny $j > outtest/$output2
		fi
        done

# Checking your outputs
USERTEST=usertest/*
mkdir userout

# echo "now comparing"

#g++ -o tiny tinyNew.C
for k in $USERTEST
	  do
	      filename=${k%.*}
	      name=${filename##*/}
	      echo -e "\n\n***Testing output of $k***"
	      output2="${name}_out.out"
	      outtest_file="${name}_o.out"
				echo $output2
				echo $outtest_file
				if [[ $k == *step4_testcase.out ]]
				then

						# echo "testing step4_testcase"
						echo 2 4 25 17 6 32 1 4 15 4 | ./tiny $k > userout/$output2
						# echo "skipping this"
				elif [[ $k == *"test_mult"* ]]
				then
						echo 3 2 | ./tiny $k > userout/$output2
				else
						./tiny $k > userout/$output2
				fi
				diff -y -B -b userout/$output2 outtest/$outtest_file
	  done
