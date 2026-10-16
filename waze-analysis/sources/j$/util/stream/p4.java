package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class p4 extends d4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f50572h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f50573i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Supplier f50574j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Collector f50575k;

    public p4(k7 k7Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.f50572h = binaryOperator;
        this.f50573i = biConsumer;
        this.f50574j = supplier;
        this.f50575k = collector;
    }

    @Override // j$.util.stream.d4
    public final y4 Q() {
        return new q4(this.f50574j, this.f50573i, this.f50572h);
    }

    @Override // j$.util.stream.d4, j$.util.stream.r8
    public final int c() {
        if (this.f50575k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return j7.r;
        }
        return 0;
    }
}
