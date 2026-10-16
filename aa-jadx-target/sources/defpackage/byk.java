package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class byk extends defpackage.cfe {
    public long a;

    public byk(long j, long j2) {
        super(j);
        this.a = j2;
    }

    @Override // defpackage.cfe
    public final defpackage.cfe a(long j) {
        return new defpackage.byk(j, this.a);
    }

    @Override // defpackage.cfe
    public final void b(defpackage.cfe cfeVar) {
        cfeVar.getClass();
        this.a = ((defpackage.byk) cfeVar).a;
    }
}
