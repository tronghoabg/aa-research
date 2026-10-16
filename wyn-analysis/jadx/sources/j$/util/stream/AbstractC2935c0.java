package j$.util.stream;

import j$.util.C3057x;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2935c0 extends AbstractC2929b implements IntStream {
    @Override // j$.util.stream.IntStream
    public final j$.util.B findAny() {
        return (j$.util.B) A(H.f37998d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B findFirst() {
        return (j$.util.B) A(H.f37997c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new L2(this, EnumC2958g3.f38207q | EnumC2958g3.f38205o);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        A(new N(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        A(new N(intConsumer, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Spliterator.OfInt W(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.OfInt) {
            return (Spliterator.OfInt) spliterator;
        }
        if (Q3.f38068a) {
            Q3.a(AbstractC2929b.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.AbstractC2929b
    final EnumC2963h3 F() {
        return EnumC2963h3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC2929b
    final K0 C(AbstractC2929b abstractC2929b, Spliterator spliterator, boolean z2, IntFunction intFunction) {
        return AbstractC3044y0.D(abstractC2929b, spliterator, z2);
    }

    @Override // j$.util.stream.AbstractC2929b
    final Spliterator R(AbstractC2929b abstractC2929b, Supplier supplier, boolean z2) {
        return new C3022t3(abstractC2929b, supplier, z2);
    }

    @Override // j$.util.stream.AbstractC2929b
    final boolean E(Spliterator spliterator, InterfaceC3011r2 interfaceC3011r2) {
        IntConsumer u10;
        boolean zN;
        Spliterator.OfInt ofIntW = W(spliterator);
        if (interfaceC3011r2 instanceof IntConsumer) {
            u10 = (IntConsumer) interfaceC3011r2;
        } else {
            if (Q3.f38068a) {
                Q3.a(AbstractC2929b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC3011r2);
            u10 = new U(interfaceC3011r2);
        }
        do {
            zN = interfaceC3011r2.n();
            if (zN) {
                break;
            }
        } while (ofIntW.tryAdvance(u10));
        return zN;
    }

    @Override // j$.util.stream.AbstractC2929b
    final C0 K(long j8, IntFunction intFunction) {
        return AbstractC3044y0.N(j8);
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final j$.util.K iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h
    public final Spliterator.OfInt spliterator() {
        return W(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC2990n0 asLongStream() {
        return new C3033w(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final E asDoubleStream() {
        return new C3023u(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C3018t(this, 0, new r(8), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream map(IntUnaryOperator intUnaryOperator) {
        Objects.requireNonNull(intUnaryOperator);
        return new W(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, intUnaryOperator, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new C3018t(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC2990n0 m() {
        Objects.requireNonNull(null);
        return new C3033w(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final E f() {
        Objects.requireNonNull(null);
        return new C3023u(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i5, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) A(new Q1(EnumC2963h3.INT_VALUE, intBinaryOperator, i5))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream p(Q0 q02) {
        Objects.requireNonNull(q02);
        return new W(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n | EnumC2958g3.f38210t, q02, 2);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.B) A(new D1(EnumC2963h3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream filter(IntPredicate intPredicate) {
        Objects.requireNonNull(intPredicate);
        return new W(this, EnumC2958g3.f38210t, intPredicate, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new W(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(Long.toString(j8));
        }
        return C2.f(this, 0L, j8);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : C2.f(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream takeWhile(IntPredicate intPredicate) {
        int i5 = r4.f38301a;
        Objects.requireNonNull(intPredicate);
        return new V3(this, r4.f38301a, intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream dropWhile(IntPredicate intPredicate) {
        int i5 = r4.f38301a;
        Objects.requireNonNull(intPredicate);
        return new X3(this, r4.f38302b, intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) A(new H1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC2972j2) boxed()).distinct().mapToInt(new r(7));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new r(12));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B min() {
        return reduce(new r(9));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B max() {
        return reduce(new r(13));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A average() {
        long j8 = ((long[]) collect(new r(14), new r(15), new r(16)))[0];
        return j8 > 0 ? j$.util.A.d(r0[1] / j8) : j$.util.A.a();
    }

    @Override // j$.util.stream.IntStream
    public final C3057x summaryStatistics() {
        return (C3057x) collect(new C2999p(17), new r(10), new r(11));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3004q c3004q = new C3004q(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c3004q);
        return A(new F1(EnumC2963h3.INT_VALUE, c3004q, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean anyMatch(IntPredicate intPredicate) {
        return ((Boolean) A(AbstractC3044y0.Q(EnumC3029v0.ANY, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean allMatch(IntPredicate intPredicate) {
        return ((Boolean) A(AbstractC3044y0.Q(EnumC3029v0.ALL, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean noneMatch(IntPredicate intPredicate) {
        return ((Boolean) A(AbstractC3044y0.Q(EnumC3029v0.NONE, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC3044y0.K((G0) B(new r(6))).d();
    }
}
