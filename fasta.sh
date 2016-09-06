echo $JAVA_OPTS
echo $1
time java $JAVA_OPTS fasta $1 > target/fasta.txt