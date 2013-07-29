do_install_append() {
	install -m 0755 -d ${D}/usr/bin/
	install -m 0755 ${S}/scripts/extract-vmlinux ${D}/usr/bin/
}
