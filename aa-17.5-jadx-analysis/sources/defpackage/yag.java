package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
class yag extends WeakReference implements yao {
    final int g;
    final yao h;
    volatile yac i;

    public yag(ReferenceQueue referenceQueue, Object obj, int i, yao yaoVar) {
        super(obj, referenceQueue);
        this.i = yan.b;
        this.g = i;
        this.h = yaoVar;
    }

    @Override // defpackage.yao
    public final int a() {
        return this.g;
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yao
    public final yac d() {
        return this.i;
    }

    @Override // defpackage.yao
    public final yao e() {
        return this.h;
    }

    public yao f() {
        throw new UnsupportedOperationException();
    }

    public yao g() {
        throw new UnsupportedOperationException();
    }

    public yao h() {
        throw new UnsupportedOperationException();
    }

    public yao i() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yao
    public final Object j() {
        return get();
    }

    public void k(long j) {
        throw new UnsupportedOperationException();
    }

    public void l(yao yaoVar) {
        throw new UnsupportedOperationException();
    }

    public void m(yao yaoVar) {
        throw new UnsupportedOperationException();
    }

    public void n(yao yaoVar) {
        throw new UnsupportedOperationException();
    }

    public void o(yao yaoVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yao
    public final void p(yac yacVar) {
        this.i = yacVar;
    }

    public void q(long j) {
        throw new UnsupportedOperationException();
    }
}
