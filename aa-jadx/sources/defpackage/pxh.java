package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pxh {
    public long j;
    public defpackage.vlu k;
    public defpackage.vas a = defpackage.vas.a;
    public defpackage.vat b = defpackage.vat.a;
    public defpackage.vau c = defpackage.vau.a;
    public defpackage.var d = defpackage.var.a;
    public android.accounts.Account e = null;
    public final defpackage.pyb f = defpackage.pyb.a;
    public defpackage.acdd g = null;
    public defpackage.abqe h = null;
    public defpackage.pyd l = null;
    public defpackage.vaq i = defpackage.vaq.GMM_API;

    public pxh() {
        defpackage.vlu vluVar = defpackage.pxi.a;
        this.k = defpackage.pxi.a;
    }

    public final void a(defpackage.vat vatVar) {
        int i = vatVar.c;
        defpackage.ysr.ba(i >= 0, "negative retryDelayMs: %s", i);
        int i2 = vatVar.d;
        defpackage.ysr.ba(i2 > 0, "maxAttempts < 1: %s", i2);
        long j = vatVar.e;
        defpackage.ysr.bb(j >= 0, "negative singleAttemptTimeoutMs: %s", j);
        this.b = vatVar;
    }

    public final void b(defpackage.vau vauVar) {
        int i = vauVar.c;
        defpackage.ysr.ba(i >= 0, "negative maxDelayMs: %s", i);
        this.c = vauVar;
    }
}
