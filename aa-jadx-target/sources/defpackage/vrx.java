package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vrx implements defpackage.aclt {
    private final defpackage.aclw a;
    private final /* synthetic */ int b;

    public vrx(defpackage.aclw aclwVar, int i) {
        this.b = i;
        this.a = aclwVar;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        android.os.Looper looper;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.vrw((ajht) ((defpackage.aclu) this.a).b);
            case 1:
                return new defpackage.vrl((android.content.Context) ((defpackage.aclu) this.a).b);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.vss(defpackage.acls.b(this.a));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.content.Context context = (android.content.Context) ((defpackage.aclu) this.a).b;
                int i = defpackage.sks.c;
                return java.lang.Integer.valueOf(defpackage.sli.a(context));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                android.content.Context context2 = (android.content.Context) ((defpackage.aclu) this.a).b;
                android.content.pm.PackageManager packageManager = context2.getPackageManager();
                java.lang.String packageName = context2.getPackageName();
                try {
                    android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                    return new defpackage.abob(packageInfo.versionName, packageInfo.versionCode);
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e)).ai((char) 9829)).y("Failed to get PackageInfo for: %s", packageName);
                    return new defpackage.abob((java.lang.String) null, 0);
                }
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new vtc((defpackage.xzo) this.a.a());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object ynuVar = defpackage.a.N() ? new defpackage.ynu((defpackage.vsw) this.a.a()) : defpackage.ynd.a;
                ynuVar.getClass();
                return ynuVar;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return !((defpackage.xyn) ((defpackage.aclu) this.a).b).f() ? new vvb() : new vvb();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return !((defpackage.xyn) ((defpackage.aclu) this.a).b).f() ? new vvb() : new vvb();
            case 9:
                defpackage.xyn xynVar = (defpackage.xyn) ((defpackage.aclu) this.a).b;
                if (xynVar.f()) {
                    looper = (android.os.Looper) xynVar.b();
                } else {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("Primes-Jank", 10);
                    handlerThread.start();
                    looper = handlerThread.getLooper();
                }
                return new android.os.Handler(looper);
            case 10:
                return new vvb();
            case 11:
                return new defpackage.vvl((ajht) ((defpackage.aclu) this.a).b);
            case 12:
                return new defpackage.vwg((ajht) ((defpackage.aclu) this.a).b);
            case 13:
                return new defpackage.vwv((ajht) ((defpackage.aclu) this.a).b);
            case 14:
                defpackage.xyn xynVar2 = (defpackage.xyn) ((defpackage.aclu) this.a).b;
                defpackage.xxe xxeVar = defpackage.xxe.a;
                return (vxb) xynVar2.d(new vxb(xxeVar, xxeVar));
            case 15:
                return new defpackage.vxg((ajht) ((defpackage.aclu) this.a).b);
            case 16:
                return new defpackage.ynu((defpackage.vsw) this.a.a());
            case 17:
                return new defpackage.vxm((ajht) ((defpackage.aclu) this.a).b);
            case 18:
                return new defpackage.vya((ajht) ((defpackage.aclu) this.a).b);
            case 19:
                return new defpackage.vyj((ajht) ((defpackage.aclu) this.a).b);
            default:
                final defpackage.tmy tmyVar = (defpackage.tmy) this.a.a();
                return new defpackage.zfw() { // from class: vyq
                    @Override // defpackage.zfw
                    public final j$.time.Instant a() {
                        return j$.time.Instant.ofEpochMilli(tmyVar.a());
                    }
                };
        }
    }
}
