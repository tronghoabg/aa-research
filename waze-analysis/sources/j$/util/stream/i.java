package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i implements Collector {

    /* renamed from: a, reason: collision with root package name */
    public final Supplier f50439a;

    /* renamed from: b, reason: collision with root package name */
    public final BiConsumer f50440b;

    /* renamed from: c, reason: collision with root package name */
    public final BinaryOperator f50441c;

    /* renamed from: d, reason: collision with root package name */
    public final Function f50442d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f50443e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Set set) {
        this(supplier, biConsumer, binaryOperator, new j$.desugar.sun.nio.fs.n(21), set);
        Set set2 = Collectors.f50307a;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f50440b;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.f50443e;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f50441c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.f50442d;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.f50439a;
    }

    public i(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.f50439a = supplier;
        this.f50440b = biConsumer;
        this.f50441c = binaryOperator;
        this.f50442d = function;
        this.f50443e = set;
    }
}
