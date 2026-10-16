package j$.util;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class n1 implements Spliterator.OfInt {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f50277a;

    /* renamed from: b, reason: collision with root package name */
    public int f50278b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50279c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50280d;

    public n1(int[] iArr, int i2, int i3, int i4) {
        this.f50277a = iArr;
        this.f50278b = i2;
        this.f50279c = i3;
        this.f50280d = i4 | 16448;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f50280d;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f50279c - this.f50278b;
    }

    @Override // j$.util.a1
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i2;
        intConsumer.getClass();
        int[] iArr = this.f50277a;
        int length = iArr.length;
        int i3 = this.f50279c;
        if (length < i3 || (i2 = this.f50278b) < 0) {
            return;
        }
        this.f50278b = i3;
        if (i2 < i3) {
            do {
                intConsumer.accept(iArr[i2]);
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
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i2 = this.f50278b;
        if (i2 < 0 || i2 >= this.f50279c) {
            return false;
        }
        this.f50278b = i2 + 1;
        intConsumer.accept(this.f50277a[i2]);
        return true;
    }

    @Override // j$.util.a1, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        int i2 = this.f50278b;
        int i3 = (this.f50279c + i2) >>> 1;
        if (i2 >= i3) {
            return null;
        }
        this.f50278b = i3;
        return new n1(this.f50277a, i2, i3, this.f50280d);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.x(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.h(this, consumer);
    }
}
