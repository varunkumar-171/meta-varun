DESCRIPTION = "Custom kernel module for the ssd1306 oled display"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=89b006c4edd6ee8fb93d9f676d0abb53"
PV = "0.1"

inherit module

SRC_URI = "file://i2c_ssd1306.c \
	   file://ssd1306.h  \
	   file://Makefile \
	   file://LICENSE"

S = "${WORKDIR}"

KERNEL_MODULE_AUTOLOAD += "i2c_ssd1306"
