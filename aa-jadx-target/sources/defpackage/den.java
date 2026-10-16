package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class den {
    public int a;
    public java.lang.Object b;
    public java.lang.Object c;

    public den() {
        this.b = new long[192];
        this.c = new long[192];
    }

    public final int a(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        java.lang.Object obj = this.b;
        int i8 = this.a;
        int i9 = i8 + 3;
        this.a = i9;
        long[] jArr = (long[]) obj;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = java.lang.Math.max(length + length, i9);
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, iMax);
            jArrCopyOf.getClass();
            this.b = jArrCopyOf;
            long[] jArrCopyOf2 = java.util.Arrays.copyOf((long[]) this.c, iMax);
            jArrCopyOf2.getClass();
            this.c = jArrCopyOf2;
        }
        int i10 = i & 33554431;
        long[] jArr2 = (long[]) this.b;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) i11) << 25) | ((long) i10);
        if (i6 == -1) {
            return i8;
        }
        int i12 = -4;
        if (i7 == -4) {
            defpackage.csc.c(defpackage.a.bm(i10, "Inserted child ", " without valid parent index"));
        } else {
            i12 = i7;
        }
        int i13 = i12 + 2;
        long j = jArr2[i13];
        if ((33554431 & ((int) j)) != i11) {
            defpackage.csc.c(defpackage.a.bz(i11, i10, "Inserted child ", " without valid parent index or parent ", " not found"));
        }
        long j2 = defpackage.deo.a;
        jArr2[i13] = ((-1151795604700004353L) & j) | (((long) java.lang.Math.min((i8 - i12) / 3, 1023)) << 50);
        return i8;
    }

    public final void b(int i, boolean z) {
        long[] jArr = (long[]) this.b;
        int i2 = i + 2;
        long j = jArr[i2] & 8070450532247928831L;
        long j2 = z ? 1L : 0L;
        jArr[i2] = j | (1152921504606846976L * j2) | (j2 * Long.MIN_VALUE);
    }

    public final void c(long j, int i, int i2, int i3) {
        long j2;
        char c;
        java.lang.Object obj;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            long j3 = defpackage.deo.a;
            long j4 = -1125899873288193L;
            int i4 = 33554431;
            java.lang.Object obj2 = this.b;
            java.lang.Object obj3 = this.c;
            int i5 = this.a;
            long[] jArr = (long[]) obj3;
            char c3 = 25;
            jArr[0] = (j & (-1125899873288193L)) | (((long) (i & 33554431)) << 25);
            int i6 = 1;
            while (i6 > 0) {
                i6--;
                long j5 = jArr[i6];
                int i7 = ((int) j5) & i4;
                int i8 = ((int) (j5 >> c3)) & i4;
                int i9 = ((int) (j5 >> c2)) & 1023;
                int i10 = i9 == 1023 ? i5 : (i9 * 3) + i8;
                while (i8 < i5 - 2 && i8 <= i10) {
                    int i11 = i8 + 3;
                    int i12 = i8 + 2;
                    long[] jArr2 = (long[]) obj2;
                    long j6 = jArr2[i12];
                    char c4 = c2;
                    int i13 = i4;
                    if ((((int) (j6 >> c3)) & i13) == i7) {
                        long j7 = jArr2[i8];
                        int i14 = i8 + 1;
                        j2 = j4;
                        long j8 = jArr2[i14];
                        c = c3;
                        obj = obj2;
                        jArr2[i8] = (((long) (((int) j7) + i3)) & 4294967295L) | (((long) (((int) (j7 >> 32)) + i2)) << 32);
                        jArr2[i14] = (((long) (((int) (j8 >> 32)) + i2)) << 32) | (((long) (((int) j8) + i3)) & 4294967295L);
                        jArr2[i12] = j6 | (((j6 >> 63) & 1) << 60);
                        if ((((int) (j6 >> c4)) & 1023) > 0) {
                            jArr[i6] = (j6 & j2) | (((long) (i11 & i13)) << c);
                            i6++;
                        }
                    } else {
                        j2 = j4;
                        c = c3;
                        obj = obj2;
                    }
                    c3 = c;
                    i4 = i13;
                    obj2 = obj;
                    i8 = i11;
                    c2 = c4;
                    j4 = j2;
                }
                c3 = c3;
                i4 = i4;
                obj2 = obj2;
                c2 = c2;
                j4 = j4;
            }
        }
    }

    public den(byte[] bArr) {
        this.b = new int[16];
        this.c = new defpackage.cdj[16];
    }
}
