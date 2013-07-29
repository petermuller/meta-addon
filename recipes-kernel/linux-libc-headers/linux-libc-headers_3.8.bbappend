do_install_append() {
	install -d 0755 -m ${D}/usr/bin/
	install -m ${S}/scripts/extract-vmlinux ${D}/usr/bin/
}
