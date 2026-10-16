package j$.util.stream;

import j$.util.C3056w;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface E extends InterfaceC2959h {
    E a(C2924a c2924a);

    j$.util.A average();

    E b();

    Stream boxed();

    E c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    E d();

    E distinct();

    E e();

    j$.util.A findAny();

    j$.util.A findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean i();

    j$.util.G iterator();

    InterfaceC2990n0 j();

    E limit(long j8);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.A max();

    j$.util.A min();

    boolean o();

    E parallel();

    E peek(DoubleConsumer doubleConsumer);

    double reduce(double d3, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.A reduce(DoubleBinaryOperator doubleBinaryOperator);

    IntStream s();

    E sequential();

    E skip(long j8);

    E sorted();

    @Override // j$.util.stream.InterfaceC2959h
    j$.util.V spliterator();

    double sum();

    C3056w summaryStatistics();

    double[] toArray();

    boolean v();
}
