package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rqy {
    static {
        defpackage.yqm.c("GH.TelemetryLog.Verbose");
        defpackage.yqm.c("GH.TelemetryLog.Concise");
    }

    public final void a(defpackage.yyh yyhVar, defpackage.yyg yygVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = java.lang.String.format(java.util.Locale.US, "%s(%d)", yyhVar.name(), java.lang.Integer.valueOf(yyhVar.aw));
        int iOrdinal = yyhVar.ordinal();
        java.lang.String str5 = "<none>";
        if (iOrdinal != 36) {
            if (iOrdinal != 37) {
                str2 = "<none>";
            } else {
                defpackage.zae zaeVar = yygVar.p;
                if (zaeVar == null) {
                    zaeVar = defpackage.zae.a;
                }
                if ((zaeVar.b & 1) != 0) {
                    java.util.Locale locale = java.util.Locale.US;
                    int i = zaeVar.c;
                    int iDc = defpackage.ysr.dc(i);
                    switch (iDc) {
                        case 1:
                            str3 = "UNKNOWN_CONTEXT";
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            str3 = "NOW_SERVICE";
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            str3 = "CALL_MANAGER";
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            str3 = "VANAGON_LIFETIME";
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            str3 = "ACTIVATION";
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            str3 = "PROJECTED_LIFETIME";
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            str3 = "STARTUP_PERF";
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            str3 = "LIFETIME";
                            break;
                        case 9:
                            str3 = "DIAGNOSTICS";
                            break;
                        case 10:
                            str3 = "LOCATION";
                            break;
                        case 11:
                            str3 = "SETTINGS";
                            break;
                        case 12:
                            str3 = "HATS_SURVEY";
                            break;
                        case 13:
                            str3 = "PERMISSIONS";
                            break;
                        case 14:
                            str3 = "MESSAGING";
                            break;
                        case 15:
                            str3 = "AUTO_LAUNCH";
                            break;
                        case 16:
                            str3 = "PLAY_STORE";
                            break;
                        case 17:
                            str3 = "CLOUD_CARD_SERVICE";
                            break;
                        case 18:
                            str3 = "NOTIFICATION_LISTENER";
                            break;
                        case 19:
                            str3 = "EXPERIMENT";
                            break;
                        case 20:
                            str3 = "MEDIA_SESSION";
                            break;
                        case 21:
                            str3 = "DRIVING_MODE";
                            break;
                        case 22:
                            str3 = "MEDIA_BROWSE";
                            break;
                        case 23:
                            str3 = "LENS_SWITCHER";
                            break;
                        case 24:
                            str3 = "BLUETOOTH";
                            break;
                        case 25:
                            str3 = "DRIVING_MODE_GEARHEAD_SETTING_COPIER";
                            break;
                        case 26:
                            str3 = "DRIVING_MODE_DND_SETTING_COPIER";
                            break;
                        case 27:
                            str3 = "COMPATIBLE_APPS";
                            break;
                        case 28:
                            str3 = "CAR_SERVICE";
                            break;
                        case 29:
                            str3 = "FZERO";
                            break;
                        case 30:
                            str3 = "CRASH_CONTEXT";
                            break;
                        case 31:
                            str3 = "DRIVING_MODE_LOCATION";
                            break;
                        case 32:
                            str3 = "SYSTEM_UI";
                            break;
                        case 33:
                            str3 = "WIRELESS";
                            break;
                        case 34:
                            str3 = "PROCESS_PRIORITY";
                            break;
                        case 35:
                            str3 = "CALL_CLIENT_CALL_ADAPTER";
                            break;
                        case 36:
                            str3 = "TESTING";
                            break;
                        case 37:
                            str3 = "LOCAL_ICS_CALL_ADAPTER";
                            break;
                        case 38:
                            str3 = "STARTUP_MEASURE";
                            break;
                        case 39:
                            str3 = "ASSISTANT_EDUCATION";
                            break;
                        case 40:
                            str3 = "ASSISTANT_SUGGESTION";
                            break;
                        case 41:
                            str3 = "HEAD_UNIT_UPDATER";
                            break;
                        case 42:
                            str3 = "PROJECTION_CONTEXT";
                            break;
                        default:
                            str3 = "null";
                            break;
                    }
                    if (iDc == 0) {
                        throw null;
                    }
                    str = java.lang.String.format(locale, "%s(%d)", str3, java.lang.Integer.valueOf(i));
                } else {
                    str = "<none>";
                }
                if ((zaeVar.b & 2) != 0) {
                    str5 = java.lang.String.format(java.util.Locale.US, "%s(%d)", defpackage.zaa.b(zaeVar.d).name(), java.lang.Integer.valueOf(zaeVar.d));
                }
            }
            java.lang.String.format("Type: %s Context: %s Action: %s", str4, str5, str2);
        }
        defpackage.zbg zbgVar = yygVar.o;
        if (zbgVar == null) {
            zbgVar = defpackage.zbg.a;
        }
        str = (zbgVar.b & 1) != 0 ? java.lang.String.format(java.util.Locale.US, "%s(%d)", defpackage.zbe.b(zbgVar.d).name(), java.lang.Integer.valueOf(zbgVar.d)) : "<none>";
        if ((zbgVar.b & 2) != 0) {
            java.util.Locale locale2 = java.util.Locale.US;
            int i2 = zbgVar.e;
            str5 = java.lang.String.format(locale2, "%s(%d)", defpackage.zbd.b(i2).sn, java.lang.Integer.valueOf(i2));
        }
        str2 = str5;
        str5 = str;
        java.lang.String.format("Type: %s Context: %s Action: %s", str4, str5, str2);
    }
}
