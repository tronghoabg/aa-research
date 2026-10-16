package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zn {
    public long[] a;
    public int b;

    public zn(int i) {
        this.a = i == 0 ? zr.a : new long[i];
    }

    public final void a(int i) {
        long[] jArr = this.a;
        int length = jArr.length;
        if (length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i, (length * 3) / 2));
            jArrCopyOf.getClass();
            this.a = jArrCopyOf;
        }
    }

    public final void b(long j) {
        a(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        jArr[i] = j;
        this.b = i + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zn) {
            zn znVar = (zn) obj;
            int i = znVar.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = znVar.a;
                afha afhaVarM = afpt.m(0, i2);
                int i3 = afhaVarM.a;
                int i4 = afhaVarM.b;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iG = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iG += a.g(jArr[i2]) * 31;
        }
        return iG;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long j = jArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(j);
            i2++;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
