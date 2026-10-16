package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class T2 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    int f38102a;

    /* renamed from: b, reason: collision with root package name */
    final int f38103b;

    /* renamed from: c, reason: collision with root package name */
    int f38104c;

    /* renamed from: d, reason: collision with root package name */
    final int f38105d;

    /* renamed from: e, reason: collision with root package name */
    Object[] f38106e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2938c3 f38107f;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.S.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.util.S.e(this, i5);
    }

    T2(C2938c3 c2938c3, int i5, int i10, int i11, int i12) {
        this.f38107f = c2938c3;
        this.f38102a = i5;
        this.f38103b = i10;
        this.f38104c = i11;
        this.f38105d = i12;
        Object[][] objArr = c2938c3.f38162f;
        this.f38106e = objArr == null ? c2938c3.f38161e : objArr[i5];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i5 = this.f38102a;
        int i10 = this.f38105d;
        int i11 = this.f38103b;
        if (i5 == i11) {
            return i10 - this.f38104c;
        }
        long[] jArr = this.f38107f.f38167d;
        return ((jArr[i11] + i10) - jArr[i5]) - this.f38104c;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i5 = this.f38102a;
        int i10 = this.f38103b;
        if (i5 >= i10 && (i5 != i10 || this.f38104c >= this.f38105d)) {
            return false;
        }
        Object[] objArr = this.f38106e;
        int i11 = this.f38104c;
        this.f38104c = i11 + 1;
        consumer.accept(objArr[i11]);
        if (this.f38104c == this.f38106e.length) {
            this.f38104c = 0;
            int i12 = this.f38102a + 1;
            this.f38102a = i12;
            Object[][] objArr2 = this.f38107f.f38162f;
            if (objArr2 != null && i12 <= i10) {
                this.f38106e = objArr2[i12];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        C2938c3 c2938c3;
        Objects.requireNonNull(consumer);
        int i5 = this.f38102a;
        int i10 = this.f38105d;
        int i11 = this.f38103b;
        if (i5 < i11 || (i5 == i11 && this.f38104c < i10)) {
            int i12 = this.f38104c;
            while (true) {
                c2938c3 = this.f38107f;
                if (i5 >= i11) {
                    break;
                }
                Object[] objArr = c2938c3.f38162f[i5];
                while (i12 < objArr.length) {
                    consumer.accept(objArr[i12]);
                    i12++;
                }
                i5++;
                i12 = 0;
            }
            Object[] objArr2 = this.f38102a == i11 ? this.f38106e : c2938c3.f38162f[i11];
            while (i12 < i10) {
                consumer.accept(objArr2[i12]);
                i12++;
            }
            this.f38102a = i11;
            this.f38104c = i10;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i5 = this.f38102a;
        int i10 = this.f38103b;
        if (i5 < i10) {
            int i11 = i10 - 1;
            int i12 = this.f38104c;
            C2938c3 c2938c3 = this.f38107f;
            T2 t22 = new T2(c2938c3, i5, i11, i12, c2938c3.f38162f[i11].length);
            this.f38102a = i10;
            this.f38104c = 0;
            this.f38106e = c2938c3.f38162f[i10];
            return t22;
        }
        if (i5 != i10) {
            return null;
        }
        int i13 = this.f38104c;
        int i14 = (this.f38105d - i13) / 2;
        if (i14 == 0) {
            return null;
        }
        Spliterator spliteratorL = Spliterators.l(this.f38106e, i13, i13 + i14);
        this.f38104c += i14;
        return spliteratorL;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
