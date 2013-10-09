#!/bin/bash
#script to start existing VMs if desired
#use only after starting the bridge with runme.sh


for i in $(ls /storage/*.cfg)
do
    xl create $i
done
