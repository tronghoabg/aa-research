package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ifz implements defpackage.iga {
    final /* synthetic */ defpackage.iga a;
    private volatile java.lang.Object b;

    public ifz(defpackage.iga igaVar) {
        this.a = igaVar;
    }

    @Override // defpackage.iga
    public final java.lang.Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    java.lang.Object objA = this.a.a();
                    defpackage.a.ak(objA, "Argument must not be null");
                    this.b = objA;
                }
            }
        }
        return this.b;
    }
}
