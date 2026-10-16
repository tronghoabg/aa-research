package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3040x1 extends C2938c3 implements K0, C0 {
    @Override // j$.util.stream.C0
    public final K0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void accept(double d3) {
        AbstractC3044y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ void accept(int i5) {
        AbstractC3044y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3011r2, j$.util.stream.InterfaceC3007q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3044y0.l();
        throw null;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j10, IntFunction intFunction) {
        return AbstractC3044y0.w(this, j8, j10, intFunction);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i5) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final void i(Object[] objArr, int i5) {
        long j8 = i5;
        long jCount = count() + j8;
        if (jCount > objArr.length || jCount < j8) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f38166c == 0) {
            System.arraycopy(this.f38161e, 0, objArr, i5, this.f38165b);
            return;
        }
        for (int i10 = 0; i10 < this.f38166c; i10++) {
            Object[] objArr2 = this.f38162f[i10];
            System.arraycopy(objArr2, 0, objArr, i5, objArr2.length);
            i5 += this.f38162f[i10].length;
        }
        int i11 = this.f38165b;
        if (i11 > 0) {
            System.arraycopy(this.f38161e, 0, objArr, i5, i11);
        }
    }

    @Override // j$.util.stream.K0
    public final Object[] o(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        clear();
        s(j8);
    }
}
