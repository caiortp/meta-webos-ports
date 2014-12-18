# Copyright (c) 2012-2013 LG Electronics, Inc.

SUMMARY = "SMTP transport service for sending emails"
SECTION = "webos/base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "jemalloc db8 mojomail-common boost icu libpalmsocket libsandbox pmloglib glib-2.0 cjson luna-service2 c-ares curl"

PV = "2.0.0-99+git${SRCPV}"
SRCREV = "3a433c00b37dbfc45210b30248b0b30a1503230e"

inherit webos_public_repo
inherit webos_cmake
inherit pkgconfig
inherit webos_system_bus
inherit webos_machine_impl_dep

WEBOS_REPO_NAME = "mojomail"
SRC_URI = "${OPENWEBOS_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git/smtp"