#
# This file is the xilinx-linux-power-utility recipe.
#

SUMMARY = "Simple ina-bm application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

TARGET_CC_ARCH += "${LDFLAGS}"

SRCREV = "c33d2699ff0790e47c865a118332ca72ecbcf708"
SRC_URI = "git://github.com/parker-xilinx/xilinx-linux-power-utility.git"


S = "${WORKDIR}/git"

do_compile() {
        oe_runmake
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/ina_bm ${D}${bindir}
}
