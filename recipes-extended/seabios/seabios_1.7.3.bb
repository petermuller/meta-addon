DESCRIPTION = "Seabios"
HOMEPAGE = "http://github.com/petermuller/meta-addon"
LICENSE = "GPLv3"
SECTION = "console/tools"
PR = "r0"

LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = " \
	http://code.coreboot.org/p/seabios/downloads/get/${PN}-${PV}.tar.gz \
	"

SRC_URI[md5sum] = "0dabc344a2ce5daaa88fb5cdc69c3f49"
SRC_URI[sha256sum] = "2762c5056da9cad463086e5588f9194425ac4d664b9b5f3d00e63950c3103dce"

S = "${WORKDIR}/${PN}-${PV}"

DEPENDS = "iasl-native"
RDEPENDS_${PN} = "iasl-native"

PACKAGES = "\
	${PN} \
	"

FILES_${PN} = "\
	/home/root \
	/home/root/bios.bin.elf \
	"

do_compile(){
	make
}

do_install(){
	install -m 0755 -d ${D}/home/root/
	install -m 0755 ${S}/out/bios.bin.elf ${D}/home/root/
}
