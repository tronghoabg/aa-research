package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ddq extends defpackage.cge implements defpackage.czc {
    public boolean a;
    public defpackage.affc b;

    public ddq(boolean z, defpackage.affc affcVar) {
        this.a = z;
        this.b = affcVar;
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        this.b.invoke(dekVar);
    }

    @Override // defpackage.czc
    public final boolean y() {
        return this.a;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.czc
    public final void D() {
    }
}
