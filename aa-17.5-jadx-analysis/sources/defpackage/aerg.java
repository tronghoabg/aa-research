package defpackage;

/* loaded from: classes3.dex */
final class aerg extends aeuw {
    final aexm a;

    public aerg(aexm aexmVar) {
        super(0);
        this.a = aexmVar;
    }

    @Override // defpackage.aeuw
    protected final int a() {
        return this.a.size();
    }

    @Override // defpackage.aeut
    protected final /* bridge */ /* synthetic */ aeus c(int i, int i2) {
        return new aerg(this.a, i, i2);
    }

    @Override // defpackage.aeut
    protected final Object d(int i) {
        return this.a.get(i);
    }

    public aerg(aexm aexmVar, int i, int i2) {
        super(i, i2);
        this.a = aexmVar;
    }
}
