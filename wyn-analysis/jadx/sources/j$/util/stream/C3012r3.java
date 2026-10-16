package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3012r3 extends AbstractC2968i3 implements j$.util.V {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.S.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.S.f(this, consumer);
    }

    @Override // j$.util.stream.AbstractC2968i3
    final AbstractC2968i3 e(Spliterator spliterator) {
        return new C3012r3(this.f38224b, spliterator, this.f38223a);
    }

    @Override // j$.util.stream.AbstractC2968i3
    final void d() {
        V2 v2 = new V2();
        this.f38230h = v2;
        Objects.requireNonNull(v2);
        this.f38227e = this.f38224b.T(new C3008q3(v2, 0));
        this.f38228f = new C2924a(2, this);
    }

    @Override // j$.util.stream.AbstractC2968i3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2968i3, j$.util.Spliterator
    public final j$.util.V trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC2968i3, j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d3;
        Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            V2 v2 = (V2) this.f38230h;
            long j8 = this.f38229g;
            int iU = v2.u(j8);
            if (v2.f38166c == 0 && iU == 0) {
                d3 = ((double[]) v2.f38156e)[(int) j8];
            } else {
                d3 = ((double[][]) v2.f38157f)[iU][(int) (j8 - v2.f38167d[iU])];
            }
            doubleConsumer.accept(d3);
        }
        return zA;
    }

    @Override // j$.util.d0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f38230h == null && !this.f38231i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            C3008q3 c3008q3 = new C3008q3(doubleConsumer, 1);
            this.f38224b.S(this.f38226d, c3008q3);
            this.f38231i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
