package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3052z3 extends B3 implements j$.util.d0 {
    protected abstract Object b();

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.S.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.util.S.e(this, i5);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    AbstractC3052z3(j$.util.d0 d0Var, long j8, long j10) {
        super(d0Var, j8, j10, 0L, Math.min(d0Var.estimateSize(), j10));
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(Object obj) {
        long j8;
        Objects.requireNonNull(obj);
        long j10 = this.f37963e;
        long j11 = this.f37959a;
        if (j11 >= j10) {
            return false;
        }
        while (true) {
            j8 = this.f37962d;
            if (j11 <= j8) {
                break;
            }
            ((j$.util.d0) this.f37961c).tryAdvance(b());
            this.f37962d++;
        }
        if (j8 >= this.f37963e) {
            return false;
        }
        this.f37962d = j8 + 1;
        return ((j$.util.d0) this.f37961c).tryAdvance(obj);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j8 = this.f37963e;
        long j10 = this.f37959a;
        if (j10 >= j8) {
            return;
        }
        long j11 = this.f37962d;
        if (j11 >= j8) {
            return;
        }
        if (j11 >= j10 && ((j$.util.d0) this.f37961c).estimateSize() + j11 <= this.f37960b) {
            ((j$.util.d0) this.f37961c).forEachRemaining(obj);
            this.f37962d = this.f37963e;
            return;
        }
        while (j10 > this.f37962d) {
            ((j$.util.d0) this.f37961c).tryAdvance(b());
            this.f37962d++;
        }
        while (this.f37962d < this.f37963e) {
            ((j$.util.d0) this.f37961c).tryAdvance(obj);
            this.f37962d++;
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
