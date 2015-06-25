#!/bin/sh
BASEDIR="$(dirname $(readlink -f $(dirname "$0")))"
profile=""
port=""
if [ $# -eq 2 ] ; then
   profile="-Dspring.profiles.active=$1"
   port="-Dserver.port=$2"
fi

nohup java $profile $port -cp $BASEDIR/config:$BASEDIR/lib/*:.  com.xuanniu.BusinessSimpleWebApplication > /dev/null 2>&1 &