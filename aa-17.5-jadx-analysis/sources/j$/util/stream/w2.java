package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.Collector;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class w2 extends a implements Stream {
    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) d(a2.G(w.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) d(a2.G(w.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object objD;
        if (this.a.k && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!u3.ORDERED.p(this.f) || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            objD = collector.supplier().get();
            forEach(new j$.nio.file.h0((Object) collector.accumulator(), objD, (byte) 8));
            collector2 = collector;
        } else {
            collector.getClass();
            Supplier supplier = collector.supplier();
            collector2 = collector;
            objD = d(new f2(v3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        }
        return collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? objD : collector2.finisher().apply(objD);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) d(new i2((byte) 8))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new j(this, u3.m | u3.s, (byte) 0);
    }

    @Override // j$.util.stream.a
    public final j0 f(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return a2.y(aVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new r(this, u3.s, predicate, (byte) 2);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) d(l.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) d(l.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream flatMap(Function function) {
        function.getClass();
        return new r2(this, u3.o | u3.n | u3.s, function, (byte) 1);
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        d(new o(consumer));
    }

    @Override // j$.util.stream.a
    public final v3 i() {
        return v3.REFERENCE;
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator iterator() {
        return new j$.util.n0(spliterator());
    }

    @Override // j$.util.stream.a
    public final b0 j(long j, IntFunction intFunction) {
        return a2.x(j, intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return e3.a(this, 0L, j);
        }
        j$.time.g.a(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new r2(this, u3.o | u3.n, function, (byte) 0);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new s2(this, u3.o | u3.n, toIntFunction);
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new t2(this, u3.o | u3.n, toLongFunction);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        comparator.getClass();
        return (Optional) d(new b2(v3.REFERENCE, new j$.desugar.sun.nio.fs.h((byte) 4, comparator), (byte) 1));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) d(a2.G(w.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        consumer.getClass();
        return new r(this, consumer);
    }

    @Override // j$.util.stream.a
    public final Spliterator r(a aVar, Supplier supplier, boolean z) {
        return new l4(aVar, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        binaryOperator.getClass();
        return d(new c2(v3.REFERENCE, binaryOperator, binaryOperator, obj, (byte) 0));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : e3.a(this, j, -1L);
        }
        j$.time.g.a(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new g3(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return a2.C(e(intFunction), intFunction).k(intFunction);
    }
}
