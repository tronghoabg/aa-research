package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aesg extends defpackage.aevw {
    final defpackage.aeym a;

    public aesg(defpackage.aeym aeymVar) {
        super(0);
        this.a = aeymVar;
    }

    @Override // defpackage.aevw
    protected final int a() {
        return this.a.size();
    }

    @Override // defpackage.aevt
    protected final /* bridge */ /* synthetic */ defpackage.aevs c(int i, int i2) {
        return new defpackage.aesg(this.a, i, i2);
    }

    @Override // defpackage.aevt
    protected final java.lang.Object d(int i) {
        return this.a.get(i);
    }

    public aesg(defpackage.aeym aeymVar, int i, int i2) {
        super(i, i2);
        this.a = aeymVar;
    }
}
