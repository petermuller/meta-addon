DESCRIPTION = "Xen Image Addons"
HOMEPAGE = "http://github.com/petermuller/meta-addon"
LICENSE = "MIT"
SECTION = "console/tools"
PR = "r0"

LIC_FILES_CHKSUM = "file://COPYING.MIT;md5=838c366f69b72c5df05c96dff79b35f2"

SRC_URI = "file://bridgesetup.sh \
	file://vmlaunch.sh \
	file://COPYING.MIT \
	"

PACKAGES = "\
	${PN} \
	"

FILES_${PN} += "\
	/home/root \
	/home/root/bridgesetup.sh \
	/home/root/vmlaunch.sh \
	"

do_configure_prepend() {
	cp ${WORKDIR}/COPYING.MIT ${S}/COPYING.MIT
}

do_install() {
	install -m 0755 -d ${D}/home/root
	install -m 0755 ${WORKDIR}/bridgesetup.sh ${D}/home/root
	install -m 0755 ${WORKDIR}/vmlaunch.sh ${D}/home/root
}
