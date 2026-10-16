package defpackage;

/* loaded from: classes.dex */
final class byc extends cex {
    public int a;

    public byc(long j, int i) {
        super(j);
        this.a = i;
    }

    @Override // defpackage.cex
    public final cex a(long j) {
        return new byc(j, this.a);
    }

    @Override // defpackage.cex
    public final void b(cex cexVar) {
        cexVar.getClass();
        this.a = ((byc) cexVar).a;
    }
}
