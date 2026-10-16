package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class e {
    public static volatile boolean a = false;
    public static boolean b = false;

    public static final void a() {
        if (android.os.Build.VERSION.SDK_INT <= 35) {
            return;
        }
        try {
            android.os.flagging.AconfigPackage aconfigPackageM = b$.ExternalSyntheticApiModelOutline0.m("android.service.personalcontext");
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "enable_personal_context_attribution_support", false);
            b = b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "enable_personal_context_service", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "allow_understander_registration", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "enable_egress_validation_for_understander", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "enable_personal_context_app_functions_support", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "public_apis", false);
            b$.ExternalSyntheticApiModelOutline0.m(aconfigPackageM, "surface_based_workflows", false);
        } catch (java.lang.Exception e) {
            android.util.Log.e("ExportedFlags", e.toString());
        } catch (java.lang.LinkageError e2) {
            android.util.Log.w("ExportedFlags", e2.toString());
        }
        a = true;
    }
}
