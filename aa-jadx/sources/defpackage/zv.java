package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zv {
    public long[] a = defpackage.aav.a;
    public long[] b = defpackage.zy.a;
    public java.lang.Object[] c = defpackage.abg.c;
    public int d;
    public int e;
    private int f;

    public zv(int i) {
        h(defpackage.aav.c(i));
    }

    private final int f(int i) {
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

    private final void g() {
        this.f = defpackage.aav.a(this.d) - this.e;
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
        g();
        this.b = new long[iMax];
        this.c = new java.lang.Object[iMax];
    }

    public final java.lang.Object a(long j) {
        int iNumberOfTrailingZeros;
        int iF = defpackage.a.f(j) * (-862048943);
        int i = iF ^ (iF << 16);
        int i2 = this.d;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j2 = (((-i6) >> 63) & (jArr[i5 + 1] << (64 - i6))) | (jArr[i5] >>> i6);
            long j3 = j2 ^ (((long) (i & 127)) * 72340172838076673L);
            for (long j4 = (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j4) >> 3) + i3) & i2;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final boolean b(long j) {
        int iF = defpackage.a.f(j) * (-862048943);
        int i = iF ^ (iF << 16);
        int i2 = this.d;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            int i7 = i4;
            long j2 = (((-i6) >> 63) & (jArr[i5 + 1] << (64 - i6))) | (jArr[i5] >>> i6);
            long j3 = (((long) (i & 127)) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j4) >> 3) + i3) & i2;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    if (iNumberOfTrailingZeros >= 0) {
                        return true;
                    }
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                break;
            }
            i4 = i7 + 8;
            i3 = (i3 + i4) & i2;
        }
        return false;
    }

    public final java.lang.Object c(long j) {
        int iNumberOfTrailingZeros;
        int iF = defpackage.a.f(j) * (-862048943);
        int i = iF ^ (iF << 16);
        int i2 = this.d;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j2 = (((-i6) >> 63) & (jArr[i5 + 1] << (64 - i6))) | (jArr[i5] >>> i6);
            long j3 = j2 ^ (((long) (i & 127)) * 72340172838076673L);
            for (long j4 = (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j4) >> 3) + i3) & i2;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.e--;
        long[] jArr2 = this.a;
        int i7 = this.d;
        int i8 = iNumberOfTrailingZeros >> 3;
        int i9 = (iNumberOfTrailingZeros & 7) << 3;
        long j5 = (jArr2[i8] & (~(255 << i9))) | (254 << i9);
        jArr2[i8] = j5;
        jArr2[(((iNumberOfTrailingZeros - 7) & i7) + (i7 & 7)) >> 3] = j5;
        java.lang.Object[] objArr = this.c;
        java.lang.Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final void d() {
        this.e = 0;
        if (this.a != defpackage.aav.a) {
            defpackage.afga.co(this.a, -9187201950435737472L);
            long[] jArr = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        defpackage.afga.by(this.c, null, 0, this.d);
        g();
    }

    public final void e(long j, java.lang.Object obj) {
        long j2;
        int i;
        int i2;
        long j3;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int i3 = -862048943;
        int iF = defpackage.a.f(j) * (-862048943);
        int i4 = iF ^ (iF << 16);
        int i5 = i4 >>> 7;
        int i6 = this.d;
        int i7 = i5 & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr2 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = jArr2[i9] >>> i10;
            int i11 = 1;
            long j5 = jArr2[i9 + 1] << (64 - i10);
            int i12 = i8;
            int i13 = 0;
            long j6 = i4 & 127;
            long j7 = (((-i10) >> 63) & j5) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (~j8) & ((-72340172838076673L) + j8) & (-9187201950435737472L);
            while (j9 != 0) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j9) >> 3) + i7) & i6;
                int i14 = i3;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
                j9 &= j9 - 1;
                i3 = i14;
            }
            int i15 = i3;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                int iF2 = f(i5);
                if (this.f != 0 || ((this.a[iF2 >> 3] >> ((iF2 & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i16 = this.d;
                    if (i16 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i16) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i17 = this.d;
                            long[] jArr4 = this.b;
                            java.lang.Object[] objArr = this.c;
                            int i18 = i17 + 7;
                            j2 = 255;
                            int i19 = 0;
                            while (i19 < (i18 >> 3)) {
                                long j10 = jArr3[i19] & (-9187201950435737472L);
                                jArr3[i19] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i19++;
                                i13 = i13;
                            }
                            i = i13;
                            int iBG = defpackage.afga.bG(jArr3);
                            int i20 = iBG - 1;
                            long j11 = 72057594037927935L;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iBG] = jArr3[i];
                            int i21 = i;
                            while (i21 != i17) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j12 = (jArr3[i22] >> i23) & 255;
                                if (j12 != 128 && j12 == 254) {
                                    int iF3 = defpackage.a.f(jArr4[i21]) * i15;
                                    int i24 = iF3 ^ (iF3 << 16);
                                    int i25 = i24 & 127;
                                    int i26 = i24 >>> 7;
                                    int iF4 = f(i26);
                                    int i27 = i26 & i17;
                                    long j13 = j11;
                                    int i28 = i11;
                                    long j14 = i25;
                                    if (((iF4 - i27) & i17) / 8 == ((i21 - i27) & i17) / 8) {
                                        jArr3[i22] = (jArr3[i22] & (~(255 << i23))) | (j14 << i23);
                                        jArr3[defpackage.afga.bG(jArr3)] = (jArr3[i] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        i11 = i28;
                                        j11 = j13;
                                    } else {
                                        int i29 = iF4 >> 3;
                                        long j15 = jArr3[i29];
                                        int i30 = (iF4 & 7) << 3;
                                        long j16 = j14 << i30;
                                        long j17 = (~(255 << i30)) & j15;
                                        if (((j15 >> i30) & 255) == 128) {
                                            long j18 = ~(255 << i23);
                                            jArr3[i29] = j17 | j16;
                                            jArr3[i22] = (j18 & jArr3[i22]) | (128 << i23);
                                            jArr4[iF4] = jArr4[i21];
                                            jArr4[i21] = 0;
                                            objArr[iF4] = objArr[i21];
                                            objArr[i21] = null;
                                        } else {
                                            jArr3[i29] = j17 | j16;
                                            long j19 = jArr4[iF4];
                                            jArr4[iF4] = jArr4[i21];
                                            jArr4[i21] = j19;
                                            java.lang.Object obj2 = objArr[iF4];
                                            objArr[iF4] = objArr[i21];
                                            objArr[i21] = obj2;
                                            i21--;
                                        }
                                        jArr3[defpackage.afga.bG(jArr3)] = (jArr3[i] & j13) | Long.MIN_VALUE;
                                        i21++;
                                        j11 = j13;
                                        i11 = i28;
                                    }
                                } else {
                                    i21++;
                                }
                            }
                            i2 = i11;
                            g();
                        }
                        iF2 = f(i5);
                    } else {
                        j3 = 128;
                    }
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    int iB = defpackage.aav.b(this.d);
                    long[] jArr5 = this.a;
                    long[] jArr6 = this.b;
                    java.lang.Object[] objArr2 = this.c;
                    int i31 = this.d;
                    h(iB);
                    long[] jArr7 = this.a;
                    long[] jArr8 = this.b;
                    java.lang.Object[] objArr3 = this.c;
                    int i32 = this.d;
                    int i33 = 0;
                    while (i33 < i31) {
                        if (((jArr5[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < j3) {
                            long j20 = jArr6[i33];
                            int iF5 = defpackage.a.f(j20) * i15;
                            int i34 = iF5 ^ (iF5 << 16);
                            jArr = jArr7;
                            int iF6 = f(i34 >>> 7);
                            int i35 = iF6 >> 3;
                            int i36 = (iF6 & 7) << 3;
                            long j21 = (jArr[i35] & (~(255 << i36))) | (((long) (i34 & 127)) << i36);
                            jArr[i35] = j21;
                            jArr[(((iF6 - 7) & i32) + (i32 & 7)) >> 3] = j21;
                            jArr8[iF6] = j20;
                            objArr3[iF6] = objArr2[i33];
                        } else {
                            jArr = jArr7;
                        }
                        i33++;
                        jArr7 = jArr;
                        jArr5 = jArr5;
                    }
                    iF2 = f(i5);
                }
                this.e++;
                int i37 = this.f;
                long[] jArr9 = this.a;
                int i38 = iF2 >> 3;
                long j22 = jArr9[i38];
                int i39 = (iF2 & 7) << 3;
                if (((j22 >> i39) & j2) == j3) {
                    i = i2;
                }
                this.f = i37 - i;
                int i40 = this.d;
                long j23 = (j6 << i39) | (j22 & (~(j2 << i39)));
                jArr9[i38] = j23;
                jArr9[(((iF2 - 7) & i40) + (i40 & 7)) >> 3] = j23;
                iNumberOfTrailingZeros = ~iF2;
                break;
            }
            i8 = i12 + 8;
            i7 = (i7 + i8) & i6;
            i3 = i15;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = j;
        this.c[iNumberOfTrailingZeros] = obj;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0072 A[LOOP:0: B:14:0x0023->B:35:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[EDGE_INSN: B:38:0x0075->B:36:0x0075 BREAK  A[LOOP:0: B:14:0x0023->B:35:0x0072], SYNTHETIC] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.zv)) {
            return false;
        }
        defpackage.zv zvVar = (defpackage.zv) obj;
        if (zvVar.e != this.e) {
            return false;
        }
        long[] jArr = this.b;
        java.lang.Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
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
                            long j2 = jArr[i5];
                            java.lang.Object obj2 = objArr[i5];
                            if (obj2 == null) {
                                if (zvVar.a(j2) != null || !zvVar.b(j2)) {
                                    return false;
                                }
                            } else if (!defpackage.afga.f(obj2, zvVar.a(j2))) {
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

    public final int hashCode() {
        int i;
        long[] jArr = this.b;
        java.lang.Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr2[i2];
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
                        long j2 = jArr[i5];
                        java.lang.Object obj = objArr[i5];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ defpackage.a.f(j2);
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

    public final java.lang.String toString() {
        int i;
        int i2;
        int i3;
        if (this.e == 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        long[] jArr = this.b;
        java.lang.Object[] objArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j = jArr2[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = (~(i4 - length)) >>> 31;
                    int i7 = 0;
                    while (true) {
                        i2 = 8 - i6;
                        if (i7 >= i2) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i8 = (i4 << 3) + i7;
                            i3 = i4;
                            long j2 = jArr[i8];
                            java.lang.Object obj = objArr[i8];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i5++;
                            if (i5 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i3 = i4;
                        }
                        j >>= 8;
                        i7++;
                        i4 = i3;
                    }
                    int i9 = i4;
                    if (i2 != 8) {
                        break;
                    }
                    i = i9;
                } else {
                    i = i4;
                }
                if (i == length) {
                    break;
                }
                i4 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public zv() {
    }
}
