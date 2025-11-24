SUMMARY = "Prebuilt bootlader images for Qualcomm RB1"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cbbe399f2c983ad51768f4561587f000"

SRC_URI = "file://emmc_binaries_arduino_unoq.zip"
SRC_URI[sha256sum] = "26390a8a2ec1ebda57d80d672ee18202c086168f170fdf5c8b12f63639cd3aae"

BOOTBINARIES = "emmc_binaries_arduino_unoq"

QCOM_BOOT_IMG_SUBDIR = "qrb2210"

include firmware-qcom-boot-common.inc
