DESCRIPTION = "Xen Image Addons"
HOMEPAGE = "http://github.com/petermuller/meta-addon"
LICENSE = "MIT"
SECTION = "console/tools"
PR = "r0"

LIC_FILES_CHKSUM = "file://COPYING.MIT;md5=838c366f69b72c5df05c96dff79b35f2"

<<<<<<< HEAD
SRC_URI = "file://bridge-setup \
=======
SRC_URI = "file://runme.sh \
	file://vmlinux \
>>>>>>> Try to add decompressed kernel to image.
	file://COPYING.MIT \
	"

PACKAGES = "\
	${PN} \
	"

FILES_${PN} += "\
<<<<<<< HEAD
	/etc/init.d/bridge-setup \
=======
	/home/root \
	/home/root/runme.sh \
	/home/root/vmlinux \
>>>>>>> Try to add decompressed kernel to image.
	"

INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME_${PN} = "bridge-setup"
INITSCRIPT_PARAMS_${PN} = "defaults 84"

do_configure_prepend() {
	cp ${WORKDIR}/COPYING.MIT ${S}/COPYING.MIT
}

do_install() {
<<<<<<< HEAD
	install -m 0755 -d ${D}/etc/init.d/
	install -m 0755 ${WORKDIR}/bridge-setup ${D}/etc/init.d/
=======
	install -m 0755 -d ${D}/home/root
	install -m 0755 ${WORKDIR}/runme.sh ${D}/home/root
	install -m 0644 ${WORKDIR}/vmlinux ${D}/home/root
>>>>>>> Try to add decompressed kernel to image.
}
