package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zm {
    public int[] a;
    public int b;

    public zm(int i) {
        this.a = i == 0 ? defpackage.zr.a : new int[i];
    }

    public final int a(int i) {
        if (i < 0 || i >= this.b) {
            defpackage.ca.aa("Index must be between 0 and size");
        }
        return this.a[i];
    }

    public final int b() {
        if (this.b == 0) {
            defpackage.ca.ab("IntList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final void c(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (length < i) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, java.lang.Math.max(i, (length * 3) / 2));
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
        java.util.Arrays.sort(iArr, 0, i);
    }

    public final void e(int i) {
        c(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.zm) {
            defpackage.zm zmVar = (defpackage.zm) obj;
            int i = zmVar.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = zmVar.a;
                defpackage.afia afiaVarM = defpackage.afqt.m(0, i2);
                int i3 = afiaVarM.a;
                int i4 = afiaVarM.b;
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
            defpackage.ca.aa("Index must be between 0 and size");
        }
        int[] iArr = this.a;
        int i2 = iArr[i];
        int i3 = this.b;
        if (i != i3 - 1) {
            int i4 = i + 1;
            iArr.getClass();
            iArr.getClass();
            java.lang.System.arraycopy(iArr, i4, iArr, i, i3 - i4);
        }
        this.b--;
    }

    public final void g(int i, int i2) {
        if (i < 0 || i >= this.b) {
            defpackage.ca.aa("Index must be between 0 and size");
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

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        int[] iArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i2 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            sb.append(i3);
        }
        sb.append((java.lang.CharSequence) "]");
        return sb.toString();
    }
}
