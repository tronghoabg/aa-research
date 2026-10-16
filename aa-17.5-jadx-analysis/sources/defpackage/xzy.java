package defpackage;

/* loaded from: classes3.dex */
class xzy extends xyw {
    final Object g;
    final int h;
    final yao i;
    volatile yac j = yan.b;

    public xzy(Object obj, int i, yao yaoVar) {
        this.g = obj;
        this.h = i;
        this.i = yaoVar;
    }

    @Override // defpackage.xyw, defpackage.yao
    public final int a() {
        return this.h;
    }

    @Override // defpackage.xyw, defpackage.yao
    public final yac d() {
        return this.j;
    }

    @Override // defpackage.xyw, defpackage.yao
    public final yao e() {
        return this.i;
    }

    @Override // defpackage.xyw, defpackage.yao
    public final Object j() {
        return this.g;
    }

    @Override // defpackage.xyw, defpackage.yao
    public final void p(yac yacVar) {
        this.j = yacVar;
    }
}
