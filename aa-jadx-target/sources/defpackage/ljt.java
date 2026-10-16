package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ljt extends defpackage.ljg {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.WheelSpeedProvider");
    private boolean d;
    private final defpackage.rpe e;
    private final defpackage.lji f;

    public ljt(defpackage.rpe rpeVar) throws defpackage.qst {
        defpackage.lji ljiVar = new defpackage.lji(this, 3, null);
        this.f = ljiVar;
        if (!b(rpeVar)) {
            throw new java.lang.IllegalStateException("Can't create unsupported WheelSpeedProvider.");
        }
        this.e = rpeVar;
        try {
            rpeVar.f(ljiVar, 2, 3);
        } catch (defpackage.qst unused) {
            ((defpackage.yqj) a.l().ai((char) 3982)).u("Car speed sensor not available when car is not connected.");
        }
    }

    static boolean b(defpackage.rpe rpeVar) throws defpackage.qst {
        return rpeVar != null && defpackage.mdp.d().r() && rpeVar.d(2);
    }

    @Override // defpackage.ljg
    public final float a() {
        return (float) defpackage.acpm.c();
    }

    @Override // defpackage.ljg
    protected final defpackage.tew e(java.lang.Object obj, java.lang.Object obj2, long j) {
        if (k(j) <= 0 && !this.d) {
            this.d = true;
            ((defpackage.yqj) a.l().ai((char) 3983)).u("Stale wheel speed! This probably shouldn't happen.");
            defpackage.omf.u().x(10, defpackage.zaa.WHEEL_SPEED_PROVIDER_STALE_SPEED);
        }
        defpackage.lbm.a();
        return new defpackage.tew(obj);
    }

    @Override // defpackage.ljg
    public final void i() {
        defpackage.lji ljiVar;
        super.i();
        defpackage.rpe rpeVar = this.e;
        if (rpeVar == null || (ljiVar = this.f) == null) {
            return;
        }
        rpeVar.b(ljiVar);
    }
}
