package defpackage;

/* loaded from: classes.dex */
final class bya extends cex {
    public float a;

    public bya(long j, float f) {
        super(j);
        this.a = f;
    }

    @Override // defpackage.cex
    public final cex a(long j) {
        return new bya(j, this.a);
    }

    @Override // defpackage.cex
    public final void b(cex cexVar) {
        cexVar.getClass();
        this.a = ((bya) cexVar).a;
    }
}
