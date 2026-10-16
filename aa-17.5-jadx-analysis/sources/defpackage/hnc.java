package defpackage;

import android.os.Build;
import android.os.flagging.AconfigPackage;
import android.util.Log;

/* loaded from: classes.dex */
public final class hnc {
    private static volatile boolean a = false;
    private static boolean b = false;

    public static boolean a() {
        if (!a) {
            b();
        }
        return b;
    }

    private static final void b() {
        if (Build.VERSION.SDK_INT <= 35) {
            return;
        }
        try {
            AconfigPackage aconfigPackageLoad = AconfigPackage.load("com.android.graphics.surfaceflinger.flags");
            aconfigPackageLoad.getBooleanFlagValue("arr_setframerate_api", false);
            aconfigPackageLoad.getBooleanFlagValue("arr_surfacecontrol_setframerate_api", false);
            b = aconfigPackageLoad.getBooleanFlagValue("disable_synthetic_vsync_for_performance", false);
            aconfigPackageLoad.getBooleanFlagValue("readback_screenshot", false);
            aconfigPackageLoad.getBooleanFlagValue("parse_edid_version_and_input_type_v2", false);
        } catch (Exception e) {
            Log.e("ExportedFlags", e.toString());
        } catch (LinkageError e2) {
            Log.w("ExportedFlags", e2.toString());
        }
        a = true;
    }
}
