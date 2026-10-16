package defpackage;

import android.os.Build;
import android.os.flagging.AconfigPackage;
import android.util.Log;

/* loaded from: classes.dex */
public final class e {
    public static volatile boolean a = false;
    public static boolean b = false;

    public static final void a() {
        if (Build.VERSION.SDK_INT <= 35) {
            return;
        }
        try {
            AconfigPackage aconfigPackageLoad = AconfigPackage.load("android.service.personalcontext");
            aconfigPackageLoad.getBooleanFlagValue("enable_personal_context_attribution_support", false);
            b = aconfigPackageLoad.getBooleanFlagValue("enable_personal_context_service", false);
            aconfigPackageLoad.getBooleanFlagValue("allow_understander_registration", false);
            aconfigPackageLoad.getBooleanFlagValue("enable_egress_validation_for_understander", false);
            aconfigPackageLoad.getBooleanFlagValue("enable_personal_context_app_functions_support", false);
            aconfigPackageLoad.getBooleanFlagValue("public_apis", false);
            aconfigPackageLoad.getBooleanFlagValue("surface_based_workflows", false);
        } catch (Exception e) {
            Log.e("ExportedFlags", e.toString());
        } catch (LinkageError e2) {
            Log.w("ExportedFlags", e2.toString());
        }
        a = true;
    }
}
