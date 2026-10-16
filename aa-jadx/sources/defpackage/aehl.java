package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aehl extends defpackage.aelq {
    final defpackage.aela a;

    public aehl(defpackage.aela aelaVar) {
        super(0);
        this.a = aelaVar;
    }

    @Override // defpackage.aeln
    protected final int a(int i) {
        return this.a.m(i);
    }

    @Override // defpackage.aelq
    protected final int b() {
        return this.a.size();
    }

    @Override // defpackage.aeln
    protected final /* bridge */ /* synthetic */ defpackage.aelm c(int i, int i2) {
        return new defpackage.aehl(this.a, i, i2);
    }

    public aehl(defpackage.aela aelaVar, int i, int i2) {
        super(i, i2);
        this.a = aelaVar;
    }
}
