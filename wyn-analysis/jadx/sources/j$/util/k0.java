package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class k0 implements V {

    /* renamed from: a, reason: collision with root package name */
    private final double[] f37919a;

    /* renamed from: b, reason: collision with root package name */
    private int f37920b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37921c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37922d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        S.a(this, consumer);
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
        return S.f(this, consumer);
    }

    public k0(double[] dArr, int i5, int i10, int i11) {
        this.f37919a = dArr;
        this.f37920b = i5;
        this.f37921c = i10;
        this.f37922d = i11 | 16448;
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public final V trySplit() {
        int i5 = this.f37920b;
        int i10 = (this.f37921c + i5) >>> 1;
        if (i5 >= i10) {
            return null;
        }
        this.f37920b = i10;
        return new k0(this.f37919a, i5, i10, this.f37922d);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i5;
        doubleConsumer.getClass();
        double[] dArr = this.f37919a;
        int length = dArr.length;
        int i10 = this.f37921c;
        if (length < i10 || (i5 = this.f37920b) < 0) {
            return;
        }
        this.f37920b = i10;
        if (i5 < i10) {
            do {
                doubleConsumer.accept(dArr[i5]);
                i5++;
            } while (i5 < i10);
        }
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i5 = this.f37920b;
        if (i5 < 0 || i5 >= this.f37921c) {
            return false;
        }
        this.f37920b = i5 + 1;
        doubleConsumer.accept(this.f37919a[i5]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37921c - this.f37920b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f37922d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (S.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
