package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class w7 extends l7 implements Spliterator.OfInt {
    @Override // j$.util.stream.l7
    public final void d() {
        z6 z6Var = new z6();
        this.f50504h = z6Var;
        Objects.requireNonNull(z6Var);
        this.f50501e = this.f50498b.R(new v7(z6Var, 1));
        this.f50502f = new j$.desugar.sun.nio.fs.g(12, this);
    }

    @Override // j$.util.stream.l7
    public final l7 e(Spliterator spliterator) {
        return new w7(this.f50498b, spliterator, this.f50497a);
    }

    @Override // j$.util.a1
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f50504h != null || this.f50505i) {
            while (tryAdvance(intConsumer)) {
            }
            return;
        }
        Objects.requireNonNull(intConsumer);
        c();
        Objects.requireNonNull(intConsumer);
        v7 v7Var = new v7(intConsumer, 0);
        this.f50498b.Q(this.f50500d, v7Var);
        this.f50505i = true;
    }

    @Override // j$.util.a1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            z6 z6Var = (z6) this.f50504h;
            long j2 = this.f50503g;
            int iY = z6Var.y(j2);
            intConsumer.accept((z6Var.f50344c == 0 && iY == 0) ? ((int[]) z6Var.f50380e)[(int) j2] : ((int[][]) z6Var.f50381f)[iY][(int) (j2 - z6Var.f50345d[iY])]);
        }
        return zA;
    }

    @Override // j$.util.stream.l7, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.l7, j$.util.Spliterator
    public final j$.util.a1 trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.l7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.x(this, consumer);
    }
}
