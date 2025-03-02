FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://01-wlan0.network"


do_install:append(){
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${UNPACKDIR}/01-wlan0.network ${D}${sysconfdir}/systemd/network
}

