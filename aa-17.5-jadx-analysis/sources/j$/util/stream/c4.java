package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class c4 extends w3 implements Spliterator.OfLong {
    @Override // j$.util.stream.w3
    public final void d() {
        p3 p3Var = new p3();
        this.h = p3Var;
        this.e = this.b.t(new b4(p3Var, (byte) 1));
        this.f = new j$.desugar.sun.nio.fs.h((byte) 16, this);
    }

    @Override // j$.util.stream.w3
    public final w3 e(Spliterator spliterator) {
        return new c4(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(longConsumer)) {
            }
            return;
        }
        longConsumer.getClass();
        c();
        b4 b4Var = new b4(longConsumer, (byte) 0);
        this.b.s(this.d, b4Var);
        this.i = true;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        boolean zA = a();
        if (zA) {
            p3 p3Var = (p3) this.h;
            long j = this.g;
            int iW = p3Var.w(j);
            longConsumer.accept((p3Var.b == 0 && iW == 0) ? ((long[]) p3Var.d)[(int) j] : ((long[][]) p3Var.e)[iW][(int) (j - p3Var.c[iW])]);
        }
        return zA;
    }

    @Override // j$.util.stream.w3, j$.util.Spliterator
    public final Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.stream.w3, j$.util.Spliterator
    public final Spliterator.OfPrimitive trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.stream.w3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.OfLong.CC.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return Spliterator.OfLong.CC.b(this, consumer);
    }
}
