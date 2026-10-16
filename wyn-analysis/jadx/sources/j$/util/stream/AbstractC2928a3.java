package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2928a3 implements j$.util.d0 {

    /* renamed from: a, reason: collision with root package name */
    int f38138a;

    /* renamed from: b, reason: collision with root package name */
    final int f38139b;

    /* renamed from: c, reason: collision with root package name */
    int f38140c;

    /* renamed from: d, reason: collision with root package name */
    final int f38141d;

    /* renamed from: e, reason: collision with root package name */
    Object f38142e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC2933b3 f38143f;

    abstract void a(int i5, Object obj, Object obj2);

    abstract j$.util.d0 b(Object obj, int i5, int i10);

    abstract j$.util.d0 c(int i5, int i10, int i11, int i12);

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

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    AbstractC2928a3(AbstractC2933b3 abstractC2933b3, int i5, int i10, int i11, int i12) {
        this.f38143f = abstractC2933b3;
        this.f38138a = i5;
        this.f38139b = i10;
        this.f38140c = i11;
        this.f38141d = i12;
        Object[] objArr = abstractC2933b3.f38157f;
        this.f38142e = objArr == null ? abstractC2933b3.f38156e : objArr[i5];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i5 = this.f38138a;
        int i10 = this.f38141d;
        int i11 = this.f38139b;
        if (i5 == i11) {
            return i10 - this.f38140c;
        }
        long[] jArr = this.f38143f.f38167d;
        return ((jArr[i11] + i10) - jArr[i5]) - this.f38140c;
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i5 = this.f38138a;
        int i10 = this.f38139b;
        if (i5 >= i10 && (i5 != i10 || this.f38140c >= this.f38141d)) {
            return false;
        }
        Object obj2 = this.f38142e;
        int i11 = this.f38140c;
        this.f38140c = i11 + 1;
        a(i11, obj2, obj);
        int i12 = this.f38140c;
        Object obj3 = this.f38142e;
        AbstractC2933b3 abstractC2933b3 = this.f38143f;
        if (i12 == abstractC2933b3.t(obj3)) {
            this.f38140c = 0;
            int i13 = this.f38138a + 1;
            this.f38138a = i13;
            Object[] objArr = abstractC2933b3.f38157f;
            if (objArr != null && i13 <= i10) {
                this.f38142e = objArr[i13];
            }
        }
        return true;
    }

    @Override // j$.util.d0
    public final void forEachRemaining(Object obj) {
        AbstractC2933b3 abstractC2933b3;
        Objects.requireNonNull(obj);
        int i5 = this.f38138a;
        int i10 = this.f38141d;
        int i11 = this.f38139b;
        if (i5 < i11 || (i5 == i11 && this.f38140c < i10)) {
            int i12 = this.f38140c;
            while (true) {
                abstractC2933b3 = this.f38143f;
                if (i5 >= i11) {
                    break;
                }
                Object obj2 = abstractC2933b3.f38157f[i5];
                abstractC2933b3.s(obj2, i12, abstractC2933b3.t(obj2), obj);
                i5++;
                i12 = 0;
            }
            abstractC2933b3.s(this.f38138a == i11 ? this.f38142e : abstractC2933b3.f38157f[i11], i12, i10, obj);
            this.f38138a = i11;
            this.f38140c = i10;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        int i5 = this.f38138a;
        int i10 = this.f38139b;
        if (i5 < i10) {
            int i11 = i10 - 1;
            int i12 = this.f38140c;
            AbstractC2933b3 abstractC2933b3 = this.f38143f;
            j$.util.d0 d0VarC = c(i5, i11, i12, abstractC2933b3.t(abstractC2933b3.f38157f[i11]));
            this.f38138a = i10;
            this.f38140c = 0;
            this.f38142e = abstractC2933b3.f38157f[i10];
            return d0VarC;
        }
        if (i5 != i10) {
            return null;
        }
        int i13 = this.f38140c;
        int i14 = (this.f38141d - i13) / 2;
        if (i14 == 0) {
            return null;
        }
        j$.util.d0 d0VarB = b(this.f38142e, i13, i14);
        this.f38140c += i14;
        return d0VarB;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a0 trySplit() {
        return (j$.util.a0) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.V trySplit() {
        return (j$.util.V) trySplit();
    }
}
