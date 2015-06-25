#!/bin/sh

if [ $# -ne 2 ] 
then
  echo "usage: makeproject.sh dir project"
  exit
fi

PDIR=$1
PROJECT=$2

if [ ! -d $PDIR ]
then
  echo "$PDIR dont exist!!!!!"
  exit
fi

if [ -d $PDIR/$PROJECT ]
then
   echo "$PROJECT had exist!!!!"
   exit
fi

mkdir -p $PDIR/$PROJECT

cp -rf . $PDIR/$PROJECT

rm -f $PDIR/$PROJECT/*.sh

cd $PDIR/$PROJECT

find . -name "*.xml" -exec sed -i -e "s@simple@$PROJECT@g" {} \;

JAVANAME=`echo $PROJECT|awk '{print substr($0,1,1)}' | tr [a-z] [A-Z]``echo $PROJECT|awk '{print substr($0,2)}'`

for f in `find . -name "*simple*"` 
do
   RPATH=`echo $f|sed -e  "s@simple@$PROJECT@g"`
   mv $f $RPATH
done

for f in `find . -name "*Simple*"` 
do
   RPATH=`echo $f|sed -e "s@Simple@$JAVANAME@g"`
   mv $f $RPATH
done


find . -name "*.java" -exec sed -i -e "s@simple@$PROJECT@g" {} \;

find . -name "*.java" -exec sed -i -e "s@Simple@$JAVANAME@g" {} \;

find . -name "*.groovy" -exec sed -i -e "s@simple@$PROJECT@g" {} \;

find . -name "*.groovy" -exec sed -i -e "s@Simple@$JAVANAME@g" {} \;

rm -rf .git
