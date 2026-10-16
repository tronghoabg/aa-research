package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class eqr extends defpackage.eqs {
    private defpackage.pt a;

    /* JADX WARN: Multi-variable type inference failed */
    public eqr(defpackage.ksi ksiVar, defpackage.eqp eqpVar) {
        this();
        java.lang.Integer num = (java.lang.Integer) ksiVar.d.e();
        java.lang.Object objE = eqpVar.e();
        objE.getClass();
        m(t(num, ((java.lang.Number) objE).intValue()));
        r(ksiVar.d, new defpackage.kku(new defpackage.err(this, eqpVar, 5, (char[]) null), 2));
        r(eqpVar, new defpackage.kku(new defpackage.err((java.lang.Object) this, (java.lang.Object) ksiVar, 6, (byte[]) (0 == true ? 1 : 0)), 2));
    }

    public static final defpackage.ksh t(java.lang.Integer num, int i) {
        defpackage.ksr ksrVar = i == 3 ? defpackage.ksq.a : defpackage.ksp.a;
        if (num != null) {
            return new defpackage.ksh(new defpackage.ksf(ksrVar.a(num.intValue()), defpackage.ksp.a), ksrVar);
        }
        defpackage.ksg ksgVar = i == 3 ? defpackage.ksg.DEFAULT : null;
        return ksgVar != null ? new defpackage.ksh(ksgVar, ksrVar) : new defpackage.ksh(defpackage.ksg.DEFAULT, defpackage.ksp.a);
    }

    @Override // defpackage.eqp
    protected void c() {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.eqq) ((java.util.Map.Entry) it.next()).getValue()).b();
        }
    }

    @Override // defpackage.eqp
    protected void d() {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.eqq) ((java.util.Map.Entry) it.next()).getValue()).c();
        }
    }

    @Override // defpackage.eqp
    public void p() {
        m(j$.util.Optional.empty());
    }

    @Override // defpackage.eqp
    public final void q(java.lang.Object obj) {
        j(j$.util.Optional.ofNullable(obj));
    }

    public final void r(defpackage.eqp eqpVar, defpackage.eqt eqtVar) {
        if (eqpVar == null) {
            throw new java.lang.NullPointerException("source cannot be null");
        }
        defpackage.eqq eqqVar = new defpackage.eqq(eqpVar, eqtVar);
        defpackage.eqq eqqVar2 = (defpackage.eqq) this.a.b(eqpVar, eqqVar);
        if (eqqVar2 != null && eqqVar2.b != eqtVar) {
            throw new java.lang.IllegalArgumentException("This source was already added with the different observer");
        }
        if (eqqVar2 == null && n()) {
            eqqVar.b();
        }
    }

    public final void s(defpackage.eqp eqpVar) {
        defpackage.eqq eqqVar = (defpackage.eqq) this.a.c(eqpVar);
        if (eqqVar != null) {
            eqqVar.c();
        }
    }

    public eqr(java.lang.Object obj) {
        super(obj);
        this.a = new defpackage.pt();
    }

    public eqr() {
        this.a = new defpackage.pt();
    }

    public eqr(lkm lkmVar, java.lang.String str, mot motVar) {
        this();
        r(lkmVar.a, new defpackage.ewl(new gbf(str, this, lkmVar, motVar, 12), 15));
    }

    public eqr(lkv lkvVar) {
        this();
        r(lkvVar.k, new defpackage.ewl(new lku(this, lkvVar), 16));
    }
}
