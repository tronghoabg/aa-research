package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mot {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.AppInfo");
    public final android.content.ComponentName a;
    private final android.content.Context c;
    private final android.content.pm.PackageManager d;
    private android.content.pm.ComponentInfo e;
    private android.content.pm.PackageInfo f;
    private android.content.res.Resources g;
    private java.lang.String h;
    private java.lang.String i;
    private android.util.SparseIntArray j;
    private android.graphics.drawable.Drawable k;
    private final int l;

    public mot(android.content.Context context, android.content.pm.ResolveInfo resolveInfo) {
        this.c = context.getApplicationContext();
        this.d = context.getPackageManager();
        resolveInfo.getClass();
        if (!f(resolveInfo)) {
            throw new java.lang.IllegalArgumentException("resolve info must contains either activityInfo or serviceInfo");
        }
        if (resolveInfo.serviceInfo != null) {
            this.e = resolveInfo.serviceInfo;
        } else {
            this.e = resolveInfo.activityInfo;
        }
        this.a = new android.content.ComponentName(this.e.packageName, this.e.name);
        this.l = true != defpackage.acpj.d() ? 32768 : 0;
    }

    public static boolean f(android.content.pm.ResolveInfo resolveInfo) {
        return (resolveInfo.activityInfo == null && resolveInfo.serviceInfo == null) ? false : true;
    }

    static final android.graphics.drawable.Drawable g(int i, android.content.res.Resources resources) {
        try {
            return resources.getDrawableForDensity(i, resources.getDisplayMetrics().densityDpi, null);
        } catch (android.content.res.Resources.NotFoundException unused) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 5119)).u("Header icon not found.");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:48:0x00ae->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc A[EDGE_INSN: B:62:0x00bc->B:51:0x00bc BREAK  A[LOOP:1: B:48:0x00ae->B:50:0x00b2], SYNTHETIC] */
    public final int a(int i) {
        int i2 = 0;
        try {
            e();
            android.util.SparseIntArray sparseIntArray = this.j;
            if (sparseIntArray == null) {
                android.content.pm.ComponentInfo componentInfo = this.e;
                int i3 = (componentInfo == null || componentInfo.metaData == null) ? 0 : this.e.metaData.getInt("com.google.android.gms.car.application.theme");
                if (i3 == 0) {
                    android.content.pm.ComponentInfo componentInfo2 = this.e;
                    i3 = (componentInfo2 == null || componentInfo2.applicationInfo == null) ? 0 : this.e.applicationInfo.theme;
                }
                if (i3 == 0) {
                    android.content.pm.PackageInfo packageInfo = this.f;
                    i3 = (packageInfo == null || packageInfo.applicationInfo == null) ? 0 : this.f.applicationInfo.theme;
                }
                int[] iArr = {android.R.attr.colorAccent, android.R.attr.colorPrimary, android.R.attr.colorPrimaryDark};
                java.util.Arrays.sort(iArr);
                int[] iArr2 = new int[3];
                android.content.res.TypedArray typedArrayObtainStyledAttributes = null;
                try {
                    try {
                        android.content.Context contextCreatePackageContext = this.c.createPackageContext(this.a.getPackageName(), 0);
                        if (i3 != 0) {
                            contextCreatePackageContext.setTheme(i3);
                        }
                        typedArrayObtainStyledAttributes = contextCreatePackageContext.getTheme().obtainStyledAttributes(iArr);
                        for (int i4 = 0; i4 < 3; i4++) {
                            iArr2[i4] = typedArrayObtainStyledAttributes != null ? typedArrayObtainStyledAttributes.getColor(i4, 0) : 0;
                        }
                        if (typedArrayObtainStyledAttributes != null) {
                            typedArrayObtainStyledAttributes.recycle();
                        }
                        while (true) {
                            sparseIntArray = this.j;
                            if (i2 < 3) {
                                break;
                            }
                            sparseIntArray.put(iArr[i2], iArr2[i2]);
                            i2++;
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.g()).p(e)).ai(5120)).u("Unable to update messaging package color attributes.");
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        this.j = new android.util.SparseIntArray(3);
                        while (true) {
                            sparseIntArray = this.j;
                            if (i2 < 3) {
                                break;
                                break;
                            }
                            sparseIntArray.put(iArr[i2], iArr2[i2]);
                            i2++;
                        }
                    }
                    this.j = new android.util.SparseIntArray(3);
                } catch (java.lang.Throwable th) {
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    throw th;
                }
            }
            return sparseIntArray.get(i);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public final android.graphics.drawable.Drawable b() {
        android.graphics.drawable.Drawable drawable = this.k;
        if (drawable != null) {
            return drawable;
        }
        try {
            e();
            android.content.pm.ComponentInfo componentInfo = this.e;
            if (componentInfo != null) {
                android.os.Bundle bundle = componentInfo.metaData;
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
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final java.lang.String c() {
        android.content.pm.ComponentInfo componentInfo;
        java.lang.String string;
        java.lang.String str = this.h;
        if (str != null) {
            return str;
        }
        try {
            e();
            if (!defpackage.mkt.e.equals(this.a) || (componentInfo = this.e) == null) {
                android.content.pm.ComponentInfo componentInfo2 = this.e;
                if (componentInfo2 != null) {
                    this.h = (java.lang.String) componentInfo2.loadLabel(this.d);
                } else if (this.f.applicationInfo != null) {
                    this.h = (java.lang.String) this.f.applicationInfo.loadLabel(this.d);
                }
            } else {
                int i = componentInfo.labelRes;
                try {
                    defpackage.mkp.a.f();
                    com.google.android.gms.car.CarInfo carInfoD = defpackage.ooa.d(defpackage.kit.b().e());
                    string = this.c.getString(i, !android.text.TextUtils.isEmpty(carInfoD.q) ? carInfoD.q : carInfoD.a);
                } catch (java.lang.IllegalStateException | java.lang.NullPointerException | defpackage.qst e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.g()).p(e)).ai((char) 5123)).u("Car not connected.");
                    string = this.c.getString(com.google.android.projection.gearhead.R.string.oem_exit_native_mode);
                }
                this.h = string;
            }
            java.lang.String strBv = defpackage.ysr.bv(this.h);
            this.h = strBv;
            return strBv;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return this.c.getString(com.google.android.projection.gearhead.R.string.unknown);
        }
    }

    public final java.lang.String d() {
        java.lang.String str = this.i;
        if (str != null) {
            return str;
        }
        try {
            e();
            java.lang.String str2 = this.f.versionName;
            this.i = str2;
            return str2;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void e() throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.pm.ComponentInfo activityInfo;
        try {
            if (this.e == null) {
                android.content.ComponentName componentName = this.a;
                try {
                    activityInfo = this.d.getServiceInfo(componentName, this.l | 128);
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    ((defpackage.yqj) b.l().ai(5121)).y("Unable to find component: %s as a service", componentName);
                    try {
                        activityInfo = this.d.getActivityInfo(componentName, this.l | 128);
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                        ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 5122)).y("Unable to find component: %s both as a service and activity", componentName);
                        throw e;
                    }
                }
                this.e = activityInfo;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.f()).p(e2)).ai(5125)).y("Component %s can't be found", this.a);
        }
        java.lang.String packageName = this.a.getPackageName();
        try {
            if (this.f == null) {
                this.f = this.d.getPackageInfo(packageName, this.l);
            }
            if (this.g == null) {
                this.g = this.d.getResourcesForApplication(packageName);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 5124)).y("Package %s can't be found", packageName);
            throw e3;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.mot) && this.a.equals(((defpackage.mot) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public mot(android.content.Context context, android.content.ComponentName componentName) {
        componentName.getClass();
        this.a = componentName;
        this.c = context.getApplicationContext();
        this.d = context.getPackageManager();
        this.l = true != defpackage.acpj.d() ? 32768 : 0;
    }
}
