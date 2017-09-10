# http://stackoverflow.com/questions/59895/getting-the-source-directory-of-a-bash-script-from-within
DIR_PROJECT="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"/../.. #
# http://stackoverflow.com/questions/11420221/sbt-run-from-outside-the-project-directory
(cd $DIR_PROJECT/others/sbt; # 
./delete.sh; #
./eclipse.sh; #
./update.sh; #
./compile.sh; #
./test.sh; #
./assembly.sh; #
./run.sh; #
cd -) #
