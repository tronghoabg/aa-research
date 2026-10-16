package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zu {
    public long[] a;
    public int b;

    public zu(int i) {
        this.a = i == 0 ? defpackage.zy.a : new long[i];
    }

    public final void a(int i) {
        long[] jArr = this.a;
        int length = jArr.length;
        if (length < i) {
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, java.lang.Math.max(i, (length * 3) / 2));
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

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.zu) {
            defpackage.zu zuVar = (defpackage.zu) obj;
            int i = zuVar.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = zuVar.a;
                defpackage.afia afiaVarM = defpackage.afqt.m(0, i2);
                int i3 = afiaVarM.a;
                int i4 = afiaVarM.b;
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
        int iF = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iF += defpackage.a.f(jArr[i2]) * 31;
        }
        return iF;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        long[] jArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            if (i2 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            sb.append(j);
        }
        sb.append((java.lang.CharSequence) "]");
        return sb.toString();
    }
}
