package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import y.AbstractC4517a;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4415h implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f47508a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f47509b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f47510c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f47511d;

    public C4415h() {
        int i5;
        int i10 = 4;
        while (true) {
            i5 = 80;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (80 <= i11) {
                i5 = i11;
                break;
            }
            i10++;
        }
        int i12 = i5 / 8;
        this.f47509b = new long[i12];
        this.f47510c = new Object[i12];
    }

    public final void a(Long l10, long j8) {
        int i5 = this.f47511d;
        if (i5 != 0 && j8 <= this.f47509b[i5 - 1]) {
            g(j8, l10);
            return;
        }
        if (this.f47508a) {
            long[] jArr = this.f47509b;
            if (i5 >= jArr.length) {
                Object[] objArr = this.f47510c;
                int i10 = 0;
                for (int i11 = 0; i11 < i5; i11++) {
                    Object obj = objArr[i11];
                    if (obj != AbstractC4416i.f47512a) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f47508a = false;
                this.f47511d = i10;
            }
        }
        int i12 = this.f47511d;
        if (i12 >= this.f47509b.length) {
            int i13 = (i12 + 1) * 8;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f47509b, i16);
            AbstractC3340k.d(jArrCopyOf, "copyOf(this, newSize)");
            this.f47509b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f47510c, i16);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f47510c = objArrCopyOf;
        }
        this.f47509b[i12] = j8;
        this.f47510c[i12] = l10;
        this.f47511d = i12 + 1;
    }

    public final void b() {
        int i5 = this.f47511d;
        Object[] objArr = this.f47510c;
        for (int i10 = 0; i10 < i5; i10++) {
            objArr[i10] = null;
        }
        this.f47511d = 0;
        this.f47508a = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C4415h clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC3340k.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C4415h c4415h = (C4415h) objClone;
        c4415h.f47509b = (long[]) this.f47509b.clone();
        c4415h.f47510c = (Object[]) this.f47510c.clone();
        return c4415h;
    }

    public final Object d(long j8) {
        Object obj;
        int iB = AbstractC4517a.b(this.f47509b, this.f47511d, j8);
        if (iB < 0 || (obj = this.f47510c[iB]) == AbstractC4416i.f47512a) {
            return null;
        }
        return obj;
    }

    public final Object e(long j8) {
        Object obj;
        int iB = AbstractC4517a.b(this.f47509b, this.f47511d, j8);
        if (iB < 0 || (obj = this.f47510c[iB]) == AbstractC4416i.f47512a) {
            return -1L;
        }
        return obj;
    }

    public final long f(int i5) {
        int i10;
        if (i5 < 0 || i5 >= (i10 = this.f47511d)) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f47508a) {
            long[] jArr = this.f47509b;
            Object[] objArr = this.f47510c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC4416i.f47512a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f47508a = false;
            this.f47511d = i11;
        }
        return this.f47509b[i5];
    }

    public final void g(long j8, Object obj) {
        int iB = AbstractC4517a.b(this.f47509b, this.f47511d, j8);
        if (iB >= 0) {
            this.f47510c[iB] = obj;
            return;
        }
        int i5 = ~iB;
        int i10 = this.f47511d;
        Object obj2 = AbstractC4416i.f47512a;
        if (i5 < i10) {
            Object[] objArr = this.f47510c;
            if (objArr[i5] == obj2) {
                this.f47509b[i5] = j8;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f47508a) {
            long[] jArr = this.f47509b;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f47510c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f47508a = false;
                this.f47511d = i11;
                i5 = ~AbstractC4517a.b(this.f47509b, i11, j8);
            }
        }
        int i13 = this.f47511d;
        if (i13 >= this.f47509b.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f47509b, i17);
            AbstractC3340k.d(jArrCopyOf, "copyOf(this, newSize)");
            this.f47509b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f47510c, i17);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f47510c = objArrCopyOf;
        }
        int i18 = this.f47511d - i5;
        if (i18 != 0) {
            long[] jArr2 = this.f47509b;
            int i19 = i5 + 1;
            AbstractC3340k.e(jArr2, "<this>");
            System.arraycopy(jArr2, i5, jArr2, i19, i18);
            Object[] objArr3 = this.f47510c;
            ff.m.h0(objArr3, i19, objArr3, i5, this.f47511d);
        }
        this.f47509b[i5] = j8;
        this.f47510c[i5] = obj;
        this.f47511d++;
    }

    public final int h() {
        if (this.f47508a) {
            int i5 = this.f47511d;
            long[] jArr = this.f47509b;
            Object[] objArr = this.f47510c;
            int i10 = 0;
            for (int i11 = 0; i11 < i5; i11++) {
                Object obj = objArr[i11];
                if (obj != AbstractC4416i.f47512a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f47508a = false;
            this.f47511d = i10;
        }
        return this.f47511d;
    }

    public final Object j(int i5) {
        int i10;
        if (i5 < 0 || i5 >= (i10 = this.f47511d)) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f47508a) {
            long[] jArr = this.f47509b;
            Object[] objArr = this.f47510c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC4416i.f47512a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f47508a = false;
            this.f47511d = i11;
        }
        return this.f47510c[i5];
    }

    public final String toString() {
        if (h() <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f47511d * 28);
        sb2.append('{');
        int i5 = this.f47511d;
        for (int i10 = 0; i10 < i5; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(f(i10));
            sb2.append('=');
            Object objJ = j(i10);
            if (objJ != sb2) {
                sb2.append(objJ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC3340k.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
