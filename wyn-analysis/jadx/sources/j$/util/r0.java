package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class r0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f37938a;

    /* renamed from: b, reason: collision with root package name */
    private int f37939b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37940c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37941d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        S.c(this, consumer);
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
        return S.h(this, consumer);
    }

    public r0(long[] jArr, int i5, int i10, int i11) {
        this.f37938a = jArr;
        this.f37939b = i5;
        this.f37940c = i10;
        this.f37941d = i11 | 16448;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final a0 trySplit() {
        int i5 = this.f37939b;
        int i10 = (this.f37940c + i5) >>> 1;
        if (i5 >= i10) {
            return null;
        }
        this.f37939b = i10;
        return new r0(this.f37938a, i5, i10, this.f37941d);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i5;
        longConsumer.getClass();
        long[] jArr = this.f37938a;
        int length = jArr.length;
        int i10 = this.f37940c;
        if (length < i10 || (i5 = this.f37939b) < 0) {
            return;
        }
        this.f37939b = i10;
        if (i5 < i10) {
            do {
                longConsumer.accept(jArr[i5]);
                i5++;
            } while (i5 < i10);
        }
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i5 = this.f37939b;
        if (i5 < 0 || i5 >= this.f37940c) {
            return false;
        }
        this.f37939b = i5 + 1;
        longConsumer.accept(this.f37938a[i5]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37940c - this.f37939b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f37941d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (S.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
