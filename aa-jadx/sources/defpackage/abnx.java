package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class abnx extends defpackage.abny {
    public final java.io.InputStream a;
    private int m;
    private int n;
    public int f = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
    public final byte[] b = new byte[4096];
    public int c = 0;
    public int d = 0;
    public int e = 0;

    public abnx(java.io.InputStream inputStream) {
        this.a = inputStream;
    }

    private final java.util.List O(int i) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i > 0) {
            int iMin = java.lang.Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.a.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.e += i3;
                    i2 += i3;
                } catch (defpackage.abpp e) {
                    e.a();
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void P() {
        int i = this.c + this.m;
        this.c = i;
        int i2 = this.e + i;
        int i3 = this.f;
        if (i2 <= i3) {
            this.m = 0;
            return;
        }
        int i4 = i2 - i3;
        this.m = i4;
        this.c = i - i4;
    }

    private final void Q(int i) throws java.io.IOException {
        if (S(i)) {
            return;
        }
        if (i <= (this.j - this.e) - this.d) {
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new defpackage.abpp("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private static boolean R(int i, int i2, int i3) {
        return i3 < i || i2 > i3 - i;
    }

    private final boolean S(int i) throws java.io.IOException {
        int i2 = this.d;
        int i3 = i2 + i;
        int i4 = this.c;
        if (i3 <= i4) {
            throw new java.lang.IllegalStateException(defpackage.a.bm(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.e;
        int i6 = i5 + i2;
        if (R(i6, i, this.j) || R(i6, i, this.f)) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.b;
                java.lang.System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.e + i2;
            this.e = i5;
            i4 = this.c - i2;
            this.c = i4;
            this.d = 0;
        }
        try {
            int i7 = this.a.read(this.b, i4, java.lang.Math.min(4096 - i4, (this.j - i5) - i4));
            if (i7 != 0 && i7 >= -1 && i7 <= 4096) {
                if (i7 <= 0) {
                    return false;
                }
                this.c += i7;
                P();
                return this.c >= i || S(i);
            }
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(this.a.getClass()) + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
        } catch (defpackage.abpp e) {
            e.a();
            throw e;
        }
    }

    private final byte[] T(int i) throws java.io.IOException {
        if (i == 0) {
            return defpackage.abpk.a;
        }
        if (i < 0) {
            throw new defpackage.abpp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.e;
        int i3 = this.d;
        int i4 = i2 + i3;
        if (R(i4, i, this.j)) {
            throw new defpackage.abpp("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.f;
        if (R(i4, i, i5)) {
            if (i5 >= i4) {
                B(i5 - i4);
            }
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.c - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.a.available()) {
                    return null;
                }
            } catch (defpackage.abpp e) {
                e.a();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.b, this.d, bArr, 0, i6);
        this.e += this.c;
        this.d = 0;
        this.c = 0;
        while (i6 < i) {
            try {
                int i8 = this.a.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.e += i8;
                i6 += i8;
            } catch (defpackage.abpp e2) {
                e2.a();
                throw e2;
            }
        }
        return bArr;
    }

    @Override // defpackage.abny
    public final void A(int i) {
        this.f = i;
        P();
    }

    @Override // defpackage.abny
    public final void B(int i) throws java.io.IOException {
        int i2 = this.c;
        int i3 = this.d;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.d = i3 + i;
            return;
        }
        if (i < 0) {
            throw new defpackage.abpp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.e + i3;
        if (R(i5, i, this.j)) {
            throw new defpackage.abpp("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.f;
        if (R(i5, i, i6)) {
            if (i6 >= i5) {
                B(i6 - i5);
            }
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.e = i5;
        this.c = 0;
        this.d = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.a.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new java.lang.IllegalStateException(java.lang.String.valueOf(this.a.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (defpackage.abpp e) {
                    e.a();
                    throw e;
                }
            } catch (java.lang.Throwable th) {
                this.e += i4;
                P();
                throw th;
            }
        }
        this.e += i4;
        P();
        if (i4 >= i) {
            return;
        }
        int i7 = this.c;
        int i8 = i7 - this.d;
        this.d = i7;
        Q(1);
        while (true) {
            int i9 = i - i8;
            int i10 = this.c;
            if (i9 <= i10) {
                this.d = i9;
                return;
            } else {
                i8 += i10;
                this.d = i10;
                Q(1);
            }
        }
    }

    @Override // defpackage.abny
    public final boolean C() throws java.io.IOException {
        return this.d == this.c && !S(1);
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
                byte[] bArr = this.b;
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

    final long F() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bA = a();
            j |= ((long) (bA & 127)) << i;
            if ((bA & 128) == 0) {
                return j;
            }
        }
        throw new defpackage.abpp("CodedInputStream encountered a malformed varint.");
    }

    public final byte[] G(int i) throws java.io.IOException {
        byte[] bArrT = T(i);
        if (bArrT != null) {
            return bArrT;
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = i3 - i2;
        this.e += i3;
        this.d = 0;
        this.c = 0;
        java.util.List<byte[]> listO = O(i - i4);
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.b, i2, bArr, 0, i4);
        for (byte[] bArr2 : listO) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte a() throws java.io.IOException {
        if (this.d == this.c) {
            Q(1);
        }
        byte[] bArr = this.b;
        int i = this.d;
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
        int i = this.f;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.e + this.d);
    }

    @Override // defpackage.abny
    public final int e() {
        return this.e + this.d;
    }

    @Override // defpackage.abny
    public final int f(int i) throws defpackage.abpp {
        if (i < 0) {
            throw new defpackage.abpp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.e + this.d;
        if (i > androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY - i2) {
            throw new defpackage.abpp("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.f;
        if (R(i2, i, i3)) {
            throw new defpackage.abpp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f = i2 + i;
        P();
        return i3;
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
            Q(4);
            i = this.d;
        }
        byte[] bArr = this.b;
        this.d = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    @Override // defpackage.abny
    public final int k() throws java.io.IOException {
        int i;
        int i2 = this.d;
        int i3 = this.c;
        if (i3 != i2) {
            byte[] bArr = this.b;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.d = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.d = i5;
                return i;
            }
        }
        return (int) F();
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
            this.n = 0;
            return 0;
        }
        int iK = k();
        this.n = iK;
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
            Q(8);
            i = this.d;
        }
        byte[] bArr = this.b;
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
        if (i2 != i) {
            byte[] bArr = this.b;
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
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
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
                                    j = j2 ^ j7;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.d = i4;
                return j;
            }
        }
        return F();
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

    @Override // defpackage.abny
    public final defpackage.abnv w() throws java.io.IOException {
        int iK = k();
        int i = this.c;
        int i2 = this.d;
        if (iK <= i - i2 && iK > 0) {
            defpackage.abnv abnvVarE = defpackage.abnv.E(this.b, i2, iK);
            this.d += iK;
            return abnvVarE;
        }
        if (iK == 0) {
            return defpackage.abnv.d;
        }
        if (iK < 0) {
            throw new defpackage.abpp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrT = T(iK);
        if (bArrT != null) {
            return defpackage.abnv.E(bArrT, 0, bArrT.length);
        }
        int i3 = this.d;
        int i4 = this.c;
        int i5 = i4 - i3;
        this.e += i4;
        this.d = 0;
        this.c = 0;
        java.util.List<byte[]> listO = O(iK - i5);
        byte[] bArr = new byte[iK];
        java.lang.System.arraycopy(this.b, i3, bArr, 0, i5);
        for (byte[] bArr2 : listO) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return defpackage.abnv.y(bArr);
    }

    @Override // defpackage.abny
    public final java.lang.String x() throws java.io.IOException {
        int iK = k();
        if (iK > 0) {
            int i = this.c;
            int i2 = this.d;
            if (iK <= i - i2) {
                java.lang.String str = new java.lang.String(this.b, i2, iK, java.nio.charset.StandardCharsets.UTF_8);
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
        if (iK > this.c) {
            return new java.lang.String(G(iK), java.nio.charset.StandardCharsets.UTF_8);
        }
        Q(iK);
        java.lang.String str2 = new java.lang.String(this.b, this.d, iK, java.nio.charset.StandardCharsets.UTF_8);
        this.d += iK;
        return str2;
    }

    @Override // defpackage.abny
    public final java.lang.String y() throws java.io.IOException {
        byte[] bArrG;
        int iK = k();
        int i = this.d;
        int i2 = this.c;
        if (iK <= i2 - i && iK > 0) {
            bArrG = this.b;
            this.d = i + iK;
        } else {
            if (iK == 0) {
                return "";
            }
            if (iK < 0) {
                throw new defpackage.abpp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iK <= i2) {
                Q(iK);
                bArrG = this.b;
                this.d = iK;
            } else {
                bArrG = G(iK);
            }
        }
        return defpackage.ysr.bL(bArrG, i, iK);
    }

    @Override // defpackage.abny
    public final void z(int i) throws defpackage.abpp {
        if (this.n != i) {
            throw new defpackage.abpp("Protocol message end-group tag did not match expected tag.");
        }
    }
}
