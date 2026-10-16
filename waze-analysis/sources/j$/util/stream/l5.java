package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class l5 extends a implements Stream {
    @Override // j$.util.stream.Stream
    public final IntStream A(g0 g0Var) {
        Objects.requireNonNull(g0Var);
        return new g1(this, j7.p | j7.n | j7.t, g0Var, 3);
    }

    @Override // j$.util.stream.Stream
    public final LongStream E(g0 g0Var) {
        Objects.requireNonNull(g0Var);
        return new p1(this, j7.p | j7.n | j7.t, g0Var, 2);
    }

    @Override // j$.util.stream.a
    public final k7 H() {
        return k7.REFERENCE;
    }

    @Override // j$.util.stream.a
    public final e2 I(long j2, IntFunction intFunction) {
        return d4.x(j2, intFunction);
    }

    @Override // j$.util.stream.a
    public final Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new o8(aVar, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final Stream a(g0 g0Var) {
        Objects.requireNonNull(g0Var);
        return new p(this, j7.p | j7.n | j7.t, g0Var, 6);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) n(d4.P(z1.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) n(d4.P(z1.ANY, predicate))).booleanValue();
    }

    public Object collect(Collector collector) {
        Collector collector2;
        Object objN;
        if (this.f50311a.f50321k && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!j7.ORDERED.k(this.f50316f) || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            objN = collector.supplier().get();
            forEach(new j$.nio.file.z(8, collector.accumulator(), objN));
            collector2 = collector;
        } else {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            collector2 = collector;
            objN = n(new p4(k7.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        }
        return collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? objN : collector2.finisher().apply(objN);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) n(new k4(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new l(this, j7.m | j7.t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i2 = p9.f50578a;
        Objects.requireNonNull(predicate);
        return new u8(this, p9.f50579b, predicate, 1);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new p(this, j7.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) n(d0.f50368d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) n(d0.f50367c);
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        n(new k0(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        n(new k0(consumer, true));
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.d1(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j2) {
        if (j2 >= 0) {
            return e6.g(this, 0L, j2);
        }
        j$.time.f.b(Long.toString(j2));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final Stream m(w0 w0Var) {
        j$.sun.misc.a aVar = d1.m;
        if (getClass() != d1.class) {
            return new d1(this, w0Var);
        }
        d1 d1Var = (d1) this;
        return new d1(d1Var.f50369l.a(w0Var), d1Var);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new p(this, j7.p | j7.n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new q(this, j7.p | j7.n, toDoubleFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new g1(this, j7.p | j7.n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new p1(this, j7.p | j7.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) n(d4.P(z1.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new p(this, consumer);
    }

    @Override // j$.util.stream.a
    public final m2 q(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return d4.y(aVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return n(new i4(k7.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? this : e6.g(this, j2, -1L);
        }
        j$.time.f.b(Long.toString(j2));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new p6(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i2 = p9.f50578a;
        Objects.requireNonNull(predicate);
        return new u8(this, p9.f50578a, predicate, 0);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return d4.F(p(intFunction), intFunction).k(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !j7.ORDERED.k(this.f50316f) ? this : new h5(this, j7.r, 1);
    }

    @Override // j$.util.stream.a
    public final boolean v(Spliterator spliterator, t5 t5Var) {
        boolean zO;
        do {
            zO = t5Var.o();
            if (zO) {
                break;
            }
        } while (spliterator.tryAdvance(t5Var));
        return zO;
    }

    @Override // j$.util.stream.Stream
    public final DoubleStream z(g0 g0Var) {
        Objects.requireNonNull(g0Var);
        return new q(this, j7.p | j7.n | j7.t, g0Var, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new p6(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new h1(25));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return n(new i4(k7.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) n(new g4(k7.REFERENCE, binaryOperator, 2));
    }

    public Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return n(new i4(k7.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }
}
