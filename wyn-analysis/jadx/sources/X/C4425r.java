package x;

import kotlin.jvm.internal.AbstractC3340k;
import y.AbstractC4517a;

/* renamed from: x.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4425r {

    /* renamed from: a, reason: collision with root package name */
    public long[] f47553a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f47554b;

    /* renamed from: c, reason: collision with root package name */
    public int f47555c;

    /* renamed from: d, reason: collision with root package name */
    public int f47556d;

    /* renamed from: e, reason: collision with root package name */
    public int f47557e;

    public C4425r(int i5) {
        this.f47553a = AbstractC4427t.f47559a;
        this.f47554b = AbstractC4517a.f47915b;
        if (i5 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        f(AbstractC4427t.d(i5));
    }

    public final boolean a(Object obj) {
        int i5 = this.f47556d;
        this.f47554b[d(obj)] = obj;
        return this.f47556d != i5;
    }

    public final void b() {
        this.f47556d = 0;
        long[] jArr = this.f47553a;
        if (jArr != AbstractC4427t.f47559a) {
            ff.m.q0(jArr);
            long[] jArr2 = this.f47553a;
            int i5 = this.f47555c;
            int i10 = i5 >> 3;
            long j8 = 255 << ((i5 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j8)) | j8;
        }
        ff.m.o0(this.f47554b, null, 0, this.f47555c);
        this.f47557e = AbstractC4427t.a(this.f47555c) - this.f47556d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f47555c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f47553a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f47554b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.AbstractC3340k.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C4425r.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        long j8;
        long j10;
        Object[] objArr;
        long[] jArr;
        long j11;
        int i5 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f47555c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr2 = this.f47553a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j12 = ((jArr2[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr2[i16] >>> i17);
            long j13 = i12;
            int i18 = i12;
            long j14 = j12 ^ (j13 * 72340172838076673L);
            long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L);
            while (j15 != 0) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j15) >> 3)) & i13;
                int i19 = i5;
                if (AbstractC3340k.a(this.f47554b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i5 = i19;
            }
            int i20 = i5;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iE = e(i11);
                long j16 = 255;
                if (this.f47557e != 0 || ((this.f47553a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j8 = 255;
                    j10 = 128;
                } else {
                    int i21 = this.f47555c;
                    if (i21 <= 8 || Long.compare((this.f47556d * 32) ^ Long.MIN_VALUE, (i21 * 25) ^ Long.MIN_VALUE) > 0) {
                        j8 = 255;
                        j10 = 128;
                        int iB = AbstractC4427t.b(this.f47555c);
                        long[] jArr3 = this.f47553a;
                        Object[] objArr2 = this.f47554b;
                        int i22 = this.f47555c;
                        f(iB);
                        Object[] objArr3 = this.f47554b;
                        int i23 = 0;
                        while (i23 < i22) {
                            if (((jArr3[i23 >> 3] >> ((i23 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i23];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i20;
                                int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                int iE2 = e(i24 >>> 7);
                                long j17 = i24 & 127;
                                long[] jArr4 = this.f47553a;
                                int i25 = iE2 >> 3;
                                int i26 = (iE2 & 7) << 3;
                                objArr = objArr3;
                                jArr = jArr3;
                                jArr4[i25] = (jArr4[i25] & (~(255 << i26))) | (j17 << i26);
                                int i27 = this.f47555c;
                                int i28 = ((iE2 - 7) & i27) + (i27 & 7);
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                jArr4[i29] = (jArr4[i29] & (~(255 << i30))) | (j17 << i30);
                                objArr[iE2] = obj2;
                            } else {
                                objArr = objArr3;
                                jArr = jArr3;
                            }
                            i23++;
                            objArr3 = objArr;
                            jArr3 = jArr;
                        }
                    } else {
                        long[] jArr5 = this.f47553a;
                        int i31 = this.f47555c;
                        int i32 = 0;
                        int i33 = 0;
                        while (i32 < i31) {
                            int i34 = i32 >> 3;
                            int i35 = (i32 & 7) << 3;
                            if (((jArr5[i34] >> i35) & j16) == 254) {
                                long[] jArr6 = this.f47553a;
                                jArr6[i34] = (jArr6[i34] & (~(j16 << i35))) | (128 << i35);
                                int i36 = this.f47555c;
                                int i37 = ((i32 - 7) & i36) + (i36 & 7);
                                int i38 = i37 >> 3;
                                int i39 = (i37 & 7) << 3;
                                j11 = j16;
                                jArr6[i38] = (jArr6[i38] & (~(j11 << i39))) | (128 << i39);
                                i33++;
                            } else {
                                j11 = j16;
                            }
                            i32++;
                            j16 = j11;
                        }
                        j8 = j16;
                        j10 = 128;
                        this.f47557e += i33;
                    }
                    iE = e(i11);
                }
                this.f47556d++;
                int i40 = this.f47557e;
                long[] jArr7 = this.f47553a;
                int i41 = iE >> 3;
                long j18 = jArr7[i41];
                int i42 = (iE & 7) << 3;
                this.f47557e = i40 - (((j18 >> i42) & j8) == j10 ? 1 : 0);
                jArr7[i41] = (j18 & (~(j8 << i42))) | (j13 << i42);
                int i43 = this.f47555c;
                int i44 = ((iE - 7) & i43) + (i43 & 7);
                int i45 = i44 >> 3;
                int i46 = (i44 & 7) << 3;
                jArr7[i45] = (jArr7[i45] & (~(j8 << i46))) | (j13 << i46);
                return iE;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
            i5 = i20;
        }
    }

    public final int e(int i5) {
        int i10 = this.f47555c;
        int i11 = i5 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f47553a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j8 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j10 = j8 & ((~j8) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j10) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof x.C4425r
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            x.r r1 = (x.C4425r) r1
            int r3 = r1.f47556d
            int r5 = r0.f47556d
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f47554b
            long[] r5 = r0.f47553a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = r4
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.c(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C4425r.equals(java.lang.Object):boolean");
    }

    public final void f(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, AbstractC4427t.c(i5)) : 0;
        this.f47555c = iMax;
        if (iMax == 0) {
            jArr = AbstractC4427t.f47559a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ff.m.q0(jArr);
        }
        this.f47553a = jArr;
        int i10 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j8)) | j8;
        this.f47557e = AbstractC4427t.a(this.f47555c) - this.f47556d;
        this.f47554b = new Object[iMax];
    }

    public final boolean g() {
        return this.f47556d == 0;
    }

    public final boolean h() {
        return this.f47556d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f47554b;
        long[] jArr = this.f47553a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i5 = 0;
        int iHashCode = 0;
        while (true) {
            long j8 = jArr[i5];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i5 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j8) < 128) {
                        Object obj = objArr[(i5 << 3) + i11];
                        iHashCode += obj != null ? obj.hashCode() : 0;
                    }
                    j8 >>= 8;
                }
                if (i10 != 8) {
                    return iHashCode;
                }
            }
            if (i5 == length) {
                return iHashCode;
            }
            i5++;
        }
    }

    public final void i(C4425r elements) {
        AbstractC3340k.e(elements, "elements");
        Object[] objArr = elements.f47554b;
        long[] jArr = elements.f47553a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j8 = jArr[i5];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i5 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j8) < 128) {
                        Object obj = objArr[(i5 << 3) + i11];
                        this.f47554b[d(obj)] = obj;
                    }
                    j8 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f47555c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f47553a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f47554b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.AbstractC3340k.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.k(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C4425r.j(java.lang.Object):boolean");
    }

    public final void k(int i5) {
        this.f47556d--;
        long[] jArr = this.f47553a;
        int i10 = i5 >> 3;
        int i11 = (i5 & 7) << 3;
        jArr[i10] = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        int i12 = this.f47555c;
        int i13 = ((i5 - 7) & i12) + (i12 & 7);
        int i14 = i13 >> 3;
        int i15 = (i13 & 7) << 3;
        jArr[i14] = (jArr[i14] & (~(255 << i15))) | (254 << i15);
        this.f47554b[i5] = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x0029, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            N.G0 r1 = new N.G0
            r2 = 1
            r1.<init>(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            java.lang.Object[] r3 = r0.f47554b
            long[] r4 = r0.f47553a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
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
            if (r11 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L35:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r14 = r3[r14]
            r15 = -1
            if (r8 != r15) goto L4e
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L70
        L4e:
            if (r8 == 0) goto L55
            java.lang.String r15 = ", "
            r2.append(r15)
        L55:
            java.lang.Object r14 = r1.invoke(r14)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r2.append(r14)
            int r8 = r8 + 1
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L35
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1b
        L6b:
            java.lang.String r1 = "]"
            r2.append(r1)
        L70:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.AbstractC3340k.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C4425r.toString():java.lang.String");
    }

    public /* synthetic */ C4425r() {
        this(6);
    }
}
