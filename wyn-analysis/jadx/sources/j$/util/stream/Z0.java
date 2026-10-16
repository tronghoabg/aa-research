package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class Z0 extends V2 implements E0, InterfaceC3049z0 {
    @Override // j$.util.stream.InterfaceC3049z0, j$.util.stream.C0
    public final E0 a() {
        return this;
    }

    @Override // j$.util.stream.C0
    public final K0 a() {
        return this;
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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 h(long j8, long j10, IntFunction intFunction) {
        return AbstractC3044y0.t(this, j8, j10);
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC3044y0.m(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC2997o2
    public final /* synthetic */ void p(Double d3) {
        AbstractC3044y0.e(this, d3);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 b(int i5) {
        b(i5);
        throw null;
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final J0 b(int i5) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void i(Object[] objArr, int i5) {
        AbstractC3044y0.n(this, (Double[]) objArr, i5);
    }

    @Override // j$.util.stream.AbstractC2933b3, j$.util.stream.J0
    public final void e(Object obj) {
        super.e((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.AbstractC2933b3, j$.util.stream.J0
    public final void r(int i5, Object obj) {
        super.r(i5, (double[]) obj);
    }

    @Override // j$.util.stream.V2, j$.util.stream.AbstractC2933b3, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.V2, j$.util.stream.AbstractC2933b3, java.lang.Iterable
    public final j$.util.d0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.InterfaceC3011r2
    public final void l(long j8) {
        clear();
        v(j8);
    }

    @Override // j$.util.stream.AbstractC2933b3, j$.util.stream.J0
    public final Object d() {
        return (double[]) super.d();
    }
}
