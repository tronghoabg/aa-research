package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qij implements java.lang.AutoCloseable {
    private final defpackage.qsh a;

    public qij(defpackage.qsh qshVar) {
        this.a = qshVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws defpackage.qst {
        defpackage.qik.e();
        defpackage.oml.C(this.a, "allow_unknown_sources", true);
    }
}
