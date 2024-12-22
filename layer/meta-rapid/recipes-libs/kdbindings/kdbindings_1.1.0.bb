LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSES/MIT.txt;md5=7dda4e90ded66ab88b86f76169f28663"

SRC_URI = "git://github.com/KDAB/KDBindings.git;protocol=https;branch=1.1"
SRCREV = "efb54c58c3c2fce280d7089617935ec265fe4e2d"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""

