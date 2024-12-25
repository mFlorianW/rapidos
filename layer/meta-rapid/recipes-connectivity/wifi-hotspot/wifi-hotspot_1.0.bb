SUMMARY = "Rapid WIFI Hotspot Service"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit systemd

RDEPENDS:${PN} = "rapid bash"

SRC_URI = " \
    file://wifi-hotspot.service \
    file://start-wifi-hotspot.sh \
"
SYSTEMD_SERVICE:${PN} = "wifi-hotspot.service"

FILES:${PN} += "${systemd_unitdir}/system/wifi-hotspot.service"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/start-wifi-hotspot.sh ${D}${bindir}
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/wifi-hotspot.service ${D}${systemd_unitdir}/system/
}

