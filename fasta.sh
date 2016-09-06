echo $JAVA_OPTS
echo "Parameter to generate file: $1 (0 is default)"
java -cp target $JAVA_OPTS fasta $1 > target/fasta.txt