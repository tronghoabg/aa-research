package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class byg extends defpackage.cfe {
    public float a;

    public byg(long j, float f) {
        super(j);
        this.a = f;
    }

    @Override // defpackage.cfe
    public final defpackage.cfe a(long j) {
        return new defpackage.byg(j, this.a);
    }

    @Override // defpackage.cfe
    public final void b(defpackage.cfe cfeVar) {
        cfeVar.getClass();
        this.a = ((defpackage.byg) cfeVar).a;
    }
}
