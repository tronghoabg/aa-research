package j$.util;

import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class h1 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f50259a;

    /* renamed from: b, reason: collision with root package name */
    public int f50260b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50261c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50262d;

    public h1(Object[] objArr, int i2, int i3, int i4) {
        this.f50259a = objArr;
        this.f50260b = i2;
        this.f50261c = i3;
        this.f50262d = i4 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f50262d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f50261c - this.f50260b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i2;
        consumer.getClass();
        Object[] objArr = this.f50259a;
        int length = objArr.length;
        int i3 = this.f50261c;
        if (length < i3 || (i2 = this.f50260b) < 0) {
            return;
        }
        this.f50260b = i3;
        if (i2 < i3) {
            do {
                consumer.accept(objArr[i2]);
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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i2 = this.f50260b;
        if (i2 < 0 || i2 >= this.f50261c) {
            return false;
        }
        this.f50260b = i2 + 1;
        consumer.accept(this.f50259a[i2]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i2 = this.f50260b;
        int i3 = (this.f50261c + i2) >>> 1;
        if (i2 >= i3) {
            return null;
        }
        this.f50260b = i3;
        return new h1(this.f50259a, i2, i3, this.f50262d);
    }
}
