package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cfb extends defpackage.cfe {
    public defpackage.cbl a;
    public int b;
    public int c;

    public cfb(long j, defpackage.cbl cblVar) {
        super(j);
        this.a = cblVar;
    }

    @Override // defpackage.cfe
    public final defpackage.cfe a(long j) {
        return new defpackage.cfb(j, this.a);
    }

    @Override // defpackage.cfe
    public final void b(defpackage.cfe cfeVar) {
        synchronized (defpackage.cev.a) {
            cfeVar.getClass();
            defpackage.cfb cfbVar = (defpackage.cfb) cfeVar;
            this.a = cfbVar.a;
            this.b = cfbVar.b;
            this.c = cfbVar.c;
        }
    }
}
