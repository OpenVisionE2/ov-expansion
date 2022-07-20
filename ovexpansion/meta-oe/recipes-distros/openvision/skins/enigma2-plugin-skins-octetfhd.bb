SUMMARY = "Enigma2 Skin OctEtFHD"
SECTION = "base"
PRIORITY = "required"
LICENSE = "proprietary"

require conf/license/license-gplv2.inc

inherit gitpkgv allarch

PV = "git${SRCPV}"
PKGV = "git${GITPKGV}"

RDEPENDS:${PN} += "\
	enigma2-plugin-extensions-weatherplugin \
	enigma2-plugin-fonts-opensans \
	enigma2-plugin-fonts-dejavusanscondensedbold \
	enigma2-plugin-skincomponents-weathercomponent \
	enigma2-plugin-systemplugins-weathercomponenthandler \
	"

SRC_URI = "git://github.com/OpenVisionE2/OctEtFHD-skin.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

FILES:${PN} = "${prefix}"

do_package_qa[noexec] = "1"

do_install() {
	cp -fr --preserve=links ${S}${prefix} ${D}/
}
