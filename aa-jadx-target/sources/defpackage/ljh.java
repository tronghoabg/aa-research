package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ljh extends defpackage.ljf {
    private static final defpackage.yqm d = defpackage.yqm.c("GH.CarLocationProvider");
    private final defpackage.rpe e;
    private final defpackage.lji f;

    public ljh(defpackage.rpe rpeVar) throws defpackage.qst {
        defpackage.lji ljiVar = new defpackage.lji(this, 1, null);
        this.f = ljiVar;
        defpackage.ysr.bk(l(rpeVar), "Can't create unsupported CarLocationProvider.");
        this.e = rpeVar;
        try {
            rpeVar.f(ljiVar, 10, 0);
        } catch (defpackage.qst unused) {
            ((defpackage.yqj) ((defpackage.yqj) d.h()).ai((char) 3977)).u("Car location sensor not available when car is not connected.");
        }
    }

    static boolean l(defpackage.rpe rpeVar) throws defpackage.qst {
        return rpeVar != null && rpeVar.d(10);
    }

    @Override // defpackage.ljf
    protected final defpackage.zaa b(java.lang.Float f) {
        return (f == null || f.floatValue() == 0.0f) ? defpackage.zaa.CAR_LOCATION_PROVIDER_NULL_SPEED : defpackage.zaa.CAR_LOCATION_PROVIDER_HAS_SPEED;
    }

    @Override // defpackage.ljg
    public final void i() {
        super.i();
        this.e.b(this.f);
    }
}
