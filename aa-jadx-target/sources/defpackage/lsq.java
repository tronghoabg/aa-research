package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lsq extends defpackage.lhm implements defpackage.mnj {
    public final java.util.Collection a;
    private final defpackage.eqp b;
    private final defpackage.eqt c;
    private final defpackage.eqp d;
    private final defpackage.eqt e;
    private final defpackage.eqp f;
    private final defpackage.eqt g;
    private final defpackage.eqp h;
    private final defpackage.eqt i;
    private final defpackage.eqp k;
    private final defpackage.eqt l;

    public lsq() {
        defpackage.eqp eqpVarC;
        defpackage.ltn ltnVarE = defpackage.lmp.a().e() ? defpackage.ltu.e(defpackage.zbe.MEDIA_FACET, null, null, null, 14) : null;
        this.a = new defpackage.yfd(250);
        int i = 4;
        if (defpackage.lmp.a().e()) {
            ltnVarE.getClass();
            eqpVarC = ((defpackage.ltt) ltnVarE).b;
        } else {
            eqpVarC = defpackage.tcu.C(defpackage.lhe.b().a(defpackage.mqg.MEDIA), new defpackage.lra(defpackage.lpg.j(), i));
        }
        int i2 = 1;
        defpackage.eqp eqpVarV = defpackage.tcu.v(eqpVarC, new defpackage.ltk(i2));
        this.b = defpackage.tcu.t(eqpVarC);
        this.d = b(eqpVarV, new defpackage.lsn(0));
        this.f = b(eqpVarV, new defpackage.lsn(2));
        this.h = b(eqpVarV, new defpackage.lsn(3));
        this.k = b(eqpVarV, new defpackage.lsn(4));
        this.c = new defpackage.lnj(this, 20);
        this.e = new defpackage.lso(this, i2);
        this.g = new defpackage.lso(this, 0);
        this.i = new defpackage.lnj(this, 18);
        this.l = new defpackage.lnj(this, 19);
    }

    private static defpackage.eqp b(defpackage.eqp eqpVar, defpackage.pu puVar) {
        return defpackage.tcu.t(defpackage.tcu.C(eqpVar, new defpackage.lra(puVar, 5)));
    }

    public final void a(java.io.PrintWriter printWriter) {
        for (lsk lskVar : this.a) {
            printWriter.println((java.lang.String.valueOf(lskVar.a.toOffsetDateTime()) + " [" + lskVar.b.flattenToShortString() + "] ").concat(lskVar.a()));
        }
        printWriter.println();
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void d() {
        super.d();
        this.b.k(this.c);
        this.d.k(this.e);
        this.f.k(this.g);
        this.h.k(this.i);
        this.k.k(this.l);
        defpackage.mnt.b(defpackage.mkp.a.c, "default_media_session_history", 1, new defpackage.lsm(this, 0));
        defpackage.mni.a().d(defpackage.mnh.j);
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() {
        super.eQ();
        this.b.eM(this, this.c);
        this.d.eM(this, this.e);
        this.f.eM(this, this.g);
        this.h.eM(this, this.i);
        this.k.eM(this, this.l);
        defpackage.mni.a().b(defpackage.mnh.j, this);
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        a(printWriter);
        defpackage.mnt.a(defpackage.mkp.a.c, "default_media_session_history", printWriter);
    }
}
