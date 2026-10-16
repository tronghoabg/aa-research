package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lhi {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.DsblUntilUsedValid");

    public static final boolean a(android.content.pm.PackageManager packageManager, android.content.ComponentName componentName) {
        try {
            return packageManager.getApplicationEnabledSetting(componentName.getPackageName()) == 4;
        } catch (java.lang.IllegalArgumentException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).p(e)).ai((char) 3918)).u("Could not obtain package information.");
            return false;
        }
    }
}
