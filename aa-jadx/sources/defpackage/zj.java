package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zj {
    public long[] a = defpackage.aav.a;
    public int[] b;
    public int[] c;
    public int d;
    public int e;
    private int f;

    public zj(int i) {
        int[] iArr = defpackage.zr.a;
        this.b = iArr;
        this.c = iArr;
        g(i);
    }

    private final int e(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (java.lang.Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void f() {
        this.f = defpackage.aav.a(this.d) - this.e;
    }

    private final void g(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            long[] jArr2 = defpackage.aav.a;
            iMax = java.lang.Math.max(7, (-1) >>> java.lang.Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.d = iMax;
        if (iMax == 0) {
            jArr = defpackage.aav.a;
        } else {
            int i2 = (iMax + 15) >> 3;
            long[] jArr3 = new long[i2];
            java.util.Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        f();
        this.b = new int[iMax];
        this.c = new int[iMax];
    }

    public final int a(int i) {
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = this.d;
        int i5 = (i3 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = j ^ (((long) (i3 & 127)) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final void b() {
        this.e = 0;
        if (this.a != defpackage.aav.a) {
            long[] jArr = this.a;
            int length = jArr.length;
            jArr.getClass();
            java.util.Arrays.fill(jArr, 0, length, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        f();
    }

    public final void c(int i, int i2) {
        long j;
        long j2;
        long j3;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int i3 = i;
        int i4 = -862048943;
        int i5 = i3 * (-862048943);
        int i6 = i5 ^ (i5 << 16);
        int i7 = i6 >>> 7;
        int i8 = this.d;
        int i9 = i7 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr2 = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j4 = jArr2[i11] >>> i12;
            long j5 = jArr2[i11 + 1] << (64 - i12);
            int i13 = i4;
            int i14 = i6;
            long j6 = i6 & 127;
            long j7 = (j5 & ((-i12) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            for (long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j9) >> 3) + i9) & i8;
                if (this.b[iNumberOfTrailingZeros] == i3) {
                    break loop0;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i7);
                if (this.f != 0 || ((this.a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i15 = this.d;
                    if (i15 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i15) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i16 = this.d;
                            int[] iArr = this.b;
                            int[] iArr2 = this.c;
                            int i17 = i16 + 7;
                            j2 = 255;
                            int i18 = 0;
                            while (i18 < (i17 >> 3)) {
                                long j10 = jArr3[i18] & (-9187201950435737472L);
                                jArr3[i18] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i18++;
                                i13 = i13;
                            }
                            int i19 = i13;
                            int iBG = defpackage.afga.bG(jArr3);
                            int i20 = iBG - 1;
                            long j11 = 72057594037927935L;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iBG] = jArr3[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr3[i22] >> i23) & 255;
                                if (j12 != 128 && j12 == 254) {
                                    int i24 = iArr[i21] * i19;
                                    int i25 = i24 ^ (i24 << 16);
                                    int i26 = i25 & 127;
                                    int i27 = i25 >>> 7;
                                    int iE2 = e(i27);
                                    int i28 = i27 & i16;
                                    long j13 = j11;
                                    long j14 = j6;
                                    long j15 = i26;
                                    if (((iE2 - i28) & i16) / 8 == ((i21 - i28) & i16) / 8) {
                                        jArr3[i22] = (j15 << i23) | ((~(255 << i23)) & jArr3[i22]);
                                        jArr3[defpackage.afga.bG(jArr3)] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                    } else {
                                        int i29 = iE2 >> 3;
                                        long j16 = jArr3[i29];
                                        int i30 = (iE2 & 7) << 3;
                                        long j17 = j15 << i30;
                                        long j18 = (~(255 << i30)) & j16;
                                        if (((j16 >> i30) & 255) == 128) {
                                            long j19 = ~(255 << i23);
                                            jArr3[i29] = j18 | j17;
                                            jArr3[i22] = (jArr3[i22] & j19) | (128 << i23);
                                            iArr[iE2] = iArr[i21];
                                            iArr[i21] = 0;
                                            iArr2[iE2] = iArr2[i21];
                                            iArr2[i21] = 0;
                                        } else {
                                            jArr3[i29] = j18 | j17;
                                            int i31 = iArr[iE2];
                                            iArr[iE2] = iArr[i21];
                                            iArr[i21] = i31;
                                            int i32 = iArr2[iE2];
                                            iArr2[iE2] = iArr2[i21];
                                            iArr2[i21] = i32;
                                            i21--;
                                        }
                                        jArr3[defpackage.afga.bG(jArr3)] = (jArr3[0] & j13) | Long.MIN_VALUE;
                                        i21++;
                                    }
                                    j11 = j13;
                                    j6 = j14;
                                } else {
                                    i21++;
                                }
                            }
                            j = j6;
                            f();
                        }
                        iE = e(i7);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    int iB = defpackage.aav.b(this.d);
                    long[] jArr4 = this.a;
                    int[] iArr3 = this.b;
                    int[] iArr4 = this.c;
                    int i33 = this.d;
                    g(iB);
                    long[] jArr5 = this.a;
                    int[] iArr5 = this.b;
                    int[] iArr6 = this.c;
                    int i34 = this.d;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr4[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            int i36 = iArr3[i35];
                            int i37 = i36 * i13;
                            int i38 = i37 ^ (i37 << 16);
                            int iE3 = e(i38 >>> 7);
                            int i39 = iE3 >> 3;
                            int i40 = (iE3 & 7) << 3;
                            jArr = jArr5;
                            long j20 = (jArr5[i39] & (~(255 << i40))) | (((long) (i38 & 127)) << i40);
                            jArr[i39] = j20;
                            jArr[(((iE3 - 7) & i34) + (i34 & 7)) >> 3] = j20;
                            iArr5[iE3] = i36;
                            iArr6[iE3] = iArr4[i35];
                        } else {
                            jArr = jArr5;
                        }
                        i35++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iE = e(i7);
                }
                this.e++;
                int i41 = this.f;
                long[] jArr6 = this.a;
                int i42 = iE >> 3;
                long j21 = jArr6[i42];
                int i43 = (iE & 7) << 3;
                this.f = i41 - (((j21 >> i43) & j2) != j3 ? 0 : 1);
                int i44 = this.d;
                long j22 = (j21 & (~(j2 << i43))) | (j << i43);
                jArr6[i42] = j22;
                jArr6[(((iE - 7) & i44) + (i44 & 7)) >> 3] = j22;
                iNumberOfTrailingZeros = ~iE;
                break;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
            i3 = i;
            i6 = i14;
            i4 = i13;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = i;
        this.c[iNumberOfTrailingZeros] = i2;
    }

    public final int d(int i) {
        int iA = a(i);
        if (iA >= 0) {
            return this.c[iA];
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0065 A[LOOP:0: B:14:0x0023->B:30:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[SYNTHETIC] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.zj)) {
            return false;
        }
        defpackage.zj zjVar = (defpackage.zj) obj;
        if (zjVar.e != this.e) {
            return false;
        }
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                int i6 = iArr[i5];
                                int i7 = iArr2[i5];
                                int iA = zjVar.a(i6);
                                if (iA < 0 || i7 != zjVar.c[iA]) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                            i3++;
                        } else if (i4 == 8) {
                            break;
                        }
                    }
                    if (i != length) {
                        i++;
                    }
                } else if (i != length) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i2 - length;
                int i5 = 0;
                while (true) {
                    i = 8 - ((~i4) >>> 31);
                    if (i5 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        i3 += iArr2[i6] ^ iArr[i6];
                    }
                    j >>= 8;
                    i5++;
                }
                if (i != 8) {
                    return i3;
                }
            }
            if (i2 == length) {
                return i3;
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[DONT_INVERT, PHI: r8
  0x0063: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:8:0x0029, B:18:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0065 A[LOOP:0: B:7:0x001b->B:20:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0068 A[EDGE_INSN: B:26:0x0068->B:21:0x0068 BREAK  A[LOOP:0: B:7:0x001b->B:20:0x0065], SYNTHETIC] */
    public final java.lang.String toString() {
        int i;
        if (this.e == 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i4 = i2 - length;
                    int i5 = 0;
                    while (true) {
                        i = 8 - ((~i4) >>> 31);
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr[i6];
                            int i8 = iArr2[i6];
                            sb.append(i7);
                            sb.append("=");
                            sb.append(i8);
                            i3++;
                            if (i3 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public zj() {
        int[] iArr = defpackage.zr.a;
        this.b = iArr;
        this.c = iArr;
    }
}
