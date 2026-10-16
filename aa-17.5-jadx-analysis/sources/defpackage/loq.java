package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;

/* loaded from: classes2.dex */
final class loq {
    public static final yph a = yph.c("GH.MediaPackageInfo");
    public final ComponentName b;
    public final Context c;
    public final PackageManager d;
    public final Resources e;
    public final ServiceInfo f;
    public final ApplicationInfo g;

    public loq(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        Resources resourcesForApplication;
        ServiceInfo serviceInfo;
        this.b = componentName;
        this.c = context;
        PackageManager packageManager = context.getPackageManager();
        this.d = packageManager;
        ApplicationInfo applicationInfo = null;
        try {
            resourcesForApplication = packageManager.getResourcesForApplication(componentName.getPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            ((ype) ((ype) a.g()).ai((char) 4104)).y("Unable to get resources for %s", componentName.getPackageName());
            resourcesForApplication = null;
        }
        this.e = resourcesForApplication;
        try {
            serviceInfo = this.d.getServiceInfo(componentName, 128);
        } catch (PackageManager.NameNotFoundException unused2) {
            ((ype) ((ype) a.g()).ai((char) 4105)).y("Got a component that doesn't exist (%s)", componentName);
            serviceInfo = null;
        }
        this.f = serviceInfo;
        try {
            applicationInfo = this.d.getApplicationInfo(componentName.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 4103)).u("Unable to update media client package attributes.");
        }
        this.g = applicationInfo;
    }

    public final String a(int i, String str) {
        Resources resources;
        if (i != 0 && (resources = this.e) != null) {
            try {
                return resources.getString(i);
            } catch (Resources.NotFoundException unused) {
                ((ype) ((ype) a.g()).ai(4106)).y("App Name not found for %s, using default", this.b);
            }
        }
        return str;
    }
}
