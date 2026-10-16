package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class S0 extends V0 implements E0 {
    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC3044y0.q(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j10, IntFunction intFunction) {
        return AbstractC3044y0.t(this, j8, j10);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void i(Object[] objArr, int i5) {
        AbstractC3044y0.n(this, (Double[]) objArr, i5);
    }

    @Override // j$.util.stream.J0
    public final Object c(int i5) {
        return new double[i5];
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return new C2971j1(this);
    }

    @Override // j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return new C2971j1(this);
    }
}
