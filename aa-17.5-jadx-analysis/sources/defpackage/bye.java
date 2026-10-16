package defpackage;

/* loaded from: classes.dex */
final class bye extends cex {
    public long a;

    public bye(long j, long j2) {
        super(j);
        this.a = j2;
    }

    @Override // defpackage.cex
    public final cex a(long j) {
        return new bye(j, this.a);
    }

    @Override // defpackage.cex
    public final void b(cex cexVar) {
        cexVar.getClass();
        this.a = ((bye) cexVar).a;
    }
}
