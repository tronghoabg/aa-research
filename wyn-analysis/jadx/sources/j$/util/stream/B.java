package j$.util.stream;

import j$.util.C3056w;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class B extends AbstractC2929b implements E {
    @Override // j$.util.stream.E
    public final j$.util.A findAny() {
        return (j$.util.A) A(G.f37990d);
    }

    @Override // j$.util.stream.E
    public final j$.util.A findFirst() {
        return (j$.util.A) A(G.f37989c);
    }

    @Override // j$.util.stream.E
    public final E sorted() {
        return new K2(this, EnumC2958g3.f38207q | EnumC2958g3.f38205o, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.V W(Spliterator spliterator) {
        if (spliterator instanceof j$.util.V) {
            return (j$.util.V) spliterator;
        }
        if (Q3.f38068a) {
            Q3.a(AbstractC2929b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // j$.util.stream.E
    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        A(new M(doubleConsumer, false));
    }

    @Override // j$.util.stream.E
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        A(new M(doubleConsumer, true));
    }

    @Override // j$.util.stream.AbstractC2929b
    final EnumC2963h3 F() {
        return EnumC2963h3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC2929b
    final K0 C(AbstractC2929b abstractC2929b, Spliterator spliterator, boolean z2, IntFunction intFunction) {
        return AbstractC3044y0.C(abstractC2929b, spliterator, z2);
    }

    @Override // j$.util.stream.AbstractC2929b
    final Spliterator R(AbstractC2929b abstractC2929b, Supplier supplier, boolean z2) {
        return new C3012r3(abstractC2929b, supplier, z2);
    }

    @Override // j$.util.stream.AbstractC2929b
    final boolean E(Spliterator spliterator, InterfaceC3011r2 interfaceC3011r2) {
        DoubleConsumer c2994o;
        boolean zN;
        j$.util.V vW = W(spliterator);
        if (interfaceC3011r2 instanceof DoubleConsumer) {
            c2994o = (DoubleConsumer) interfaceC3011r2;
        } else {
            if (Q3.f38068a) {
                Q3.a(AbstractC2929b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC3011r2);
            c2994o = new C2994o(interfaceC3011r2);
        }
        do {
            zN = interfaceC3011r2.n();
            if (zN) {
                break;
            }
        } while (vW.tryAdvance(c2994o));
        return zN;
    }

    @Override // j$.util.stream.AbstractC2929b
    final C0 K(long j8, IntFunction intFunction) {
        return AbstractC3044y0.G(j8);
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final j$.util.G iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h
    public final j$.util.V spliterator() {
        return W(super.spliterator());
    }

    @Override // j$.util.stream.E
    public final Stream boxed() {
        return new C3018t(this, 0, new C2999p(26), 0);
    }

    @Override // j$.util.stream.E
    public final E e() {
        Objects.requireNonNull(null);
        return new C3023u(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, 0);
    }

    @Override // j$.util.stream.E
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new C3018t(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, doubleFunction, 0);
    }

    @Override // j$.util.stream.E
    public final IntStream s() {
        Objects.requireNonNull(null);
        return new C3028v(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, 0);
    }

    @Override // j$.util.stream.E
    public final InterfaceC2990n0 j() {
        Objects.requireNonNull(null);
        return new C3033w(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, 0);
    }

    @Override // j$.util.stream.E
    public final E a(C2924a c2924a) {
        Objects.requireNonNull(c2924a);
        return new C3043y(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n | EnumC2958g3.f38210t, c2924a, 0);
    }

    @Override // j$.util.stream.E
    public final E c() {
        Objects.requireNonNull(null);
        return new C3023u(this, EnumC2958g3.f38210t, 2);
    }

    @Override // j$.util.stream.E
    public final E peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C3043y(this, doubleConsumer);
    }

    @Override // j$.util.stream.E
    public final E limit(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(Long.toString(j8));
        }
        return C2.e(this, 0L, j8);
    }

    @Override // j$.util.stream.E
    public final E skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : C2.e(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.E
    public final E b() {
        int i5 = r4.f38301a;
        Objects.requireNonNull(null);
        return new d4(this, r4.f38301a, 0);
    }

    @Override // j$.util.stream.E
    public final E d() {
        int i5 = r4.f38301a;
        Objects.requireNonNull(null);
        return new f4(this, r4.f38302b, 0);
    }

    @Override // j$.util.stream.E
    public final E distinct() {
        return ((AbstractC2972j2) boxed()).distinct().mapToDouble(new C2999p(27));
    }

    @Override // j$.util.stream.E
    public final double sum() {
        double[] dArr = (double[]) collect(new r(0), new C2999p(3), new C2999p(0));
        int i5 = AbstractC2974k.f38244a;
        double d3 = dArr[0] + dArr[1];
        double d5 = dArr[dArr.length - 1];
        return (Double.isNaN(d3) && Double.isInfinite(d5)) ? d5 : d3;
    }

    @Override // j$.util.stream.E
    public final j$.util.A min() {
        return reduce(new C2999p(22));
    }

    @Override // j$.util.stream.E
    public final j$.util.A max() {
        return reduce(new C2999p(29));
    }

    @Override // j$.util.stream.E
    public final j$.util.A average() {
        double[] dArr = (double[]) collect(new C2999p(23), new C2999p(1), new C2999p(2));
        if (dArr[2] <= 0.0d) {
            return j$.util.A.a();
        }
        int i5 = AbstractC2974k.f38244a;
        double d3 = dArr[0] + dArr[1];
        double d5 = dArr[dArr.length - 1];
        if (Double.isNaN(d3) && Double.isInfinite(d5)) {
            d3 = d5;
        }
        return j$.util.A.d(d3 / dArr[2]);
    }

    @Override // j$.util.stream.E
    public final C3056w summaryStatistics() {
        return (C3056w) collect(new C2999p(16), new C2999p(24), new C2999p(25));
    }

    @Override // j$.util.stream.E
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3004q c3004q = new C3004q(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c3004q);
        return A(new F1(EnumC2963h3.DOUBLE_VALUE, c3004q, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.E
    public final boolean o() {
        return ((Boolean) A(AbstractC3044y0.P(EnumC3029v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.E
    public final boolean i() {
        return ((Boolean) A(AbstractC3044y0.P(EnumC3029v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.E
    public final boolean v() {
        return ((Boolean) A(AbstractC3044y0.P(EnumC3029v0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.E
    public final double[] toArray() {
        return (double[]) AbstractC3044y0.J((E0) B(new C2999p(28))).d();
    }

    @Override // j$.util.stream.E
    public final double reduce(double d3, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) A(new J1(EnumC2963h3.DOUBLE_VALUE, doubleBinaryOperator, d3))).doubleValue();
    }

    @Override // j$.util.stream.E
    public final j$.util.A reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.A) A(new D1(EnumC2963h3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.E
    public final long count() {
        return ((Long) A(new H1(1))).longValue();
    }
}
