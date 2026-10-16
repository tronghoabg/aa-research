package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class abnw extends defpackage.abny {
    private final byte[] a;
    private final int b;
    private int c;
    private int d;
    private final int e;
    private int f;
    private int m = Integer.MAX_VALUE;

    public abnw(byte[] bArr, int i, int i2) {
        this.a = bArr;
        int i3 = i2 + i;
        this.b = i3;
        this.c = i3;
        this.d = i;
        this.e = i;
    }

    private final void F(int i) {
        this.m = i;
        int i2 = this.b;
        if (i > i2) {
            i = i2;
        }
        this.c = i;
    }

    @Override // defpackage.abny
    public final void A(int i) {
        F(i);
    }

    @Override // defpackage.abny
    public final void B(int i) throws java.io.IOException {
        if (i >= 0) {
            int i2 = this.c;
            int i3 = this.d;
            if (i <= i2 - i3) {
                this.d = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new defpackage.abpp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.abny
    public final boolean C() throws java.io.IOException {
        return this.d == this.c;
    }

    @Override // defpackage.abny
    public final boolean D() throws java.io.IOException {
        return s() != 0;
    }

    @Override // defpackage.abny
    public final boolean E(int i) throws java.io.IOException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.c - this.d < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new defpackage.abpp("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.a;
                int i4 = this.d;
                this.d = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new defpackage.abpp("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            B(8);
            return true;
        }
        if (i2 == 2) {
            B(k());
            return true;
        }
        if (i2 == 3) {
            K();
            z(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            J();
            return false;
        }
        if (i2 != 5) {
            throw new defpackage.abpo();
        }
        B(4);
        return true;
    }

    public final byte a() throws java.io.IOException {
        int i = this.d;
        if (i == this.c) {
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.d = i + 1;
        return bArr[i];
    }

    @Override // defpackage.abny
    public final double b() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(r());
    }

    @Override // defpackage.abny
    public final float c() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(j());
    }

    @Override // defpackage.abny
    public final int d() {
        int i = this.m;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.d;
    }

    @Override // defpackage.abny
    public final int e() {
        return this.d - this.e;
    }

    @Override // defpackage.abny
    public final int f(int i) throws defpackage.abpp {
        if (i < 0) {
            throw new defpackage.abpp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.d;
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
            if (i > Integer.MAX_VALUE - (i2 - this.e)) {
                throw new defpackage.abpp("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
        }
        int i4 = this.m;
        if (i3 > i4) {
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        F(i3);
        return i4;
    }

    @Override // defpackage.abny
    public final int g() throws java.io.IOException {
        return k();
    }

    @Override // defpackage.abny
    public final int h() throws java.io.IOException {
        return j();
    }

    @Override // defpackage.abny
    public final int i() throws java.io.IOException {
        return k();
    }

    public final int j() throws java.io.IOException {
        int i = this.d;
        if (this.c - i < 4) {
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.d = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0070 A[PHI: r4
  0x0070: PHI (r4v5 int) = (r4v4 int), (r4v9 int), (r4v11 int) binds: [B:17:0x0043, B:21:0x004f, B:25:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.abny
    public final int k() throws java.io.IOException {
        try {
            int i = this.d;
            byte[] bArr = this.a;
            int i2 = i + 1;
            int i3 = bArr[i];
            if (i3 < 0) {
                int i4 = i + 2;
                int i5 = (bArr[i2] << 7) ^ i3;
                if (i5 < 0) {
                    i3 = (i5 == true ? 1 : 0) ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (i5 == true ? 1 : 0) ^ (bArr[i4] << 14);
                    if (i7 >= 0) {
                        int i8 = i7 ^ 16256;
                        i2 = i6;
                        i3 = i8;
                    } else {
                        i4 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            i3 = i9 ^ (-2080896);
                        } else {
                            int i10 = i + 5;
                            int i11 = bArr[i4];
                            int i12 = (i9 ^ (i11 << 28)) ^ 266354560;
                            if (i11 < 0) {
                                i4 = i + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i + 7;
                                    if (bArr[i4] < 0) {
                                        i4 = i + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i + 9;
                                            if (bArr[i4] < 0) {
                                                int i13 = i + 10;
                                                if (bArr[i10] < 0) {
                                                    throw new defpackage.abpp("CodedInputStream encountered a malformed varint.");
                                                }
                                                i3 = i12;
                                                i2 = i13;
                                            } else {
                                                int i14 = i10;
                                                i3 = i12;
                                                i2 = i14;
                                            }
                                        }
                                    } else {
                                        int i15 = i10;
                                        i3 = i12;
                                        i2 = i15;
                                    }
                                }
                                i3 = i12;
                            } else {
                                int i16 = i10;
                                i3 = i12;
                                i2 = i16;
                            }
                        }
                    }
                }
                i2 = i4;
            }
            this.d = i2;
            if (i2 <= this.c) {
                return i3;
            }
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (defpackage.abpp e) {
            if (this.d > this.c) {
                throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw e;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // defpackage.abny
    public final int l() throws java.io.IOException {
        return j();
    }

    @Override // defpackage.abny
    public final int m() throws java.io.IOException {
        int iK = k();
        return (-(iK & 1)) ^ (iK >>> 1);
    }

    @Override // defpackage.abny
    public final int n() throws java.io.IOException {
        if (C()) {
            this.f = 0;
            return 0;
        }
        int iK = k();
        this.f = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw new defpackage.abpp("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.abny
    public final int o() throws java.io.IOException {
        return k();
    }

    @Override // defpackage.abny
    public final long p() throws java.io.IOException {
        return r();
    }

    @Override // defpackage.abny
    public final long q() throws java.io.IOException {
        return s();
    }

    public final long r() throws java.io.IOException {
        int i = this.d;
        if (this.c - i < 8) {
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.d = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    @Override // defpackage.abny
    public final long s() throws java.io.IOException {
        long j;
        long j2;
        long j3;
        int i = this.d;
        int i2 = this.c;
        long j4 = 0;
        if (i2 != i) {
            byte[] bArr = this.a;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.d = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j = (-2080896) ^ i9;
                            i4 = i8;
                        } else {
                            i6 = i + 5;
                            long j5 = (((long) bArr[i8]) << 28) ^ ((long) i9);
                            if (j5 >= 0) {
                                j = j5 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j6 = (((long) bArr[i6]) << 35) ^ j5;
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 42);
                                    if (j7 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j6 = j7 ^ (((long) bArr[i10]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            j7 = j6 ^ (((long) bArr[i4]) << 56);
                                            if (j7 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                byte b2 = bArr[i10];
                                                long j8 = j7 ^ (((long) b2) << 63);
                                                if (j8 >= 0) {
                                                    int i11 = i + 10;
                                                    if (b2 >= 0) {
                                                        j = (-9151873028817141888L) ^ j8;
                                                        i4 = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j3 ^ j6;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.d = i4;
                return j;
            }
        }
        for (int i12 = 0; i12 < 64; i12 += 7) {
            byte bA = a();
            j4 |= ((long) (bA & 127)) << i12;
            if ((bA & 128) == 0) {
                return j4;
            }
        }
        throw new defpackage.abpp("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.abny
    public final long t() throws java.io.IOException {
        return r();
    }

    @Override // defpackage.abny
    public final long u() throws java.io.IOException {
        long jS = s();
        return (-(jS & 1)) ^ (jS >>> 1);
    }

    @Override // defpackage.abny
    public final long v() throws java.io.IOException {
        return s();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    @Override // defpackage.abny
    public final defpackage.abnv w() throws java.io.IOException {
        byte[] bArrCopyOfRange;
        int iK = k();
        if (iK > 0) {
            int i = this.c;
            int i2 = this.d;
            if (iK <= i - i2) {
                defpackage.abnv abnvVarE = defpackage.abnv.E(this.a, i2, iK);
                this.d += iK;
                return abnvVarE;
            }
        }
        if (iK == 0) {
            return defpackage.abnv.d;
        }
        if (iK > 0) {
            int i3 = this.c;
            int i4 = this.d;
            if (iK <= i3 - i4) {
                int i5 = iK + i4;
                this.d = i5;
                bArrCopyOfRange = java.util.Arrays.copyOfRange(this.a, i4, i5);
            } else {
                if (iK <= 0) {
                    throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (iK == 0) {
                    throw new defpackage.abpp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                bArrCopyOfRange = defpackage.abpk.a;
            }
        } else {
            if (iK <= 0) {
                throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (iK == 0) {
                throw new defpackage.abpp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            bArrCopyOfRange = defpackage.abpk.a;
        }
        return defpackage.abnv.F(bArrCopyOfRange);
    }

    @Override // defpackage.abny
    public final java.lang.String x() throws java.io.IOException {
        int iK = k();
        if (iK > 0) {
            int i = this.c;
            int i2 = this.d;
            if (iK <= i - i2) {
                java.lang.String str = new java.lang.String(this.a, i2, iK, java.nio.charset.StandardCharsets.UTF_8);
                this.d += iK;
                return str;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw new defpackage.abpp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.abny
    public final java.lang.String y() throws java.io.IOException {
        int iK = k();
        if (iK > 0) {
            int i = this.c;
            int i2 = this.d;
            if (iK <= i - i2) {
                java.lang.String strBL = defpackage.ysr.bL(this.a, i2, iK);
                this.d += iK;
                return strBL;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK <= 0) {
            throw new defpackage.abpp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.abny
    public final void z(int i) throws defpackage.abpp {
        if (this.f != i) {
            throw new defpackage.abpp("Protocol message end-group tag did not match expected tag.");
        }
    }
}
