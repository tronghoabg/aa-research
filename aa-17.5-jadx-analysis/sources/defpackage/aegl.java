package defpackage;

/* loaded from: classes3.dex */
final class aegl extends aekq {
    final aeka a;

    public aegl(aeka aekaVar) {
        super(0);
        this.a = aekaVar;
    }

    @Override // defpackage.aekn
    protected final int a(int i) {
        return this.a.m(i);
    }

    @Override // defpackage.aekq
    protected final int b() {
        return this.a.size();
    }

    @Override // defpackage.aekn
    protected final /* bridge */ /* synthetic */ aekm c(int i, int i2) {
        return new aegl(this.a, i, i2);
    }

    public aegl(aeka aekaVar, int i, int i2) {
        super(i, i2);
        this.a = aekaVar;
    }
}
