package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class c7 implements j$.util.a1 {

    /* renamed from: a, reason: collision with root package name */
    public int f50353a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50354b;

    /* renamed from: c, reason: collision with root package name */
    public int f50355c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50356d;

    /* renamed from: e, reason: collision with root package name */
    public Object f50357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d7 f50358f;

    public c7(d7 d7Var, int i2, int i3, int i4, int i5) {
        this.f50358f = d7Var;
        this.f50353a = i2;
        this.f50354b = i3;
        this.f50355c = i4;
        this.f50356d = i5;
        Object[] objArr = d7Var.f50381f;
        this.f50357e = objArr == null ? d7Var.f50380e : objArr[i2];
    }

    public abstract void a(int i2, Object obj, Object obj2);

    public abstract j$.util.a1 b(Object obj, int i2, int i3);

    public abstract j$.util.a1 c(int i2, int i3, int i4, int i5);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i2 = this.f50353a;
        int i3 = this.f50356d;
        int i4 = this.f50354b;
        if (i2 == i4) {
            return i3 - this.f50355c;
        }
        long[] jArr = this.f50358f.f50345d;
        return ((jArr[i4] + i3) - jArr[i2]) - this.f50355c;
    }

    @Override // j$.util.a1
    public final void forEachRemaining(Object obj) {
        d7 d7Var;
        Objects.requireNonNull(obj);
        int i2 = this.f50353a;
        int i3 = this.f50356d;
        int i4 = this.f50354b;
        if (i2 < i4 || (i2 == i4 && this.f50355c < i3)) {
            int i5 = this.f50355c;
            while (true) {
                d7Var = this.f50358f;
                if (i2 >= i4) {
                    break;
                }
                Object obj2 = d7Var.f50381f[i2];
                d7Var.w(obj2, i5, d7Var.x(obj2), obj);
                i2++;
                i5 = 0;
            }
            d7Var.w(this.f50353a == i4 ? this.f50357e : d7Var.f50381f[i4], i5, i3, obj);
            this.f50353a = i4;
            this.f50355c = i3;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
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
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i2 = this.f50353a;
        int i3 = this.f50354b;
        if (i2 >= i3 && (i2 != i3 || this.f50355c >= this.f50356d)) {
            return false;
        }
        Object obj2 = this.f50357e;
        int i4 = this.f50355c;
        this.f50355c = i4 + 1;
        a(i4, obj2, obj);
        int i5 = this.f50355c;
        Object obj3 = this.f50357e;
        d7 d7Var = this.f50358f;
        if (i5 == d7Var.x(obj3)) {
            this.f50355c = 0;
            int i6 = this.f50353a + 1;
            this.f50353a = i6;
            Object[] objArr = d7Var.f50381f;
            if (objArr != null && i6 <= i3) {
                this.f50357e = objArr[i6];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final j$.util.a1 trySplit() {
        int i2 = this.f50353a;
        int i3 = this.f50354b;
        if (i2 < i3) {
            int i4 = i3 - 1;
            int i5 = this.f50355c;
            d7 d7Var = this.f50358f;
            j$.util.a1 a1VarC = c(i2, i4, i5, d7Var.x(d7Var.f50381f[i4]));
            this.f50353a = i3;
            this.f50355c = 0;
            this.f50357e = d7Var.f50381f[i3];
            return a1VarC;
        }
        if (i2 != i3) {
            return null;
        }
        int i6 = this.f50355c;
        int i7 = (this.f50356d - i6) / 2;
        if (i7 == 0) {
            return null;
        }
        j$.util.a1 a1VarB = b(this.f50357e, i6, i7);
        this.f50355c += i7;
        return a1VarB;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.a1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.a1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.x0 trySplit() {
        return (j$.util.x0) trySplit();
    }

    @Override // j$.util.a1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.s0 trySplit() {
        return (j$.util.s0) trySplit();
    }
}
