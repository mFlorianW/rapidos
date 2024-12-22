LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSES/GPL-2.0-or-later.txt;md5=3d26203303a722dedc6bf909d95ba815"

SRC_URI = "git://github.com/mFlorianW/rapid.git;protocol=https;branch=main"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit cmake

DEPENDS += " \
    kdbindings \
    boost \
    spdlog \
    nlohmann-json \
"

EXTRA_OECMAKE += " -DENABLE_QT=OFF  -DENABLE_BOOST=ON"
