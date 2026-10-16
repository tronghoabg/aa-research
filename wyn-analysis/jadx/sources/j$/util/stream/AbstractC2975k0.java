package j$.util.stream;

import j$.util.C3059z;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2975k0 extends AbstractC2929b implements InterfaceC2990n0 {
    @Override // j$.util.stream.InterfaceC2990n0
    public final j$.util.C findAny() {
        return (j$.util.C) A(I.f38004d);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final j$.util.C findFirst() {
        return (j$.util.C) A(I.f38003c);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final InterfaceC2990n0 sorted() {
        return new M2(this, EnumC2958g3.f38207q | EnumC2958g3.f38205o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        A(new O(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        A(new O(longConsumer, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.a0 W(Spliterator spliterator) {
        if (spliterator instanceof j$.util.a0) {
            return (j$.util.a0) spliterator;
        }
        if (Q3.f38068a) {
            Q3.a(AbstractC2929b.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.AbstractC2929b
    final EnumC2963h3 F() {
        return EnumC2963h3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC2929b
    final K0 C(AbstractC2929b abstractC2929b, Spliterator spliterator, boolean z2, IntFunction intFunction) {
        return AbstractC3044y0.E(abstractC2929b, spliterator, z2);
    }

    @Override // j$.util.stream.AbstractC2929b
    final Spliterator R(AbstractC2929b abstractC2929b, Supplier supplier, boolean z2) {
        return new C3032v3(abstractC2929b, supplier, z2);
    }

    @Override // j$.util.stream.AbstractC2929b
    final boolean E(Spliterator spliterator, InterfaceC3011r2 interfaceC3011r2) {
        LongConsumer c2940d0;
        boolean zN;
        j$.util.a0 a0VarW = W(spliterator);
        if (interfaceC3011r2 instanceof LongConsumer) {
            c2940d0 = (LongConsumer) interfaceC3011r2;
        } else {
            if (Q3.f38068a) {
                Q3.a(AbstractC2929b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC3011r2);
            c2940d0 = new C2940d0(interfaceC3011r2);
        }
        do {
            zN = interfaceC3011r2.n();
            if (zN) {
                break;
            }
        } while (a0VarW.tryAdvance(c2940d0));
        return zN;
    }

    @Override // j$.util.stream.AbstractC2929b
    final C0 K(long j8, IntFunction intFunction) {
        return AbstractC3044y0.O(j8);
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final j$.util.O iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.AbstractC2929b, j$.util.stream.InterfaceC2959h
    public final j$.util.a0 spliterator() {
        return W(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final E asDoubleStream() {
        return new C3023u(this, EnumC2958g3.f38204n, 5);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final Stream boxed() {
        return new C3018t(this, 0, new r(22), 2);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final InterfaceC2990n0 e() {
        Objects.requireNonNull(null);
        return new C3033w(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, 3);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new C3018t(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final IntStream u() {
        Objects.requireNonNull(null);
        return new C3028v(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, 2);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final E l() {
        Objects.requireNonNull(null);
        return new C3023u(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, 6);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final InterfaceC2990n0 a(C2924a c2924a) {
        Objects.requireNonNull(c2924a);
        return new C2960h0(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n | EnumC2958g3.f38210t, c2924a, 0);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final InterfaceC2990n0 c() {
        Objects.requireNonNull(null);
        return new C3033w(this, EnumC2958g3.f38210t, 5);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final InterfaceC2990n0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C2960h0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final InterfaceC2990n0 limit(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(Long.toString(j8));
        }
        return C2.g(this, 0L, j8);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final InterfaceC2990n0 skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : C2.g(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final InterfaceC2990n0 b() {
        int i5 = r4.f38301a;
        Objects.requireNonNull(null);
        return new Z3(this, r4.f38301a, 0);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final InterfaceC2990n0 d() {
        int i5 = r4.f38301a;
        Objects.requireNonNull(null);
        return new b4(this, r4.f38302b, 0);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final InterfaceC2990n0 distinct() {
        return ((AbstractC2972j2) boxed()).distinct().mapToLong(new r(19));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final long sum() {
        return reduce(0L, new r(27));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final j$.util.C min() {
        return reduce(new r(18));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final j$.util.C max() {
        return reduce(new r(26));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final j$.util.A average() {
        long j8 = ((long[]) collect(new r(23), new r(24), new r(25)))[0];
        return j8 > 0 ? j$.util.A.d(r0[1] / j8) : j$.util.A.a();
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final long reduce(long j8, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) A(new B1(EnumC2963h3.LONG_VALUE, longBinaryOperator, j8))).longValue();
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final C3059z summaryStatistics() {
        return (C3059z) collect(new C2999p(18), new r(17), new r(20));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C3004q c3004q = new C3004q(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c3004q);
        return A(new F1(EnumC2963h3.LONG_VALUE, c3004q, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final boolean q() {
        return ((Boolean) A(AbstractC3044y0.R(EnumC3029v0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final j$.util.C reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.C) A(new D1(EnumC2963h3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final boolean t() {
        return ((Boolean) A(AbstractC3044y0.R(EnumC3029v0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final boolean g() {
        return ((Boolean) A(AbstractC3044y0.R(EnumC3029v0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final long[] toArray() {
        return (long[]) AbstractC3044y0.L((I0) B(new r(21))).d();
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final long count() {
        return ((Long) A(new H1(0))).longValue();
    }
}
