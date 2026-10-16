package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dlv {
    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final long c(long j, long j2) {
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final long d(long j) {
        int iRound = java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j >> 32)));
        return (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final long e(int i, int i2) {
        return (((long) i2) & 4294967295L) | (i << 32);
    }

    public static final long f(long j) {
        return (((long) java.lang.Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final defpackage.cjj g(defpackage.dlx dlxVar) {
        return new defpackage.cjj(dlxVar.b, dlxVar.c, dlxVar.d, dlxVar.e);
    }

    public static final defpackage.dlx h(long j, long j2) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        return new defpackage.dlx(i2, i, ((int) (j2 >> 32)) + i2, ((int) (j2 & 4294967295L)) + i);
    }

    public static final defpackage.dlx i(defpackage.cjj cjjVar) {
        return new defpackage.dlx(java.lang.Math.round(cjjVar.b), java.lang.Math.round(cjjVar.c), java.lang.Math.round(cjjVar.d), java.lang.Math.round(cjjVar.e));
    }

    public static android.content.Intent j(android.app.Activity activity) {
        android.content.Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            java.lang.String strL = l(activity, activity.getComponentName());
            if (strL == null) {
                return null;
            }
            android.content.ComponentName componentName = new android.content.ComponentName(activity, strL);
            try {
                return l(activity, componentName) == null ? android.content.Intent.makeMainActivity(componentName) : new android.content.Intent().setComponent(componentName);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                android.util.Log.e("NavUtils", defpackage.a.bp(strL, "getParentActivityIntent: bad parentActivityName '", "' in manifest"));
                return null;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static android.content.Intent k(android.content.Context context, android.content.ComponentName componentName) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String strL = l(context, componentName);
        if (strL == null) {
            return null;
        }
        android.content.ComponentName componentName2 = new android.content.ComponentName(componentName.getPackageName(), strL);
        return l(context, componentName2) == null ? android.content.Intent.makeMainActivity(componentName2) : new android.content.Intent().setComponent(componentName2);
    }

    public static java.lang.String l(android.content.Context context, android.content.ComponentName componentName) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String string;
        android.content.pm.ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, android.os.Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        java.lang.String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        return string.charAt(0) == '.' ? java.lang.String.valueOf(context.getPackageName()).concat(string) : string;
    }

    public static int m(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return ((android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
    }

    public static defpackage.zhs n(defpackage.dog dogVar) {
        defpackage.doe doeVar = new defpackage.doe();
        defpackage.doi doiVar = new defpackage.doi(doeVar);
        doeVar.b = doiVar;
        doeVar.a = dogVar.getClass();
        try {
            doeVar.a = dogVar.a(doeVar);
            return doiVar;
        } catch (java.lang.Exception e) {
            doiVar.a(e);
            return doiVar;
        }
    }

    public static final float o(float f) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat(((int) ((((long) java.lang.Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }
}
