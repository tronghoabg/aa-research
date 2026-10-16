package defpackage;

/* loaded from: classes3.dex */
final class aeqs extends aeuw {
    final aeuh a;

    public aeqs(aeuh aeuhVar) {
        super(0);
        this.a = aeuhVar;
    }

    @Override // defpackage.aeuw
    protected final int a() {
        return this.a.size();
    }

    @Override // defpackage.aeut
    protected final /* bridge */ /* synthetic */ aeus c(int i, int i2) {
        return new aeqs(this.a, i, i2);
    }

    @Override // defpackage.aeut
    protected final Object d(int i) {
        return this.a.get(i);
    }

    public aeqs(aeuh aeuhVar, int i, int i2) {
        super(i, i2);
        this.a = aeuhVar;
    }
}
