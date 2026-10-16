package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes2.dex */
public final class jrk {
    private static final yph a = yph.c("GH.PackageManagerUtils");

    public static String a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (PackageManager.NameNotFoundException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 2702)).u("Failed to find appName. Maybe the specified package doesn't exist?");
            return null;
        }
    }

    public static boolean b(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(RemoteApiConstants.NOW_PACKAGE, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
