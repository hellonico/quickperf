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

# fasta macbook

real	0m12.859s
user	0m42.658s
sys	0m0.616s

# fast fasta macbook

real    0m6.799s
user    0m5.179s
sys 0m0.648s

# fast fasta SL

## zulu
real    0m7.498s
user    1m4.619s
sys 0m2.190s

# fast knucleotide SL

real    0m4.134s
user    0m46.589s
sys 0m0.362s

real    0m4.790s
user    0m46.196s
sys 0m0.372s

## zulu 

real    0m4.222s
user    0m47.031s
sys 0m0.372s

# fast knucleotide macbook

real    0m17.124s
user    0m43.973s
sys 0m1.315s
