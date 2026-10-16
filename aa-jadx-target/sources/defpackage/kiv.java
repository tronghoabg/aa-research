package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kiv {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CarInfoCache");
    public static final com.google.android.gms.car.CarInfo b = new com.google.android.gms.car.CarInfo("", "", "", "", 0, 0, false, 0, "", "", "", "", false, false, false, "", "", 0);
    public final java.util.concurrent.atomic.AtomicReference c = new java.util.concurrent.atomic.AtomicReference();
    public final java.util.concurrent.atomic.AtomicReference d = new java.util.concurrent.atomic.AtomicReference();
    private final defpackage.kfp e;

    public kiv(defpackage.jrj jrjVar) {
        defpackage.kiu kiuVar = new defpackage.kiu(this);
        this.e = kiuVar;
        if (jrjVar == defpackage.jrj.b) {
            defpackage.yqm yqmVar = defpackage.kit.a;
            ((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).v(kiuVar);
        }
    }

    public static defpackage.kiv a() {
        return (defpackage.kiv) defpackage.mkp.a.i(defpackage.kiv.class);
    }

    public final com.google.android.gms.car.CarInfo b() {
        return (com.google.android.gms.car.CarInfo) this.c.get();
    }

    public final java.lang.String c() {
        return (java.lang.String) this.d.get();
    }

    public final void d(com.google.android.gms.car.CarInfo carInfo, java.lang.String str) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3157)).y("setCarInfo invoked by %s", str);
        this.c.set(carInfo);
    }
}
