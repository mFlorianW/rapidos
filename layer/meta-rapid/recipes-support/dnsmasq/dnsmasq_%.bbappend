FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://dnsmasq.conf"

SYSTEMD_AUTO_ENABLE:${PN} = "enable"

do_install:append(){
    install -d ${D}${sysconfdir}/system
    install -m 0644 ${UNPACKDIR}/dnsmasq.conf ${D}${sysconfdir}
}

