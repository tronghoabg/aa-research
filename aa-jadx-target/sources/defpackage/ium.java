package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ium {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.CAM.PKGUTILS");

    public static final android.util.Pair b(android.content.Context context, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{android.R.attr.taskOpenEnterAnimation, android.R.attr.taskOpenExitAnimation});
        try {
            return android.util.Pair.create(java.lang.Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(0, 0)), java.lang.Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(1, 0)));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final int a(android.content.Context context) {
        try {
            android.os.Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getInt("com.google.android.projection.gearhead.WINDOW_ANIMATION_STYLE", 0);
            }
            return 0;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 1349)).y("Could not get windowAnimationStyle for package %s", context.getPackageName());
            return 0;
        }
    }
}
