package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public abstract class abmt extends abmw {
    private final byte[] a;
    private final int b;
    private int c;
    private int d;
    private final int e;
    private int f;
    private int m = Alert.DURATION_SHOW_INDEFINITELY;

    public abmt(byte[] bArr, int i, int i2) {
        this.a = bArr;
        int i3 = i2 + i;
        this.b = i3;
        this.c = i3;
        this.d = i;
        this.e = i;
    }

    private final void Q(int i) {
        this.m = i;
        int i2 = this.b;
        if (i > i2) {
            i = i2;
        }
        this.c = i;
    }

    @Override // defpackage.abmw
    public final String A() throws IOException {
        int iM = m();
        if (iM > 0) {
            int i = this.c;
            int i2 = this.d;
            if (iM <= i - i2) {
                String str = new String(this.a, i2, iM, StandardCharsets.UTF_8);
                this.d += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            throw new abon("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new abon("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.abmw
    public final String B() throws IOException {
        int iM = m();
        if (iM > 0) {
            int i = this.c;
            int i2 = this.d;
            if (iM <= i - i2) {
                String strDQ = woy.dQ(this.a, i2, iM);
                this.d += iM;
                return strDQ;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM <= 0) {
            throw new abon("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new abon("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // defpackage.abmw
    public final void C(int i) throws abon {
        if (this.f != i) {
            throw new abon("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.abmw
    public final void D(int i) {
        Q(i);
    }

    @Override // defpackage.abmw
    public final void E(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.c;
            int i3 = this.d;
            if (i <= i2 - i3) {
                this.d = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new abon("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new abon("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // defpackage.abmw
    public final boolean F() throws IOException {
        return this.d == this.c;
    }

    @Override // defpackage.abmw
    public final boolean G() throws IOException {
        return v() != 0;
    }

    @Override // defpackage.abmw
    public final boolean H(int i) throws IOException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.c - this.d < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new abon("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.a;
                int i4 = this.d;
                this.d = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new abon("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            E(8);
            return true;
        }
        if (i2 == 2) {
            E(m());
            return true;
        }
        if (i2 == 3) {
            M();
            C(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            L();
            return false;
        }
        if (i2 != 5) {
            throw new abom();
        }
        E(4);
        return true;
    }

    @Override // defpackage.abmw
    public final byte[] I() throws IOException {
        throw null;
    }

    public final byte a() throws IOException {
        int i = this.d;
        if (i == this.c) {
            throw new abon("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.d = i + 1;
        return bArr[i];
    }

    @Override // defpackage.abmw
    public final double b() throws IOException {
        return Double.longBitsToDouble(u());
    }

    @Override // defpackage.abmw
    public final float c() throws IOException {
        return Float.intBitsToFloat(j());
    }

    @Override // defpackage.abmw
    public final int d() {
        int i = this.m;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.d;
    }

    @Override // defpackage.abmw
    public final int e() {
        return this.d - this.e;
    }

    @Override // defpackage.abmw
    public final int f(int i) throws abon {
        if (i < 0) {
            throw new abon("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.d;
        int i3 = i2 + i;
        if (i3 < 0) {
            int i4 = i2 - this.e;
            i3 = Alert.DURATION_SHOW_INDEFINITELY;
            if (i > Alert.DURATION_SHOW_INDEFINITELY - i4) {
                throw new abon("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
        }
        int i5 = this.m;
        if (i3 > i5) {
            throw new abon("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        Q(i3);
        return i5;
    }

    @Override // defpackage.abmw
    public final int g() throws IOException {
        return l();
    }

    @Override // defpackage.abmw
    public final int h() throws IOException {
        return j();
    }

    @Override // defpackage.abmw
    public final int i() throws IOException {
        return l();
    }

    public final int j() throws IOException {
        int i = this.d;
        if (this.c - i < 4) {
            throw new abon("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.d = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    @Override // defpackage.abmw
    public final int k() throws IOException {
        return l();
    }

    public abstract int l() throws IOException;

    protected abstract int m() throws IOException;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[PHI: r4
  0x0070: PHI (r4v5 int) = (r4v4 int), (r4v9 int), (r4v11 int) binds: [B:17:0x0043, B:21:0x004f, B:25:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int n() throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            int r1 = r8.d     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            byte[] r2 = r8.a     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            int r3 = r1 + 1
            r4 = r2[r1]     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            if (r4 < 0) goto Le
            goto L73
        Le:
            int r5 = r1 + 2
            r3 = r2[r3]     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            int r3 = r3 << 7
            r3 = r3 ^ r4
            if (r3 >= 0) goto L1b
            r4 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
        L19:
            r3 = r5
            goto L73
        L1b:
            int r4 = r1 + 3
            r5 = r2[r5]     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            int r5 = r5 << 14
            r3 = r3 ^ r5
            if (r3 < 0) goto L29
            r1 = r3 ^ 16256(0x3f80, float:2.278E-41)
            r3 = r4
            r4 = r1
            goto L73
        L29:
            int r5 = r1 + 4
            r4 = r2[r4]     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            int r4 = r4 << 21
            r3 = r3 ^ r4
            if (r3 >= 0) goto L38
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r4 = r3 ^ r1
            goto L19
        L38:
            int r4 = r1 + 5
            r5 = r2[r5]     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            int r6 = r5 << 28
            r3 = r3 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r6
            if (r5 >= 0) goto L70
            int r5 = r1 + 6
            r4 = r2[r4]     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            if (r4 >= 0) goto L6e
            int r4 = r1 + 7
            r5 = r2[r5]     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            if (r5 >= 0) goto L70
            int r5 = r1 + 8
            r4 = r2[r4]     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            if (r4 >= 0) goto L6e
            int r4 = r1 + 9
            r5 = r2[r5]     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            if (r5 >= 0) goto L70
            int r1 = r1 + 10
            r2 = r2[r4]     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            if (r2 < 0) goto L66
            r4 = r3
            r3 = r1
            goto L73
        L66:
            abon r1 = new abon     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            java.lang.String r2 = "CodedInputStream encountered a malformed varint."
            r1.<init>(r2)     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            throw r1     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
        L6e:
            r4 = r3
            goto L19
        L70:
            r7 = r4
            r4 = r3
            r3 = r7
        L73:
            r8.d = r3     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            int r1 = r8.c     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            if (r3 > r1) goto L7a
            return r4
        L7a:
            abon r1 = new abon     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            r1.<init>(r0)     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
            throw r1     // Catch: defpackage.abon -> L80 java.lang.IndexOutOfBoundsException -> L8e
        L80:
            r1 = move-exception
            int r2 = r8.d
            int r8 = r8.c
            if (r2 <= r8) goto L8d
            abon r8 = new abon
            r8.<init>(r0)
            throw r8
        L8d:
            throw r1
        L8e:
            abon r8 = new abon
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abmt.n():int");
    }

    @Override // defpackage.abmw
    public final int o() throws IOException {
        return j();
    }

    @Override // defpackage.abmw
    public final int p() throws IOException {
        int iM = m();
        return (-(iM & 1)) ^ (iM >>> 1);
    }

    @Override // defpackage.abmw
    public final int q() throws IOException {
        if (F()) {
            this.f = 0;
            return 0;
        }
        int iM = m();
        this.f = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new abon("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.abmw
    public final int r() throws IOException {
        return m();
    }

    @Override // defpackage.abmw
    public final long s() throws IOException {
        return u();
    }

    @Override // defpackage.abmw
    public final long t() throws IOException {
        return v();
    }

    public final long u() throws IOException {
        int i = this.d;
        if (this.c - i < 8) {
            throw new abon("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.a;
        this.d = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // defpackage.abmw
    public final long v() throws IOException {
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
                    j3 = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j3 = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j3 = (-2080896) ^ i9;
                            i4 = i8;
                        } else {
                            i6 = i + 5;
                            long j5 = (bArr[i8] << 28) ^ i9;
                            if (j5 >= 0) {
                                j3 = j5 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j6 = (bArr[i6] << 35) ^ j5;
                                if (j6 < 0) {
                                    j = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j7 = j6 ^ (bArr[i4] << 42);
                                    if (j7 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j6 = j7 ^ (bArr[i10] << 49);
                                        if (j6 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            j7 = j6 ^ (bArr[i4] << 56);
                                            if (j7 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                i4 = i + 10;
                                                j6 = j7 ^ (bArr[i10] << 63);
                                                if (j6 >= 0) {
                                                    j = -9151873028817141888L;
                                                }
                                            }
                                        }
                                    }
                                    j3 = j7 ^ j2;
                                    i4 = i10;
                                }
                                j3 = j ^ j6;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.d = i4;
                return j3;
            }
        }
        for (int i11 = 0; i11 < 64; i11 += 7) {
            j4 |= (r1 & 127) << i11;
            if ((a() & 128) == 0) {
                return j4;
            }
        }
        throw new abon("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.abmw
    public final long w() throws IOException {
        return u();
    }

    @Override // defpackage.abmw
    public final long x() throws IOException {
        long jV = v();
        return (-(jV & 1)) ^ (jV >>> 1);
    }

    @Override // defpackage.abmw
    public final long y() throws IOException {
        return v();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // defpackage.abmw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.abms z() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.m()
            if (r0 <= 0) goto L19
            int r1 = r3.c
            int r2 = r3.d
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.a
            abms r1 = defpackage.abms.E(r1, r2, r0)
            int r2 = r3.d
            int r2 = r2 + r0
            r3.d = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            abms r3 = defpackage.abms.d
            return r3
        L1e:
            if (r0 <= 0) goto L31
            int r1 = r3.c
            int r2 = r3.d
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            int r0 = r0 + r2
            r3.d = r0
            byte[] r3 = r3.a
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r2, r0)
            goto L37
        L31:
            if (r0 > 0) goto L44
            if (r0 != 0) goto L3c
            byte[] r3 = defpackage.aboi.a
        L37:
            abms r3 = defpackage.abms.F(r3)
            return r3
        L3c:
            abon r3 = new abon
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r3.<init>(r0)
            throw r3
        L44:
            abon r3 = new abon
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abmt.z():abms");
    }
}
