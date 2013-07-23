DESCRIPTION = "Seabios"
HOMEPAGE = "http://github.com/petermuller/meta-addon"
LICENSE = "GPLv3"
SECTION = "console/tools"
PR = "r0"

LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = " \
	file://bios.bin \
	file://COPYING \
	"

#SRC_URI[md5sum] = "3fe6207982752f0eb7068244748ae45d"
#SRC_URI[sha256sum] = "e6862230581ff6e0838f2a708a5aaa6c34000bce025138ca449a0931ebc0604f"

PACKAGES = "\
	${PN} \
	"

FILES_${PN} = "\
	/usr/share/qemu \
	/usr/share/qemu/bios.bin \
	/usr/share/seabios \
	/usr/share/seabios/bios.bin \
	"

do_configure_prepend() {
	cp ${WORKDIR}/COPYING ${S}/COPYING
}

do_install(){
	install -m 0755 -d ${D}/usr/share/qemu/
	install -m 0755 -d ${D}/usr/share/seabios/
	install -m 0755 ${WORKDIR}/bios.bin ${D}/usr/share/qemu/
	install -m 0755 ${WORKDIR}/bios.bin ${D}/usr/share/seabios/
}
