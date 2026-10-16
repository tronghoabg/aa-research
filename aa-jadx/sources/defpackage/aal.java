package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aal {
    public long[] a = defpackage.aav.a;
    public java.lang.Object[] b = defpackage.abg.c;
    public int[] c = defpackage.zr.a;
    public int d;
    public int e;
    private int f;

    public aal(int i) {
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
        this.b = new java.lang.Object[iMax];
        this.c = new int[iMax];
    }

    public final int a(java.lang.Object obj) {
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.d;
        int i3 = iHashCode * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        while (true) {
            int i6 = i5 & i2;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = (((-i8) >> 63) & (jArr[i7 + 1] << (64 - i8))) | (jArr[i7] >>> i8);
            long j2 = j ^ (((long) (i4 & 127)) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i6) & i2;
                if (defpackage.afga.f(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final int b(java.lang.Object obj, int i) {
        int iA = a(obj);
        return iA >= 0 ? this.c[iA] : i;
    }

    public final boolean c() {
        return this.e != 0;
    }

    public final int d(java.lang.Object obj) {
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
                int i14 = i(i4);
                long j11 = 255;
                if (this.f != 0 || ((this.a[i14 >> 3] >> ((i14 & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    j3 = 128;
                } else {
                    int i15 = this.d;
                    if (i15 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((((long) this.e) * 32) ^ Long.MIN_VALUE, (((long) i15) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i16 = this.d;
                            java.lang.Object[] objArr = this.b;
                            int[] iArr = this.c;
                            int i17 = i16 + 7;
                            int i18 = 0;
                            while (i18 < (i17 >> 3)) {
                                char c2 = c;
                                long j12 = jArr3[i18] & (-9187201950435737472L);
                                jArr3[i18] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i18++;
                                i17 = i17;
                                i11 = i11;
                                c = c2;
                                j11 = j11;
                            }
                            j2 = j11;
                            int i19 = i11;
                            int iBG = defpackage.afga.bG(jArr3);
                            int i20 = iBG - 1;
                            jArr3[i20] = (jArr3[i20] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iBG] = jArr3[i19];
                            int i21 = i19;
                            while (i21 != i16) {
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                long j13 = (jArr3[i22] >> i23) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    java.lang.Object obj2 = objArr[i21];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : i19) * i13;
                                    int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i25 = i24 & 127;
                                    int i26 = i24 >>> 7;
                                    int i27 = i(i26);
                                    int i28 = i26 & i16;
                                    int i29 = i19;
                                    long j14 = j6;
                                    long[] jArr4 = jArr3;
                                    long j15 = i25;
                                    if (((i27 - i28) & i16) / 8 == ((i21 - i28) & i16) / 8) {
                                        jArr4[i22] = (j15 << i23) | ((~(j2 << i23)) & jArr4[i22]);
                                        jArr4[defpackage.afga.bG(jArr4)] = (jArr4[i29] & 72057594037927935L) | Long.MIN_VALUE;
                                        i21++;
                                    } else {
                                        int i30 = i27 >> 3;
                                        long j16 = jArr4[i30];
                                        int i31 = (i27 & 7) << 3;
                                        long j17 = j15 << i31;
                                        long j18 = (~(j2 << i31)) & j16;
                                        if (((j16 >> i31) & j2) == 128) {
                                            long j19 = ~(j2 << i23);
                                            jArr4[i30] = j18 | j17;
                                            jArr4[i22] = (jArr4[i22] & j19) | (128 << i23);
                                            objArr[i27] = objArr[i21];
                                            objArr[i21] = null;
                                            iArr[i27] = iArr[i21];
                                            iArr[i21] = i29;
                                        } else {
                                            jArr4[i30] = j18 | j17;
                                            java.lang.Object obj3 = objArr[i27];
                                            objArr[i27] = objArr[i21];
                                            objArr[i21] = obj3;
                                            int i32 = iArr[i27];
                                            iArr[i27] = iArr[i21];
                                            iArr[i21] = i32;
                                            i21--;
                                        }
                                        jArr4[defpackage.afga.bG(jArr4)] = (jArr4[i29] & 72057594037927935L) | Long.MIN_VALUE;
                                        i21++;
                                    }
                                    jArr3 = jArr4;
                                    i19 = i29;
                                    j6 = j14;
                                } else {
                                    i21++;
                                }
                            }
                            j = j6;
                            i = i19;
                            j();
                        }
                        i14 = i(i4);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    i = 0;
                    int iB = defpackage.aav.b(this.d);
                    long[] jArr5 = this.a;
                    java.lang.Object[] objArr2 = this.b;
                    int[] iArr2 = this.c;
                    int i33 = this.d;
                    k(iB);
                    long[] jArr6 = this.a;
                    java.lang.Object[] objArr3 = this.b;
                    int[] iArr3 = this.c;
                    int i34 = this.d;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr5[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            java.lang.Object obj4 = objArr2[i35];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i13;
                            int i36 = iHashCode3 ^ (iHashCode3 << 16);
                            int i37 = i(i36 >>> 7);
                            int i38 = i37 >> 3;
                            int i39 = (i37 & 7) << 3;
                            jArr = jArr6;
                            long j20 = (jArr6[i38] & (~(255 << i39))) | (((long) (i36 & 127)) << i39);
                            jArr[i38] = j20;
                            jArr[(((i37 - 7) & i34) + (i34 & 7)) >> 3] = j20;
                            objArr3[i37] = obj4;
                            iArr3[i37] = iArr2[i35];
                        } else {
                            jArr = jArr6;
                        }
                        i35++;
                        jArr5 = jArr5;
                        jArr6 = jArr;
                    }
                    i14 = i(i4);
                }
                this.e++;
                int i40 = this.f;
                long[] jArr7 = this.a;
                int i41 = i14 >> 3;
                long j21 = jArr7[i41];
                int i42 = (i14 & 7) << 3;
                this.f = i40 - (((j21 >> i42) & j2) != j3 ? i : 1);
                int i43 = this.d;
                long j22 = (j21 & (~(j2 << i42))) | (j << i42);
                jArr7[i41] = j22;
                jArr7[(((i14 - 7) & i43) + (i43 & 7)) >> 3] = j22;
                return ~i14;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i3 = i10;
            i2 = i13;
        }
    }

    public final void e() {
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
        java.lang.Object[] objArr = this.b;
        int i3 = this.d;
        objArr.getClass();
        java.util.Arrays.fill(objArr, 0, i3, (java.lang.Object) null);
        j();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0065 A[LOOP:0: B:14:0x0023->B:30:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[SYNTHETIC] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.aal)) {
            return false;
        }
        defpackage.aal aalVar = (defpackage.aal) obj;
        if (aalVar.e != this.e) {
            return false;
        }
        java.lang.Object[] objArr = this.b;
        int[] iArr = this.c;
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
                                java.lang.Object obj2 = objArr[i5];
                                int i6 = iArr[i5];
                                int iA = aalVar.a(obj2);
                                if (iA < 0 || i6 != aalVar.c[iA]) {
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

    public final void f(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.d;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final void g(java.lang.Object obj, int i) {
        int iD = d(obj);
        if (iD < 0) {
            iD = ~iD;
        }
        this.b[iD] = obj;
        this.c[iD] = i;
    }

    public final int h(java.lang.Object obj, int i) {
        int i2;
        int iD = d(obj);
        if (iD < 0) {
            iD = ~iD;
            i2 = -1;
        } else {
            i2 = this.c[iD];
        }
        this.b[iD] = obj;
        this.c[iD] = i;
        return i2;
    }

    public final int hashCode() {
        int i;
        java.lang.Object[] objArr = this.b;
        int[] iArr = this.c;
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
                        iHashCode += iArr[i5] ^ (obj != null ? obj.hashCode() : 0);
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
        java.lang.Object[] objArr = this.b;
        int[] iArr = this.c;
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
                            int i7 = iArr[i6];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i7);
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

    public aal() {
    }
}
