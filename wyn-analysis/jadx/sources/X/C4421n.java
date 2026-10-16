package x;

import kotlin.jvm.internal.AbstractC3340k;
import y.AbstractC4517a;

/* renamed from: x.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4421n {

    /* renamed from: a, reason: collision with root package name */
    public long[] f47528a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f47529b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f47530c;

    /* renamed from: d, reason: collision with root package name */
    public int f47531d;

    /* renamed from: e, reason: collision with root package name */
    public int f47532e;

    /* renamed from: f, reason: collision with root package name */
    public int f47533f;

    public C4421n(int i5) {
        this.f47528a = AbstractC4427t.f47559a;
        this.f47529b = AbstractC4517a.f47915b;
        this.f47530c = AbstractC4414g.f47507a;
        if (i5 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        d(AbstractC4427t.d(i5));
    }

    public final int a(int i5) {
        int i10 = this.f47531d;
        int i11 = i5 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f47528a;
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

    public final int b(Object obj) {
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
        int i13 = this.f47531d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr2 = this.f47528a;
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
                if (AbstractC3340k.a(this.f47529b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j15 &= j15 - 1;
                i5 = i19;
            }
            int i20 = i5;
            if ((((~j12) << 6) & j12 & (-9187201950435737472L)) != 0) {
                int iA = a(i11);
                long j16 = 255;
                if (this.f47533f != 0 || ((this.f47528a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j8 = 255;
                    j10 = 128;
                } else {
                    int i21 = this.f47531d;
                    if (i21 <= 8 || Long.compare((this.f47532e * 32) ^ Long.MIN_VALUE, (i21 * 25) ^ Long.MIN_VALUE) > 0) {
                        j8 = 255;
                        j10 = 128;
                        int iB = AbstractC4427t.b(this.f47531d);
                        long[] jArr3 = this.f47528a;
                        Object[] objArr2 = this.f47529b;
                        int[] iArr = this.f47530c;
                        int i22 = this.f47531d;
                        d(iB);
                        Object[] objArr3 = this.f47529b;
                        int[] iArr2 = this.f47530c;
                        int i23 = 0;
                        while (i23 < i22) {
                            if (((jArr3[i23 >> 3] >> ((i23 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i23];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i20;
                                int i24 = iHashCode2 ^ (iHashCode2 << 16);
                                int iA2 = a(i24 >>> 7);
                                objArr = objArr3;
                                jArr = jArr3;
                                long j17 = i24 & 127;
                                long[] jArr4 = this.f47528a;
                                int i25 = iA2 >> 3;
                                int i26 = (iA2 & 7) << 3;
                                jArr4[i25] = (jArr4[i25] & (~(255 << i26))) | (j17 << i26);
                                int i27 = this.f47531d;
                                int i28 = ((iA2 - 7) & i27) + (i27 & 7);
                                int i29 = i28 >> 3;
                                int i30 = (i28 & 7) << 3;
                                jArr4[i29] = (jArr4[i29] & (~(255 << i30))) | (j17 << i30);
                                objArr[iA2] = obj2;
                                iArr2[iA2] = iArr[i23];
                            } else {
                                objArr = objArr3;
                                jArr = jArr3;
                            }
                            i23++;
                            jArr3 = jArr;
                            objArr3 = objArr;
                        }
                    } else {
                        long[] jArr5 = this.f47528a;
                        int i31 = this.f47531d;
                        int i32 = 0;
                        int i33 = 0;
                        while (i32 < i31) {
                            int i34 = i32 >> 3;
                            int i35 = (i32 & 7) << 3;
                            if (((jArr5[i34] >> i35) & j16) == 254) {
                                long[] jArr6 = this.f47528a;
                                jArr6[i34] = (jArr6[i34] & (~(j16 << i35))) | (128 << i35);
                                int i36 = this.f47531d;
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
                        this.f47533f += i33;
                    }
                    iA = a(i11);
                }
                this.f47532e++;
                int i40 = this.f47533f;
                long[] jArr7 = this.f47528a;
                int i41 = iA >> 3;
                long j18 = jArr7[i41];
                int i42 = (iA & 7) << 3;
                this.f47533f = i40 - (((j18 >> i42) & j8) == j10 ? 1 : 0);
                jArr7[i41] = (j18 & (~(j8 << i42))) | (j13 << i42);
                int i43 = this.f47531d;
                int i44 = ((iA - 7) & i43) + (i43 & 7);
                int i45 = i44 >> 3;
                int i46 = (i44 & 7) << 3;
                jArr7[i45] = (jArr7[i45] & (~(j8 << i46))) | (j13 << i46);
                return ~iA;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
            i5 = i20;
        }
    }

    public final int c(Object obj) {
        int i5 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f47531d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f47528a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j8 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (i11 * 72340172838076673L) ^ j8;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                if (AbstractC3340k.a(this.f47529b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i13 = i14 + i5;
        }
    }

    public final void d(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, AbstractC4427t.c(i5)) : 0;
        this.f47531d = iMax;
        if (iMax == 0) {
            jArr = AbstractC4427t.f47559a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ff.m.q0(jArr);
        }
        this.f47528a = jArr;
        int i10 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j8)) | j8;
        this.f47533f = AbstractC4427t.a(this.f47531d) - this.f47532e;
        this.f47529b = new Object[iMax];
        this.f47530c = new int[iMax];
    }

    public final void e(int i5) {
        this.f47532e--;
        long[] jArr = this.f47528a;
        int i10 = i5 >> 3;
        int i11 = (i5 & 7) << 3;
        jArr[i10] = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        int i12 = this.f47531d;
        int i13 = ((i5 - 7) & i12) + (i12 & 7);
        int i14 = i13 >> 3;
        int i15 = (i13 & 7) << 3;
        jArr[i14] = (jArr[i14] & (~(255 << i15))) | (254 << i15);
        this.f47529b[i5] = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
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
            boolean r3 = r1 instanceof x.C4421n
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            x.n r1 = (x.C4421n) r1
            int r3 = r1.f47532e
            int r5 = r0.f47532e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f47529b
            int[] r5 = r0.f47530c
            long[] r6 = r0.f47528a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L80
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L7b
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L79
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L75
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r16 = r1.c(r15)
            if (r16 < 0) goto L5c
            int[] r15 = r1.f47530c
            r15 = r15[r16]
            if (r14 == r15) goto L75
            return r4
        L5c:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "There is no key "
            r2.<init>(r3)
            r2.append(r15)
            java.lang.String r3 = " in the map"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L75:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L79:
            if (r11 != r12) goto L80
        L7b:
            if (r8 == r7) goto L80
            int r8 = r8 + 1
            goto L23
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C4421n.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.f47529b;
        int[] iArr = this.f47530c;
        long[] jArr = this.f47528a;
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
                        int i12 = (i5 << 3) + i11;
                        Object obj = objArr[i12];
                        iHashCode += iArr[i12] ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f47532e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f47529b
            int[] r3 = r0.f47530c
            long[] r4 = r0.f47528a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
            r6 = 0
            r7 = r6
            r8 = r7
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L64
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            if (r15 != r0) goto L4e
            java.lang.String r15 = "(this)"
        L4e:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f47532e
            if (r8 >= r14) goto L64
            java.lang.String r14 = ", "
            r1.append(r14)
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L68:
            if (r11 != r12) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L1e
        L6f:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "s.append('}').toString()"
            kotlin.jvm.internal.AbstractC3340k.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C4421n.toString():java.lang.String");
    }

    public /* synthetic */ C4421n() {
        this(6);
    }
}
