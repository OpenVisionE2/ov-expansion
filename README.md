ov-expansion [![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
============
With this expansion you'll be able to compile a bootable OV image using OE-A.

It's not our intention to support unofficial builds so do yourself a favor and use https://openvision.tech/stb-images/ instead.

What you get as the result is an image with OV's enigma2 but not what we build so you're on your own. The word "unofficial" clarifies clearly what you build using this expansion is not a work of us.

# How to use?
* git clone -b 5.3 --depth 1 https://github.com/oe-alliance/build-enviroment.git
* cd build-enviroment
* make update
* cd meta-oe-alliance
* git clone --depth 1 https://github.com/OpenVisionE2/ov-expansion.git
* cd ov-expansion
* ./install-ov-expansion.sh
# Example
Now get back to build-enviroment again and use your command with our distro
* MACHINE=zgemmah9t DISTRO=openvision DISTRO_TYPE=release make enigma2-image
