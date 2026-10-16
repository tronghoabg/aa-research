package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aers extends defpackage.aevw {
    final defpackage.aevh a;

    public aers(defpackage.aevh aevhVar) {
        super(0);
        this.a = aevhVar;
    }

    @Override // defpackage.aevw
    protected final int a() {
        return this.a.size();
    }

    @Override // defpackage.aevt
    protected final /* bridge */ /* synthetic */ defpackage.aevs c(int i, int i2) {
        return new defpackage.aers(this.a, i, i2);
    }

    @Override // defpackage.aevt
    protected final java.lang.Object d(int i) {
        return this.a.get(i);
    }

    public aers(defpackage.aevh aevhVar, int i, int i2) {
        super(i, i2);
        this.a = aevhVar;
    }
}
