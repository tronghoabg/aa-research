package defpackage;

/* loaded from: classes.dex */
public final class ceu extends cex {
    public cbf a;
    public int b;
    public int c;

    public ceu(long j, cbf cbfVar) {
        super(j);
        this.a = cbfVar;
    }

    @Override // defpackage.cex
    public final cex a(long j) {
        return new ceu(j, this.a);
    }

    @Override // defpackage.cex
    public final void b(cex cexVar) {
        synchronized (ceo.a) {
            cexVar.getClass();
            ceu ceuVar = (ceu) cexVar;
            this.a = ceuVar.a;
            this.b = ceuVar.b;
            this.c = ceuVar.c;
        }
    }
}
