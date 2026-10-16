package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public interface DoubleStream extends BaseStream<Double, DoubleStream> {
    IntStream D();

    boolean G();

    DoubleStream a(g0 g0Var);

    j$.util.z average();

    DoubleStream b();

    Stream boxed();

    DoubleStream c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    DoubleStream d();

    DoubleStream distinct();

    j$.util.z findAny();

    j$.util.z findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.BaseStream
    j$.util.f0 iterator();

    DoubleStream limit(long j2);

    DoubleStream map(DoubleUnaryOperator doubleUnaryOperator);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.z max();

    j$.util.z min();

    @Override // j$.util.stream.BaseStream
    DoubleStream parallel();

    DoubleStream peek(DoubleConsumer doubleConsumer);

    double reduce(double d2, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.z reduce(DoubleBinaryOperator doubleBinaryOperator);

    boolean s();

    @Override // j$.util.stream.BaseStream
    DoubleStream sequential();

    DoubleStream skip(long j2);

    DoubleStream sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.s0 spliterator();

    double sum();

    j$.util.u summaryStatistics();

    double[] toArray();

    boolean x();

    LongStream y();
}
