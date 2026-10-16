package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class byi extends defpackage.cfe {
    public int a;

    public byi(long j, int i) {
        super(j);
        this.a = i;
    }

    @Override // defpackage.cfe
    public final defpackage.cfe a(long j) {
        return new defpackage.byi(j, this.a);
    }

    @Override // defpackage.cfe
    public final void b(defpackage.cfe cfeVar) {
        cfeVar.getClass();
        this.a = ((defpackage.byi) cfeVar).a;
    }
}
