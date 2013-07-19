DESCRIPTION = "Xen Image Addons"
HOMEPAGE = "http://github.com/petermuller/meta-addon"
LICENSE = "GPLv2"
SECTION = "console/tools"
PR = "r0"

LIC_FILES_CHKSUM = "file://COPYING;md5=e0f0f3ac55608719a82394cc353928df"

SRC_URI = "file://runme.sh"

PACKAGES = "\
	${PN}-base \
	"

FILES_${PN}-base += "\
	/home/root \
	/home/root/runme.sh \
	"

do_install() {
	install -m 0755 -d ${D}/home/root
	install -m 0644 ${WORKDIR}/runme.sh ${D}/home/root
}
