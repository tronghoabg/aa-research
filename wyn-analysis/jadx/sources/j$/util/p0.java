package j$.util;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class p0 implements Spliterator.OfInt {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f37928a;

    /* renamed from: b, reason: collision with root package name */
    private int f37929b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37930c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37931d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        S.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return S.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return S.e(this, i5);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return S.g(this, consumer);
    }

    public p0(int[] iArr, int i5, int i10, int i11) {
        this.f37928a = iArr;
        this.f37929b = i5;
        this.f37930c = i10;
        this.f37931d = i11 | 16448;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        int i5 = this.f37929b;
        int i10 = (this.f37930c + i5) >>> 1;
        if (i5 >= i10) {
            return null;
        }
        this.f37929b = i10;
        return new p0(this.f37928a, i5, i10, this.f37931d);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i5;
        intConsumer.getClass();
        int[] iArr = this.f37928a;
        int length = iArr.length;
        int i10 = this.f37930c;
        if (length < i10 || (i5 = this.f37929b) < 0) {
            return;
        }
        this.f37929b = i10;
        if (i5 < i10) {
            do {
                intConsumer.accept(iArr[i5]);
                i5++;
            } while (i5 < i10);
        }
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i5 = this.f37929b;
        if (i5 < 0 || i5 >= this.f37930c) {
            return false;
        }
        this.f37929b = i5 + 1;
        intConsumer.accept(this.f37928a[i5]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37930c - this.f37929b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f37931d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (S.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
