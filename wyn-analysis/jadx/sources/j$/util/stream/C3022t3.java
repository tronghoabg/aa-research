package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3022t3 extends AbstractC2968i3 implements Spliterator.OfInt {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.g(this, consumer);
    }

    @Override // j$.util.stream.AbstractC2968i3
    final AbstractC2968i3 e(Spliterator spliterator) {
        return new C3022t3(this.f38224b, spliterator, this.f38223a);
    }

    @Override // j$.util.stream.AbstractC2968i3
    final void d() {
        X2 x22 = new X2();
        this.f38230h = x22;
        Objects.requireNonNull(x22);
        this.f38227e = this.f38224b.T(new C3017s3(x22, 0));
        this.f38228f = new C2924a(3, this);
    }

    @Override // j$.util.stream.AbstractC2968i3, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2968i3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2968i3, j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i5;
        Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            X2 x22 = (X2) this.f38230h;
            long j8 = this.f38229g;
            int iU = x22.u(j8);
            if (x22.f38166c == 0 && iU == 0) {
                i5 = ((int[]) x22.f38156e)[(int) j8];
            } else {
                i5 = ((int[][]) x22.f38157f)[iU][(int) (j8 - x22.f38167d[iU])];
            }
            intConsumer.accept(i5);
        }
        return zA;
    }

    @Override // j$.util.d0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f38230h == null && !this.f38231i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            C3017s3 c3017s3 = new C3017s3(intConsumer, 1);
            this.f38224b.S(this.f38226d, c3017s3);
            this.f38231i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
