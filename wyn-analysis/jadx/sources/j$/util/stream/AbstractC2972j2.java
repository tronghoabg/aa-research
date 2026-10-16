package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2972j2 extends AbstractC2929b implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new N2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C2989n(this, EnumC2958g3.f38203m | EnumC2958g3.f38210t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) A(J.f38017d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) A(J.f38016c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new N2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return A(new F1(EnumC2963h3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return A(new F1(EnumC2963h3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        A(new P(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        A(new P(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.AbstractC2929b
    final EnumC2963h3 F() {
        return EnumC2963h3.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) A(new D1(EnumC2963h3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.AbstractC2929b
    final K0 C(AbstractC2929b abstractC2929b, Spliterator spliterator, boolean z2, IntFunction intFunction) {
        return AbstractC3044y0.B(abstractC2929b, spliterator, z2, intFunction);
    }

    @Override // j$.util.stream.AbstractC2929b
    final Spliterator R(AbstractC2929b abstractC2929b, Supplier supplier, boolean z2) {
        return new K3(abstractC2929b, supplier, z2);
    }

    @Override // j$.util.stream.AbstractC2929b
    final boolean E(Spliterator spliterator, InterfaceC3011r2 interfaceC3011r2) {
        boolean zN;
        do {
            zN = interfaceC3011r2.n();
            if (zN) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC3011r2));
        return zN;
    }

    @Override // j$.util.stream.AbstractC2929b
    final C0 K(long j8, IntFunction intFunction) {
        return AbstractC3044y0.A(j8, intFunction);
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C3018t(this, EnumC2958g3.f38210t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C3018t(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new W(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, toIntFunction, 4);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return A(new F1(EnumC2963h3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC2990n0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C2960h0(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final E mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C3043y(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) A(new H1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream a(C2924a c2924a) {
        Objects.requireNonNull(c2924a);
        return new C3018t(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n | EnumC2958g3.f38210t, c2924a, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream r(C2924a c2924a) {
        Objects.requireNonNull(c2924a);
        return new W(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n | EnumC2958g3.f38210t, c2924a, 5);
    }

    @Override // j$.util.stream.Stream
    public final E w(C2924a c2924a) {
        Objects.requireNonNull(c2924a);
        return new C3043y(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n | EnumC2958g3.f38210t, c2924a, 3);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC2990n0 n(C2924a c2924a) {
        Objects.requireNonNull(c2924a);
        return new C2960h0(this, EnumC2958g3.f38206p | EnumC2958g3.f38204n | EnumC2958g3.f38210t, c2924a, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C3018t(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(Long.toString(j8));
        }
        return C2.h(this, 0L, j8);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? this : C2.h(this, j8, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j8));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i5 = r4.f38301a;
        Objects.requireNonNull(predicate);
        return new R3(this, r4.f38301a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i5 = r4.f38301a;
        Objects.requireNonNull(predicate);
        return new T3(this, r4.f38302b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC3044y0.I(B(intFunction), intFunction).o(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C2942d2(0));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) A(AbstractC3044y0.S(EnumC3029v0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) A(AbstractC3044y0.S(EnumC3029v0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) A(AbstractC3044y0.S(EnumC3029v0.NONE, predicate))).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    @Override // j$.util.stream.Stream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(j$.util.stream.C2969j r10) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.AbstractC2972j2.h(j$.util.stream.j):java.lang.Object");
    }
}
