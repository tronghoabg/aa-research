package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class c8 extends f8 implements j$.util.a1 {
    public c8(j$.util.a1 a1Var, long j2, long j3) {
        super(a1Var, j2, j3, 0L, Math.min(a1Var.estimateSize(), j3));
    }

    public abstract Object b();

    @Override // j$.util.a1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j2 = this.f50408e;
        long j3 = this.f50404a;
        if (j3 >= j2) {
            return;
        }
        long j4 = this.f50407d;
        if (j4 >= j2) {
            return;
        }
        if (j4 >= j3 && ((j$.util.a1) this.f50406c).estimateSize() + j4 <= this.f50405b) {
            ((j$.util.a1) this.f50406c).forEachRemaining(obj);
            this.f50407d = this.f50408e;
            return;
        }
        while (j3 > this.f50407d) {
            ((j$.util.a1) this.f50406c).tryAdvance(b());
            this.f50407d++;
        }
        while (this.f50407d < this.f50408e) {
            ((j$.util.a1) this.f50406c).tryAdvance(obj);
            this.f50407d++;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.l(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i2) {
        return j$.com.android.tools.r8.a.n(this, i2);
    }

    @Override // j$.util.a1
    public final boolean tryAdvance(Object obj) {
        long j2;
        Objects.requireNonNull(obj);
        long j3 = this.f50408e;
        long j4 = this.f50404a;
        if (j4 >= j3) {
            return false;
        }
        while (true) {
            j2 = this.f50407d;
            if (j4 <= j2) {
                break;
            }
            ((j$.util.a1) this.f50406c).tryAdvance(b());
            this.f50407d++;
        }
        if (j2 >= this.f50408e) {
            return false;
        }
        this.f50407d = j2 + 1;
        return ((j$.util.a1) this.f50406c).tryAdvance(obj);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
