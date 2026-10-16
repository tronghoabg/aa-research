package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class r1 implements LongStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.LongStream f50593a;

    public /* synthetic */ r1(java.util.stream.LongStream longStream) {
        this.f50593a = longStream;
    }

    public static /* synthetic */ LongStream e(java.util.stream.LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof s1 ? ((s1) longStream).f50601a : new r1(longStream);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean B() {
        return this.f50593a.allMatch(null);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ IntStream F() {
        return IntStream.VivifiedWrapper.convert(this.f50593a.mapToInt(null));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream a(g0 g0Var) {
        java.util.stream.LongStream longStream = this.f50593a;
        g0 g0Var2 = new g0();
        g0Var2.f50410a = g0Var;
        return e(longStream.flatMap(g0Var2));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ DoubleStream asDoubleStream() {
        return x.e(this.f50593a.asDoubleStream());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.z average() {
        return j$.util.y.b(this.f50593a.average());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream b() {
        return e(this.f50593a.takeWhile(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream boxed() {
        return f7.e(this.f50593a.boxed());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream c() {
        return e(this.f50593a.filter(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f50593a.close();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f50593a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long count() {
        return this.f50593a.count();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream d() {
        return e(this.f50593a.dropWhile(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream distinct() {
        return e(this.f50593a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.LongStream longStream = this.f50593a;
        if (obj instanceof r1) {
            obj = ((r1) obj).f50593a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream f() {
        return e(this.f50593a.map(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.b0 findAny() {
        return j$.util.y.d(this.f50593a.findAny());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.b0 findFirst() {
        return j$.util.y.d(this.f50593a.findFirst());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f50593a.forEach(longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f50593a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f50593a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f50593a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.n0 iterator() {
        ?? it = this.f50593a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.m0 ? ((j$.util.m0) it).f50275a : new j$.util.l0(it);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ DoubleStream k() {
        return x.e(this.f50593a.mapToDouble(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream limit(long j2) {
        return e(this.f50593a.limit(j2));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return f7.e(this.f50593a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.b0 max() {
        return j$.util.y.d(this.f50593a.max());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.b0 min() {
        return j$.util.y.d(this.f50593a.min());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean o() {
        return this.f50593a.noneMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return e.e(this.f50593a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return e.e(this.f50593a.parallel());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        return e(this.f50593a.peek(longConsumer));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.b0 reduce(LongBinaryOperator longBinaryOperator) {
        return j$.util.y.d(this.f50593a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return e.e(this.f50593a.sequential());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream skip(long j2) {
        return e(this.f50593a.skip(j2));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ LongStream sorted() {
        return e(this.f50593a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.x0 spliterator() {
        return j$.util.v0.a(this.f50593a.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return this.f50593a.sum();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.x summaryStatistics() {
        this.f50593a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.f50593a.toArray();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean u() {
        return this.f50593a.anyMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return e.e(this.f50593a.unordered());
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ LongStream parallel() {
        return e(this.f50593a.parallel());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long reduce(long j2, LongBinaryOperator longBinaryOperator) {
        return this.f50593a.reduce(j2, longBinaryOperator);
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ LongStream sequential() {
        return e(this.f50593a.sequential());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.b1.a(this.f50593a.spliterator());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f50593a.iterator();
    }
}
