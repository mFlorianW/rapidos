LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = "git://github.com/commschamp/cc.ublox.generated.git;protocol=https;branch=master"
SRCREV = "ab77f67754d47e9f34f114e5169d7b56b4b07745"

DEPENDS += "comms"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""

FILES:${PN}-dev += " \
    ${libdir}/cc_ublox/cmake/ \
"

