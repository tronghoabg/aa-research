package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum t implements eg {
    UNKNOWN(0),
    JS(1),
    DESKTOP(2),
    IOS(3),
    IOS_V2(10),
    ANDROID(4),
    PLAY_CE(5),
    PYTHON(6),
    VR(7),
    PANCETTA(8),
    DRIVE_FS(9),
    YETI(11),
    MAC(12),
    GOOGLE_HOME(13),
    BIRDSONG(14),
    IOS_FIREBASE(15),
    GO(16),
    FUCHSIA(17),
    SPARKLIGHT(18),
    CPLUSPLUS(19),
    KAIOS(20),
    MUSK(21),
    COMPUTE_IMAGE_TOOLS(22),
    ANDROID_FIREBASE(23),
    LOONIX(24),
    C9(25),
    BATTLESTAR(26),
    PORTABLE_PHENOTYPE_LIBRARY(27),
    WINDOWS(28),
    CLOUD_WORKSTATIONS_CONNECTOR(29),
    FITBIT_DARKHORSE(30),
    FITBIT_PYTHON(31),
    NEARBY(32),
    CHROMEOS_BUILD_PYTHON(33),
    DOVETAIL_LOGWRITER(34),
    NEARBY_CPP(35),
    CELLO(36),
    NESTCAM_PHOTON(37),
    DESKTOP_SERVICES(38),
    CHROME_ENTERPRISE_COMPANION(39),
    APPSHEET_CLIENT(40),
    STARGATE(41),
    WGA(42),
    VERTEX_DEV_EXPRESS(43),
    JETSKI(44),
    XPK(45),
    COLAB_VSCODE(46),
    CHROME_DEVTOOLS_MCP_JS(47),
    CLUSTER_TOOLKIT(48),
    MEDIAPIPE(49),
    CHROME_MODERN_WEB_GUIDANCE_JS(50),
    CLUSTER_HEALTH_SCANNER(51);

    private final int ab;

    t(int i2) {
        this.ab = i2;
    }

    public static t a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return JS;
            case 2:
                return DESKTOP;
            case 3:
                return IOS;
            case 4:
                return ANDROID;
            case 5:
                return PLAY_CE;
            case 6:
                return PYTHON;
            case 7:
                return VR;
            case 8:
                return PANCETTA;
            case 9:
                return DRIVE_FS;
            case 10:
                return IOS_V2;
            case 11:
                return YETI;
            case 12:
                return MAC;
            case 13:
                return GOOGLE_HOME;
            case 14:
                return BIRDSONG;
            case 15:
                return IOS_FIREBASE;
            case 16:
                return GO;
            case 17:
                return FUCHSIA;
            case 18:
                return SPARKLIGHT;
            case 19:
                return CPLUSPLUS;
            case 20:
                return KAIOS;
            case 21:
                return MUSK;
            case 22:
                return COMPUTE_IMAGE_TOOLS;
            case 23:
                return ANDROID_FIREBASE;
            case 24:
                return LOONIX;
            case 25:
                return C9;
            case 26:
                return BATTLESTAR;
            case 27:
                return PORTABLE_PHENOTYPE_LIBRARY;
            case 28:
                return WINDOWS;
            case 29:
                return CLOUD_WORKSTATIONS_CONNECTOR;
            case 30:
                return FITBIT_DARKHORSE;
            case 31:
                return FITBIT_PYTHON;
            case 32:
                return NEARBY;
            case 33:
                return CHROMEOS_BUILD_PYTHON;
            case 34:
                return DOVETAIL_LOGWRITER;
            case 35:
                return NEARBY_CPP;
            case 36:
                return CELLO;
            case 37:
                return NESTCAM_PHOTON;
            case 38:
                return DESKTOP_SERVICES;
            case 39:
                return CHROME_ENTERPRISE_COMPANION;
            case 40:
                return APPSHEET_CLIENT;
            case 41:
                return STARGATE;
            case 42:
                return WGA;
            case 43:
                return VERTEX_DEV_EXPRESS;
            case 44:
                return JETSKI;
            case 45:
                return XPK;
            case 46:
                return COLAB_VSCODE;
            case 47:
                return CHROME_DEVTOOLS_MCP_JS;
            case 48:
                return CLUSTER_TOOLKIT;
            case 49:
                return MEDIAPIPE;
            case 50:
                return CHROME_MODERN_WEB_GUIDANCE_JS;
            case 51:
                return CLUSTER_HEALTH_SCANNER;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.ab;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ab);
    }
}
