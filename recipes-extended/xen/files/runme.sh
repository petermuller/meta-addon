#!/bin/bash

#Configure bridge
ifconfig eth0 up
brctl addbr xenbr0
brctl addif xenbr0 eth0
udhcpc -i xenbr0
cd /storage
xl create 2buntu.cfg
xl create centos.cfg
xl create debian.cfg

