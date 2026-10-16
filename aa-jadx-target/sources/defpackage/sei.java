package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sei {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.FRX.CHECKS");
    public final defpackage.roy b;
    private final android.content.Context c;
    private final defpackage.seh d;
    private final defpackage.seg e;
    private final java.lang.String f = "com.google.android.projection.gearhead";

    public sei(android.content.Context context, defpackage.roy royVar, defpackage.seh sehVar, defpackage.seg segVar) {
        this.c = context;
        this.b = royVar;
        this.d = sehVar;
        this.e = segVar;
    }

    public static final void f(defpackage.wyz wyzVar, defpackage.zbd zbdVar) {
        ((defpackage.joq) wyzVar.a).f.O.b(defpackage.rrw.h(defpackage.yzd.FRX, defpackage.zbe.PREFLIGHT, zbdVar).l());
    }

    public final java.util.List a() {
        return this.e.e();
    }

    public final boolean b() {
        try {
            if (this.c.getPackageManager().getPackageInfo(this.f, 0).versionCode < 17629000) {
                return true;
            }
            return this.d.a();
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 8814)).u("Gearhead isn't installed; this check must be in the wrong position");
            return true;
        }
    }

    public final boolean c() {
        defpackage.roy royVar = this.b;
        if (!royVar.a()) {
            return false;
        }
        com.google.android.gms.carsetup.CarInfoInternal carInfoInternal = (com.google.android.gms.carsetup.CarInfoInternal) royVar.a;
        return carInfoInternal.o && carInfoInternal.p;
    }

    public final boolean d() {
        return ((com.google.android.gms.carsetup.CarInfoInternal) this.b.a).c;
    }

    public final boolean e() {
        return (c() && d() && b() && a().isEmpty()) ? false : true;
    }
}
