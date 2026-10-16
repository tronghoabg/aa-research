package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
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
            android.os.flagging.AconfigPackage aconfigPackageM = b$.ExternalSyntheticApiModelOutline0.m("com.android.graphics.surfaceflinger.flags");
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "arr_setframerate_api", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "arr_surfacecontrol_setframerate_api", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "blur_outline_regions", false);
            b = b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "disable_synthetic_vsync_for_performance", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "readback_screenshot", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "parse_edid_version_and_input_type_v2", false);
        } catch (java.lang.Exception e) {
            android.util.Log.e("ExportedFlags", e.toString());
        } catch (java.lang.LinkageError e2) {
            android.util.Log.w("ExportedFlags", e2.toString());
        }
        a = true;
    }
}
