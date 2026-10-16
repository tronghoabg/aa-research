package j$.util.stream;

import j$.util.C3059z;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2990n0 extends InterfaceC2959h {
    InterfaceC2990n0 a(C2924a c2924a);

    E asDoubleStream();

    j$.util.A average();

    InterfaceC2990n0 b();

    Stream boxed();

    InterfaceC2990n0 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC2990n0 d();

    InterfaceC2990n0 distinct();

    InterfaceC2990n0 e();

    j$.util.C findAny();

    j$.util.C findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    boolean g();

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    j$.util.O iterator();

    E l();

    InterfaceC2990n0 limit(long j8);

    Stream mapToObj(LongFunction longFunction);

    j$.util.C max();

    j$.util.C min();

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    InterfaceC2990n0 parallel();

    InterfaceC2990n0 peek(LongConsumer longConsumer);

    boolean q();

    long reduce(long j8, LongBinaryOperator longBinaryOperator);

    j$.util.C reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.InterfaceC2959h, j$.util.stream.E
    InterfaceC2990n0 sequential();

    InterfaceC2990n0 skip(long j8);

    InterfaceC2990n0 sorted();

    @Override // j$.util.stream.InterfaceC2959h
    j$.util.a0 spliterator();

    long sum();

    C3059z summaryStatistics();

    boolean t();

    long[] toArray();

    IntStream u();
}
