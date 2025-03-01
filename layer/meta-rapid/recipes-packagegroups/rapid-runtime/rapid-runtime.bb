DESCRIPTION = "Package group for rapid runtime"
LICENCE = "CLOSED"
SUMMARY = "This package group adds various packages to an image to run the rapid laptimer"

inherit packagegroup

RDEPENDS:${PN} = "  \
    lsof \
    picocom \
    rapid-headless-init \
    hostapd \
"
