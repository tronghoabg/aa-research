package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class tcn extends defpackage.tck {
    public final boolean h;
    public final j$.time.Duration i;
    public final defpackage.affg j;
    public aiuw k;
    public aiwg l;
    public aiwg m;

    public tcn(defpackage.eqp eqpVar, j$.time.Duration duration, boolean z, j$.time.Duration duration2, defpackage.affg affgVar) {
        this.h = z;
        this.i = duration2;
        this.j = affgVar;
        if (duration2 != null && duration2.compareTo(duration) < 0) {
            throw new java.lang.IllegalArgumentException("Settle time must not be greater than max-delay time");
        }
        super.r(eqpVar, new defpackage.kku(new defpackage.err(this, duration, 15, (byte[]) null), 11));
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected void c() {
        aiut aiutVar = aivl.a;
        this.k = ahoi.b(ajdt.a.i());
        b(this.h);
        super.c();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.eqr, defpackage.eqp
    protected final void d() throws afbj {
        super.d();
        aiuw aiuwVar = this.k;
        if (aiuwVar == null) {
            defpackage.afga.d("coroutineScope");
            aiuwVar = null;
        }
        ahoi.e(aiuwVar, (java.util.concurrent.CancellationException) null);
        a();
    }

    public final void u() {
        if (this.i == null) {
            return;
        }
        aiwg aiwgVar = this.m;
        if (aiwgVar != null) {
            aiwgVar.s((java.util.concurrent.CancellationException) null);
        }
        aiuw aiuwVar = this.k;
        if (aiuwVar == null) {
            defpackage.afga.d("coroutineScope");
            aiuwVar = null;
        }
        this.m = ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.nbo(this, (defpackage.afdk) null, 10), 3);
    }
}
