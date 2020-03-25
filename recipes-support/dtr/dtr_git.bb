SUMMARY = "dtr - C++ utility library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/dtrussel/dtr.git"
SRCREV = "866c777907e096f9d88d01cf104984906afc6425"

S = "${WORKDIR}/git"

inherit cmake

FILES_${PN}-dev = "${includedir}"

DEPENDS = "boost"
