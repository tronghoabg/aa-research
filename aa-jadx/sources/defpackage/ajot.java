package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajot {
    public int a;
    public java.lang.Object b;

    public ajot(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new long[16];
        this.a = 0;
    }

    private final void t(int i, int i2) {
        int[] iArr = (int[]) this.b;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = iArr[i4];
        int i6 = i2 + 1;
        iArr[i4] = iArr[i6];
        iArr[i6] = i5;
        int i7 = i + 2;
        int i8 = iArr[i7];
        int i9 = i2 + 2;
        iArr[i7] = iArr[i9];
        iArr[i9] = i8;
    }

    private final int[] u(int[] iArr) {
        int length = iArr.length;
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length + length);
        iArrCopyOf.getClass();
        this.b = iArrCopyOf;
        return iArrCopyOf;
    }

    public final defpackage.ajnv a() {
        return ((defpackage.ajnv[]) this.b)[1];
    }

    public final void b(int i, defpackage.ajnv ajnvVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            defpackage.ajnv[] ajnvVarArr = (defpackage.ajnv[]) this.b;
            defpackage.ajnv ajnvVar2 = ajnvVarArr[i2];
            ajnvVar2.getClass();
            if (defpackage.afga.c(0L, ajnvVar.j - ajnvVar2.j) <= 0) {
                break;
            }
            ajnvVar2.i = i;
            ajnvVarArr[i] = ajnvVar2;
            i = i2;
        }
        ((defpackage.ajnv[]) this.b)[i] = ajnvVar;
        ajnvVar.i = i;
    }

    public final void c(defpackage.ajnv ajnvVar) {
        defpackage.ajnv ajnvVar2;
        int i = ajnvVar.i;
        if (i == -1) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        int i2 = this.a;
        defpackage.ajnv[] ajnvVarArr = (defpackage.ajnv[]) this.b;
        defpackage.ajnv ajnvVar3 = ajnvVarArr[i2];
        ajnvVar3.getClass();
        ajnvVar.i = -1;
        ajnvVarArr[i2] = null;
        this.a = i2 - 1;
        if (ajnvVar == ajnvVar3) {
            return;
        }
        int iC = defpackage.afga.c(0L, ajnvVar3.j - ajnvVar.j);
        if (iC == 0) {
            ajnvVarArr[i] = ajnvVar3;
            ajnvVar3.i = i;
            return;
        }
        if (iC >= 0) {
            b(i, ajnvVar3);
            return;
        }
        while (true) {
            int i3 = i + i;
            int i4 = i3 + 1;
            int i5 = this.a;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                ajnvVar2 = ((defpackage.ajnv[]) this.b)[i3];
                ajnvVar2.getClass();
            } else {
                defpackage.ajnv[] ajnvVarArr2 = (defpackage.ajnv[]) this.b;
                ajnvVar2 = ajnvVarArr2[i3];
                ajnvVar2.getClass();
                defpackage.ajnv ajnvVar4 = ajnvVarArr2[i4];
                ajnvVar4.getClass();
                if (defpackage.afga.c(0L, ajnvVar4.j - ajnvVar2.j) >= 0) {
                    ajnvVar2 = ajnvVar4;
                }
            }
            if (defpackage.afga.c(0L, ajnvVar2.j - ajnvVar3.j) <= 0) {
                break;
            }
            int i6 = ajnvVar2.i;
            ajnvVar2.i = i;
            ((defpackage.ajnv[]) this.b)[i] = ajnvVar2;
            i = i6;
        }
        ((defpackage.ajnv[]) this.b)[i] = ajnvVar3;
        ajnvVar3.i = i;
    }

    public final void d(long j) {
        int i = this.a;
        int i2 = i + 1;
        long[] jArr = (long[]) this.b;
        int length = jArr.length;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = java.lang.Integer.highestOneBit(i);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
            }
            this.b = java.util.Arrays.copyOf(jArr, i3);
        }
        java.lang.Object obj = this.b;
        int i4 = this.a;
        ((long[]) obj)[i4] = j;
        this.a = i4 + 1;
    }

    public final void e(int i) {
        this.b = defpackage.xyn.h(java.lang.Integer.valueOf(i));
    }

    public final void f() {
        this.b = null;
        this.a = 0;
    }

    public final void g(defpackage.udx udxVar, int i) {
        this.b = udxVar;
        this.a = i;
    }

    public final defpackage.tsw h() {
        if (this.b == null || this.a == 0) {
            throw new java.lang.IllegalStateException();
        }
        return new defpackage.tsw((defpackage.abgl) this.b, this.a);
    }

    public final void i() {
        this.b = null;
        this.a = 0;
    }

    public final defpackage.lzp j() {
        int i;
        java.lang.Object obj = this.b;
        if (obj != null && (i = this.a) != 0) {
            return new defpackage.lzp((android.content.ComponentName) obj, i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" componentName");
        }
        if (this.a == 0) {
            sb.append(" state");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void k(android.content.ComponentName componentName) {
        if (componentName == null) {
            throw new java.lang.NullPointerException("Null componentName");
        }
        this.b = componentName;
    }

    public final int l(int i) {
        return ((int[]) this.b)[i];
    }

    public final int m() {
        java.lang.Object obj = this.b;
        int i = this.a - 1;
        this.a = i;
        return ((int[]) obj)[i];
    }

    public final void n(int i, int i2, int i3) {
        int i4 = this.a;
        int i5 = i4 + 3;
        java.lang.Object objU = this.b;
        int[] iArr = (int[]) objU;
        if (i5 >= iArr.length) {
            objU = u(iArr);
        }
        int[] iArr2 = (int[]) objU;
        iArr2[i4] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.a = i5;
    }

    public final void o(int i, int i2, int i3, int i4) {
        int i5 = this.a;
        int i6 = i5 + 4;
        java.lang.Object objU = this.b;
        int[] iArr = (int[]) objU;
        if (i6 >= iArr.length) {
            objU = u(iArr);
        }
        int[] iArr2 = (int[]) objU;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.a = i6;
    }

    public final void p(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = (int[]) this.b;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    t(i3, i4);
                }
            }
            t(i3 + 3, i2);
            p(i, i3);
            p(i3 + 6, i2);
        }
    }

    public final boolean q(long j) {
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.b)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public final void r(long j) {
        if (q(j)) {
            return;
        }
        int i = this.a;
        java.lang.Object objCopyOf = this.b;
        long[] jArr = (long[]) objCopyOf;
        int length = jArr.length;
        if (i >= length) {
            objCopyOf = java.util.Arrays.copyOf(jArr, java.lang.Math.max(i + 1, length + length));
            objCopyOf.getClass();
            this.b = objCopyOf;
        }
        ((long[]) objCopyOf)[i] = j;
        if (i >= this.a) {
            this.a = i + 1;
        }
    }

    public final void s(long j) {
        int i = this.a;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.b)[i2]) {
                int i3 = this.a - 1;
                while (i2 < i3) {
                    int i4 = i2 + 1;
                    long[] jArr = (long[]) this.b;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.a--;
                return;
            }
            i2++;
        }
    }

    public ajot(int i, com.google.android.gms.car.CarAudioConfiguration[] carAudioConfigurationArr) {
        this.a = i;
        this.b = carAudioConfigurationArr;
    }

    public ajot(byte[] bArr) {
        this.b = defpackage.xxe.a;
        this.a = 0;
    }

    public ajot() {
        this.b = new defpackage.ajnv[8];
    }

    public ajot(char[] cArr) {
    }

    public ajot(char[] cArr, char[] cArr2) {
        this.b = new long[2];
    }

    public ajot(int i) {
        this.a = 0;
        this.b = new long[i];
    }

    public ajot(int i, byte[] bArr) {
        this.b = new int[i];
    }
}
