SUMMARY = "openvision-spinner"
SECTION = "base"
LICENSE = "proprietary"
inherit allarch

require conf/license/license-gplv2.inc

PV = "1.0"
PR = "r0"

SRC_URI="file://wait1.png \
        file://wait2.png \
        file://wait3.png \
        file://wait4.png \
        file://wait5.png \
        file://wait6.png \
        "
        
S = "${WORKDIR}"

do_install() {
    install -d ${D}${datadir}/enigma2/spinner
    install -m 0644 ${S}/*.png ${D}${datadir}/enigma2/spinner
}

FILES:${PN} = "${datadir}/enigma2"
