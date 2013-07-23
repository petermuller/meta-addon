DESCRIPTION = "Xen Image Addons"
HOMEPAGE = "http://github.com/petermuller/meta-addon"
LICENSE = "MIT"
SECTION = "console/tools"
PR = "r0"

SRC_URI = "file://runme.sh \
	file://seabios.tar.gz.txt \
	"

PACKAGES = "\
	${PN} \
	"

FILES_${PN} += "\
	/home/root \
	/home/root/runme.sh \
	/home/root/seabios.tar.gz.txt \
	"

do_install() {
	install -m 0755 -d ${D}/home/root
	install -m 0755 ${WORKDIR}/runme.sh ${D}/home/root
	install -m 0644 ${WORKDIR}/seabios.tar.gz.txt ${D}/home/root
}
