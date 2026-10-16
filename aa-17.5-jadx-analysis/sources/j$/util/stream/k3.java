package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class k3 extends q3 implements j$.util.e0 {
    public final /* synthetic */ x0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(x0 x0Var, int i, int i2, int i3, int i4) {
        super(x0Var, i, i2, i3, i4);
        this.g = x0Var;
    }

    @Override // j$.util.stream.q3
    public final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.q3
    public final Spliterator.OfPrimitive c(int i, int i2, int i3, int i4) {
        return new k3(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.r(this, consumer);
    }
}
