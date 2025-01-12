LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = "git://github.com/commschamp/comms.git;protocol=https;branch=master"
SRCREV = "ebaa7b6097b74bfa01310556b8e8ef5527afafa2"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""

FILES:${PN}-dev += " \
    ${libdir}/LibComms/cmake/ \
"
