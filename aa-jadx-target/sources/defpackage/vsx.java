package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vsx {
    public final android.content.Context a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final defpackage.tny e;
    public final defpackage.xzi f;
    public final defpackage.afak g;
    public final defpackage.xyn h;
    public final defpackage.xyn i;
    public final defpackage.xyn j;
    public final defpackage.afak k;
    public final int l;
    public final defpackage.ojm m;

    public vsx(android.content.Context context, defpackage.xyn xynVar, java.lang.String str, defpackage.afak afakVar, defpackage.ojm ojmVar, defpackage.xyn xynVar2, defpackage.xyn xynVar3, defpackage.xyn xynVar4, defpackage.afak afakVar2) {
        int i;
        this.a = context;
        this.g = afakVar;
        this.b = context.getPackageName();
        android.app.ActivityManager activityManager = defpackage.vrn.a;
        this.c = defpackage.vrn.b(context.getPackageName(), defpackage.vrn.a());
        if (xynVar.f()) {
        }
        this.d = str;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
            i = 3;
        } else {
            i = packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        }
        this.l = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : i;
        this.e = new defpackage.tny(context);
        this.f = defpackage.ysr.aQ(new defpackage.ryo(this, 7));
        this.m = ojmVar;
        this.h = xynVar2;
        this.i = xynVar3;
        this.j = xynVar4;
        this.k = afakVar2;
    }

    public static java.util.List a(java.util.List list, int i) {
        return list.size() > i ? list.subList(0, i) : list;
    }
}
