package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class aiwf extends defpackage.aiwj {
    private final defpackage.affc a;

    public aiwf(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.aiwj
    public final void b(java.lang.Throwable th) {
        this.a.invoke(th);
    }

    @Override // defpackage.aiwj
    public final boolean c() {
        return false;
    }
}
