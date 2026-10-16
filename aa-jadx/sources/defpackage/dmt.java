package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dmt extends defpackage.cge {
    public defpackage.affc a;
    public final defpackage.affc b = new defpackage.deh(this, 5);

    public dmt(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    @Override // defpackage.cge
    public final void dz() {
        this.a.invoke(this.b);
    }

    @Override // defpackage.cge
    public final void q() {
        this.a.invoke(null);
    }
}
