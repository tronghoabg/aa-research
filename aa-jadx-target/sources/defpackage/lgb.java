package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lgb {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.IconLoader");

    public static final android.graphics.drawable.Drawable a(android.content.Context context, android.content.ComponentName componentName, int i) {
        android.content.pm.ComponentInfo activityInfo;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        int iconResource = 0;
        try {
            try {
                activityInfo = packageManager.getServiceInfo(componentName, 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                activityInfo = packageManager.getActivityInfo(componentName, 0);
            }
            iconResource = activityInfo.getIconResource();
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            ((defpackage.yqj) ((defpackage.yqj) b.f()).ai((char) 3900)).y("Unable to find component as a service or activity (componentName=%s)", componentName);
            try {
                iconResource = packageManager.getApplicationInfo(componentName.getPackageName(), 0).icon;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 3901)).y("Unable to find component as a service, activity, or application (componentName=%s)", componentName);
            }
        }
        try {
            return packageManager.getResourcesForApplication(componentName.getPackageName()).getDrawableForDensity(iconResource, i, null);
        } catch (android.content.pm.PackageManager.NameNotFoundException | android.content.res.Resources.NotFoundException unused4) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 3899)).y("Unable to load the component icon (componentName=%s)", componentName);
            return null;
        }
    }
}
