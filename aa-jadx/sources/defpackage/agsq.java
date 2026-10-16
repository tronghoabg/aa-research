package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class agsq implements defpackage.affc {
    private final defpackage.agsu arg$0;
    private final defpackage.affc arg$1;

    public agsq(defpackage.agsu agsuVar, defpackage.affc affcVar) {
        this.arg$0 = agsuVar;
        this.arg$1 = affcVar;
    }

    @Override // defpackage.affc
    public java.lang.Object invoke(java.lang.Object obj) {
        return defpackage.agsu.extractNullability$lambda$2(this.arg$0, this.arg$1, obj);
    }
}
