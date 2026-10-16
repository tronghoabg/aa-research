package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
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

/* renamed from: j$.util.stream.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2943d3 implements Stream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.Stream f38170a;

    private /* synthetic */ C2943d3(java.util.stream.Stream stream) {
        this.f38170a = stream;
    }

    public static /* synthetic */ Stream k(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new C2943d3(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream a(C2924a c2924a) {
        return k(this.f38170a.flatMap(AbstractC3044y0.M(c2924a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f38170a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f38170a.anyMatch(predicate);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f38170a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f38170a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f38170a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return k(this.f38170a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return k(this.f38170a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.f38170a;
        if (obj instanceof C2943d3) {
            obj = ((C2943d3) obj).f38170a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return k(this.f38170a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return j$.util.S.i(this.f38170a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return j$.util.S.i(this.f38170a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f38170a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f38170a.forEachOrdered(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object h(C2969j c2969j) {
        return this.f38170a.collect(c2969j == null ? null : c2969j.f38236a);
    }

    public final /* synthetic */ int hashCode() {
        return this.f38170a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ boolean isParallel() {
        return this.f38170a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return this.f38170a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j8) {
        return k(this.f38170a.limit(j8));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return k(this.f38170a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ E mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C.k(this.f38170a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f38170a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC2990n0 mapToLong(ToLongFunction toLongFunction) {
        return C2980l0.k(this.f38170a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return j$.util.S.i(this.f38170a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return j$.util.S.i(this.f38170a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC2990n0 n(C2924a c2924a) {
        return C2980l0.k(this.f38170a.flatMapToLong(AbstractC3044y0.M(c2924a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f38170a.noneMatch(predicate);
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ InterfaceC2959h onClose(Runnable runnable) {
        return C2949f.k(this.f38170a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ InterfaceC2959h parallel() {
        return C2949f.k(this.f38170a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return k(this.f38170a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream r(C2924a c2924a) {
        return IntStream.VivifiedWrapper.convert(this.f38170a.flatMapToInt(AbstractC3044y0.M(c2924a)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return j$.util.S.i(this.f38170a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f38170a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f38170a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    public final /* synthetic */ InterfaceC2959h sequential() {
        return C2949f.k(this.f38170a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j8) {
        return k(this.f38170a.skip(j8));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return k(this.f38170a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return k(this.f38170a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.e0.a(this.f38170a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return k(this.f38170a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f38170a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f38170a.toArray(intFunction);
    }

    @Override // j$.util.stream.InterfaceC2959h
    public final /* synthetic */ InterfaceC2959h unordered() {
        return C2949f.k(this.f38170a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ E w(C2924a c2924a) {
        return C.k(this.f38170a.flatMapToDouble(AbstractC3044y0.M(c2924a)));
    }
}
