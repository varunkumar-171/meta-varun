FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI:append:raspberrypi4-64 = " file://my-ssd1306-overlay.dts;subdir=git/arch/${ARCH}/boot/dts/overlays"

