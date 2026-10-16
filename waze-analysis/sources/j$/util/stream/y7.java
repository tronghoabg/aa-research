package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class y7 extends l7 implements j$.util.x0 {
    @Override // j$.util.stream.l7
    public final void d() {
        b7 b7Var = new b7();
        this.f50504h = b7Var;
        Objects.requireNonNull(b7Var);
        this.f50501e = this.f50498b.R(new x7(b7Var, 1));
        this.f50502f = new j$.desugar.sun.nio.fs.g(13, this);
    }

    @Override // j$.util.stream.l7
    public final l7 e(Spliterator spliterator) {
        return new y7(this.f50498b, spliterator, this.f50497a);
    }

    @Override // j$.util.a1
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f50504h != null || this.f50505i) {
            while (tryAdvance(longConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(longConsumer);
        c();
        Objects.requireNonNull(longConsumer);
        x7 x7Var = new x7(longConsumer, 0);
        this.f50498b.Q(this.f50500d, x7Var);
        this.f50505i = true;
    }

    @Override // j$.util.a1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            b7 b7Var = (b7) this.f50504h;
            long j2 = this.f50503g;
            int iY = b7Var.y(j2);
            longConsumer.accept((b7Var.f50344c == 0 && iY == 0) ? ((long[]) b7Var.f50380e)[(int) j2] : ((long[][]) b7Var.f50381f)[iY][(int) (j2 - b7Var.f50345d[iY])]);
        }
        return zA;
    }

    @Override // j$.util.stream.l7, j$.util.Spliterator
    public final j$.util.x0 trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.stream.l7, j$.util.Spliterator
    public final j$.util.a1 trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.stream.l7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.y(this, consumer);
    }
}
