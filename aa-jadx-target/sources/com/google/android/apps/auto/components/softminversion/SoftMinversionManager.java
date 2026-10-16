package com.google.android.apps.auto.components.softminversion;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class SoftMinversionManager {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.SoftMinversionMgr");
    public final defpackage.yhe b;
    public final android.content.Context c;
    public final defpackage.rqt d;

    public SoftMinversionManager(android.content.Context context) {
        defpackage.rqt rqtVarA = defpackage.rqt.a(context);
        this.c = context;
        this.d = rqtVarA;
        this.b = defpackage.yhe.m("com.google.android.gms", 2132083142, "com.google.android.googlequicksearchbox", 2132083140, "com.google.android.apps.maps", 2132083141);
    }

    public final android.graphics.Bitmap a(java.lang.String str) {
        try {
            android.graphics.drawable.Drawable applicationIcon = this.c.getPackageManager().getApplicationIcon(str);
            if (applicationIcon instanceof android.graphics.drawable.BitmapDrawable) {
                return ((android.graphics.drawable.BitmapDrawable) applicationIcon).getBitmap();
            }
            android.content.Context context = this.c;
            return defpackage.kfn.b(applicationIcon, context.getResources().getDimensionPixelSize(2131168033), context.getResources().getDimensionPixelSize(2131168032));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
