package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static volatile boolean a = false;
    public static boolean b = false;

    public static final void a() {
        if (android.os.Build.VERSION.SDK_INT <= 35) {
            return;
        }
        try {
            android.os.flagging.AconfigPackage aconfigPackageLoad = android.os.flagging.AconfigPackage.load("android.service.personalcontext");
            aconfigPackageLoad.getBooleanFlagValue("enable_personal_context_attribution_support", false);
            b = aconfigPackageLoad.getBooleanFlagValue("enable_personal_context_service", false);
            aconfigPackageLoad.getBooleanFlagValue("allow_understander_registration", false);
            aconfigPackageLoad.getBooleanFlagValue("enable_egress_validation_for_understander", false);
            aconfigPackageLoad.getBooleanFlagValue("enable_personal_context_app_functions_support", false);
            aconfigPackageLoad.getBooleanFlagValue("public_apis", false);
            aconfigPackageLoad.getBooleanFlagValue("surface_based_workflows", false);
        } catch (java.lang.Exception e) {
            android.util.Log.e("ExportedFlags", e.toString());
        } catch (java.lang.LinkageError e2) {
            android.util.Log.w("ExportedFlags", e2.toString());
        }
        a = true;
    }
}
