ov-expansion [![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
============
Time to say "Shut that hole" to some people, right? ;)

Over time we heard some inexperienced people said OV is closed-source which is nonsense. They don't know how to work with OE otherwise we wouldn't be having this repo.

With this expansion you'll be able to compile a bootable OV image using OE-A but do remember we won't support it as we're not a part of OE-A and we will NEVER be.

It's not our intention to support unofficial builds so do yourself a favor and use https://openvision.tech/stb-images/ instead.

What you get as the result is an image with OV's enigma2 but not what we build so you're on your own. The word "unofficial" clarifies clearly what you build using this expansion is not a work of us so good luck.

# How to use?
* git clone -b 5.1 --depth 1 https://github.com/oe-alliance/build-enviroment.git
* cd build-enviroment
* make update
* cd meta-oe-alliance
* git clone --depth 1 https://github.com/OpenVisionE2/ov-expansion.git
* cd ov-expansion
* ./install-ov-expansion.sh
# Example
Now get back to build-enviroment again and use your command with our distro
* MACHINE=zgemmah9t DISTRO=openvision DISTRO_TYPE=release make enigma2-image
