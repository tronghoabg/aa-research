package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.google.android.gms.car.CarInfo;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class mon {
    private static final yph b = yph.c("GH.AppInfo");
    public final ComponentName a;
    private final Context c;
    private final PackageManager d;
    private ComponentInfo e;
    private PackageInfo f;
    private Resources g;
    private String h;
    private String i;
    private SparseIntArray j;
    private Drawable k;
    private final int l;

    public mon(Context context, ResolveInfo resolveInfo) {
        this.c = context.getApplicationContext();
        this.d = context.getPackageManager();
        resolveInfo.getClass();
        if (!f(resolveInfo)) {
            throw new IllegalArgumentException("resolve info must contains either activityInfo or serviceInfo");
        }
        if (resolveInfo.serviceInfo != null) {
            this.e = resolveInfo.serviceInfo;
        } else {
            this.e = resolveInfo.activityInfo;
        }
        this.a = new ComponentName(this.e.packageName, this.e.name);
        this.l = true != acoh.d() ? 32768 : 0;
    }

    public static boolean f(ResolveInfo resolveInfo) {
        return (resolveInfo.activityInfo == null && resolveInfo.serviceInfo == null) ? false : true;
    }

    static final Drawable g(int i, Resources resources) {
        try {
            return resources.getDrawableForDensity(i, resources.getDisplayMetrics().densityDpi, null);
        } catch (Resources.NotFoundException unused) {
            ((ype) ((ype) b.h()).ai((char) 5117)).u("Header icon not found.");
            return null;
        }
    }

    public final int a(int i) {
        int i2 = 0;
        try {
            e();
            SparseIntArray sparseIntArray = this.j;
            if (sparseIntArray == null) {
                ComponentInfo componentInfo = this.e;
                int i3 = (componentInfo == null || componentInfo.metaData == null) ? 0 : this.e.metaData.getInt("com.google.android.gms.car.application.theme");
                if (i3 == 0) {
                    ComponentInfo componentInfo2 = this.e;
                    i3 = (componentInfo2 == null || componentInfo2.applicationInfo == null) ? 0 : this.e.applicationInfo.theme;
                }
                if (i3 == 0) {
                    PackageInfo packageInfo = this.f;
                    i3 = (packageInfo == null || packageInfo.applicationInfo == null) ? 0 : this.f.applicationInfo.theme;
                }
                int[] iArr = {R.attr.colorAccent, R.attr.colorPrimary, R.attr.colorPrimaryDark};
                Arrays.sort(iArr);
                int[] iArr2 = new int[3];
                TypedArray typedArrayObtainStyledAttributes = null;
                try {
                    try {
                        Context contextCreatePackageContext = this.c.createPackageContext(this.a.getPackageName(), 0);
                        if (i3 != 0) {
                            contextCreatePackageContext.setTheme(i3);
                        }
                        typedArrayObtainStyledAttributes = contextCreatePackageContext.getTheme().obtainStyledAttributes(iArr);
                        for (int i4 = 0; i4 < 3; i4++) {
                            iArr2[i4] = typedArrayObtainStyledAttributes != null ? typedArrayObtainStyledAttributes.getColor(i4, 0) : 0;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        ((ype) ((ype) ((ype) b.g()).p(e)).ai(5118)).u("Unable to update messaging package color attributes.");
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                    }
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    this.j = new SparseIntArray(3);
                    while (true) {
                        sparseIntArray = this.j;
                        if (i2 >= 3) {
                            break;
                        }
                        sparseIntArray.put(iArr[i2], iArr2[i2]);
                        i2++;
                    }
                } catch (Throwable th) {
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    throw th;
                }
            }
            return sparseIntArray.get(i);
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public final Drawable b() {
        Drawable drawable = this.k;
        if (drawable != null) {
            return drawable;
        }
        try {
            e();
            ComponentInfo componentInfo = this.e;
            if (componentInfo != null) {
                Bundle bundle = componentInfo.metaData;
                if (bundle != null && bundle.containsKey("appIcon")) {
                    this.k = g(bundle.getInt("appIcon"), this.g);
                } else if (componentInfo.getIconResource() != 0) {
                    this.k = g(componentInfo.getIconResource(), this.g);
                } else {
                    this.k = this.d.getApplicationIcon(componentInfo.applicationInfo);
                }
            } else if (this.f.applicationInfo != null) {
                this.k = this.d.getApplicationIcon(this.f.applicationInfo);
            }
            return this.k;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    public final String c() {
        ComponentInfo componentInfo;
        String string;
        String str = this.h;
        if (str != null) {
            return str;
        }
        try {
            e();
            if (!mkn.e.equals(this.a) || (componentInfo = this.e) == null) {
                ComponentInfo componentInfo2 = this.e;
                if (componentInfo2 != null) {
                    this.h = (String) componentInfo2.loadLabel(this.d);
                } else if (this.f.applicationInfo != null) {
                    this.h = (String) this.f.applicationInfo.loadLabel(this.d);
                }
            } else {
                int i = componentInfo.labelRes;
                try {
                    mki.a.f();
                    CarInfo carInfoD = oni.d(kio.b().e());
                    string = this.c.getString(i, !TextUtils.isEmpty(carInfoD.q) ? carInfoD.q : carInfoD.a);
                } catch (IllegalStateException | NullPointerException | qrz e) {
                    ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 5121)).u("Car not connected.");
                    string = this.c.getString(com.google.android.projection.gearhead.R.string.oem_exit_native_mode);
                }
                this.h = string;
            }
            String strAl = woy.al(this.h);
            this.h = strAl;
            return strAl;
        } catch (PackageManager.NameNotFoundException unused) {
            return this.c.getString(com.google.android.projection.gearhead.R.string.unknown);
        }
    }

    public final String d() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        try {
            e();
            String str2 = this.f.versionName;
            this.i = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void e() throws PackageManager.NameNotFoundException {
        ComponentInfo activityInfo;
        try {
            if (this.e == null) {
                ComponentName componentName = this.a;
                try {
                    activityInfo = this.d.getServiceInfo(componentName, this.l | 128);
                } catch (PackageManager.NameNotFoundException e) {
                    ((ype) b.l().ai(5119)).y("Unable to find component: %s as a service", componentName);
                    try {
                        activityInfo = this.d.getActivityInfo(componentName, this.l | 128);
                    } catch (PackageManager.NameNotFoundException unused) {
                        ((ype) ((ype) b.h()).ai((char) 5120)).y("Unable to find component: %s both as a service and activity", componentName);
                        throw e;
                    }
                }
                this.e = activityInfo;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            ((ype) ((ype) ((ype) b.f()).p(e2)).ai(5123)).y("Component %s can't be found", this.a);
        }
        String packageName = this.a.getPackageName();
        try {
            if (this.f == null) {
                this.f = this.d.getPackageInfo(packageName, this.l);
            }
            if (this.g == null) {
                this.g = this.d.getResourcesForApplication(packageName);
            }
        } catch (PackageManager.NameNotFoundException e3) {
            ((ype) ((ype) b.h()).ai((char) 5122)).y("Package %s can't be found", packageName);
            throw e3;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mon) && this.a.equals(((mon) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public mon(Context context, ComponentName componentName) {
        componentName.getClass();
        this.a = componentName;
        this.c = context.getApplicationContext();
        this.d = context.getPackageManager();
        this.l = true != acoh.d() ? 32768 : 0;
    }
}
