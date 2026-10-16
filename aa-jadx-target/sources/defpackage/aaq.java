package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aaq {
    public long[] a = defpackage.aav.a;
    public java.lang.Object[] b = defpackage.abg.c;
    public long[] c = defpackage.aaz.a;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f;
    public int g;
    private int h;

    public aaq(int i) {
        l(i);
    }

    private final int i(java.lang.Object obj) {
        long j;
        long j2;
        int i;
        long j3;
        int i2;
        long[] jArr;
        int i3;
        int i4 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = this.f;
        int i8 = i6 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            int i13 = i5;
            long j4 = i5 & 127;
            long j5 = ((jArr2[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr2[i10] >>> i11);
            long j6 = (72340172838076673L * j4) ^ j5;
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                int i14 = i4;
                if (defpackage.afga.f(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i14;
            }
            int i15 = i4;
            if ((j5 & ((~j5) << 6) & (-9187201950435737472L)) != 0) {
                int iJ = j(i6);
                if (this.h != 0 || ((this.a[iJ >> 3] >> ((iJ & 7) << 3)) & 255) == 254) {
                    j = j4;
                    j2 = 255;
                    i = 1;
                    j3 = 128;
                } else {
                    int i16 = this.f;
                    j3 = 128;
                    if (i16 <= 8 || java.lang.Long.compare((((long) this.g) * 32) ^ Long.MIN_VALUE, (((long) i16) * 25) ^ Long.MIN_VALUE) > 0) {
                        j = j4;
                        i2 = i6;
                        j2 = 255;
                        i = 1;
                        int i17 = 0;
                        int iB = defpackage.aav.b(this.f);
                        long[] jArr3 = this.a;
                        java.lang.Object[] objArr = this.b;
                        long[] jArr4 = this.c;
                        int i18 = this.f;
                        int[] iArr = new int[i18];
                        l(iB);
                        long[] jArr5 = this.a;
                        java.lang.Object[] objArr2 = this.b;
                        long[] jArr6 = this.c;
                        int i19 = this.f;
                        int i20 = 0;
                        while (i20 < i18) {
                            if (((jArr3[i20 >> 3] >> ((i20 & 7) << 3)) & 255) < 128) {
                                java.lang.Object obj2 = objArr[i20];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : i17) * i15;
                                int i21 = iHashCode2 ^ (iHashCode2 << 16);
                                int iJ2 = j(i21 >>> 7);
                                int i22 = iJ2 >> 3;
                                int i23 = (iJ2 & 7) << 3;
                                jArr = jArr5;
                                long j8 = (((long) (i21 & 127)) << i23) | (jArr5[i22] & (~(255 << i23)));
                                jArr[i22] = j8;
                                jArr[(((iJ2 - 7) & i19) + (i19 & 7)) >> 3] = j8;
                                objArr2[iJ2] = obj2;
                                jArr6[iJ2] = jArr4[i20];
                                iArr[i20] = iJ2;
                            } else {
                                jArr = jArr5;
                            }
                            i20++;
                            jArr5 = jArr;
                            jArr3 = jArr3;
                            i17 = 0;
                        }
                        long[] jArr7 = this.c;
                        int length = jArr7.length;
                        for (int i24 = 0; i24 < length; i24++) {
                            long j9 = jArr7[i24];
                            int i25 = (int) ((j9 >> 31) & 2147483647L);
                            int i26 = (int) (j9 & 2147483647L);
                            jArr7[i24] = (((j9 & (-4611686018427387904L)) | ((long) (i25 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i25]))) << 31) | ((long) (i26 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i26]));
                        }
                        int i27 = this.d;
                        if (i27 != Integer.MAX_VALUE) {
                            this.d = iArr[i27];
                        }
                        int i28 = this.e;
                        if (i28 != Integer.MAX_VALUE) {
                            this.e = iArr[i28];
                        }
                    } else {
                        long[] jArr8 = this.a;
                        if (jArr8 == null) {
                            j = j4;
                            i3 = i6;
                            j2 = 255;
                            i = 1;
                        } else {
                            int i29 = this.f;
                            java.lang.Object[] objArr3 = this.b;
                            long[] jArr9 = this.c;
                            long[] jArr10 = new long[i29];
                            j2 = 255;
                            java.util.Arrays.fill(jArr10, 0, i29, 9223372034707292159L);
                            int i30 = (i29 + 7) >> 3;
                            int i31 = 0;
                            while (i31 < i30) {
                                long j10 = jArr8[i31] & (-9187201950435737472L);
                                jArr8[i31] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i31++;
                                i12 = i12;
                            }
                            i = i12;
                            int iBG = defpackage.afga.bG(jArr8);
                            int i32 = iBG - 1;
                            jArr8[i32] = (jArr8[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr8[iBG] = jArr8[0];
                            int i33 = 0;
                            while (i33 != i29) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j11 = (jArr8[i34] >> i35) & 255;
                                if (j11 != 128 && j11 == 254) {
                                    java.lang.Object obj3 = objArr3[i33];
                                    int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i15;
                                    int i36 = iHashCode3 ^ (iHashCode3 << 16);
                                    int i37 = i36 & 127;
                                    int i38 = i36 >>> 7;
                                    int iJ3 = j(i38);
                                    int i39 = i38 & i29;
                                    int i40 = i6;
                                    long j12 = i37;
                                    if (((iJ3 - i39) & i29) / 8 == ((i33 - i39) & i29) / 8) {
                                        int i41 = i33 + 1;
                                        jArr8[i34] = (j12 << i35) | (jArr8[i34] & (~(255 << i35)));
                                        if (jArr10[i33] == 9223372034707292159L) {
                                            long j13 = i33;
                                            jArr10[i33] = j13 | (j13 << 32);
                                        }
                                        jArr8[jArr8.length - 1] = jArr8[0];
                                        i33 = i41;
                                        i6 = i40;
                                    } else {
                                        long j14 = i33;
                                        long j15 = j4;
                                        long j16 = iJ3;
                                        int i42 = iJ3 >> 3;
                                        long j17 = jArr8[i42];
                                        int i43 = (iJ3 & 7) << 3;
                                        long j18 = j12 << i43;
                                        long j19 = j17 & (~(255 << i43));
                                        if (((j17 >> i43) & 255) == 128) {
                                            long j20 = j14 << 32;
                                            long j21 = ~(255 << i35);
                                            jArr8[i42] = j18 | j19;
                                            jArr8[i34] = (j21 & jArr8[i34]) | (128 << i35);
                                            objArr3[iJ3] = objArr3[i33];
                                            objArr3[i33] = null;
                                            jArr9[iJ3] = jArr9[i33];
                                            jArr9[i33] = 4611686018427387903L;
                                            int i44 = (int) ((jArr10[i33] >> 32) & 4294967295L);
                                            if (i44 != Integer.MAX_VALUE) {
                                                jArr10[i44] = (jArr10[i44] & (-4294967296L)) | j16;
                                                jArr10[i33] = (jArr10[i33] & 4294967295L) | (-4294967296L);
                                            } else {
                                                jArr10[i33] = j16 | 9223372032559808512L;
                                            }
                                            jArr10[iJ3] = j20 | 2147483647L;
                                        } else {
                                            long j22 = j16 << 32;
                                            jArr8[i42] = j18 | j19;
                                            java.lang.Object obj4 = objArr3[iJ3];
                                            objArr3[iJ3] = objArr3[i33];
                                            objArr3[i33] = obj4;
                                            long j23 = jArr9[iJ3];
                                            jArr9[iJ3] = jArr9[i33];
                                            jArr9[i33] = j23;
                                            int i45 = (int) ((jArr10[i33] >> 32) & 4294967295L);
                                            if (i45 != Integer.MAX_VALUE) {
                                                jArr10[i45] = (jArr10[i45] & (-4294967296L)) | j16;
                                                jArr10[i33] = j22 | (jArr10[i33] & 4294967295L);
                                            } else {
                                                jArr10[i33] = j22 | j16;
                                                i45 = i33;
                                            }
                                            jArr10[iJ3] = (((long) i45) << 32) | j14;
                                            i33--;
                                        }
                                        jArr8[jArr8.length - 1] = jArr8[0];
                                        i33++;
                                        i6 = i40;
                                        j4 = j15;
                                    }
                                } else {
                                    i33++;
                                }
                            }
                            j = j4;
                            i2 = i6;
                            k();
                            long[] jArr11 = this.c;
                            int length2 = jArr11.length;
                            for (int i46 = 0; i46 < length2; i46++) {
                                long j24 = jArr11[i46];
                                int i47 = (int) ((j24 >> 31) & 2147483647L);
                                int i48 = (int) (j24 & 2147483647L);
                                jArr11[i46] = (((j24 & (-4611686018427387904L)) | ((long) (i47 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr10[i47] & 4294967295L)))) << 31) | ((long) (i48 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr10[i48] & 4294967295L)));
                            }
                            int i49 = this.d;
                            if (i49 != Integer.MAX_VALUE) {
                                this.d = (int) (jArr10[i49] & 4294967295L);
                            }
                            int i50 = this.e;
                            if (i50 != Integer.MAX_VALUE) {
                                this.e = (int) (jArr10[i50] & 4294967295L);
                            }
                        }
                        iJ = j(i3);
                    }
                    i3 = i2;
                    iJ = j(i3);
                }
                this.g++;
                int i51 = this.h;
                long[] jArr12 = this.a;
                int i52 = iJ >> 3;
                long j25 = jArr12[i52];
                int i53 = (iJ & 7) << 3;
                if (((j25 >> i53) & j2) != j3) {
                    i = 0;
                }
                this.h = i51 - i;
                int i54 = this.f;
                long j26 = (j25 & (~(j2 << i53))) | (j << i53);
                jArr12[i52] = j26;
                jArr12[(((iJ - 7) & i54) + (i54 & 7)) >> 3] = j26;
                return iJ;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i5 = i13;
            i4 = i15;
        }
    }

    private final int j(int i) {
        int i2 = this.f;
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

    private final void k() {
        this.h = defpackage.aav.a(this.f) - this.g;
    }

    private final void l(int i) {
        int iMax;
        long[] jArr;
        int i2;
        int i3;
        java.lang.Object[] objArr;
        long[] jArr2;
        if (i > 0) {
            long[] jArr3 = defpackage.aav.a;
            iMax = java.lang.Math.max(7, (-1) >>> java.lang.Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.f = iMax;
        if (iMax == 0) {
            jArr = defpackage.aav.a;
            i2 = 0;
        } else {
            int i4 = (iMax + 15) >> 3;
            long[] jArr4 = new long[i4];
            java.util.Arrays.fill(jArr4, 0, i4, -9187201950435737472L);
            jArr = jArr4;
            i2 = iMax;
        }
        this.a = jArr;
        int i5 = i2 >> 3;
        long j = 255 << ((7 & i2) << 3);
        jArr[i5] = (jArr[i5] & (~j)) | j;
        k();
        if (iMax == 0) {
            objArr = defpackage.abg.c;
            i3 = 0;
        } else {
            i3 = iMax;
            objArr = new java.lang.Object[iMax];
        }
        this.b = objArr;
        if (i3 == 0) {
            jArr2 = defpackage.aaz.a;
        } else {
            jArr2 = new long[i3];
            java.util.Arrays.fill(jArr2, 0, i3, 4611686018427387903L);
        }
        this.c = jArr2;
    }

    public final boolean a(java.lang.Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = this.f;
        int i2 = iHashCode * (-862048943);
        int i3 = i2 ^ (i2 << 16);
        int i4 = (i3 >>> 7) & i;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            int i8 = i3;
            long j = (((-i7) >> 63) & (jArr[i6 + 1] << (64 - i7))) | (jArr[i6] >>> i7);
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i4) & i;
                if (defpackage.afga.f(this.b[iNumberOfTrailingZeros], obj)) {
                    if (iNumberOfTrailingZeros >= 0) {
                        return true;
                    }
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i;
            i3 = i8;
        }
        return false;
    }

    public final boolean b() {
        return this.g == 0;
    }

    public final void c() {
        this.g = 0;
        if (this.a != defpackage.aav.a) {
            defpackage.afga.co(this.a, -9187201950435737472L);
            long[] jArr = this.a;
            int i = this.f;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        defpackage.afga.by(this.b, null, 0, this.f);
        defpackage.afga.co(this.c, 4611686018427387903L);
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        k();
    }

    public final void d(java.lang.Object obj) {
        int i = i(obj);
        this.b[i] = obj;
        long[] jArr = this.c;
        int i2 = this.d;
        jArr[i] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((2147483647L & ((long) i)) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.d = i;
        if (this.e == Integer.MAX_VALUE) {
            this.e = i;
        }
    }

    public final void e(int i) {
        this.g--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.f;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
        long[] jArr2 = this.c;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & 2147483647L);
        int i6 = (int) (j2 & 2147483647L);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & (-2147483648L)) | ((long) i6);
        } else {
            this.d = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = (((long) i5) << 31) | (jArr2[i6] & (-4611686016279904257L));
        } else {
            this.e = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b A[LOOP:0: B:14:0x0021->B:28:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x005e A[SYNTHETIC] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.aaq)) {
            return false;
        }
        defpackage.aaq aaqVar = (defpackage.aaq) obj;
        if (aaqVar.g != this.g) {
            return false;
        }
        java.lang.Object[] objArr = this.b;
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
                            if ((255 & j) < 128 && !aaqVar.a(objArr[(i << 3) + i3])) {
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

    public final boolean f(java.lang.Object obj) {
        int i = this.g;
        int i2 = i(obj);
        this.b[i2] = obj;
        long[] jArr = this.c;
        int i3 = this.d;
        jArr[i2] = (((long) i3) & 2147483647L) | 4611686016279904256L;
        if (i3 != Integer.MAX_VALUE) {
            jArr[i3] = ((2147483647L & ((long) i2)) << 31) | (jArr[i3] & (-4611686016279904257L));
        }
        this.d = i2;
        if (this.e == Integer.MAX_VALUE) {
            this.e = i2;
        }
        return this.g != i;
    }

    public final boolean g(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = this.f;
        int i2 = iHashCode * (-862048943);
        int i3 = i2 ^ (i2 << 16);
        int i4 = (i3 >>> 7) & i;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            int i8 = i3;
            long j = (((-i7) >> 63) & (jArr[i6 + 1] << (64 - i7))) | (jArr[i6] >>> i7);
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i4) & i;
                if (defpackage.afga.f(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i;
            i3 = i8;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            e(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final boolean h(java.util.Collection collection) {
        int i;
        collection.getClass();
        java.lang.Object[] objArr = this.b;
        int i2 = this.g;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i = 8 - ((~i4) >>> 31);
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!defpackage.afga.bh(collection, objArr[i6])) {
                                e(i6);
                            }
                        }
                        j >>= 8;
                        i5++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return i2 != this.g;
    }

    public final int hashCode() {
        int i;
        int iHashCode = (this.f * 31) + this.g;
        java.lang.Object[] objArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = (~(i2 - length)) >>> 31;
                    int i4 = 0;
                    while (true) {
                        i = 8 - i3;
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            java.lang.Object obj = objArr[(i2 << 3) + i4];
                            if (!defpackage.afga.f(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        return iHashCode;
                    }
                }
                if (i2 != length) {
                    i2++;
                }
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.CharSequence, java.lang.Object] */
    public final java.lang.String toString() {
        int i = 0;
        defpackage.aap aapVar = new defpackage.aap(this, i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.lang.Object[] objArr = this.b;
        long[] jArr = this.c;
        int i2 = this.e;
        while (i2 != Integer.MAX_VALUE) {
            long j = jArr[i2] >> 31;
            java.lang.Object obj = objArr[i2];
            if (i != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            if (i == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            sb.append((java.lang.CharSequence) aapVar.invoke(obj));
            i++;
            i2 = (int) (j & 2147483647L);
        }
        sb.append((java.lang.CharSequence) "]");
        return sb.toString();
    }

    public aaq() {
    }
}
