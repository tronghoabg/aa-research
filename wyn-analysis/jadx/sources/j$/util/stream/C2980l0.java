package j$.util.stream;

import j$.util.C3059z;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2980l0 implements InterfaceC2990n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LongStream f38252a;

    private /* synthetic */ C2980l0(LongStream longStream) {
        this.f38252a = longStream;
    }

    public static /* synthetic */ InterfaceC2990n0 k(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C2985m0 ? ((C2985m0) longStream).f38257a : new C2980l0(longStream);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ E asDoubleStream() {
        return C.k(this.f38252a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ j$.util.A average() {
        return j$.util.S.j(this.f38252a.average());
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ InterfaceC2990n0 b() {
        return k(this.f38252a.takeWhile(null));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ Stream boxed() {
        return C2943d3.k(this.f38252a.boxed());
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ InterfaceC2990n0 c() {
        return k(this.f38252a.filter(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f38252a.close();
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f38252a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ long count() {
        return this.f38252a.count();
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ InterfaceC2990n0 d() {
        return k(this.f38252a.dropWhile(null));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ InterfaceC2990n0 distinct() {
        return k(this.f38252a.distinct());
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ InterfaceC2990n0 e() {
        return k(this.f38252a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f38252a;
        if (obj instanceof C2980l0) {
            obj = ((C2980l0) obj).f38252a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ j$.util.C findAny() {
        return j$.util.S.l(this.f38252a.findAny());
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ j$.util.C findFirst() {
        return j$.util.S.l(this.f38252a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f38252a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f38252a.forEachOrdered(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ boolean g() {
        return this.f38252a.noneMatch(null);
    }

    public final /* synthetic */ int hashCode() {
        return this.f38252a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ boolean isParallel() {
        return this.f38252a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC2990n0, j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ j$.util.O iterator() {
        return j$.util.M.a(this.f38252a.iterator());
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return this.f38252a.iterator();
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ E l() {
        return C.k(this.f38252a.mapToDouble(null));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ InterfaceC2990n0 limit(long j8) {
        return k(this.f38252a.limit(j8));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C2943d3.k(this.f38252a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ j$.util.C max() {
        return j$.util.S.l(this.f38252a.max());
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ j$.util.C min() {
        return j$.util.S.l(this.f38252a.min());
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ InterfaceC2959h onClose(Runnable runnable) {
        return C2949f.k(this.f38252a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ InterfaceC2959h parallel() {
        return C2949f.k(this.f38252a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2990n0, j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ InterfaceC2990n0 parallel() {
        return k(this.f38252a.parallel());
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ InterfaceC2990n0 peek(LongConsumer longConsumer) {
        return k(this.f38252a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ boolean q() {
        return this.f38252a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ long reduce(long j8, LongBinaryOperator longBinaryOperator) {
        return this.f38252a.reduce(j8, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ j$.util.C reduce(LongBinaryOperator longBinaryOperator) {
        return j$.util.S.l(this.f38252a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ InterfaceC2959h sequential() {
        return C2949f.k(this.f38252a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2990n0, j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ InterfaceC2990n0 sequential() {
        return k(this.f38252a.sequential());
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ InterfaceC2990n0 skip(long j8) {
        return k(this.f38252a.skip(j8));
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ InterfaceC2990n0 sorted() {
        return k(this.f38252a.sorted());
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.e0.a(this.f38252a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC2990n0, j$.util.stream.InterfaceC2959h
    public final /* synthetic */ j$.util.a0 spliterator() {
        return j$.util.Y.a(this.f38252a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ long sum() {
        return this.f38252a.sum();
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ boolean t() {
        return this.f38252a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ long[] toArray() {
        return this.f38252a.toArray();
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final /* synthetic */ IntStream u() {
        return IntStream.VivifiedWrapper.convert(this.f38252a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ InterfaceC2959h unordered() {
        return C2949f.k(this.f38252a.unordered());
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final C3059z summaryStatistics() {
        this.f38252a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC2990n0
    public final InterfaceC2990n0 a(C2924a c2924a) {
        LongStream longStream = this.f38252a;
        C2924a c2924a2 = new C2924a(9);
        c2924a2.f38137b = c2924a;
        return k(longStream.flatMap(c2924a2));
    }
}
