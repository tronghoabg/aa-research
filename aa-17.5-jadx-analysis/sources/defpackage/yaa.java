package defpackage;

/* loaded from: classes3.dex */
final class yaa extends xzy {
    volatile long a;
    yao b;
    yao c;

    public yaa(Object obj, int i, yao yaoVar) {
        super(obj, i, yaoVar);
        this.a = Long.MAX_VALUE;
        int i2 = yan.x;
        xzs xzsVar = xzs.a;
        this.b = xzsVar;
        this.c = xzsVar;
    }

    @Override // defpackage.xyw, defpackage.yao
    public final long c() {
        return this.a;
    }

    @Override // defpackage.xyw, defpackage.yao
    public final yao g() {
        return this.b;
    }

    @Override // defpackage.xyw, defpackage.yao
    public final yao i() {
        return this.c;
    }

    @Override // defpackage.xyw, defpackage.yao
    public final void m(yao yaoVar) {
        this.b = yaoVar;
    }

    @Override // defpackage.xyw, defpackage.yao
    public final void o(yao yaoVar) {
        this.c = yaoVar;
    }

    @Override // defpackage.xyw, defpackage.yao
    public final void q(long j) {
        this.a = j;
    }
}
