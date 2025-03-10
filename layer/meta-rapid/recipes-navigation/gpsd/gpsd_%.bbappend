FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://gpsd.default"

do_install:append(){
    install -d ${D}${sysconfdir}/default
    install -m 0644 ${UNPACKDIR}/gpsd.default ${D}${sysconfdir}/default
}

