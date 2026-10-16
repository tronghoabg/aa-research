package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class x implements DoubleStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.DoubleStream f50666a;

    public /* synthetic */ x(java.util.stream.DoubleStream doubleStream) {
        this.f50666a = doubleStream;
    }

    public static /* synthetic */ DoubleStream e(java.util.stream.DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof y ? ((y) doubleStream).f50691a : new x(doubleStream);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ IntStream D() {
        return IntStream.VivifiedWrapper.convert(this.f50666a.mapToInt(null));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ boolean G() {
        return this.f50666a.noneMatch(null);
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream a(g0 g0Var) {
        java.util.stream.DoubleStream doubleStream = this.f50666a;
        g0 g0Var2 = new g0();
        g0Var2.f50410a = g0Var;
        return e(doubleStream.flatMap(g0Var2));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.z average() {
        return j$.util.y.b(this.f50666a.average());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream b() {
        return e(this.f50666a.takeWhile(null));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ Stream boxed() {
        return f7.e(this.f50666a.boxed());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream c() {
        return e(this.f50666a.filter(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f50666a.close();
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f50666a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ long count() {
        return this.f50666a.count();
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream d() {
        return e(this.f50666a.dropWhile(null));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream distinct() {
        return e(this.f50666a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.DoubleStream doubleStream = this.f50666a;
        if (obj instanceof x) {
            obj = ((x) obj).f50666a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.z findAny() {
        return j$.util.y.b(this.f50666a.findAny());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.z findFirst() {
        return j$.util.y.b(this.f50666a.findFirst());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f50666a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f50666a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f50666a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f50666a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.DoubleStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.f0 iterator() {
        ?? it = this.f50666a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.e0 ? ((j$.util.e0) it).f50221a : new j$.util.d0(it);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream limit(long j2) {
        return e(this.f50666a.limit(j2));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        return e(this.f50666a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return f7.e(this.f50666a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.z max() {
        return j$.util.y.b(this.f50666a.max());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.z min() {
        return j$.util.y.b(this.f50666a.min());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return e.e(this.f50666a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return e.e(this.f50666a.parallel());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream peek(DoubleConsumer doubleConsumer) {
        return e(this.f50666a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.z reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.util.y.b(this.f50666a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ boolean s() {
        return this.f50666a.anyMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return e.e(this.f50666a.sequential());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream skip(long j2) {
        return e(this.f50666a.skip(j2));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ DoubleStream sorted() {
        return e(this.f50666a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.DoubleStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.s0 spliterator() {
        return j$.util.q0.a(this.f50666a.spliterator());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ double sum() {
        return this.f50666a.sum();
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.u summaryStatistics() {
        this.f50666a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ double[] toArray() {
        return this.f50666a.toArray();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return e.e(this.f50666a.unordered());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ boolean x() {
        return this.f50666a.allMatch(null);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ LongStream y() {
        return r1.e(this.f50666a.mapToLong(null));
    }

    @Override // j$.util.stream.DoubleStream, j$.util.stream.BaseStream
    public final /* synthetic */ DoubleStream parallel() {
        return e(this.f50666a.parallel());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ double reduce(double d2, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f50666a.reduce(d2, doubleBinaryOperator);
    }

    @Override // j$.util.stream.DoubleStream, j$.util.stream.BaseStream
    public final /* synthetic */ DoubleStream sequential() {
        return e(this.f50666a.sequential());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.b1.a(this.f50666a.spliterator());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f50666a.iterator();
    }
}
