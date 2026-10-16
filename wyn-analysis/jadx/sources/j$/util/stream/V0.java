package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
abstract class V0 extends M0 implements J0 {
    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC3044y0.m(this, intFunction);
    }

    @Override // j$.util.stream.J0
    public final void e(Object obj) {
        ((J0) this.f38034a).e(obj);
        ((J0) this.f38035b).e(obj);
    }

    @Override // j$.util.stream.J0
    public final void r(int i5, Object obj) {
        K0 k02 = this.f38034a;
        ((J0) k02).r(i5, obj);
        ((J0) this.f38035b).r(i5 + ((int) ((J0) k02).count()), obj);
    }

    @Override // j$.util.stream.J0
    public final Object d() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objC = c((int) jCount);
        r(0, objC);
        return objC;
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f38034a, this.f38035b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
