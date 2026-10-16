package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
abstract class F3 extends I3 implements j$.util.d0 {
    protected abstract void e(Object obj);

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.S.d(this);
    }

    protected abstract AbstractC2988m3 h(int i5);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.util.S.e(this, i5);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (d() != H3.NO_MORE && ((j$.util.d0) this.f38009a).tryAdvance(this)) {
            if (b(1L) == 1) {
                e(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.d0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC2988m3 abstractC2988m3H = null;
        while (true) {
            H3 h3D = d();
            if (h3D == H3.NO_MORE) {
                return;
            }
            H3 h32 = H3.MAYBE_MORE;
            Spliterator spliterator = this.f38009a;
            if (h3D == h32) {
                int i5 = this.f38011c;
                if (abstractC2988m3H == null) {
                    abstractC2988m3H = h(i5);
                } else {
                    abstractC2988m3H.f38259b = 0;
                }
                long j8 = 0;
                while (((j$.util.d0) spliterator).tryAdvance(abstractC2988m3H)) {
                    j8++;
                    if (j8 >= i5) {
                        break;
                    }
                }
                if (j8 == 0) {
                    return;
                } else {
                    abstractC2988m3H.b(obj, b(j8));
                }
            } else {
                ((j$.util.d0) spliterator).forEachRemaining(obj);
                return;
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
