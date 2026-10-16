package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class khr extends defpackage.eqr {
    public khr(defpackage.eqp eqpVar) {
        r(eqpVar, new defpackage.hlm(this, 17));
    }

    public final void a() {
        defpackage.ojm.a();
        m(java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli()));
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void c() {
        super.c();
        a();
    }
}
