SUMMARY = "Logging DBUS Object"
DESCRIPTION = "Logging DBUS Object"
HOMEPAGE = "https://github.com/openbmc/phosphor-logging"
PR = "r1"

inherit autotools pkgconfig
inherit pythonnative
inherit obmc-phosphor-license
inherit obmc-phosphor-dbus-service
inherit phosphor-dbus-interfaces

DBUS_SERVICE_${PN} += "xyz.openbmc_project.Logging.service"

DEPENDS += "autoconf-archive-native"
DEPENDS += "systemd"
DEPENDS += "python-mako-native"
DEPENDS += "python-pyyaml-native"
DEPENDS += "sdbusplus sdbusplus-native"
DEPENDS += "phosphor-dbus-interfaces"
RDEPENDS_${PN} += "sdbusplus phosphor-dbus-interfaces"
PROVIDES += "virtual/obmc-logging-mgmt"
RPROVIDES_${PN} += "virtual-obmc-logging-mgmt"

SRC_URI += "git://github.com/openbmc/phosphor-logging"
SRCREV = "27c87d922b94567b05ba4c60ba67615c1568b599"

S = "${WORKDIR}/git"

EXTRA_OECONF = "YAML_DIR=${STAGING_DIR_NATIVE}${yaml_dir}"
