clean:
	rm -fr target

build: clean
	mkdir target
	javac fasta.java -d target
	javac knucleotide.java -d target

test:
	./fast_fasta.sh 25000000
	./knucleotide.sh target/fasta.txt

all: clean build test