#!/bin/bash
#script to start existing VMs if desired
#use only after starting the bridge with runme.sh

cd /storage
xl create 2buntu.cfg
xl create centos.cfg
xl create debian.cfg
