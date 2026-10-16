package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aaw {
    public long[] a = defpackage.aav.a;
    public java.lang.Object[] b = defpackage.abg.c;
    public int c;
    public int d;
    public java.util.Set e;
    private int f;

    public aaw(int i) {
        p(i);
    }

    private final int m(java.lang.Object obj) {
        long j;
        long j2;
        int i;
        int i2;
        long j3;
        long[] jArr;
        int i3 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = this.c;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = jArr2[i9] >>> i10;
            int i11 = 1;
            long j5 = jArr2[i9 + 1] << (64 - i10);
            int i12 = i4;
            int i13 = 0;
            long j6 = i4 & 127;
            long j7 = (j5 & ((-i10) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j9) >> 3) + i7) & i6;
                int i14 = i3;
                if (defpackage.afga.f(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i3 = i14;
            }
            int i15 = i3;
            long j10 = j7 & ((~j7) << 6) & (-9187201950435737472L);
            int i16 = 8;
            if (j10 != 0) {
                int iN = n(i5);
                long j11 = 255;
                if (this.f != 0 || ((this.a[iN >> 3] >> ((iN & 7) << 3)) & 255) == 254) {
                    j = j6;
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i17 = this.c;
                    if (i17 > 8) {
                        j3 = 128;
                        if (java.lang.Long.compare((((long) this.d) * 32) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i18 = this.c;
                            java.lang.Object[] objArr = this.b;
                            int i19 = i18 + 7;
                            int i20 = 0;
                            while (i20 < (i19 >> 3)) {
                                long j12 = jArr3[i20] & (-9187201950435737472L);
                                jArr3[i20] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i20++;
                                i16 = i16;
                                j11 = j11;
                            }
                            int i21 = i16;
                            j2 = j11;
                            int iBG = defpackage.afga.bG(jArr3);
                            int i22 = iBG - 1;
                            jArr3[i22] = (jArr3[i22] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iBG] = jArr3[0];
                            int i23 = 0;
                            while (i23 != i18) {
                                int i24 = i23 >> 3;
                                int i25 = (i23 & 7) << 3;
                                long j13 = (jArr3[i24] >> i25) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    java.lang.Object obj2 = objArr[i23];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : i13) * i15;
                                    int i26 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i27 = i26 & 127;
                                    int i28 = i26 >>> 7;
                                    int iN2 = n(i28);
                                    int i29 = i28 & i18;
                                    int i30 = i13;
                                    int i31 = ((iN2 - i29) & i18) / 8;
                                    int i32 = ((i23 - i29) & i18) / i21;
                                    int i33 = i21;
                                    int i34 = i11;
                                    long j14 = i27;
                                    if (i31 == i32) {
                                        jArr3[i24] = ((~(j2 << i25)) & jArr3[i24]) | (j14 << i25);
                                        jArr3[defpackage.afga.bG(jArr3)] = (jArr3[i30] & 72057594037927935L) | Long.MIN_VALUE;
                                        i23++;
                                        i11 = i34;
                                        i13 = i30;
                                        i21 = i33;
                                    } else {
                                        int i35 = iN2 >> 3;
                                        long j15 = jArr3[i35];
                                        int i36 = (iN2 & 7) << 3;
                                        long j16 = j14 << i36;
                                        long j17 = j6;
                                        long[] jArr4 = jArr3;
                                        long j18 = j15 & (~(j2 << i36));
                                        if (((j15 >> i36) & j2) == 128) {
                                            long j19 = ~(j2 << i25);
                                            jArr4[i35] = j18 | j16;
                                            jArr4[i24] = (j19 & jArr4[i24]) | (128 << i25);
                                            objArr[iN2] = objArr[i23];
                                            objArr[i23] = null;
                                        } else {
                                            jArr4[i35] = j18 | j16;
                                            java.lang.Object obj3 = objArr[iN2];
                                            objArr[iN2] = objArr[i23];
                                            objArr[i23] = obj3;
                                            i23--;
                                        }
                                        jArr4[defpackage.afga.bG(jArr4)] = (jArr4[i30] & 72057594037927935L) | Long.MIN_VALUE;
                                        i23++;
                                        jArr3 = jArr4;
                                        i11 = i34;
                                        i13 = i30;
                                        i21 = i33;
                                        j6 = j17;
                                    }
                                } else {
                                    i23++;
                                }
                            }
                            j = j6;
                            i = i13;
                            i2 = i11;
                            o();
                        }
                        iN = n(i5);
                    } else {
                        j3 = 128;
                    }
                    j = j6;
                    j2 = 255;
                    i = 0;
                    i2 = 1;
                    int iB = defpackage.aav.b(this.c);
                    long[] jArr5 = this.a;
                    java.lang.Object[] objArr2 = this.b;
                    int i37 = this.c;
                    p(iB);
                    long[] jArr6 = this.a;
                    java.lang.Object[] objArr3 = this.b;
                    int i38 = this.c;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr5[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < j3) {
                            java.lang.Object obj4 = objArr2[i39];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i15;
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iN3 = n(i40 >>> 7);
                            int i41 = iN3 >> 3;
                            int i42 = (iN3 & 7) << 3;
                            jArr = jArr6;
                            long j20 = ((~(255 << i42)) & jArr6[i41]) | (((long) (i40 & 127)) << i42);
                            jArr[i41] = j20;
                            jArr[(((iN3 - 7) & i38) + (i38 & 7)) >> 3] = j20;
                            objArr3[iN3] = obj4;
                        } else {
                            jArr = jArr6;
                        }
                        i39++;
                        jArr5 = jArr5;
                        jArr6 = jArr;
                    }
                    iN = n(i5);
                }
                this.d++;
                int i43 = this.f;
                long[] jArr7 = this.a;
                int i44 = iN >> 3;
                long j21 = jArr7[i44];
                int i45 = (iN & 7) << 3;
                if (((j21 >> i45) & j2) != j3) {
                    i2 = i;
                }
                this.f = i43 - i2;
                int i46 = this.c;
                long j22 = (j21 & (~(j2 << i45))) | (j << i45);
                jArr7[i44] = j22;
                jArr7[(((iN - 7) & i46) + (i46 & 7)) >> 3] = j22;
                return iN;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i4 = i12;
            i3 = i15;
        }
    }

    private final int n(int i) {
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

    private final void o() {
        this.f = defpackage.aav.a(this.c) - this.d;
    }

    private final void p(int i) {
        int iMax;
        long[] jArr;
        int i2 = 0;
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
            int i3 = (iMax + 15) >> 3;
            long[] jArr3 = new long[i3];
            java.util.Arrays.fill(jArr3, 0, i3, -9187201950435737472L);
            i2 = iMax;
            jArr = jArr3;
        }
        this.a = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((7 & i2) << 3);
        jArr[i4] = j | (jArr[i4] & (~j));
        o();
        this.b = iMax == 0 ? defpackage.abg.c : new java.lang.Object[iMax];
    }

    public final boolean a(java.lang.Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = this.c;
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
        return this.d == 0;
    }

    public final boolean c() {
        return this.d != 0;
    }

    public final void d() {
        this.d = 0;
        if (this.a != defpackage.aav.a) {
            long[] jArr = this.a;
            int length = jArr.length;
            jArr.getClass();
            java.util.Arrays.fill(jArr, 0, length, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        java.lang.Object[] objArr = this.b;
        int i3 = this.c;
        objArr.getClass();
        java.util.Arrays.fill(objArr, 0, i3, (java.lang.Object) null);
        o();
    }

    public final void e(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.c;
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
            } else {
                i += 8;
                i5 = i6 + i;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            i(iNumberOfTrailingZeros);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b A[LOOP:0: B:14:0x0021->B:28:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x005e A[SYNTHETIC] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.aaw)) {
            return false;
        }
        defpackage.aaw aawVar = (defpackage.aaw) obj;
        if (aawVar.d != this.d) {
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
                            if ((255 & j) < 128 && !aawVar.a(objArr[(i << 3) + i3])) {
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

    public final void f(defpackage.aaw aawVar) {
        int i;
        aawVar.getClass();
        java.lang.Object[] objArr = aawVar.b;
        long[] jArr = aawVar.a;
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
                        h(objArr[(i2 << 3) + i4]);
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

    public final void g(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
    }

    public final void h(java.lang.Object obj) {
        this.b[m(obj)] = obj;
    }

    public final int hashCode() {
        int i;
        java.lang.Object[] objArr = this.b;
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
                        java.lang.Object obj = objArr[(i2 << 3) + i4];
                        iHashCode += obj != null ? obj.hashCode() : 0;
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

    public final void i(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.c;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public final boolean j(java.lang.Object obj) {
        int i = this.d;
        this.b[m(obj)] = obj;
        return this.d != i;
    }

    public final boolean k(java.lang.Iterable iterable) {
        int i = this.d;
        g(iterable);
        return i != this.d;
    }

    public final boolean l(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int i = this.c;
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
            i(iNumberOfTrailingZeros);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066 A[LOOP:0: B:5:0x001b->B:22:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[EDGE_INSN: B:27:0x0069->B:23:0x0069 BREAK  A[LOOP:0: B:5:0x001b->B:22:0x0066], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.CharSequence, java.lang.Object] */
    public final java.lang.String toString() {
        defpackage.aap aapVar = new defpackage.aap(this, 2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        java.lang.Object[] objArr = this.b;
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
                            java.lang.Object obj = objArr[(i << 3) + i4];
                            if (i2 != 0) {
                                sb.append((java.lang.CharSequence) ", ");
                            }
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) "...");
                                break loop0;
                            }
                            sb.append((java.lang.CharSequence) aapVar.invoke(obj));
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

    public aaw() {
    }
}
