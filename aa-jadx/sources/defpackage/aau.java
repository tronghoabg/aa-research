package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aau {
    public long[] a = defpackage.aav.a;
    public java.lang.Object[] b;
    public java.lang.Object[] c;
    public int d;
    public int e;
    private java.util.Map f;
    private int g;

    public aau(int i) {
        java.lang.Object[] objArr = defpackage.abg.c;
        this.b = objArr;
        this.c = objArr;
        if (i < 0) {
            defpackage.ca.Y("Capacity must be a positive value.");
        }
        p(defpackage.aav.c(i));
    }

    public static /* synthetic */ boolean f(defpackage.aau aauVar, java.lang.Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = aauVar.d;
        int i2 = iHashCode * (-862048943);
        int i3 = i2 ^ (i2 << 16);
        int i4 = (i3 >>> 7) & i;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = aauVar.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            int i8 = i3;
            long j = (((-i7) >> 63) & (jArr[i6 + 1] << (64 - i7))) | (jArr[i6] >>> i7);
            long j2 = (((long) (i3 & 127)) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i4) & i;
                if (defpackage.afga.f(aauVar.b[iNumberOfTrailingZeros], obj)) {
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

    private final int n(int i) {
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

    private final void o() {
        this.g = defpackage.aav.a(this.d) - this.e;
    }

    private final void p(int i) {
        int iMax;
        long[] jArr;
        java.lang.Object[] objArr;
        int i2 = 0;
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
            int i3 = (iMax + 15) >> 3;
            long[] jArr3 = new long[i3];
            java.util.Arrays.fill(jArr3, 0, i3, -9187201950435737472L);
            int i4 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr3[i4] = (jArr3[i4] & (~j)) | j;
            jArr = jArr3;
        }
        this.a = jArr;
        o();
        if (iMax == 0) {
            objArr = defpackage.abg.c;
        } else {
            i2 = iMax;
            objArr = new java.lang.Object[iMax];
        }
        this.b = objArr;
        this.c = i2 == 0 ? defpackage.abg.c : new java.lang.Object[i2];
    }

    public final java.lang.Object a(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.d;
        int i3 = iHashCode * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i2;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = j ^ (((long) (i4 & 127)) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i6) & i2;
                if (defpackage.afga.f(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final java.util.Map b() {
        java.util.Map map = this.f;
        if (map != null) {
            return map;
        }
        defpackage.aad aadVar = new defpackage.aad(this);
        this.f = aadVar;
        return aadVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046 A[LOOP:0: B:5:0x000b->B:20:0x0046, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0049 A[SYNTHETIC] */
    public final boolean c(java.lang.Object obj) {
        java.lang.Object[] objArr = this.c;
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
                            if ((255 & j) < 128 && defpackage.afga.f(obj, objArr[(i << 3) + i3])) {
                                return true;
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
        return false;
    }

    public final boolean d() {
        return this.e == 0;
    }

    public final boolean e() {
        return this.e != 0;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0072 A[LOOP:0: B:14:0x0023->B:35:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[EDGE_INSN: B:38:0x0075->B:36:0x0075 BREAK  A[LOOP:0: B:14:0x0023->B:35:0x0072], SYNTHETIC] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.aau)) {
            return false;
        }
        defpackage.aau aauVar = (defpackage.aau) obj;
        if (aauVar.e != this.e) {
            return false;
        }
        java.lang.Object[] objArr = this.b;
        java.lang.Object[] objArr2 = this.c;
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
                            java.lang.Object obj2 = objArr[i5];
                            java.lang.Object obj3 = objArr2[i5];
                            if (obj3 == null) {
                                if (aauVar.a(obj2) != null || !f(aauVar, obj2)) {
                                    return false;
                                }
                            } else if (!defpackage.afga.f(obj3, aauVar.a(obj2))) {
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

    public final int g(java.lang.Object obj) {
        long j;
        long j2;
        int i;
        long j3;
        long[] jArr;
        int i2 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = this.d;
        int i6 = i4 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = jArr2[i8] >>> i9;
            long j5 = jArr2[i8 + 1] << (64 - i9);
            int i10 = i3;
            int i11 = 0;
            long j6 = i3 & 127;
            long j7 = (j5 & ((-i9) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j9) >> 3) + i6) & i5;
                int i12 = i2;
                if (defpackage.afga.f(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i2 = i12;
            }
            int i13 = i2;
            long j10 = j7 & ((~j7) << 6) & (-9187201950435737472L);
            char c = '\b';
            if (j10 != 0) {
                int iN = n(i4);
                long j11 = 255;
                if (this.g != 0 || ((this.a[iN >> 3] >> ((iN & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    j3 = 128;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i14) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i15 = this.d;
                            java.lang.Object[] objArr = this.b;
                            java.lang.Object[] objArr2 = this.c;
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
                            jArr3[iBG] = jArr3[i18];
                            int i20 = i18;
                            while (i20 != i15) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j13 = (jArr3[i21] >> i22) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    java.lang.Object obj2 = objArr[i20];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : i18) * i13;
                                    int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i24 = i23 & 127;
                                    int i25 = i23 >>> 7;
                                    int iN2 = n(i25);
                                    int i26 = i25 & i15;
                                    int i27 = i18;
                                    long j14 = j6;
                                    long[] jArr4 = jArr3;
                                    long j15 = i24;
                                    if (((iN2 - i26) & i15) / 8 == ((i20 - i26) & i15) / 8) {
                                        jArr4[i21] = (j15 << i22) | ((~(j2 << i22)) & jArr4[i21]);
                                        jArr4[defpackage.afga.bG(jArr4)] = jArr4[i27];
                                        i20++;
                                    } else {
                                        int i28 = iN2 >> 3;
                                        long j16 = jArr4[i28];
                                        int i29 = (iN2 & 7) << 3;
                                        long j17 = j15 << i29;
                                        long j18 = (~(j2 << i29)) & j16;
                                        if (((j16 >> i29) & j2) == 128) {
                                            long j19 = ~(j2 << i22);
                                            jArr4[i28] = j18 | j17;
                                            jArr4[i21] = (jArr4[i21] & j19) | (128 << i22);
                                            objArr[iN2] = objArr[i20];
                                            objArr[i20] = null;
                                            objArr2[iN2] = objArr2[i20];
                                            objArr2[i20] = null;
                                        } else {
                                            jArr4[i28] = j18 | j17;
                                            java.lang.Object obj3 = objArr[iN2];
                                            objArr[iN2] = objArr[i20];
                                            objArr[i20] = obj3;
                                            java.lang.Object obj4 = objArr2[iN2];
                                            objArr2[iN2] = objArr2[i20];
                                            objArr2[i20] = obj4;
                                            i20--;
                                        }
                                        jArr4[defpackage.afga.bG(jArr4)] = jArr4[i27];
                                        i20++;
                                    }
                                    jArr3 = jArr4;
                                    i18 = i27;
                                    j6 = j14;
                                } else {
                                    i20++;
                                }
                            }
                            j = j6;
                            i = i18;
                            o();
                        }
                        iN = n(i4);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    i = 0;
                    int iB = defpackage.aav.b(this.d);
                    long[] jArr5 = this.a;
                    java.lang.Object[] objArr3 = this.b;
                    java.lang.Object[] objArr4 = this.c;
                    int i30 = this.d;
                    p(iB);
                    long[] jArr6 = this.a;
                    java.lang.Object[] objArr5 = this.b;
                    java.lang.Object[] objArr6 = this.c;
                    int i31 = this.d;
                    int i32 = 0;
                    while (i32 < i30) {
                        if (((jArr5[i32 >> 3] >> ((i32 & 7) << 3)) & 255) < j3) {
                            java.lang.Object obj5 = objArr3[i32];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i13;
                            int i33 = iHashCode3 ^ (iHashCode3 << 16);
                            int iN3 = n(i33 >>> 7);
                            int i34 = iN3 >> 3;
                            int i35 = (iN3 & 7) << 3;
                            jArr = jArr6;
                            long j20 = (jArr6[i34] & (~(255 << i35))) | (((long) (i33 & 127)) << i35);
                            jArr[i34] = j20;
                            jArr[(((iN3 - 7) & i31) + (i31 & 7)) >> 3] = j20;
                            objArr5[iN3] = obj5;
                            objArr6[iN3] = objArr4[i32];
                        } else {
                            jArr = jArr6;
                        }
                        i32++;
                        jArr5 = jArr5;
                        jArr6 = jArr;
                    }
                    iN = n(i4);
                }
                this.e++;
                int i36 = this.g;
                long[] jArr7 = this.a;
                int i37 = iN >> 3;
                long j21 = jArr7[i37];
                int i38 = (iN & 7) << 3;
                this.g = i36 - (((j21 >> i38) & j2) != j3 ? i : 1);
                int i39 = this.d;
                long j22 = (j21 & (~(j2 << i38))) | (j << i38);
                jArr7[i37] = j22;
                jArr7[(((iN - 7) & i39) + (i39 & 7)) >> 3] = j22;
                return ~iN;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i3 = i10;
            i2 = i13;
        }
    }

    public final java.lang.Object h(java.lang.Object obj, java.lang.Object obj2) {
        int iG = g(obj);
        if (iG < 0) {
            iG = ~iG;
        }
        java.lang.Object[] objArr = this.c;
        java.lang.Object obj3 = objArr[iG];
        this.b[iG] = obj;
        objArr[iG] = obj2;
        return obj3;
    }

    public final int hashCode() {
        int i;
        java.lang.Object[] objArr = this.b;
        java.lang.Object[] objArr2 = this.c;
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
                        java.lang.Object obj = objArr[i5];
                        java.lang.Object obj2 = objArr2[i5];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final java.lang.Object i(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.d;
        int i3 = iHashCode * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i2;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = j ^ (((long) (i4 & 127)) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i6) & i2;
                if (defpackage.afga.f(this.b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return j(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final java.lang.Object j(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.d;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
        java.lang.Object[] objArr = this.c;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void k() {
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
        java.lang.Object[] objArr2 = this.b;
        int i4 = this.d;
        objArr2.getClass();
        java.util.Arrays.fill(objArr2, 0, i4, (java.lang.Object) null);
        o();
    }

    public final void l(defpackage.aau aauVar) {
        int i;
        java.lang.Object[] objArr = aauVar.b;
        java.lang.Object[] objArr2 = aauVar.c;
        long[] jArr = aauVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
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
                        m(objArr[i5], objArr2[i5]);
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void m(java.lang.Object obj, java.lang.Object obj2) {
        int iG = g(obj);
        if (iG < 0) {
            iG = ~iG;
        }
        this.b[iG] = obj;
        this.c[iG] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[DONT_INVERT, PHI: r8
  0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:26:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0074 A[LOOP:0: B:9:0x0020->B:28:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[EDGE_INSN: B:32:0x0077->B:29:0x0077 BREAK  A[LOOP:0: B:9:0x0020->B:28:0x0074], SYNTHETIC] */
    public final java.lang.String toString() {
        int i;
        if (d()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.lang.Object[] objArr = this.b;
        java.lang.Object[] objArr2 = this.c;
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
                            java.lang.Object obj = objArr[i6];
                            java.lang.Object obj2 = objArr2[i6];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
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

    public aau() {
        java.lang.Object[] objArr = defpackage.abg.c;
        this.b = objArr;
        this.c = objArr;
    }
}
