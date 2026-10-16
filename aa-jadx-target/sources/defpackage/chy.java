package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class chy extends defpackage.cge implements defpackage.cic {
    public defpackage.affc a;
    private defpackage.cja b;

    public chy(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cic
    public final void dC(defpackage.cja cjaVar) {
        if (defpackage.afga.f(this.b, cjaVar)) {
            return;
        }
        this.b = cjaVar;
        this.a.invoke(cjaVar);
    }
}
