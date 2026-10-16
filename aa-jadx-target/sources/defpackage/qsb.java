package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qsb {
    public java.lang.Boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public qsb(qwt qwtVar, defpackage.qyl qylVar) {
        new java.util.concurrent.CopyOnWriteArrayList();
        this.c = new defpackage.rps(new defpackage.qhx(7));
        if (qwtVar == null) {
            throw new java.lang.IllegalStateException("You must provide ICarCall to CarCallManager.");
        }
        this.b = qylVar;
        if (qylVar == null) {
            this.a = java.lang.Boolean.FALSE;
        }
    }

    public final boolean a() {
        return this.b != null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qyl] */
    public final boolean b() {
        java.lang.Boolean boolValueOf = this.a;
        if (boolValueOf == null) {
            try {
                boolValueOf = java.lang.Boolean.valueOf(this.b.i());
                this.a = boolValueOf;
            } catch (android.os.RemoteException unused) {
                boolValueOf = java.lang.Boolean.FALSE;
                this.a = boolValueOf;
            }
        }
        return boolValueOf.booleanValue();
    }

    public final weu c() {
        this.a.getClass();
        return new weu(this.a.booleanValue(), ((defpackage.ygr) this.c).g(), ((defpackage.ygr) this.b).g());
    }

    public final void d() {
        defpackage.ysr.bk(this.a == null, "A SourcePolicy can only set internal() or external() once.");
        this.a = java.lang.Boolean.FALSE;
    }

    public qsb() {
        int i = defpackage.ygw.d;
        this.c = new defpackage.ygr(4);
        this.b = new defpackage.ygr(4);
    }
}
