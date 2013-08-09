#!/bin/bash

#execute this script only if replacing a filesystem
cd /storage
mv rootfs.img rootfs.img.old
cp rootfs.img.new rootfs.img
