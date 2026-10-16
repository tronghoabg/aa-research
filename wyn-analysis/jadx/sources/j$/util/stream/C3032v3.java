package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3032v3 extends AbstractC2968i3 implements j$.util.a0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.h(this, consumer);
    }

    @Override // j$.util.stream.AbstractC2968i3
    final AbstractC2968i3 e(Spliterator spliterator) {
        return new C3032v3(this.f38224b, spliterator, this.f38223a);
    }

    @Override // j$.util.stream.AbstractC2968i3
    final void d() {
        Z2 z2 = new Z2();
        this.f38230h = z2;
        Objects.requireNonNull(z2);
        this.f38227e = this.f38224b.T(new C3027u3(z2, 0));
        this.f38228f = new C2924a(4, this);
    }

    @Override // j$.util.stream.AbstractC2968i3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.a0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2968i3, j$.util.Spliterator
    public final j$.util.a0 trySplit() {
        return (j$.util.a0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2968i3, j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        return (j$.util.a0) super.trySplit();
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j8;
        Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            Z2 z2 = (Z2) this.f38230h;
            long j10 = this.f38229g;
            int iU = z2.u(j10);
            if (z2.f38166c == 0 && iU == 0) {
                j8 = ((long[]) z2.f38156e)[(int) j10];
            } else {
                j8 = ((long[][]) z2.f38157f)[iU][(int) (j10 - z2.f38167d[iU])];
            }
            longConsumer.accept(j8);
        }
        return zA;
    }

    @Override // j$.util.d0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f38230h == null && !this.f38231i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            C3027u3 c3027u3 = new C3027u3(longConsumer, 1);
            this.f38224b.S(this.f38226d, c3027u3);
            this.f38231i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
