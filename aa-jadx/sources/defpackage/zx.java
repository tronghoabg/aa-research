package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zx {
    public long[] a = defpackage.aav.a;
    public long[] b = defpackage.zy.a;
    public int c;
    public int d;
    public int e;

    public zx(int i) {
        d(i);
    }

    public final boolean a(long j) {
        int iF = defpackage.a.f(j) * (-862048943);
        int i = iF ^ (iF << 16);
        int i2 = this.c;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            int i7 = i4;
            long j2 = (((-i6) >> 63) & (jArr[i5 + 1] << (64 - i6))) | (jArr[i5] >>> i6);
            long j3 = (((long) (i & 127)) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j4) >> 3) + i3) & i2;
                if (this.b[iNumberOfTrailingZeros] == j) {
                    if (iNumberOfTrailingZeros >= 0) {
                        return true;
                    }
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                break;
            }
            i4 = i7 + 8;
            i3 = (i3 + i4) & i2;
        }
        return false;
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
                return (i3 + (java.lang.Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void c() {
        this.e = defpackage.aav.a(this.c) - this.d;
    }

    public final void d(int i) {
        int iMax;
        long[] jArr;
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
            int i2 = (iMax + 15) >> 3;
            long[] jArr3 = new long[i2];
            java.util.Arrays.fill(jArr3, 0, i2, -9187201950435737472L);
            jArr = jArr3;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        c();
        this.b = new long[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005b A[LOOP:0: B:14:0x0021->B:28:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x005e A[SYNTHETIC] */
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.zx)) {
            return false;
        }
        defpackage.zx zxVar = (defpackage.zx) obj;
        if (zxVar.d != this.d) {
            return false;
        }
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128 && !zxVar.a(jArr[(i << 3) + i3])) {
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

    public final int hashCode() {
        int i;
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iF = 0;
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
                        iF += defpackage.a.f(jArr[(i2 << 3) + i4]);
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return iF;
                }
            }
            if (i2 == length) {
                return iF;
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c A[LOOP:0: B:5:0x0015->B:22:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005f A[EDGE_INSN: B:27:0x005f->B:23:0x005f BREAK  A[LOOP:0: B:5:0x0015->B:22:0x005c], SYNTHETIC] */
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
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
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 != 0) {
                                sb.append((java.lang.CharSequence) ", ");
                            }
                            if (i2 == -1) {
                                sb.append((java.lang.CharSequence) "...");
                                break loop0;
                            }
                            sb.append(j2);
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

    public zx() {
    }
}
