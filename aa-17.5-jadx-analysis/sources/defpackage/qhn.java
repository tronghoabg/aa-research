package defpackage;

/* loaded from: classes2.dex */
public final class qhn implements AutoCloseable {
    private final qrn a;

    public qhn(qrn qrnVar) {
        this.a = qrnVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws qrz {
        qho.e();
        ols.C(this.a, "allow_unknown_sources", true);
    }
}
