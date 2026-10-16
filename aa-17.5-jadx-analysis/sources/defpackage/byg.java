package defpackage;

/* loaded from: classes.dex */
final class byg extends cex {
    public Object a;

    public byg(long j, Object obj) {
        super(j);
        this.a = obj;
    }

    @Override // defpackage.cex
    public final /* bridge */ /* synthetic */ cex a(long j) {
        return new byg(j, this.a);
    }

    @Override // defpackage.cex
    public final void b(cex cexVar) {
        cexVar.getClass();
        this.a = ((byg) cexVar).a;
    }
}
