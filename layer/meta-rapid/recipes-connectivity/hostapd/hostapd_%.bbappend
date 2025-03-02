FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://hostapd.conf"

SYSTEMD_AUTO_ENABLE:${PN} = "enable"

do_install:append(){
    install -d ${D}${sysconfdir}/system
    install -m 0644 ${UNPACKDIR}/hostapd.conf ${D}${sysconfdir}
}
