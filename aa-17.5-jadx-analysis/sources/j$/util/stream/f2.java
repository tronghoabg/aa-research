package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class f2 extends a2 {
    public final /* synthetic */ BinaryOperator i;
    public final /* synthetic */ BiConsumer j;
    public final /* synthetic */ Supplier k;
    public final /* synthetic */ Collector l;

    public f2(v3 v3Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        super((byte) 8);
        this.i = binaryOperator;
        this.j = biConsumer;
        this.k = supplier;
        this.l = collector;
    }

    @Override // j$.util.stream.a2
    public final n2 H() {
        return new g2(this.k, this.j, this.i);
    }

    @Override // j$.util.stream.a2, j$.util.stream.t4
    public final int c() {
        if (this.l.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return u3.q;
        }
        return 0;
    }
}
