package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class A3 extends B3 implements Spliterator {
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

    A3(Spliterator spliterator, long j8, long j10) {
        super(spliterator, j8, j10, 0L, Math.min(spliterator.estimateSize(), j10));
    }

    @Override // j$.util.stream.B3
    protected final Spliterator a(Spliterator spliterator, long j8, long j10, long j11, long j12) {
        return new A3(spliterator, j8, j10, j11, j12);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j8;
        Objects.requireNonNull(consumer);
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
            this.f37961c.tryAdvance(new C2942d2(4));
            this.f37962d++;
        }
        if (j8 >= this.f37963e) {
            return false;
        }
        this.f37962d = j8 + 1;
        return this.f37961c.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j8 = this.f37963e;
        long j10 = this.f37959a;
        if (j10 >= j8) {
            return;
        }
        long j11 = this.f37962d;
        if (j11 >= j8) {
            return;
        }
        if (j11 >= j10 && this.f37961c.estimateSize() + j11 <= this.f37960b) {
            this.f37961c.forEachRemaining(consumer);
            this.f37962d = this.f37963e;
            return;
        }
        while (j10 > this.f37962d) {
            this.f37961c.tryAdvance(new C2942d2(5));
            this.f37962d++;
        }
        while (this.f37962d < this.f37963e) {
            this.f37961c.tryAdvance(consumer);
            this.f37962d++;
        }
    }
}
