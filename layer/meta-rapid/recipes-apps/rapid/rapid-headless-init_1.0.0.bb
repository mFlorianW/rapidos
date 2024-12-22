SUMMARY = "Rapid Headless  Service"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit systemd

RDEPENDS:${PN} = "rapid"

SRC_URI = "file://rapid-headless.service"
SYSTEMD_SERVICE:${PN} = "rapid-headless.service"

FILES:${PN} += "${systemd_unitdir}/system/rapid-headless.service"

do_install() {
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/rapid-headless.service ${D}${systemd_unitdir}/system/
}
