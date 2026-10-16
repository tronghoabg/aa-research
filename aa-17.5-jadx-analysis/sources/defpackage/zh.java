package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zh {
    public long[] a = aao.a;
    public int[] b = zk.a;
    public Object[] c = aaz.c;
    public int d;
    public int e;
    private int f;

    public zh(int i) {
        if (i < 0) {
            ca.Y("Capacity must be a positive value.");
        }
        k(aao.c(i));
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
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void j() {
        this.f = aao.a(this.d) - this.e;
    }

    private final void k(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            long[] jArr2 = aao.a;
            iMax = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.d = iMax;
        if (iMax == 0) {
            jArr = aao.a;
        } else {
            int i2 = (iMax + 15) >> 3;
            long[] jArr3 = new long[i2];
            Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        j();
        this.b = new int[iMax];
        this.c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r15) {
        /*
            r14 = this;
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r15
            int r1 = r0 << 16
            r0 = r0 ^ r1
            int r1 = r0 >>> 7
            int r2 = r14.d
            r1 = r1 & r2
            r3 = 0
        Ld:
            r4 = r0 & 127(0x7f, float:1.78E-43)
            long[] r5 = r14.a
            r6 = r1 & 7
            int r7 = r1 >> 3
            r8 = r5[r7]
            int r6 = r6 << 3
            long r8 = r8 >>> r6
            int r7 = r7 + 1
            r10 = r5[r7]
            int r5 = 64 - r6
            long r10 = r10 << r5
            long r5 = (long) r6
            long r5 = -r5
            long r12 = (long) r4
            r4 = 63
            long r4 = r5 >> r4
            long r4 = r4 & r10
            long r4 = r4 | r8
            r6 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r12 = r12 * r6
            long r6 = r4 ^ r12
            r8 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r8 = r8 + r6
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L40:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r2
            int[] r11 = r14.b
            r11 = r11[r10]
            if (r11 != r15) goto L55
            goto L64
        L55:
            r10 = -1
            long r10 = r10 + r6
            long r6 = r6 & r10
            goto L40
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object[] r14 = r14.c
            r14 = r14[r10]
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r1 = r1 + r3
            r1 = r1 & r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh.a(int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r3 = r2 << 16
            r2 = r2 ^ r3
            int r3 = r2 >>> 7
            int r4 = r0.d
            r3 = r3 & r4
            r6 = 0
        L11:
            r7 = r2 & 127(0x7f, float:1.78E-43)
            long[] r8 = r0.a
            r9 = r3 & 7
            int r10 = r3 >> 3
            r11 = r8[r10]
            int r9 = r9 << 3
            long r11 = r11 >>> r9
            r13 = 1
            int r10 = r10 + r13
            r14 = r8[r10]
            int r8 = 64 - r9
            long r14 = r14 << r8
            long r8 = (long) r9
            long r8 = -r8
            r16 = r6
            r10 = 0
            long r5 = (long) r7
            r7 = 63
            long r7 = r8 >> r7
            long r7 = r7 & r14
            long r7 = r7 | r11
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r5 = r5 * r11
            long r5 = r5 ^ r7
            r11 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r11 = r11 + r5
            long r5 = ~r5
            long r5 = r5 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r11
        L46:
            r14 = 0
            int r9 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r9 == 0) goto L62
            int r9 = java.lang.Long.numberOfTrailingZeros(r5)
            int r9 = r9 >> 3
            int r9 = r9 + r3
            r9 = r9 & r4
            int[] r14 = r0.b
            r14 = r14[r9]
            if (r14 != r1) goto L5d
            if (r9 < 0) goto L70
            return r13
        L5d:
            r14 = -1
            long r14 = r14 + r5
            long r5 = r5 & r14
            goto L46
        L62:
            long r5 = ~r7
            r9 = 6
            long r5 = r5 << r9
            long r5 = r5 & r7
            long r5 = r5 & r11
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 != 0) goto L70
            int r6 = r16 + 8
            int r3 = r3 + r6
            r3 = r3 & r4
            goto L11
        L70:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh.b(int):boolean");
    }

    public final int c(int i) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2 = -862048943;
        int i3 = i * (-862048943);
        int i4 = i3 ^ (i3 << 16);
        int i5 = i4 >>> 7;
        int i6 = this.d;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = jArr3[i9] >>> i10;
            long j5 = jArr3[i9 + 1] << (64 - i10);
            int i11 = i2;
            int i12 = i4;
            long j6 = i4 & 127;
            long j7 = (j5 & ((-i10) >> 63)) | j4;
            long j8 = (72340172838076673L * j6) ^ j7;
            for (long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i7) & i6;
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
                        if (Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i14 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.a;
                            int i15 = this.d;
                            int[] iArr = this.b;
                            Object[] objArr = this.c;
                            int i16 = i15 + 7;
                            int i17 = 0;
                            while (i17 < (i16 >> 3)) {
                                char c2 = c;
                                long j12 = jArr4[i17] & (-9187201950435737472L);
                                jArr4[i17] = (-72340172838076674L) & ((~j12) + (j12 >>> 7));
                                i17++;
                                i16 = i16;
                                i11 = i11;
                                c = c2;
                                j11 = j11;
                            }
                            j2 = j11;
                            int i18 = i11;
                            int iCM = woy.cM(jArr4);
                            int i19 = iCM - 1;
                            jArr4[i19] = (jArr4[i19] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iCM] = jArr4[0];
                            int i20 = 0;
                            while (i20 != i15) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j13 = (jArr4[i21] >> i22) & j2;
                                if (j13 != 128 && j13 == 254) {
                                    int i23 = iArr[i20] * i18;
                                    int i24 = i23 ^ (i23 << 16);
                                    int i25 = i24 & 127;
                                    int i26 = i24 >>> 7;
                                    int i27 = i(i26);
                                    int i28 = i26 & i15;
                                    int i29 = i18;
                                    long j14 = j6;
                                    long[] jArr5 = jArr4;
                                    long j15 = i25;
                                    if (((i27 - i28) & i15) / 8 == ((i20 - i28) & i15) / 8) {
                                        jArr5[i21] = (j15 << i22) | ((~(j2 << i22)) & jArr5[i21]);
                                        jArr5[woy.cM(jArr5)] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i20++;
                                    } else {
                                        int i30 = i27 >> 3;
                                        long j16 = jArr5[i30];
                                        int i31 = (i27 & 7) << 3;
                                        long j17 = j15 << i31;
                                        long j18 = (~(j2 << i31)) & j16;
                                        if (((j16 >> i31) & j2) == 128) {
                                            long j19 = ~(j2 << i22);
                                            jArr5[i30] = j18 | j17;
                                            jArr5[i21] = (jArr5[i21] & j19) | (128 << i22);
                                            iArr[i27] = iArr[i20];
                                            iArr[i20] = 0;
                                            objArr[i27] = objArr[i20];
                                            objArr[i20] = null;
                                        } else {
                                            jArr5[i30] = j18 | j17;
                                            int i32 = iArr[i27];
                                            iArr[i27] = iArr[i20];
                                            iArr[i20] = i32;
                                            Object obj = objArr[i27];
                                            objArr[i27] = objArr[i20];
                                            objArr[i20] = obj;
                                            i20--;
                                        }
                                        jArr5[woy.cM(jArr5)] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i20++;
                                    }
                                    jArr4 = jArr5;
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
                    int iB = aao.b(this.d);
                    long[] jArr6 = this.a;
                    int[] iArr2 = this.b;
                    Object[] objArr2 = this.c;
                    int i33 = this.d;
                    k(iB);
                    long[] jArr7 = this.a;
                    int[] iArr3 = this.b;
                    Object[] objArr3 = this.c;
                    int i34 = this.d;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr6[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            int i36 = iArr2[i35];
                            int i37 = i36 * i11;
                            int i38 = i((i37 ^ (i37 << 16)) >>> 7);
                            int i39 = i38 >> 3;
                            int i40 = (i38 & 7) << 3;
                            jArr = jArr7;
                            jArr2 = jArr6;
                            long j20 = (jArr7[i39] & (~(255 << i40))) | ((r12 & 127) << i40);
                            jArr[i39] = j20;
                            jArr[(((i38 - 7) & i34) + (i34 & 7)) >> 3] = j20;
                            iArr3[i38] = i36;
                            objArr3[i38] = objArr2[i35];
                        } else {
                            jArr = jArr7;
                            jArr2 = jArr6;
                        }
                        i35++;
                        jArr6 = jArr2;
                        jArr7 = jArr;
                    }
                    i13 = i(i5);
                }
                this.e++;
                int i41 = this.f;
                long[] jArr8 = this.a;
                int i42 = i13 >> 3;
                long j21 = jArr8[i42];
                int i43 = (i13 & 7) << 3;
                this.f = i41 - (((j21 >> i43) & j2) != j3 ? 0 : 1);
                int i44 = this.d;
                long j22 = (j21 & (~(j2 << i43))) | (j << i43);
                jArr8[i42] = j22;
                jArr8[(((i13 - 7) & i44) + (i44 & 7)) >> 3] = j22;
                return ~i13;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
            i4 = i12;
            i2 = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r15) {
        /*
            r14 = this;
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r15
            int r1 = r0 << 16
            r0 = r0 ^ r1
            int r1 = r0 >>> 7
            int r2 = r14.d
            r1 = r1 & r2
            r3 = 0
        Ld:
            r4 = r0 & 127(0x7f, float:1.78E-43)
            long[] r5 = r14.a
            r6 = r1 & 7
            int r7 = r1 >> 3
            r8 = r5[r7]
            int r6 = r6 << 3
            long r8 = r8 >>> r6
            int r7 = r7 + 1
            r10 = r5[r7]
            int r5 = 64 - r6
            long r10 = r10 << r5
            long r5 = (long) r6
            long r5 = -r5
            long r12 = (long) r4
            r4 = 63
            long r4 = r5 >> r4
            long r4 = r4 & r10
            long r4 = r4 | r8
            r6 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r12 = r12 * r6
            long r6 = r4 ^ r12
            r8 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r8 = r8 + r6
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L40:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r2
            int[] r11 = r14.b
            r11 = r11[r10]
            if (r11 != r15) goto L55
            goto L64
        L55:
            r10 = -1
            long r10 = r10 + r6
            long r6 = r6 & r10
            goto L40
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object r14 = r14.e(r10)
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r1 = r1 + r3
            r1 = r1 & r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh.d(int):java.lang.Object");
    }

    public final Object e(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.d;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof defpackage.zh
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            zh r1 = (defpackage.zh) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.b
            java.lang.Object[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L75
            r7 = r4
        L23:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L70
            int r10 = r7 - r6
            r11 = r4
        L36:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L6e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L6a
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r3[r12]
            r12 = r5[r12]
            if (r12 != 0) goto L5f
            java.lang.Object r12 = r1.a(r14)
            if (r12 != 0) goto L5e
            boolean r12 = r1.b(r14)
            if (r12 == 0) goto L5e
            goto L6a
        L5e:
            return r4
        L5f:
            java.lang.Object r14 = r1.a(r14)
            boolean r12 = defpackage.affa.f(r12, r14)
            if (r12 != 0) goto L6a
            return r4
        L6a:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L36
        L6e:
            if (r12 != r13) goto L75
        L70:
            if (r7 == r6) goto L75
            int r7 = r7 + 1
            goto L23
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh.equals(java.lang.Object):boolean");
    }

    public final void f() {
        this.e = 0;
        if (this.a != aao.a) {
            woy.du(this.a, -9187201950435737472L);
            long[] jArr = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        woy.cE(this.c, null, 0, this.d);
        j();
    }

    public final void g(int i, Object obj) {
        int iC = c(i);
        if (iC < 0) {
            iC = ~iC;
        }
        this.b[iC] = i;
        this.c[iC] = obj;
    }

    public final void h(int i, Object obj) {
        int iC = c(i);
        if (iC < 0) {
            iC = ~iC;
        }
        Object[] objArr = this.c;
        Object obj2 = objArr[iC];
        this.b[iC] = i;
        objArr[iC] = obj;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.b;
        Object[] objArr = this.c;
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
                        Object obj = objArr[i5];
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[PHI: r8
  0x0067: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:8:0x0029, B:21:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.e
            if (r1 == 0) goto L76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.b
            java.lang.Object[] r3 = r0.c
            long[] r4 = r0.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6c
            r6 = 0
            r7 = r6
            r8 = r7
        L1b:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = r6
        L31:
            r13 = 8
            int r14 = 8 - r11
            if (r12 >= r14) goto L65
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L61
            int r14 = r7 << 3
            int r14 = r14 + r12
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L53
            java.lang.String r14 = "(this)"
        L53:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.e
            if (r8 >= r14) goto L61
            java.lang.String r14 = ", "
            r1.append(r14)
        L61:
            long r9 = r9 >> r13
            int r12 = r12 + 1
            goto L31
        L65:
            if (r14 != r13) goto L6c
        L67:
            if (r7 == r5) goto L6c
            int r7 = r7 + 1
            goto L1b
        L6c:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L76:
            java.lang.String r0 = "{}"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh.toString():java.lang.String");
    }

    public zh() {
    }
}
