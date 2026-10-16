package x;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: x.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4419l {

    /* renamed from: a, reason: collision with root package name */
    public int[] f47520a = new int[16];

    /* renamed from: b, reason: collision with root package name */
    public int f47521b;

    public final void a(int i5) {
        int i10 = this.f47521b + 1;
        int[] iArr = this.f47520a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            AbstractC3340k.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f47520a = iArrCopyOf;
        }
        int[] iArr2 = this.f47520a;
        int i11 = this.f47521b;
        iArr2[i11] = i5;
        this.f47521b = i11 + 1;
    }

    public final int b(int i5) {
        if (i5 >= 0 && i5 < this.f47521b) {
            return this.f47520a[i5];
        }
        StringBuilder sbL = pd.f.l(i5, "Index ", " must be in 0..");
        sbL.append(this.f47521b - 1);
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    public final int c(int i5) {
        int i10;
        if (i5 < 0 || i5 >= (i10 = this.f47521b)) {
            StringBuilder sbL = pd.f.l(i5, "Index ", " must be in 0..");
            sbL.append(this.f47521b - 1);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        int[] iArr = this.f47520a;
        int i11 = iArr[i5];
        if (i5 != i10 - 1) {
            ff.m.g0(i5, i5 + 1, i10, iArr, iArr);
        }
        this.f47521b--;
        return i11;
    }

    public final void d(int i5, int i10) {
        if (i5 < 0 || i5 >= this.f47521b) {
            StringBuilder sbL = pd.f.l(i5, "set index ", " must be between 0 .. ");
            sbL.append(this.f47521b - 1);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        int[] iArr = this.f47520a;
        int i11 = iArr[i5];
        iArr[i5] = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4419l) {
            C4419l c4419l = (C4419l) obj;
            int i5 = c4419l.f47521b;
            int i10 = this.f47521b;
            if (i5 == i10) {
                int[] iArr = this.f47520a;
                int[] iArr2 = c4419l.f47520a;
                zf.g gVarU0 = android.support.v4.media.session.b.u0(0, i10);
                int i11 = gVarU0.f48500a;
                int i12 = gVarU0.f48501b;
                if (i11 > i12) {
                    return true;
                }
                while (iArr[i11] == iArr2[i11]) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f47520a;
        int i5 = this.f47521b;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            i10 += iArr[i11] * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f47520a;
        int i5 = this.f47521b;
        int i10 = 0;
        while (true) {
            if (i10 >= i5) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i11 = iArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i11);
            i10++;
        }
        String string = sb2.toString();
        AbstractC3340k.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
