package defpackage;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes3.dex */
final class yai extends yag {
    volatile long a;
    yao b;
    yao c;

    public yai(ReferenceQueue referenceQueue, Object obj, int i, yao yaoVar) {
        super(referenceQueue, obj, i, yaoVar);
        this.a = Long.MAX_VALUE;
        int i2 = yan.x;
        xzs xzsVar = xzs.a;
        this.b = xzsVar;
        this.c = xzsVar;
    }

    @Override // defpackage.yag, defpackage.yao
    public final long c() {
        return this.a;
    }

    @Override // defpackage.yag, defpackage.yao
    public final yao g() {
        return this.b;
    }

    @Override // defpackage.yag, defpackage.yao
    public final yao i() {
        return this.c;
    }

    @Override // defpackage.yag, defpackage.yao
    public final void m(yao yaoVar) {
        this.b = yaoVar;
    }

    @Override // defpackage.yag, defpackage.yao
    public final void o(yao yaoVar) {
        this.c = yaoVar;
    }

    @Override // defpackage.yag, defpackage.yao
    public final void q(long j) {
        this.a = j;
    }
}
