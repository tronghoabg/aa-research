package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mpy {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.AuxDisplayConfig");
    public static final android.content.ComponentName b = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.auxiliarydisplay.PrototypeAuxiliaryDisplayNavigationCarActivityService");
    public static final android.content.ComponentName c = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.auxiliarydisplay.PrototypeAuxiliaryDisplayTurnCardCarActivityService");
    public static final android.content.ComponentName d = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.auxiliarydisplay.AuxiliaryDisplayTurnCardCarActivityService");
    public static final android.content.ComponentName e = new android.content.ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.system.auxiliarydisplay.AuxiliaryDisplayNavigationCarActivityService");
    private static final defpackage.yhe h;
    public volatile defpackage.yhe f;
    public volatile boolean g;

    static {
        defpackage.yha yhaVar = new defpackage.yha(4);
        for (defpackage.rkf rkfVar : defpackage.rkf.values()) {
            yhaVar.f(rkfVar, new defpackage.mpx(rkfVar));
        }
        h = yhaVar.d(true);
    }

    public static defpackage.mpy a() {
        return (defpackage.mpy) defpackage.mkp.a.i(defpackage.mpy.class);
    }

    public final defpackage.mpz b(defpackage.rkf rkfVar) {
        d();
        defpackage.mpx mpxVar = (defpackage.mpx) h.get(rkfVar);
        mpxVar.getClass();
        return mpxVar;
    }

    public final defpackage.rkf c(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        d();
        if (!this.f.containsKey(carDisplayId)) {
            throw new java.lang.IllegalArgumentException("AuxiliaryDisplayConfiguration can't provide initial content type for carDisplayId: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(carDisplayId))));
        }
        defpackage.rkf rkfVar = (defpackage.rkf) this.f.get(carDisplayId);
        rkfVar.getClass();
        return rkfVar;
    }

    public final void d() {
        if (!this.g) {
            throw new java.lang.IllegalStateException("AuxiliaryDisplayConfiguration queried before being initialized");
        }
        this.f.getClass();
    }
}
