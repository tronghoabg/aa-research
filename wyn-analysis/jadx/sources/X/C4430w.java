package x;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;
import y.AbstractC4517a;

/* renamed from: x.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4430w implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f47564a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f47565b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f47566c;

    public C4430w() {
        int i5;
        int i10 = 4;
        while (true) {
            i5 = 40;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (40 <= i11) {
                i5 = i11;
                break;
            }
            i10++;
        }
        int i12 = i5 / 4;
        this.f47564a = new int[i12];
        this.f47565b = new Object[i12];
    }

    public final void a(int i5, Object obj) {
        int i10 = this.f47566c;
        if (i10 != 0 && i5 <= this.f47564a[i10 - 1]) {
            d(i5, obj);
            return;
        }
        if (i10 >= this.f47564a.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f47564a, i14);
            AbstractC3340k.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f47564a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f47565b, i14);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f47565b = objArrCopyOf;
        }
        this.f47564a[i10] = i5;
        this.f47565b[i10] = obj;
        this.f47566c = i10 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4430w clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC3340k.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C4430w c4430w = (C4430w) objClone;
        c4430w.f47564a = (int[]) this.f47564a.clone();
        c4430w.f47565b = (Object[]) this.f47565b.clone();
        return c4430w;
    }

    public final Object c(int i5) {
        Object obj;
        int iA = AbstractC4517a.a(this.f47566c, i5, this.f47564a);
        if (iA < 0 || (obj = this.f47565b[iA]) == AbstractC4416i.f47513b) {
            return null;
        }
        return obj;
    }

    public final void d(int i5, Object obj) {
        int iA = AbstractC4517a.a(this.f47566c, i5, this.f47564a);
        if (iA >= 0) {
            this.f47565b[iA] = obj;
            return;
        }
        int i10 = ~iA;
        int i11 = this.f47566c;
        if (i10 < i11) {
            Object[] objArr = this.f47565b;
            if (objArr[i10] == AbstractC4416i.f47513b) {
                this.f47564a[i10] = i5;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f47564a.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f47564a, i15);
            AbstractC3340k.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f47564a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f47565b, i15);
            AbstractC3340k.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f47565b = objArrCopyOf;
        }
        int i16 = this.f47566c;
        if (i16 - i10 != 0) {
            int[] iArr = this.f47564a;
            int i17 = i10 + 1;
            ff.m.g0(i17, i10, i16, iArr, iArr);
            Object[] objArr2 = this.f47565b;
            ff.m.h0(objArr2, i17, objArr2, i10, this.f47566c);
        }
        this.f47564a[i10] = i5;
        this.f47565b[i10] = obj;
        this.f47566c++;
    }

    public final String toString() {
        int i5 = this.f47566c;
        if (i5 <= 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(i5 * 28);
        sb2.append('{');
        int i10 = this.f47566c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f47564a[i11]);
            sb2.append('=');
            Object obj = this.f47565b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC3340k.d(string, "buffer.toString()");
        return string;
    }
}
