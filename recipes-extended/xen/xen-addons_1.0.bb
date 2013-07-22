DESCRIPTION = "Xen Image Addons"
HOMEPAGE = "http://github.com/petermuller/meta-addon"
LICENSE = "MIT"
SECTION = "console/tools"
PR = "r0"

LIC_FILES_CHKSUM = "file://COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://runme.sh \
	file://COPYING.MIT \
	"

PACKAGES = "\
	${PN} \
	"

FILES_${PN} += "\
	/home/root \
	/home/root/runme.sh \
	"

do_install() {
	install -m 0755 -d ${D}/home/root
	install -m 0644 ${WORKDIR}/runme.sh ${D}/home/root
}