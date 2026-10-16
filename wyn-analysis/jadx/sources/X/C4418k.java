package x;

import java.util.NoSuchElementException;
import ka.AbstractC3256n;

/* renamed from: x.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4418k {

    /* renamed from: a, reason: collision with root package name */
    public long[] f47514a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f47515b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f47516c;

    /* renamed from: d, reason: collision with root package name */
    public int f47517d;

    /* renamed from: e, reason: collision with root package name */
    public int f47518e;

    /* renamed from: f, reason: collision with root package name */
    public int f47519f;

    public final int a(int i5) {
        int i10 = this.f47517d;
        int i11 = i5 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f47514a;
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

    public final int b(int i5) {
        int i10 = (-862048943) * i5;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & 127;
        int i13 = this.f47517d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f47514a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j8 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (i12 * 72340172838076673L) ^ j8;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f47515b[iNumberOfTrailingZeros] == i5) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int c(int i5) {
        int iB = b(i5);
        if (iB >= 0) {
            return this.f47516c[iB];
        }
        throw new NoSuchElementException(AbstractC3256n.g(i5, "Cannot find value for key "));
    }

    public final void d(int i5) {
        long[] jArr;
        int iMax = i5 > 0 ? Math.max(7, AbstractC4427t.c(i5)) : 0;
        this.f47517d = iMax;
        if (iMax == 0) {
            jArr = AbstractC4427t.f47559a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ff.m.q0(jArr);
        }
        this.f47514a = jArr;
        int i10 = iMax >> 3;
        long j8 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j8)) | j8;
        this.f47519f = AbstractC4427t.a(this.f47517d) - this.f47518e;
        this.f47515b = new int[iMax];
        this.f47516c = new int[iMax];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
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
            boolean r3 = r1 instanceof x.C4418k
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            x.k r1 = (x.C4418k) r1
            int r3 = r1.f47518e
            int r5 = r0.f47518e
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f47515b
            int[] r5 = r0.f47516c
            long[] r6 = r0.f47514a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L61
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
            if (r11 == 0) goto L5c
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L5a
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L56
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.c(r15)
            if (r14 == r15) goto L56
            return r4
        L56:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L5a:
            if (r11 != r12) goto L61
        L5c:
            if (r8 == r7) goto L61
            int r8 = r8 + 1
            goto L23
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C4418k.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.f47515b;
        int[] iArr2 = this.f47516c;
        long[] jArr = this.f47514a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i5 = 0;
        int i10 = 0;
        while (true) {
            long j8 = jArr[i5];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i5 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j8) < 128) {
                        int i13 = (i5 << 3) + i12;
                        i10 += iArr2[i13] ^ iArr[i13];
                    }
                    j8 >>= 8;
                }
                if (i11 != 8) {
                    return i10;
                }
            }
            if (i5 == length) {
                return i10;
            }
            i5++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f47518e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            int[] r2 = r0.f47515b
            int[] r3 = r0.f47516c
            long[] r4 = r0.f47514a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6b
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
            if (r11 == 0) goto L66
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L64
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L60
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f47518e
            if (r8 >= r14) goto L60
            java.lang.String r14 = ", "
            r1.append(r14)
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L64:
            if (r11 != r12) goto L6b
        L66:
            if (r7 == r5) goto L6b
            int r7 = r7 + 1
            goto L1e
        L6b:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "s.append('}').toString()"
            kotlin.jvm.internal.AbstractC3340k.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C4418k.toString():java.lang.String");
    }
}
