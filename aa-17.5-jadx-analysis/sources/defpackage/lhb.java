package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class lhb {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.DsblUntilUsedValid");

    public static final boolean a(PackageManager packageManager, ComponentName componentName) {
        try {
            return packageManager.getApplicationEnabledSetting(componentName.getPackageName()) == 4;
        } catch (IllegalArgumentException e) {
            ((ype) ((ype) ((ype) b.h()).p(e)).ai((char) 3915)).u("Could not obtain package information.");
            return false;
        }
    }
}
