#!/bin/bash

#Configure bridge
ifconfig eth0 up
brctl addbr xenbr0
brctl addif xenbr0 eth0
udhcpc -i xenbr0
