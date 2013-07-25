meta-addon
==========

Layer for adding desired functionality to an existing OpenEmbedded image.

You may experience an error such as "tools/kconfig/conf: File not found" or something similar. This is because there may be a misplaced shared library. To fix this, I used the following command (while on Ubuntu 12.10):

# ln -sf /lib64/ld-linux-x86-64.so.2 /lib/ld-linux-x86-64.so.2
