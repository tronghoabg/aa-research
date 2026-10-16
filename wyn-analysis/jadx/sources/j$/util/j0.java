package j$.util;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class j0 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f37913a;

    /* renamed from: b, reason: collision with root package name */
    private int f37914b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37915c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37916d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return S.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return S.e(this, i5);
    }

    public j0(Object[] objArr, int i5, int i10, int i11) {
        this.f37913a = objArr;
        this.f37914b = i5;
        this.f37915c = i10;
        this.f37916d = i11 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i5 = this.f37914b;
        int i10 = (this.f37915c + i5) >>> 1;
        if (i5 >= i10) {
            return null;
        }
        this.f37914b = i10;
        return new j0(this.f37913a, i5, i10, this.f37916d);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i5;
        consumer.getClass();
        Object[] objArr = this.f37913a;
        int length = objArr.length;
        int i10 = this.f37915c;
        if (length < i10 || (i5 = this.f37914b) < 0) {
            return;
        }
        this.f37914b = i10;
        if (i5 < i10) {
            do {
                consumer.accept(objArr[i5]);
                i5++;
            } while (i5 < i10);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i5 = this.f37914b;
        if (i5 < 0 || i5 >= this.f37915c) {
            return false;
        }
        this.f37914b = i5 + 1;
        consumer.accept(this.f37913a[i5]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f37915c - this.f37914b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f37916d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (S.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
