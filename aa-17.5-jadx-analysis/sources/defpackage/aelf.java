package defpackage;

/* loaded from: classes3.dex */
final class aelf extends aeqh {
    final aeps a;

    public aelf(aeps aepsVar) {
        super(0);
        this.a = aepsVar;
    }

    @Override // defpackage.aeqh
    protected final int a() {
        return this.a.size();
    }

    @Override // defpackage.aeqe
    protected final long b(int i) {
        return this.a.m(i);
    }

    @Override // defpackage.aeqe
    protected final /* bridge */ /* synthetic */ aeqd c(int i, int i2) {
        return new aelf(this.a, i, i2);
    }

    public aelf(aeps aepsVar, int i, int i2) {
        super(i, i2);
        this.a = aepsVar;
    }
}
