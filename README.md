# how to use 

```
# to compile java classes
make build

# to generate input file, bigger number bigger file
./fast_fasta.sh 25000000

# the file fasta.txt is generated in the target folder
# use that as input file
./knucleotide.sh target/fasta.txt
```

# long knu

## SL

real    0m37.693s
user    6m16.796s
sys 0m3.516s

## macbook
real    3m14.540s
user    9m4.400s
sys 0m30.759s

# long fast fasta

## softlayer
[cocasys@localhost quickperf]$ ./fast_fasta.sh 
-server -XX:+TieredCompilation -XX:+AggressiveOpts

real    0m51.525s
user    0m49.034s
sys 0m2.695s

## macbook
Nicolass-MacBook% ./fast_fasta.sh 
-server -XX:+TieredCompilation -XX:+AggressiveOpts

real    0m54.661s
user    0m47.236s
sys 0m2.958s
