# http://stackoverflow.com/questions/59895/getting-the-source-directory-of-a-bash-script-from-within
DIR_PROJECT="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"/../.. #
# http://stackoverflow.com/questions/11420221/sbt-run-from-outside-the-project-directory
(cd $DIR_PROJECT; rm -rf bin; rm -rf target; rm -rf project/project; rm -rf project/target; rm -rf .cache-main; rm -rf .cache-tests; cd -) #