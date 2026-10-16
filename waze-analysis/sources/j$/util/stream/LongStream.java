package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public interface LongStream extends BaseStream<Long, LongStream> {
    boolean B();

    IntStream F();

    LongStream a(g0 g0Var);

    DoubleStream asDoubleStream();

    j$.util.z average();

    LongStream b();

    Stream boxed();

    LongStream c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    LongStream d();

    LongStream distinct();

    LongStream f();

    j$.util.b0 findAny();

    j$.util.b0 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.BaseStream
    j$.util.n0 iterator();

    DoubleStream k();

    LongStream limit(long j2);

    Stream mapToObj(LongFunction longFunction);

    j$.util.b0 max();

    j$.util.b0 min();

    boolean o();

    @Override // j$.util.stream.BaseStream
    LongStream parallel();

    LongStream peek(LongConsumer longConsumer);

    long reduce(long j2, LongBinaryOperator longBinaryOperator);

    j$.util.b0 reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.BaseStream
    LongStream sequential();

    LongStream skip(long j2);

    LongStream sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.x0 spliterator();

    long sum();

    j$.util.x summaryStatistics();

    long[] toArray();

    boolean u();
}
