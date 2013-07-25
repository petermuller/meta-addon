DESCRIPTION = "Xen Image Addons"
HOMEPAGE = "http://github.com/petermuller/meta-addon"
LICENSE = "MIT"
SECTION = "console/tools"
PR = "r0"

LIC_FILES_CHKSUM = "file://COPYING.MIT;md5=838c366f69b72c5df05c96dff79b35f2"

SRC_URI = "file://bridge-setup \
	file://COPYING.MIT \
	"

PACKAGES = "\
	${PN} \
	"

FILES_${PN} += "\
	/etc/init.d/bridge-setup \
	"

INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME_${PN} = "bridge-setup"
INITSCRIPT_PARAMS_${PN} = "defaults 84"

do_configure_prepend() {
	cp ${WORKDIR}/COPYING.MIT ${S}/COPYING.MIT
}

do_install() {
	install -m 0755 -d ${D}/etc/init.d/
	install -m 0755 ${WORKDIR}/bridge-setup ${D}/etc/init.d/
}
