package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zj {
    public long[] a = aao.a;
    public int[] b = zk.a;
    public int c;
    public int d;
    private int e;

    public zj(int i) {
        if (i < 0) {
            ca.Y("Capacity must be a positive value.");
        }
        h(aao.c(i));
    }

    private final int f(int i) {
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
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void g() {
        this.e = aao.a(this.c) - this.d;
    }

    private final void h(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            long[] jArr2 = aao.a;
            iMax = Math.max(7, (-1) >>> Integer.numberOfLeadingZeros(i));
        } else {
            iMax = 0;
        }
        this.c = iMax;
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
        g();
        this.b = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r3 = r2 << 16
            r2 = r2 ^ r3
            int r3 = r2 >>> 7
            int r4 = r0.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj.a(int):boolean");
    }

    public final void b() {
        this.d = 0;
        if (this.a != aao.a) {
            woy.du(this.a, -9187201950435737472L);
            long[] jArr = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        g();
    }

    public final void c(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = this.c;
        int i4 = (i & 7) << 3;
        long j = (jArr[i2] & (~(255 << i4))) | (254 << i4);
        jArr[i2] = j;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
    
        r22 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
    
        if (((r10 & ((~r10) << 6)) & (-9187201950435737472L)) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007e, code lost:
    
        r6 = f(r5);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
    
        if (r36.e != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        if (((r36.a[r6 >> 3] >> ((r6 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        r6 = r36.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a0, code lost:
    
        if (r6 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ba, code lost:
    
        if (java.lang.Long.compare((r36.d * 32) ^ Long.MIN_VALUE, (r6 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        r6 = r36.a;
        r7 = r36.c;
        r8 = r36.b;
        r9 = r7 + 7;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ca, code lost:
    
        if (r15 >= (r9 >> 3)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cc, code lost:
    
        r29 = r11;
        r11 = r6[r15] & (-9187201950435737472L);
        r6[r15] = (-72340172838076674L) & ((~r11) + (r11 >>> 7));
        r15 = r15 + 1;
        r13 = r13;
        r11 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
    
        r29 = r11;
        r10 = r13;
        r9 = defpackage.woy.cM(r6);
        r11 = r9 - 1;
        r14 = 72057594037927935L;
        r6[r11] = (r6[r11] & 72057594037927935L) | (-72057594037927936L);
        r6[r9] = r6[0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0106, code lost:
    
        if (r9 == r7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0108, code lost:
    
        r11 = r9 >> 3;
        r17 = (r9 & 7) << 3;
        r12 = (r6[r11] >> r17) & r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0116, code lost:
    
        if (r12 != 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0118, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011d, code lost:
    
        if (r12 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0120, code lost:
    
        r12 = r8[r9] * r10;
        r12 = r12 ^ (r12 << 16);
        r13 = r12 & 127;
        r12 = r12 >>> 7;
        r18 = f(r12);
        r12 = r12 & r7;
        r31 = r10;
        r32 = r14;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013f, code lost:
    
        if ((((r18 - r12) & r7) / 8) != (((r9 - r12) & r7) / 8)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0141, code lost:
    
        r6[r11] = (r6[r11] & (~(r29 << r17))) | (r14 << r17);
        r6[defpackage.woy.cM(r6)] = (r6[0] & r32) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r10 = r31;
        r14 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0160, code lost:
    
        r10 = r18 >> 3;
        r12 = r6[r10];
        r28 = (r18 & 7) << 3;
        r14 = r14 << r28;
        r34 = r2;
        r1 = (~(r29 << r28)) & r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0176, code lost:
    
        if (((r12 >> r28) & r29) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0178, code lost:
    
        r12 = ~(r29 << r17);
        r6[r10] = r1 | r14;
        r6[r11] = (r6[r11] & r12) | (128 << r17);
        r8[r18] = r8[r9];
        r8[r9] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x018d, code lost:
    
        r6[r10] = r1 | r14;
        r1 = r8[r18];
        r8[r18] = r8[r9];
        r8[r9] = r1;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x019a, code lost:
    
        r6[defpackage.woy.cM(r6)] = (r6[0] & r32) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r10 = r31;
        r14 = r32;
        r2 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b2, code lost:
    
        r34 = r2;
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b9, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01bb, code lost:
    
        r34 = r2;
        r29 = 255;
        r1 = defpackage.aao.b(r36.c);
        r2 = r36.a;
        r3 = r36.b;
        r6 = r36.c;
        h(r1);
        r1 = r36.a;
        r7 = r36.b;
        r8 = r36.c;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01da, code lost:
    
        if (r9 >= r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e9, code lost:
    
        if (((r2[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= r19) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01eb, code lost:
    
        r10 = r3[r9];
        r11 = r10 * r13;
        r12 = f((r11 ^ (r11 << 16)) >>> 7);
        r13 = r12 >> 3;
        r14 = (r12 & 7) << 3;
        r21 = r1;
        r15 = r2;
        r1 = (r1[r13] & (~(255 << r14))) | ((r11 & 127) << r14);
        r21[r13] = r1;
        r21[(((r12 - 7) & r8) + (r8 & 7)) >> 3] = r1;
        r7[r12] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x021f, code lost:
    
        r21 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0222, code lost:
    
        r9 = r9 + 1;
        r2 = r15;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0228, code lost:
    
        r12 = f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022e, code lost:
    
        r34 = r2;
        r29 = 255;
        r19 = 128;
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0237, code lost:
    
        r36.d++;
        r1 = r36.e;
        r2 = r36.a;
        r3 = r12 >> 3;
        r5 = r2[r3];
        r7 = (r12 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x024f, code lost:
    
        if (((r5 >> r7) & r29) != r19) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0251, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0254, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0256, code lost:
    
        r36.e = r1 - r8;
        r1 = r36.c;
        r5 = (r5 & (~(r29 << r7))) | (r34 << r7);
        r2[r3] = r5;
        r2[(((r12 - 7) & r1) + (r1 & 7)) >> 3] = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(int r37) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj.d(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r9 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r3 = r2 << 16
            r2 = r2 ^ r3
            int r3 = r2 >>> 7
            int r4 = r0.c
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
        L45:
            r14 = 0
            int r9 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r9 == 0) goto L5f
            int r9 = java.lang.Long.numberOfTrailingZeros(r5)
            int r9 = r9 >> 3
            int r9 = r9 + r3
            r9 = r9 & r4
            int[] r14 = r0.b
            r14 = r14[r9]
            if (r14 != r1) goto L5a
            goto L69
        L5a:
            r14 = -1
            long r14 = r14 + r5
            long r5 = r5 & r14
            goto L45
        L5f:
            long r5 = ~r7
            r9 = 6
            long r5 = r5 << r9
            long r5 = r5 & r7
            long r5 = r5 & r11
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 == 0) goto L74
            r9 = -1
        L69:
            if (r9 < 0) goto L6d
            r5 = r13
            goto L6e
        L6d:
            r5 = 0
        L6e:
            if (r5 == 0) goto L73
            r0.c(r9)
        L73:
            return r5
        L74:
            int r6 = r16 + 8
            int r3 = r3 + r6
            r3 = r3 & r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj.e(int):boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zj)) {
            return false;
        }
        zj zjVar = (zj) obj;
        if (zjVar.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i == length) {
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
                        } else {
                            if ((255 & j) < 128 && !zjVar.a(iArr[(i << 3) + i3])) {
                                return false;
                            }
                            j >>= 8;
                            i3++;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i2 - length;
                int i5 = 0;
                while (true) {
                    i = 8 - ((~i4) >>> 31);
                    if (i5 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        i3 += iArr[(i2 << 3) + i5];
                    }
                    j >>= 8;
                    i5++;
                }
                if (i != 8) {
                    return i3;
                }
            }
            if (i2 == length) {
                return i3;
            }
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i == length) {
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
                        } else {
                            if ((255 & j) < 128) {
                                int i6 = iArr[(i << 3) + i4];
                                if (i2 != 0) {
                                    sb.append((CharSequence) ", ");
                                }
                                if (i2 == -1) {
                                    sb.append((CharSequence) "...");
                                    break loop0;
                                }
                                sb.append(i6);
                                i2++;
                            }
                            j >>= 8;
                            i4++;
                        }
                    }
                }
            }
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public zj() {
    }
}
