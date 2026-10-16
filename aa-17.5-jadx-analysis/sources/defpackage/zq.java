package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zq {
    public long[] a = aao.a;
    public long[] b = zr.a;
    public int c;
    public int d;
    public int e;

    public zq(int i) {
        d(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        if (((((~r6) << 6) & r6) & (-9187201950435737472L)) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(long r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = defpackage.a.g(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 7
            int r3 = r0.c
            r2 = r2 & r3
            r5 = 0
        L13:
            r6 = r1 & 127(0x7f, float:1.78E-43)
            long[] r7 = r0.a
            r8 = r2 & 7
            int r9 = r2 >> 3
            r10 = r7[r9]
            int r8 = r8 << 3
            long r10 = r10 >>> r8
            r12 = 1
            int r9 = r9 + r12
            r13 = r7[r9]
            int r7 = 64 - r8
            long r13 = r13 << r7
            long r7 = (long) r8
            long r7 = -r7
            r15 = r5
            r9 = 0
            long r4 = (long) r6
            r6 = 63
            long r6 = r7 >> r6
            long r6 = r6 & r13
            long r6 = r6 | r10
            r10 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r4 = r4 * r10
            long r4 = r4 ^ r6
            r10 = -72340172838076673(0xfefefefefefefeff, double:-5.314010372517808E303)
            long r10 = r10 + r4
            long r4 = ~r4
            long r4 = r4 & r10
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r10
        L47:
            r13 = 0
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 == 0) goto L65
            int r8 = java.lang.Long.numberOfTrailingZeros(r4)
            int r8 = r8 >> 3
            int r8 = r8 + r2
            r8 = r8 & r3
            long[] r13 = r0.b
            r16 = r13[r8]
            int r13 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r13 != 0) goto L60
            if (r8 < 0) goto L73
            return r12
        L60:
            r13 = -1
            long r13 = r13 + r4
            long r4 = r4 & r13
            goto L47
        L65:
            long r4 = ~r6
            r8 = 6
            long r4 = r4 << r8
            long r4 = r4 & r6
            long r4 = r4 & r10
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 != 0) goto L73
            int r5 = r15 + 8
            int r2 = r2 + r5
            r2 = r2 & r3
            goto L13
        L73:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq.a(long):boolean");
    }

    public final int b(int i) {
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

    public final void c() {
        this.e = aao.a(this.c) - this.d;
    }

    public final void d(int i) {
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
        c();
        this.b = new long[iMax];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zq)) {
            return false;
        }
        zq zqVar = (zq) obj;
        if (zqVar.d != this.d) {
            return false;
        }
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
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
                            if ((255 & j) < 128 && !zqVar.a(jArr[(i << 3) + i3])) {
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
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iG = 0;
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
                        iG += a.g(jArr[(i2 << 3) + i4]);
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return iG;
                }
            }
            if (i2 == length) {
                return iG;
            }
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
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
                                long j2 = jArr[(i << 3) + i4];
                                if (i2 != 0) {
                                    sb.append((CharSequence) ", ");
                                }
                                if (i2 == -1) {
                                    sb.append((CharSequence) "...");
                                    break loop0;
                                }
                                sb.append(j2);
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

    public zq() {
    }
}
