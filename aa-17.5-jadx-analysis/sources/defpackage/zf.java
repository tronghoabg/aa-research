package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zf {
    public int[] a;
    public int b;

    public zf(int i) {
        this.a = i == 0 ? zk.a : new int[i];
    }

    public final int a(int i) {
        if (i < 0 || i >= this.b) {
            ca.aa("Index must be between 0 and size");
        }
        return this.a[i];
    }

    public final int b() {
        if (this.b == 0) {
            ca.ab("IntList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final void c(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (length * 3) / 2));
            iArrCopyOf.getClass();
            this.a = iArrCopyOf;
        }
    }

    public final void d() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        int[] iArr = this.a;
        iArr.getClass();
        Arrays.sort(iArr, 0, i);
    }

    public final void e(int i) {
        c(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zf) {
            zf zfVar = (zf) obj;
            int i = zfVar.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = zfVar.a;
                afha afhaVarM = afpt.m(0, i2);
                int i3 = afhaVarM.a;
                int i4 = afhaVarM.b;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
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

    public final void f(int i) {
        if (i < 0 || i >= this.b) {
            ca.aa("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i2 = iArr[i];
        int i3 = this.b;
        if (i != i3 - 1) {
            int i4 = i + 1;
            iArr.getClass();
            iArr.getClass();
            System.arraycopy(iArr, i4, iArr, i, i3 - i4);
        }
        this.b--;
    }

    public final void g(int i, int i2) {
        if (i < 0 || i >= this.b) {
            ca.aa("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            int i3 = iArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(i3);
            i2++;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
