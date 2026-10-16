package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class p1 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f50289a;

    /* renamed from: b, reason: collision with root package name */
    public int f50290b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50291c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50292d;

    public p1(long[] jArr, int i2, int i3, int i4) {
        this.f50289a = jArr;
        this.f50290b = i2;
        this.f50291c = i3;
        this.f50292d = i4 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f50292d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f50291c - this.f50290b;
    }

    @Override // j$.util.a1
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i2;
        longConsumer.getClass();
        long[] jArr = this.f50289a;
        int length = jArr.length;
        int i3 = this.f50291c;
        if (length < i3 || (i2 = this.f50290b) < 0) {
            return;
        }
        this.f50290b = i3;
        if (i2 < i3) {
            do {
                longConsumer.accept(jArr[i2]);
                i2++;
            } while (i2 < i3);
        }
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (j$.com.android.tools.r8.a.n(this, 4)) {
            return null;
        }
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
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i2 = this.f50290b;
        if (i2 < 0 || i2 >= this.f50291c) {
            return false;
        }
        this.f50290b = i2 + 1;
        longConsumer.accept(this.f50289a[i2]);
        return true;
    }

    @Override // j$.util.a1, j$.util.Spliterator
    public final x0 trySplit() {
        int i2 = this.f50290b;
        int i3 = (this.f50291c + i2) >>> 1;
        if (i2 >= i3) {
            return null;
        }
        this.f50290b = i3;
        return new p1(this.f50289a, i2, i3, this.f50292d);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.y(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.i(this, consumer);
    }
}
