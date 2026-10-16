package defpackage;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes3.dex */
final class yae extends yag {
    volatile long a;
    yao b;
    yao c;

    public yae(ReferenceQueue referenceQueue, Object obj, int i, yao yaoVar) {
        super(referenceQueue, obj, i, yaoVar);
        this.a = Long.MAX_VALUE;
        int i2 = yan.x;
        xzs xzsVar = xzs.a;
        this.b = xzsVar;
        this.c = xzsVar;
    }

    @Override // defpackage.yag, defpackage.yao
    public final long b() {
        return this.a;
    }

    @Override // defpackage.yag, defpackage.yao
    public final yao f() {
        return this.b;
    }

    @Override // defpackage.yag, defpackage.yao
    public final yao h() {
        return this.c;
    }

    @Override // defpackage.yag, defpackage.yao
    public final void k(long j) {
        this.a = j;
    }

    @Override // defpackage.yag, defpackage.yao
    public final void l(yao yaoVar) {
        this.b = yaoVar;
    }

    @Override // defpackage.yag, defpackage.yao
    public final void n(yao yaoVar) {
        this.c = yaoVar;
    }
}
