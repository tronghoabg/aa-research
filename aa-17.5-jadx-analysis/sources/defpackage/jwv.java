package defpackage;

/* loaded from: classes2.dex */
final class jwv extends gni {
    private final tfj b;

    public jwv(tfj tfjVar) {
        super(tfjVar.name());
        this.b = tfjVar;
    }

    @Override // defpackage.gni
    protected final void e(boolean z, long j) {
        tfk.a.d(this.b, true != z ? 2 : 1);
    }

    @Override // defpackage.gni
    protected final void g() {
        tfk.a.b(this.b);
    }
}
