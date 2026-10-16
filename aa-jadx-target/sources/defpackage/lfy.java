package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lfy {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.AppIconCache");
    public static final java.lang.Object b = new java.lang.Object();
    public static defpackage.lfy c;
    private final defpackage.lfz d;
    private final android.util.LruCache e = new android.util.LruCache(24);

    public lfy(defpackage.lfz lfzVar) {
        this.d = lfzVar;
    }

    public static defpackage.lfy e(android.content.Context context) {
        defpackage.lfy lfyVar;
        synchronized (b) {
            lfyVar = c;
            if (lfyVar == null) {
                lfyVar = new defpackage.lfy(new defpackage.lfz(context));
                c = lfyVar;
            }
        }
        return lfyVar;
    }

    public final synchronized android.graphics.Bitmap a(android.content.Context context, int i) throws java.lang.Throwable {
        try {
            try {
                return d(context, i, -1, null, android.graphics.PorterDuff.Mode.SRC_IN);
            } catch (java.lang.Throwable th) {
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public final synchronized android.graphics.Bitmap b(android.content.Context context, android.content.ComponentName componentName) {
        return c(context, componentName, -1);
    }

    public final synchronized android.graphics.Bitmap c(android.content.Context context, android.content.ComponentName componentName, int i) {
        return f(context, componentName, i, android.graphics.PorterDuff.Mode.SRC_IN);
    }

    public final synchronized android.graphics.Bitmap d(android.content.Context context, int i, int i2, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        defpackage.lfy lfyVarE = e(context);
        android.util.LruCache lruCache = lfyVarE.e;
        java.lang.String strBo = defpackage.a.bo(i, "r_");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) lruCache.get(strBo);
        if (bitmap != null) {
            return bitmap;
        }
        defpackage.lfz lfzVar = lfyVarE.d;
        android.graphics.drawable.Drawable drawable = context.getDrawable(i);
        drawable.getClass();
        android.graphics.Bitmap bitmapA = lfzVar.a(drawable, false, i2, colorStateList, mode, null);
        ((defpackage.yqj) defpackage.lfz.a.l().ai(3893)).R("createAppIcon: Resource id: %d Size: %dx%d.", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(bitmapA.getWidth()), java.lang.Integer.valueOf(bitmapA.getHeight()));
        lruCache.put(strBo, bitmapA);
        return bitmapA;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0051 A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:4:0x0007, B:7:0x002f, B:9:0x0041, B:11:0x0049, B:19:0x0074, B:21:0x0085, B:46:0x010b, B:50:0x0140, B:49:0x0128, B:23:0x0091, B:28:0x00ad, B:31:0x00b6, B:33:0x00bf, B:35:0x00d6, B:37:0x00db, B:38:0x00e7, B:41:0x00f0, B:43:0x00fd, B:12:0x0051, B:14:0x005b, B:16:0x0065, B:17:0x006a), top: B:57:0x0007, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x005b A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:4:0x0007, B:7:0x002f, B:9:0x0041, B:11:0x0049, B:19:0x0074, B:21:0x0085, B:46:0x010b, B:50:0x0140, B:49:0x0128, B:23:0x0091, B:28:0x00ad, B:31:0x00b6, B:33:0x00bf, B:35:0x00d6, B:37:0x00db, B:38:0x00e7, B:41:0x00f0, B:43:0x00fd, B:12:0x0051, B:14:0x005b, B:16:0x0065, B:17:0x006a), top: B:57:0x0007, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0065 A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:4:0x0007, B:7:0x002f, B:9:0x0041, B:11:0x0049, B:19:0x0074, B:21:0x0085, B:46:0x010b, B:50:0x0140, B:49:0x0128, B:23:0x0091, B:28:0x00ad, B:31:0x00b6, B:33:0x00bf, B:35:0x00d6, B:37:0x00db, B:38:0x00e7, B:41:0x00f0, B:43:0x00fd, B:12:0x0051, B:14:0x005b, B:16:0x0065, B:17:0x006a), top: B:57:0x0007, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x010b A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:4:0x0007, B:7:0x002f, B:9:0x0041, B:11:0x0049, B:19:0x0074, B:21:0x0085, B:46:0x010b, B:50:0x0140, B:49:0x0128, B:23:0x0091, B:28:0x00ad, B:31:0x00b6, B:33:0x00bf, B:35:0x00d6, B:37:0x00db, B:38:0x00e7, B:41:0x00f0, B:43:0x00fd, B:12:0x0051, B:14:0x005b, B:16:0x0065, B:17:0x006a), top: B:57:0x0007, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0127  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128 A[Catch: all -> 0x01a6, TryCatch #0 {all -> 0x01a6, blocks: (B:4:0x0007, B:7:0x002f, B:9:0x0041, B:11:0x0049, B:19:0x0074, B:21:0x0085, B:46:0x010b, B:50:0x0140, B:49:0x0128, B:23:0x0091, B:28:0x00ad, B:31:0x00b6, B:33:0x00bf, B:35:0x00d6, B:37:0x00db, B:38:0x00e7, B:41:0x00f0, B:43:0x00fd, B:12:0x0051, B:14:0x005b, B:16:0x0065, B:17:0x006a), top: B:57:0x0007, inners: #1, #2 }] */
    public final synchronized android.graphics.Bitmap f(android.content.Context context, android.content.ComponentName componentName, int i, android.graphics.PorterDuff.Mode mode) {
        android.graphics.Bitmap bitmap;
        android.content.ComponentName componentNameB;
        android.content.ComponentName componentName2;
        android.graphics.drawable.Drawable applicationIcon;
        int i2;
        try {
            defpackage.lfy lfyVarE = e(context);
            java.lang.String str = "c_" + java.lang.String.valueOf(componentName) + "_" + i;
            android.util.LruCache lruCache = lfyVarE.e;
            bitmap = (android.graphics.Bitmap) lruCache.get(str);
            if (bitmap == null) {
                defpackage.lfz lfzVar = lfyVarE.d;
                defpackage.lgp lgpVarA = defpackage.lgp.a();
                defpackage.acwd acwdVar = defpackage.acwd.a;
                if (acwdVar.fF().c()) {
                    java.util.HashMap map = lgpVarA.b;
                    if (map.containsKey(componentName)) {
                        componentName2 = (android.content.ComponentName) map.get(componentName);
                    } else {
                        componentNameB = defpackage.lgp.b(componentName);
                        if (!componentNameB.equals(componentName)) {
                            if (acwdVar.fF().c()) {
                                lgpVarA.b.put(componentName, componentNameB);
                            }
                            ((defpackage.yqj) defpackage.lgp.a.l().ai((char) 3905)).M("Fetching icon for system app instead of gearhead app. system app: %s, gearhead: %s", componentNameB, componentName);
                        }
                        componentName2 = componentNameB;
                    }
                } else {
                    componentNameB = defpackage.lgp.b(componentName);
                    if (!componentNameB.equals(componentName)) {
                        if (acwdVar.fF().c()) {
                            lgpVarA.b.put(componentName, componentNameB);
                        }
                        ((defpackage.yqj) defpackage.lgp.a.l().ai((char) 3905)).M("Fetching icon for system app instead of gearhead app. system app: %s, gearhead: %s", componentNameB, componentName);
                    }
                    componentName2 = componentNameB;
                }
                defpackage.yqm yqmVar = defpackage.lgd.a;
                componentName2.getClass();
                if (defpackage.afga.f(componentName2.getPackageName(), "com.samsung.android.calendar") || defpackage.afga.f(componentName2.getPackageName(), "com.google.android.calendar")) {
                    int i3 = lfzVar.b;
                    context.getClass();
                    componentName2.getClass();
                    java.lang.String packageName = componentName2.getPackageName();
                    int iHashCode = packageName.hashCode();
                    applicationIcon = null;
                    if (iHashCode != -1955351778) {
                        if (iHashCode == 578428293 && packageName.equals("com.google.android.calendar")) {
                            android.content.pm.PackageManager packageManager = context.getPackageManager();
                            packageManager.getClass();
                            try {
                                android.os.Bundle bundle = packageManager.getActivityInfo(componentName2, 128).metaData;
                                android.content.res.Resources resourcesForApplication = packageManager.getResourcesForApplication(componentName2.getPackageName());
                                resourcesForApplication.getClass();
                                int iA = defpackage.lgd.a(componentName2, bundle, resourcesForApplication);
                                if (iA != 0) {
                                    applicationIcon = resourcesForApplication.getDrawableForDensity(iA, i3, null);
                                }
                            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                                defpackage.lgd.a.l().y("Calendar package not found %s", componentName2);
                            }
                        }
                    } else if (packageName.equals("com.samsung.android.calendar")) {
                        try {
                            applicationIcon = context.getPackageManager().getApplicationIcon(componentName2.getPackageName());
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                            defpackage.lgd.a.l().y("Failed to load dynamic Samsung calendar icon: %s", componentName2);
                        }
                    }
                    if (applicationIcon == null) {
                        int i4 = defpackage.lgb.a;
                        i2 = lfzVar.b;
                        applicationIcon = defpackage.lgb.a(context, componentName2, i2);
                        if (applicationIcon != null) {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.lfz.a.h()).ai((char) 3898)).y("Falling back to the default icon (componentName=%s)", componentName2);
                            applicationIcon = context.getResources().getDrawableForDensity(android.R.drawable.sym_def_app_icon, i2);
                        }
                    }
                    applicationIcon.getClass();
                    android.graphics.Bitmap bitmapA = lfzVar.a(applicationIcon, true, -1, null, mode, componentName2);
                    ((defpackage.yqj) defpackage.lfz.a.l().ai(3894)).R("createAppIcon: Size: %dx%d (componentName=%s)", java.lang.Integer.valueOf(bitmapA.getWidth()), java.lang.Integer.valueOf(bitmapA.getHeight()), componentName2.flattenToShortString());
                    android.graphics.Bitmap bitmapC = defpackage.kfn.c(bitmapA, i);
                    ((defpackage.yqj) a.l().ai(3890)).T("Stored icon for %s in cache(%s). Sized %dx%d for requested width: %d", componentName, str, java.lang.Integer.valueOf(bitmapC.getWidth()), java.lang.Integer.valueOf(bitmapC.getHeight()), java.lang.Integer.valueOf(i));
                    lruCache.put(str, bitmapC);
                    bitmap = bitmapC;
                } else {
                    int i5 = defpackage.lgb.a;
                    i2 = lfzVar.b;
                    applicationIcon = defpackage.lgb.a(context, componentName2, i2);
                    if (applicationIcon != null) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.lfz.a.h()).ai((char) 3898)).y("Falling back to the default icon (componentName=%s)", componentName2);
                        applicationIcon = context.getResources().getDrawableForDensity(android.R.drawable.sym_def_app_icon, i2);
                    }
                    applicationIcon.getClass();
                    android.graphics.Bitmap bitmapA2 = lfzVar.a(applicationIcon, true, -1, null, mode, componentName2);
                    ((defpackage.yqj) defpackage.lfz.a.l().ai(3894)).R("createAppIcon: Size: %dx%d (componentName=%s)", java.lang.Integer.valueOf(bitmapA2.getWidth()), java.lang.Integer.valueOf(bitmapA2.getHeight()), componentName2.flattenToShortString());
                    android.graphics.Bitmap bitmapC2 = defpackage.kfn.c(bitmapA2, i);
                    ((defpackage.yqj) a.l().ai(3890)).T("Stored icon for %s in cache(%s). Sized %dx%d for requested width: %d", componentName, str, java.lang.Integer.valueOf(bitmapC2.getWidth()), java.lang.Integer.valueOf(bitmapC2.getHeight()), java.lang.Integer.valueOf(i));
                    lruCache.put(str, bitmapC2);
                    bitmap = bitmapC2;
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return bitmap;
    }
}
