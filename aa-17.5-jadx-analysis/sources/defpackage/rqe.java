package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Locale;

/* loaded from: classes.dex */
public final class rqe {
    static {
        yph.c("GH.TelemetryLog.Verbose");
        yph.c("GH.TelemetryLog.Concise");
    }

    public final void a(yxc yxcVar, yxb yxbVar) {
        String str;
        String str2;
        String str3;
        String str4 = String.format(Locale.US, "%s(%d)", yxcVar.name(), Integer.valueOf(yxcVar.aw));
        int iOrdinal = yxcVar.ordinal();
        String str5 = "<none>";
        if (iOrdinal == 36) {
            zab zabVar = yxbVar.o;
            if (zabVar == null) {
                zabVar = zab.a;
            }
            str = (zabVar.b & 1) != 0 ? String.format(Locale.US, "%s(%d)", yzz.b(zabVar.d).name(), Integer.valueOf(zabVar.d)) : "<none>";
            if ((zabVar.b & 2) != 0) {
                Locale locale = Locale.US;
                int i = zabVar.e;
                str5 = String.format(locale, "%s(%d)", yzy.b(i).sn, Integer.valueOf(i));
            }
        } else {
            if (iOrdinal != 37) {
                str2 = "<none>";
                String.format("Type: %s Context: %s Action: %s", str4, str5, str2);
            }
            yyz yyzVar = yxbVar.p;
            if (yyzVar == null) {
                yyzVar = yyz.a;
            }
            if ((yyzVar.b & 1) != 0) {
                Locale locale2 = Locale.US;
                int i2 = yyzVar.c;
                int iAK = wub.aK(i2);
                switch (iAK) {
                    case 1:
                        str3 = "UNKNOWN_CONTEXT";
                        break;
                    case 2:
                        str3 = "NOW_SERVICE";
                        break;
                    case 3:
                        str3 = "CALL_MANAGER";
                        break;
                    case 4:
                        str3 = "VANAGON_LIFETIME";
                        break;
                    case 5:
                        str3 = "ACTIVATION";
                        break;
                    case 6:
                        str3 = "PROJECTED_LIFETIME";
                        break;
                    case 7:
                        str3 = "STARTUP_PERF";
                        break;
                    case 8:
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
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        str3 = "CAR_SERVICE";
                        break;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
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
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        str3 = "WIRELESS";
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        str3 = "PROCESS_PRIORITY";
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        str3 = "CALL_CLIENT_CALL_ADAPTER";
                        break;
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                        str3 = "TESTING";
                        break;
                    case 37:
                        str3 = "LOCAL_ICS_CALL_ADAPTER";
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        str3 = "STARTUP_MEASURE";
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        str3 = "ASSISTANT_EDUCATION";
                        break;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        str3 = "ASSISTANT_SUGGESTION";
                        break;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        str3 = "HEAD_UNIT_UPDATER";
                        break;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        str3 = "PROJECTION_CONTEXT";
                        break;
                    default:
                        str3 = "null";
                        break;
                }
                if (iAK == 0) {
                    throw null;
                }
                str = String.format(locale2, "%s(%d)", str3, Integer.valueOf(i2));
            } else {
                str = "<none>";
            }
            if ((yyzVar.b & 2) != 0) {
                str5 = String.format(Locale.US, "%s(%d)", yyv.b(yyzVar.d).name(), Integer.valueOf(yyzVar.d));
            }
        }
        str2 = str5;
        str5 = str;
        String.format("Type: %s Context: %s Action: %s", str4, str5, str2);
    }
}
