package j$.util.stream;

import com.waze.strings.DisplayStrings;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class v6 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public int f50644a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50645b;

    /* renamed from: c, reason: collision with root package name */
    public int f50646c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50647d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f50648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e7 f50649f;

    public v6(e7 e7Var, int i2, int i3, int i4, int i5) {
        this.f50649f = e7Var;
        this.f50644a = i2;
        this.f50645b = i3;
        this.f50646c = i4;
        this.f50647d = i5;
        Object[][] objArr = e7Var.f50391f;
        this.f50648e = objArr == null ? e7Var.f50390e : objArr[i2];
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i2 = this.f50644a;
        int i3 = this.f50647d;
        int i4 = this.f50645b;
        if (i2 == i4) {
            return i3 - this.f50646c;
        }
        long[] jArr = this.f50649f.f50345d;
        return ((jArr[i4] + i3) - jArr[i2]) - this.f50646c;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        e7 e7Var;
        Objects.requireNonNull(consumer);
        int i2 = this.f50644a;
        int i3 = this.f50647d;
        int i4 = this.f50645b;
        if (i2 < i4 || (i2 == i4 && this.f50646c < i3)) {
            int i5 = this.f50646c;
            while (true) {
                e7Var = this.f50649f;
                if (i2 >= i4) {
                    break;
                }
                Object[] objArr = e7Var.f50391f[i2];
                while (i5 < objArr.length) {
                    consumer.u(objArr[i5]);
                    i5++;
                }
                i2++;
                i5 = 0;
            }
            Object[] objArr2 = this.f50644a == i4 ? this.f50648e : e7Var.f50391f[i4];
            while (i5 < i3) {
                consumer.u(objArr2[i5]);
                i5++;
            }
            this.f50644a = i4;
            this.f50646c = i3;
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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i2 = this.f50644a;
        int i3 = this.f50645b;
        if (i2 >= i3 && (i2 != i3 || this.f50646c >= this.f50647d)) {
            return false;
        }
        Object[] objArr = this.f50648e;
        int i4 = this.f50646c;
        this.f50646c = i4 + 1;
        consumer.u(objArr[i4]);
        if (this.f50646c == this.f50648e.length) {
            this.f50646c = 0;
            int i5 = this.f50644a + 1;
            this.f50644a = i5;
            Object[][] objArr2 = this.f50649f.f50391f;
            if (objArr2 != null && i5 <= i3) {
                this.f50648e = objArr2[i5];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i2 = this.f50644a;
        int i3 = this.f50645b;
        if (i2 < i3) {
            int i4 = i3 - 1;
            int i5 = this.f50646c;
            e7 e7Var = this.f50649f;
            v6 v6Var = new v6(e7Var, i2, i4, i5, e7Var.f50391f[i4].length);
            this.f50644a = i3;
            this.f50646c = 0;
            this.f50648e = e7Var.f50391f[i3];
            return v6Var;
        }
        if (i2 != i3) {
            return null;
        }
        int i6 = this.f50646c;
        int i7 = (this.f50647d - i6) / 2;
        if (i7 == 0) {
            return null;
        }
        j$.util.h1 h1VarB = Spliterators.b(this.f50648e, i6, i6 + i7, DisplayStrings.DS_LOG_OUT);
        this.f50646c += i7;
        return h1VarB;
    }
}
