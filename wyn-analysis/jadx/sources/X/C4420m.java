package x;

import y.AbstractC4517a;

/* renamed from: x.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4420m {

    /* renamed from: a, reason: collision with root package name */
    public long[] f47522a = AbstractC4427t.f47559a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f47523b = AbstractC4414g.f47507a;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f47524c = AbstractC4517a.f47915b;

    /* renamed from: d, reason: collision with root package name */
    public int f47525d;

    /* renamed from: e, reason: collision with root package name */
    public int f47526e;

    /* renamed from: f, reason: collision with root package name */
    public int f47527f;

    public C4420m() {
        c(AbstractC4427t.d(6));
    }

    public final int a(int i5) {
        int i10 = this.f47525d;
        int i11 = i5 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f47522a;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r14) {
        /*
            r13 = this;
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r14
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f47525d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        Lf:
            long[] r4 = r13.f47522a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3b:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L56
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f47523b
            r11 = r11[r10]
            if (r11 != r14) goto L50
            goto L60
        L50:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3b
        L56:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L69
            r10 = -1
        L60:
            if (r10 < 0) goto L67
            java.lang.Object[] r14 = r13.f47524c
            r14 = r14[r10]
            return r14
        L67:
            r14 = 0
            return r14
        L69:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C4420m.b(int):java.lang.Object");
    }

    public final void c(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, AbstractC4427t.c(i5)) : 0;
        this.f47525d = iMax;
        if (iMax == 0) {
            jArr = AbstractC4427t.f47559a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ff.m.q0(jArr);
        }
        this.f47522a = jArr;
        int i10 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j8)) | j8;
        this.f47527f = AbstractC4427t.a(this.f47525d) - this.f47526e;
        this.f47523b = new int[iMax];
        this.f47524c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0076, code lost:
    
        if (((((~r7) << 6) & r7) & r11) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        r2 = a(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
    
        if (r29.f47527f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
    
        if (((r29.f47522a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        r22 = 255;
        r20 = 1;
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        r2 = r29.f47525d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if (r2 <= 8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (java.lang.Long.compare((r29.f47526e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        r2 = r29.f47522a;
        r3 = r29.f47525d;
        r5 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c2, code lost:
    
        if (r5 >= r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        r7 = r5 >> 3;
        r8 = (r5 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d2, code lost:
    
        if (((r2[r7] >> r8) & r11) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:
    
        r13 = r29.f47522a;
        r22 = r11;
        r13[r7] = (r13[r7] & (~(r22 << r8))) | (128 << r8);
        r7 = r29.f47525d;
        r8 = ((r5 - 7) & r7) + (r7 & 7);
        r7 = r8 >> 3;
        r8 = (r8 & 7) << 3;
        r20 = r14;
        r13[r7] = (r13[r7] & (~(r22 << r8))) | (128 << r8);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0103, code lost:
    
        r22 = r11;
        r20 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0107, code lost:
    
        r5 = r5 + 1;
        r14 = r20;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010e, code lost:
    
        r22 = r11;
        r20 = r14;
        r29.f47527f += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0119, code lost:
    
        r22 = 255;
        r20 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011e, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0121, code lost:
    
        r2 = x.AbstractC4427t.b(r29.f47525d);
        r3 = r29.f47522a;
        r5 = r29.f47523b;
        r6 = r29.f47524c;
        r7 = r29.f47525d;
        c(r2);
        r2 = r29.f47523b;
        r8 = r29.f47524c;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0137, code lost:
    
        if (r11 >= r7) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0146, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r16) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0148, code lost:
    
        r12 = r5[r11];
        r14 = r12 * r13;
        r14 = r14 ^ (r14 << 16);
        r15 = a(r14 >>> 7);
        r13 = r14 & 127;
        r1 = r29.f47522a;
        r19 = r15 >> 3;
        r24 = (r15 & 7) << 3;
        r27 = r2;
        r1[r19] = (r1[r19] & (~(255 << r24))) | (r13 << r24);
        r1 = r29.f47525d;
        r2 = ((r15 - 7) & r1) + (r1 & 7);
        r1 = r2 >> 3;
        r2 = (r2 & 7) << 3;
        r1[r1] = (r1[r1] & (~(255 << r2))) | (r13 << r2);
        r27[r15] = r12;
        r8[r15] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0196, code lost:
    
        r27 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0198, code lost:
    
        r11 = r11 + 1;
        r2 = r27;
        r13 = -862048943;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a2, code lost:
    
        r1 = a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a7, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a8, code lost:
    
        r29.f47526e++;
        r2 = r29.f47527f;
        r3 = r29.f47522a;
        r4 = r1 >> 3;
        r5 = r3[r4];
        r7 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c0, code lost:
    
        if (((r5 >> r7) & r22) != r16) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c3, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c5, code lost:
    
        r29.f47527f = r2 - r20;
        r3[r4] = (r5 & (~(r22 << r7))) | (r9 << r7);
        r2 = r29.f47525d;
        r4 = ((r1 - 7) & r2) + (r2 & 7);
        r2 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r3[r2] = (r3[r2] & (~(r22 << r4))) | (r9 << r4);
        r17 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r30, java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C4420m.d(int, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        r26 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    
        if (((r2 & ((~r2) << 6)) & r19) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        r24 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        return r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C4420m.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.f47523b;
        Object[] objArr = this.f47524c;
        long[] jArr = this.f47522a;
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
                        int i13 = iArr[i12];
                        Object obj = objArr[i12];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ i13;
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
            int r1 = r0.f47526e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.f47523b
            java.lang.Object[] r3 = r0.f47524c
            long[] r4 = r0.f47522a
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
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L56
            java.lang.String r14 = "(this)"
        L56:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f47526e
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
        throw new UnsupportedOperationException("Method not decompiled: x.C4420m.toString():java.lang.String");
    }
}
