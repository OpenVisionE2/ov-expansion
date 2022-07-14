RDEPENDS:${PN}:remove:openvision = "oe-alliance-branding"
RDEPENDS:${PN}:append:openvision = " openwebif-remotes"

SRC_URI = "${@bb.utils.contains("DISTRO_NAME", "openvision", "git://github.com/OpenVisionE2/${MODULE}.git;protocol=https;branch=${BRANCH}", "git://github.com/E2OpenPlugins/e2openplugin-${MODULE}.git;protocol=https;branch=${BRANCH}", d)} \
           file://transcoding.py"
