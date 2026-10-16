package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hnj {
    private static volatile boolean a = false;
    private static boolean b = false;

    public static boolean a() {
        if (!a) {
            b();
        }
        return b;
    }

    private static final void b() {
        if (android.os.Build.VERSION.SDK_INT <= 35) {
            return;
        }
        try {
            android.os.flagging.AconfigPackage aconfigPackageLoad = android.os.flagging.AconfigPackage.load("com.android.graphics.surfaceflinger.flags");
            aconfigPackageLoad.getBooleanFlagValue("arr_setframerate_api", false);
            aconfigPackageLoad.getBooleanFlagValue("arr_surfacecontrol_setframerate_api", false);
            aconfigPackageLoad.getBooleanFlagValue("blur_outline_regions", false);
            b = aconfigPackageLoad.getBooleanFlagValue("disable_synthetic_vsync_for_performance", false);
            aconfigPackageLoad.getBooleanFlagValue("readback_screenshot", false);
            aconfigPackageLoad.getBooleanFlagValue("parse_edid_version_and_input_type_v2", false);
        } catch (java.lang.Exception e) {
            android.util.Log.e("ExportedFlags", e.toString());
        } catch (java.lang.LinkageError e2) {
            android.util.Log.w("ExportedFlags", e2.toString());
        }
        a = true;
    }
}
