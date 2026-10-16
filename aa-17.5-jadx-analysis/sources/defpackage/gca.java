package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class gca {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.gcb r19, defpackage.cfy r20, int r21, defpackage.bux r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gca.a(gcb, cfy, int, bux, int, int):void");
    }

    public static final cfy b(cfy cfyVar, afdr afdrVar, afdr afdrVar2) {
        return bxc.r(cjn.g(cfyVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, false, 1, 983039), new fnv(afdrVar, afdrVar2, 17, null));
    }

    public static final String c(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(componentName.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            gks.f("CarApp.H.Tem", e, "Could not find the application info");
            applicationInfo = null;
        }
        return applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo).toString() : componentName.getPackageName();
    }

    public static final String d(String str, gdq gdqVar, Context context) {
        int i = gdqVar.e;
        if (i == 0) {
            return context.getString(R.string.client_error_text, str);
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return context.getString(R.string.gearhead_anr_message, str);
        }
        if (i2 == 1) {
            return context.getString(R.string.gearhead_anr_waiting);
        }
        if (i2 != 2) {
            return i2 != 3 ? context.getString(R.string.feature_not_supported_text, str) : context.getString(R.string.missing_permission_text, str);
        }
        Throwable th = gdqVar.a;
        int i3 = th instanceof ggm ? ((ggm) th).a : 2;
        if (i3 != 0) {
            return context.getString(i3 + (-1) != 0 ? R.string.host_api_too_old : R.string.app_api_too_old, str);
        }
        throw null;
    }

    public static void e(geu geuVar, uq uqVar) {
        if (uqVar.isParkedOnly()) {
            geuVar.i();
            if (!geuVar.w().b) {
                nas nasVarY = geuVar.y();
                Resources resources = geuVar.getResources();
                geuVar.u();
                nasVarY.a(resources.getString(R.string.parked_only_action), 0);
                return;
            }
        }
        geuVar.t().h(uqVar);
    }

    public static boolean f(geu geuVar) {
        return (geuVar.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
