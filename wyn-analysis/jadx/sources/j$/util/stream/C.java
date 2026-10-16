package j$.util.stream;

import j$.util.C3056w;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class C implements E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DoubleStream f37964a;

    private /* synthetic */ C(DoubleStream doubleStream) {
        this.f37964a = doubleStream;
    }

    public static /* synthetic */ E k(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof D ? ((D) doubleStream).f37969a : new C(doubleStream);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.A average() {
        return j$.util.S.j(this.f37964a.average());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E b() {
        return k(this.f37964a.takeWhile(null));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ Stream boxed() {
        return C2943d3.k(this.f37964a.boxed());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E c() {
        return k(this.f37964a.filter(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f37964a.close();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f37964a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ long count() {
        return this.f37964a.count();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E d() {
        return k(this.f37964a.dropWhile(null));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E distinct() {
        return k(this.f37964a.distinct());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E e() {
        return k(this.f37964a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f37964a;
        if (obj instanceof C) {
            obj = ((C) obj).f37964a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.A findAny() {
        return j$.util.S.j(this.f37964a.findAny());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.A findFirst() {
        return j$.util.S.j(this.f37964a.findFirst());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f37964a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f37964a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f37964a.hashCode();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ boolean i() {
        return this.f37964a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ boolean isParallel() {
        return this.f37964a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.G iterator() {
        return j$.util.E.a(this.f37964a.iterator());
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return this.f37964a.iterator();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ InterfaceC2990n0 j() {
        return C2980l0.k(this.f37964a.mapToLong(null));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E limit(long j8) {
        return k(this.f37964a.limit(j8));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C2943d3.k(this.f37964a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.A max() {
        return j$.util.S.j(this.f37964a.max());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.A min() {
        return j$.util.S.j(this.f37964a.min());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ boolean o() {
        return this.f37964a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ InterfaceC2959h onClose(Runnable runnable) {
        return C2949f.k(this.f37964a.onClose(runnable));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E parallel() {
        return k(this.f37964a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ InterfaceC2959h parallel() {
        return C2949f.k(this.f37964a.parallel());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E peek(DoubleConsumer doubleConsumer) {
        return k(this.f37964a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ double reduce(double d3, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f37964a.reduce(d3, doubleBinaryOperator);
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ j$.util.A reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.util.S.j(this.f37964a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ IntStream s() {
        return IntStream.VivifiedWrapper.convert(this.f37964a.mapToInt(null));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E sequential() {
        return k(this.f37964a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ InterfaceC2959h sequential() {
        return C2949f.k(this.f37964a.sequential());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E skip(long j8) {
        return k(this.f37964a.skip(j8));
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ E sorted() {
        return k(this.f37964a.sorted());
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.e0.a(this.f37964a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.E, j$.util.stream.InterfaceC2959h
    public final /* synthetic */ j$.util.V spliterator() {
        return j$.util.T.a(this.f37964a.spliterator());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ double sum() {
        return this.f37964a.sum();
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ double[] toArray() {
        return this.f37964a.toArray();
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ InterfaceC2959h unordered() {
        return C2949f.k(this.f37964a.unordered());
    }

    @Override // j$.util.stream.E
    public final /* synthetic */ boolean v() {
        return this.f37964a.noneMatch(null);
    }

    @Override // j$.util.stream.E
    public final C3056w summaryStatistics() {
        this.f37964a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.E
    public final E a(C2924a c2924a) {
        DoubleStream doubleStream = this.f37964a;
        C2924a c2924a2 = new C2924a(7);
        c2924a2.f38137b = c2924a;
        return k(doubleStream.flatMap(c2924a2));
    }
}
