package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class lfv {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.IconLoader");

    public static final Drawable a(Context context, ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        ComponentInfo activityInfo;
        PackageManager packageManager = context.getPackageManager();
        int iconResource = 0;
        try {
            try {
                activityInfo = packageManager.getServiceInfo(componentName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = packageManager.getActivityInfo(componentName, 0);
            }
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException unused2) {
            ((ype) ((ype) b.f()).ai((char) 3897)).y("Unable to find component as a service or activity (componentName=%s)", componentName);
            try {
                iconResource = packageManager.getApplicationInfo(componentName.getPackageName(), 0).icon;
            } catch (PackageManager.NameNotFoundException unused3) {
                ((ype) ((ype) b.h()).ai((char) 3898)).y("Unable to find component as a service, activity, or application (componentName=%s)", componentName);
            }
        }
        try {
            return packageManager.getResourcesForApplication(componentName.getPackageName()).getDrawableForDensity(iconResource, i, null);
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused4) {
            ((ype) ((ype) b.h()).ai((char) 3896)).y("Unable to load the component icon (componentName=%s)", componentName);
            return null;
        }
    }
}
