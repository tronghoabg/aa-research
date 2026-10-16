package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class e8 extends f8 implements Spliterator {
    public e8(Spliterator spliterator, long j2, long j3) {
        super(spliterator, j2, j3, 0L, Math.min(spliterator.estimateSize(), j3));
    }

    @Override // j$.util.stream.f8
    public final Spliterator a(Spliterator spliterator, long j2, long j3, long j4, long j5) {
        return new e8(spliterator, j2, j3, j4, j5);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j2 = this.f50408e;
        long j3 = this.f50404a;
        if (j3 >= j2) {
            return;
        }
        long j4 = this.f50407d;
        if (j4 >= j2) {
            return;
        }
        if (j4 >= j3 && this.f50406c.estimateSize() + j4 <= this.f50405b) {
            this.f50406c.forEachRemaining(consumer);
            this.f50407d = this.f50408e;
            return;
        }
        while (j3 > this.f50407d) {
            this.f50406c.tryAdvance(new d8(0));
            this.f50407d++;
        }
        while (this.f50407d < this.f50408e) {
            this.f50406c.tryAdvance(consumer);
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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j2;
        Objects.requireNonNull(consumer);
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
            this.f50406c.tryAdvance(new h1(29));
            this.f50407d++;
        }
        if (j2 >= this.f50408e) {
            return false;
        }
        this.f50407d = j2 + 1;
        return this.f50406c.tryAdvance(consumer);
    }
}
