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

DEPENDS = "iasl"

PACKAGES = "\
	${PN} \
	"

FILES_${PN} = "\
	
	"
