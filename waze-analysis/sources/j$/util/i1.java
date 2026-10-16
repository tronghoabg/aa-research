package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i1 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f50264a;

    /* renamed from: b, reason: collision with root package name */
    public int f50265b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50266c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50267d;

    public i1(double[] dArr, int i2, int i3, int i4) {
        this.f50264a = dArr;
        this.f50265b = i2;
        this.f50266c = i3;
        this.f50267d = i4 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f50267d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f50266c - this.f50265b;
    }

    @Override // j$.util.a1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i2;
        doubleConsumer.getClass();
        double[] dArr = this.f50264a;
        int length = dArr.length;
        int i3 = this.f50266c;
        if (length < i3 || (i2 = this.f50265b) < 0) {
            return;
        }
        this.f50265b = i3;
        if (i2 < i3) {
            do {
                doubleConsumer.accept(dArr[i2]);
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
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i2 = this.f50265b;
        if (i2 < 0 || i2 >= this.f50266c) {
            return false;
        }
        this.f50265b = i2 + 1;
        doubleConsumer.accept(this.f50264a[i2]);
        return true;
    }

    @Override // j$.util.a1, j$.util.Spliterator
    public final s0 trySplit() {
        int i2 = this.f50265b;
        int i3 = (this.f50266c + i2) >>> 1;
        if (i2 >= i3) {
            return null;
        }
        this.f50265b = i3;
        return new i1(this.f50264a, i2, i3, this.f50267d);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.w(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.g(this, consumer);
    }
}
