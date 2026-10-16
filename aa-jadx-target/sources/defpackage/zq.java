package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zq {
    public long[] a = defpackage.aav.a;
    public int[] b = defpackage.zr.a;
    public int c;
    public int d;
    private int e;

    public zq(int i) {
        if (i < 0) {
            defpackage.ca.Y("Capacity must be a positive value.");
        }
        h(defpackage.aav.c(i));
    }

    private final int f(int i) {
        int i2 = this.c;
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

    private final void g() {
        this.e = defpackage.aav.a(this.c) - this.d;
    }

    private final void h(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            long[] jArr2 = defpackage.aav.a;
            iMax = java.lang.Math.max(7, (-1) >>> java.lang.Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.c = iMax;
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
        g();
        this.b = new int[iMax];
    }

    public final boolean a(int i) {
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = this.c;
        int i5 = (i3 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            int i9 = i6;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    if (iNumberOfTrailingZeros >= 0) {
                        return true;
                    }
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                break;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
        }
        return false;
    }

    public final void b() {
        this.d = 0;
        if (this.a != defpackage.aav.a) {
            defpackage.afga.co(this.a, -9187201950435737472L);
            long[] jArr = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        g();
    }

    public final void c(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.c;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
    }

    public final boolean d(int i) {
        boolean z;
        long j;
        long j2;
        long j3;
        int iF;
        long[] jArr;
        int i2 = i;
        int i3 = -862048943;
        int i4 = i2 * (-862048943);
        int i5 = i4 ^ (i4 << 16);
        int i6 = this.d;
        int i7 = i5 >>> 7;
        int i8 = this.c;
        int i9 = i7 & i8;
        int i10 = 0;
        loop0: while (true) {
            long[] jArr2 = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j4 = jArr2[i11] >>> i12;
            long j5 = jArr2[i11 + 1] << (64 - i12);
            int i13 = i3;
            int i14 = i5;
            long j6 = i5 & 127;
            long j7 = (j5 & ((-i12) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            for (long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                iF = ((java.lang.Long.numberOfTrailingZeros(j9) >> 3) + i9) & i8;
                z = false;
                if (this.b[iF] == i2) {
                    break loop0;
                }
            }
            z = false;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int iF2 = f(i7);
                long j10 = 255;
                if (this.e != 0 || ((this.a[iF2 >> 3] >> ((iF2 & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                    iF = iF2;
                } else {
                    int i15 = this.c;
                    if (i15 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((((long) this.d) * 32) ^ Long.MIN_VALUE, (((long) i15) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i16 = this.c;
                            int[] iArr = this.b;
                            int i17 = i16 + 7;
                            int i18 = 0;
                            while (i18 < (i17 >> 3)) {
                                long j11 = j10;
                                long j12 = jArr3[i18] & (-9187201950435737472L);
                                jArr3[i18] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i18++;
                                i13 = i13;
                                j10 = j11;
                            }
                            j2 = j10;
                            int i19 = i13;
                            int iBG = defpackage.afga.bG(jArr3);
                            int i20 = iBG - 1;
                            long j13 = 72057594037927935L;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iBG] = jArr3[0];
                            int i21 = 0;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j14 = (jArr3[i22] >> i23) & j2;
                                if (j14 != 128 && j14 == 254) {
                                    int i24 = iArr[i21] * i19;
                                    int i25 = i24 ^ (i24 << 16);
                                    int i26 = i25 & 127;
                                    int i27 = i25 >>> 7;
                                    int iF3 = f(i27);
                                    int i28 = i27 & i16;
                                    int i29 = i19;
                                    long j15 = j13;
                                    long j16 = i26;
                                    if (((iF3 - i28) & i16) / 8 == ((i21 - i28) & i16) / 8) {
                                        jArr3[i22] = (jArr3[i22] & (~(j2 << i23))) | (j16 << i23);
                                        jArr3[defpackage.afga.bG(jArr3)] = (jArr3[0] & j15) | Long.MIN_VALUE;
                                        i21++;
                                        i19 = i29;
                                        j13 = j15;
                                    } else {
                                        int i30 = iF3 >> 3;
                                        long j17 = jArr3[i30];
                                        int i31 = (iF3 & 7) << 3;
                                        long j18 = j16 << i31;
                                        long j19 = j6;
                                        long j20 = (~(j2 << i31)) & j17;
                                        if (((j17 >> i31) & j2) == 128) {
                                            long j21 = ~(j2 << i23);
                                            jArr3[i30] = j20 | j18;
                                            jArr3[i22] = (jArr3[i22] & j21) | (128 << i23);
                                            iArr[iF3] = iArr[i21];
                                            iArr[i21] = 0;
                                        } else {
                                            jArr3[i30] = j20 | j18;
                                            int i32 = iArr[iF3];
                                            iArr[iF3] = iArr[i21];
                                            iArr[i21] = i32;
                                            i21--;
                                        }
                                        jArr3[defpackage.afga.bG(jArr3)] = (jArr3[0] & j15) | Long.MIN_VALUE;
                                        i21++;
                                        i19 = i29;
                                        j13 = j15;
                                        j6 = j19;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            j = j6;
                            g();
                        }
                        iF = f(i7);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    int iB = defpackage.aav.b(this.c);
                    long[] jArr4 = this.a;
                    int[] iArr2 = this.b;
                    int i33 = this.c;
                    h(iB);
                    long[] jArr5 = this.a;
                    int[] iArr3 = this.b;
                    int i34 = this.c;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr4[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            int i36 = iArr2[i35];
                            int i37 = i36 * i13;
                            int i38 = i37 ^ (i37 << 16);
                            int iF4 = f(i38 >>> 7);
                            int i39 = iF4 >> 3;
                            int i40 = (iF4 & 7) << 3;
                            jArr = jArr5;
                            long j22 = (jArr5[i39] & (~(255 << i40))) | (((long) (i38 & 127)) << i40);
                            jArr[i39] = j22;
                            jArr[(((iF4 - 7) & i34) + (i34 & 7)) >> 3] = j22;
                            iArr3[iF4] = i36;
                        } else {
                            jArr = jArr5;
                        }
                        i35++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iF = f(i7);
                }
                this.d++;
                int i41 = this.e;
                long[] jArr6 = this.a;
                int i42 = iF >> 3;
                long j23 = jArr6[i42];
                int i43 = (iF & 7) << 3;
                this.e = i41 - (((j23 >> i43) & j2) == j3 ? 1 : 0);
                int i44 = this.c;
                long j24 = (j23 & (~(j2 << i43))) | (j << i43);
                jArr6[i42] = j24;
                jArr6[(((iF - 7) & i44) + (i44 & 7)) >> 3] = j24;
                break;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
            i2 = i;
            i5 = i14;
            i3 = i13;
        }
        this.b[iF] = i;
        if (this.d != i6) {
            return true;
        }
        return z;
    }

    public final boolean e(int i) {
        int iNumberOfTrailingZeros;
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = this.c;
        int i5 = (i3 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            int i9 = i6;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            c(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b A[LOOP:0: B:14:0x0021->B:28:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x005e A[SYNTHETIC] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.zq)) {
            return false;
        }
        defpackage.zq zqVar = (defpackage.zq) obj;
        if (zqVar.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128 && !zqVar.a(iArr[(i << 3) + i3])) {
                                return false;
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
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.b;
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
                        i3 += iArr[(i2 << 3) + i5];
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

    /* JADX WARN: Code duplicated, block: B:22:0x005c A[LOOP:0: B:5:0x0015->B:22:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005f A[EDGE_INSN: B:27:0x005f->B:23:0x005f BREAK  A[LOOP:0: B:5:0x0015->B:22:0x005c], SYNTHETIC] */
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = i - length;
                    int i4 = 0;
                    while (true) {
                        int i5 = 8 - ((~i3) >>> 31);
                        if (i4 >= i5) {
                            if (i5 != 8) {
                                break;
                            }
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = iArr[(i << 3) + i4];
                            if (i2 != 0) {
                                sb.append((java.lang.CharSequence) ", ");
                            }
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) "...");
                                break loop0;
                            }
                            sb.append(i6);
                            i2++;
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append((java.lang.CharSequence) "]");
        return sb.toString();
    }

    public zq() {
    }
}
