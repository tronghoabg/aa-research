package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class jxa extends defpackage.gnp {
    private final defpackage.tgf b;

    public jxa(defpackage.tgf tgfVar) {
        super(tgfVar.name());
        this.b = tgfVar;
    }

    @Override // defpackage.gnp
    protected final void e(boolean z, long j) {
        defpackage.tgg.a.d(this.b, true != z ? 2 : 1);
    }

    @Override // defpackage.gnp
    protected final void g() {
        defpackage.tgg.a.b(this.b);
    }
}
