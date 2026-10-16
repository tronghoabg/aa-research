package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zo {
    public long[] a = defpackage.aav.a;
    public int[] b = defpackage.zr.a;
    public java.lang.Object[] c = defpackage.abg.c;
    public int d;
    public int e;
    private int f;

    public zo(int i) {
        if (i < 0) {
            defpackage.ca.Y("Capacity must be a positive value.");
        }
        k(defpackage.aav.c(i));
    }

    private final int i(int i) {
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

    private final void j() {
        this.f = defpackage.aav.a(this.d) - this.e;
    }

    private final void k(int i) {
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
        j();
        this.b = new int[iMax];
        this.c = new java.lang.Object[iMax];
    }

    public final java.lang.Object a(int i) {
        int iNumberOfTrailingZeros;
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = this.d;
        int i5 = (i3 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = j ^ (((long) (i3 & 127)) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final boolean b(int i) {
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = this.d;
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

    public final int c(int i) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i2 = -862048943;
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        int i6 = this.d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = jArr2[i9] >>> i10;
            long j5 = jArr2[i9 + 1] << (64 - i10);
            int i11 = i2;
            int i12 = i4;
            long j6 = i4 & 127;
            long j7 = (j5 & ((-i10) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            for (long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j9) >> 3) + i7) & i6;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            long j10 = j7 & ((~j7) << 6) & (-9187201950435737472L);
            char c = '\b';
            if (j10 != 0) {
                int i13 = i(i5);
                long j11 = 255;
                if (this.f != 0 || ((this.a[i13 >> 3] >> ((i13 & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    j3 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i14) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i15 = this.d;
                            int[] iArr = this.b;
                            java.lang.Object[] objArr = this.c;
                            int i16 = i15 + 7;
                            int i17 = 0;
                            while (i17 < (i16 >> 3)) {
                                char c2 = c;
                                long j12 = jArr3[i17] & (-9187201950435737472L);
                                jArr3[i17] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i17++;
                                i16 = i16;
                                i11 = i11;
                                c = c2;
                                j11 = j11;
                            }
                            j2 = j11;
                            int i18 = i11;
                            int iBG = defpackage.afga.bG(jArr3);
                            int i19 = iBG - 1;
                            jArr3[i19] = (jArr3[i19] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iBG] = jArr3[0];
                            int i20 = 0;
                            while (i20 != i15) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j13 = (jArr3[i21] >> i22) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    int i23 = iArr[i20] * i18;
                                    int i24 = i23 ^ (i23 << 16);
                                    int i25 = i24 & 127;
                                    int i26 = i24 >>> 7;
                                    int i27 = i(i26);
                                    int i28 = i26 & i15;
                                    int i29 = i18;
                                    long j14 = j6;
                                    long[] jArr4 = jArr3;
                                    long j15 = i25;
                                    if (((i27 - i28) & i15) / 8 == ((i20 - i28) & i15) / 8) {
                                        jArr4[i21] = (j15 << i22) | ((~(j2 << i22)) & jArr4[i21]);
                                        jArr4[defpackage.afga.bG(jArr4)] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i20++;
                                    } else {
                                        int i30 = i27 >> 3;
                                        long j16 = jArr4[i30];
                                        int i31 = (i27 & 7) << 3;
                                        long j17 = j15 << i31;
                                        long j18 = (~(j2 << i31)) & j16;
                                        if (((j16 >> i31) & j2) == 128) {
                                            long j19 = ~(j2 << i22);
                                            jArr4[i30] = j18 | j17;
                                            jArr4[i21] = (jArr4[i21] & j19) | (128 << i22);
                                            iArr[i27] = iArr[i20];
                                            iArr[i20] = 0;
                                            objArr[i27] = objArr[i20];
                                            objArr[i20] = null;
                                        } else {
                                            jArr4[i30] = j18 | j17;
                                            int i32 = iArr[i27];
                                            iArr[i27] = iArr[i20];
                                            iArr[i20] = i32;
                                            java.lang.Object obj = objArr[i27];
                                            objArr[i27] = objArr[i20];
                                            objArr[i20] = obj;
                                            i20--;
                                        }
                                        jArr4[defpackage.afga.bG(jArr4)] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i20++;
                                    }
                                    jArr3 = jArr4;
                                    i18 = i29;
                                    j6 = j14;
                                } else {
                                    i20++;
                                }
                            }
                            j = j6;
                            j();
                        }
                        i13 = i(i5);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    int iB = defpackage.aav.b(this.d);
                    long[] jArr5 = this.a;
                    int[] iArr2 = this.b;
                    java.lang.Object[] objArr2 = this.c;
                    int i33 = this.d;
                    k(iB);
                    long[] jArr6 = this.a;
                    int[] iArr3 = this.b;
                    java.lang.Object[] objArr3 = this.c;
                    int i34 = this.d;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr5[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            int i36 = iArr2[i35];
                            int i37 = i36 * i11;
                            int i38 = i37 ^ (i37 << 16);
                            int i39 = i(i38 >>> 7);
                            int i40 = i39 >> 3;
                            int i41 = (i39 & 7) << 3;
                            jArr = jArr6;
                            long j20 = (jArr6[i40] & (~(255 << i41))) | (((long) (i38 & 127)) << i41);
                            jArr[i40] = j20;
                            jArr[(((i39 - 7) & i34) + (i34 & 7)) >> 3] = j20;
                            iArr3[i39] = i36;
                            objArr3[i39] = objArr2[i35];
                        } else {
                            jArr = jArr6;
                        }
                        i35++;
                        jArr5 = jArr5;
                        jArr6 = jArr;
                    }
                    i13 = i(i5);
                }
                this.e++;
                int i42 = this.f;
                long[] jArr7 = this.a;
                int i43 = i13 >> 3;
                long j21 = jArr7[i43];
                int i44 = (i13 & 7) << 3;
                this.f = i42 - (((j21 >> i44) & j2) != j3 ? 0 : 1);
                int i45 = this.d;
                long j22 = (j21 & (~(j2 << i44))) | (j << i44);
                jArr7[i43] = j22;
                jArr7[(((i13 - 7) & i45) + (i45 & 7)) >> 3] = j22;
                return ~i13;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i4 = i12;
            i2 = i11;
        }
    }

    public final java.lang.Object d(int i) {
        int iNumberOfTrailingZeros;
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = this.d;
        int i5 = (i3 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = j ^ (((long) (i3 & 127)) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (this.b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return e(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final java.lang.Object e(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.d;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        java.lang.Object[] objArr = this.c;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0072 A[LOOP:0: B:14:0x0023->B:35:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[EDGE_INSN: B:38:0x0075->B:36:0x0075 BREAK  A[LOOP:0: B:14:0x0023->B:35:0x0072], SYNTHETIC] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.zo)) {
            return false;
        }
        defpackage.zo zoVar = (defpackage.zo) obj;
        if (zoVar.e != this.e) {
            return false;
        }
        int[] iArr = this.b;
        java.lang.Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 >= i4) {
                            if (i4 != 8) {
                                break;
                            }
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i3;
                            int i6 = iArr[i5];
                            java.lang.Object obj2 = objArr[i5];
                            if (obj2 == null) {
                                if (zoVar.a(i6) != null || !zoVar.b(i6)) {
                                    return false;
                                }
                            } else if (!defpackage.afga.f(obj2, zoVar.a(i6))) {
                                return false;
                            }
                        }
                        j >>= 8;
                        i3++;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final void f() {
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
        java.lang.Object[] objArr = this.c;
        int i3 = this.d;
        objArr.getClass();
        java.util.Arrays.fill(objArr, 0, i3, (java.lang.Object) null);
        j();
    }

    public final void g(int i, java.lang.Object obj) {
        int iC = c(i);
        if (iC < 0) {
            iC = ~iC;
        }
        this.b[iC] = i;
        this.c[iC] = obj;
    }

    public final void h(int i, java.lang.Object obj) {
        int iC = c(i);
        if (iC < 0) {
            iC = ~iC;
        }
        java.lang.Object[] objArr = this.c;
        java.lang.Object obj2 = objArr[iC];
        this.b[iC] = i;
        objArr[iC] = obj;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.b;
        java.lang.Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        int i6 = iArr[i5];
                        java.lang.Object obj = objArr[i5];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ i6;
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return iHashCode;
                }
            }
            if (i2 == length) {
                return iHashCode;
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067 A[DONT_INVERT, PHI: r8
  0x0067: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:8:0x0029, B:21:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0069 A[LOOP:0: B:7:0x001b->B:23:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006c A[EDGE_INSN: B:29:0x006c->B:24:0x006c BREAK  A[LOOP:0: B:7:0x001b->B:23:0x0069], SYNTHETIC] */
    public final java.lang.String toString() {
        int i;
        if (this.e == 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        int[] iArr = this.b;
        java.lang.Object[] objArr = this.c;
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
                    int i4 = (~(i2 - length)) >>> 31;
                    int i5 = 0;
                    while (true) {
                        i = 8 - i4;
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr[i6];
                            java.lang.Object obj = objArr[i6];
                            sb.append(i7);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
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

    public zo() {
    }
}
