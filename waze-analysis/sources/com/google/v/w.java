package com.google.v;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.work.WorkInfo;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
abstract class w extends z {

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f13056g;

    /* renamed from: h, reason: collision with root package name */
    private final int f13057h;

    /* renamed from: i, reason: collision with root package name */
    private int f13058i;

    /* renamed from: j, reason: collision with root package name */
    private int f13059j;

    /* renamed from: k, reason: collision with root package name */
    private final int f13060k;

    /* renamed from: l, reason: collision with root package name */
    private int f13061l;
    private int m;

    /* synthetic */ w(byte[] bArr, int i2, int i3) {
        super(null);
        this.m = Integer.MAX_VALUE;
        this.f13056g = bArr;
        int i4 = i3 + i2;
        this.f13057h = i4;
        this.f13058i = i4;
        this.f13059j = i2;
        this.f13060k = i2;
    }

    private final void aa(int i2) {
        this.m = i2;
        int i3 = this.f13057h;
        if (i2 > i3) {
            i2 = i3;
        }
        this.f13058i = i2;
    }

    @Override // com.google.v.z
    public final long A() {
        return w();
    }

    @Override // com.google.v.z
    public final v B() {
        int iM = m();
        if (iM > 0) {
            int i2 = this.f13058i;
            int i3 = this.f13059j;
            if (iM <= i2 - i3) {
                v vVarY = v.y(this.f13056g, i3, iM);
                this.f13059j += iM;
                return vVarY;
            }
        }
        return iM == 0 ? v.f13054a : v.z(N(iM));
    }

    @Override // com.google.v.z
    public final String C() throws eu {
        int iM = m();
        if (iM > 0) {
            int i2 = this.f13058i;
            int i3 = this.f13059j;
            if (iM <= i2 - i3) {
                String str = new String(this.f13056g, i3, iM, StandardCharsets.UTF_8);
                this.f13059j += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.v.z
    public final String D() throws eu {
        int iM = m();
        if (iM > 0) {
            int i2 = this.f13058i;
            int i3 = this.f13059j;
            if (iM <= i2 - i3) {
                String strP = dc.p(this.f13056g, i3, iM);
                this.f13059j += iM;
                return strP;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM <= 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.v.z
    public final void E(int i2) throws eu {
        if (this.f13061l != i2) {
            throw new eu("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.v.z
    public final void F(int i2) {
        aa(i2);
    }

    @Override // com.google.v.z
    public final void G(int i2, fh fhVar, de deVar) throws eu {
        U();
        this.f13071b++;
        fhVar.mergeFrom(this, deVar);
        E(go.c(i2, 4));
        this.f13071b--;
    }

    @Override // com.google.v.z
    public final void H(fh fhVar, de deVar) throws eu {
        int iM = m();
        U();
        int iF = f(iM);
        this.f13070a++;
        fhVar.mergeFrom(this, deVar);
        E(0);
        this.f13070a--;
        if (d() != 0) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        aa(iF);
    }

    @Override // com.google.v.z
    public final void I(int i2) throws eu {
        if (i2 >= 0) {
            int i3 = this.f13058i;
            int i4 = this.f13059j;
            if (i2 <= i3 - i4) {
                this.f13059j = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.v.z
    public final boolean J() {
        return this.f13059j == this.f13058i;
    }

    @Override // com.google.v.z
    public final boolean K() {
        return w() != 0;
    }

    @Override // com.google.v.z
    public final boolean L(int i2) throws eu {
        int iB = go.b(i2);
        int i3 = 0;
        if (iB == 0) {
            if (this.f13058i - this.f13059j < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new eu("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.f13056g;
                int i4 = this.f13059j;
                this.f13059j = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new eu("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (iB == 1) {
            I(8);
            return true;
        }
        if (iB == 2) {
            I(m());
            return true;
        }
        if (iB == 3) {
            W();
            E(go.c(go.a(i2), 4));
            return true;
        }
        if (iB == 4) {
            V();
            return false;
        }
        if (iB != 5) {
            throw new et();
        }
        I(4);
        return true;
    }

    @Override // com.google.v.z
    public final byte[] M() {
        return N(m());
    }

    public final byte[] N(int i2) throws eu {
        if (i2 > 0) {
            int i3 = this.f13058i;
            int i4 = this.f13059j;
            if (i2 <= i3 - i4) {
                int i5 = i2 + i4;
                this.f13059j = i5;
                return Arrays.copyOfRange(this.f13056g, i4, i5);
            }
        }
        if (i2 > 0) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            return ep.f12912a;
        }
        throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final byte a() throws eu {
        int i2 = this.f13059j;
        if (i2 == this.f13058i) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f13056g;
        this.f13059j = i2 + 1;
        return bArr[i2];
    }

    @Override // com.google.v.z
    public final double b() {
        return Double.longBitsToDouble(v());
    }

    @Override // com.google.v.z
    public final float c() {
        return Float.intBitsToFloat(j());
    }

    @Override // com.google.v.z
    public final int d() {
        int i2 = this.m;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - this.f13059j;
    }

    @Override // com.google.v.z
    public final int e() {
        return this.f13059j - this.f13060k;
    }

    @Override // com.google.v.z
    public final int f(int i2) {
        if (i2 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = this.f13059j;
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
            if (i2 > Integer.MAX_VALUE - (i3 - this.f13060k)) {
                throw new eu("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
        }
        int i5 = this.m;
        if (i4 > i5) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        aa(i4);
        return i5;
    }

    @Override // com.google.v.z
    public final int g() {
        return l();
    }

    @Override // com.google.v.z
    public final int h() {
        return j();
    }

    @Override // com.google.v.z
    public final int i() {
        return l();
    }

    public final int j() throws eu {
        int i2 = this.f13059j;
        if (this.f13058i - i2 < 4) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f13056g;
        this.f13059j = i2 + 4;
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24);
    }

    @Override // com.google.v.z
    public final int k() {
        return l();
    }

    protected abstract int l();

    protected abstract int m();

    protected final int n() {
        int i2;
        int i3 = this.f13059j;
        int i4 = this.f13058i;
        if (i4 != i3) {
            byte[] bArr = this.f13056g;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f13059j = i5;
                return b2;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b2;
                if (i7 < 0) {
                    i2 = i7 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << StylePropertiesKt.TopId) ^ i7;
                    if (i9 >= 0) {
                        i2 = i9 ^ 16256;
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << StylePropertiesKt.AlphaId);
                        if (i11 < 0) {
                            i2 = (-2080896) ^ i11;
                        } else {
                            i8 = i3 + 5;
                            byte b3 = bArr[i10];
                            int i12 = (i11 ^ (b3 << StylePropertiesKt.RotationZId)) ^ 266354560;
                            if (b3 < 0) {
                                i10 = i3 + 6;
                                if (bArr[i8] < 0) {
                                    i8 = i3 + 7;
                                    if (bArr[i10] < 0) {
                                        i10 = i3 + 8;
                                        if (bArr[i8] < 0) {
                                            i8 = i3 + 9;
                                            if (bArr[i10] < 0) {
                                                int i13 = i3 + 10;
                                                if (bArr[i8] >= 0) {
                                                    i6 = i13;
                                                    i2 = i12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i12;
                            }
                            i2 = i12;
                        }
                        i6 = i10;
                    }
                    i6 = i8;
                }
                this.f13059j = i6;
                return i2;
            }
        }
        return (int) x();
    }

    @Override // com.google.v.z
    public final int o() {
        return j();
    }

    @Override // com.google.v.z
    public final int p() {
        return O(m());
    }

    @Override // com.google.v.z
    public final int q() throws eu {
        if (J()) {
            this.f13061l = 0;
            return 0;
        }
        int iM = m();
        this.f13061l = iM;
        if (go.a(iM) != 0) {
            return iM;
        }
        throw new eu("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.v.z
    public final int r() {
        return m();
    }

    @Override // com.google.v.z
    public final int s(byte[] bArr, int i2, int i3) {
        z.T(bArr, i2, i3);
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, this.f13058i - this.f13059j);
        if (iMin == 0) {
            return -1;
        }
        System.arraycopy(this.f13056g, this.f13059j, bArr, i2, iMin);
        this.f13059j += iMin;
        return iMin;
    }

    @Override // com.google.v.z
    public final long t() {
        return v();
    }

    @Override // com.google.v.z
    public final long u() {
        return w();
    }

    public final long v() throws eu {
        int i2 = this.f13059j;
        if (this.f13058i - i2 < 8) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f13056g;
        this.f13059j = i2 + 8;
        long j2 = bArr[i2];
        long j3 = bArr[i2 + 2];
        long j4 = bArr[i2 + 3];
        return ((bArr[i2 + 6] & 255) << 48) | (j2 & 255) | ((bArr[i2 + 1] & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 7] & 255) << 56);
    }

    @Override // com.google.v.z
    public final long w() {
        long j2;
        long j3;
        long j4;
        int i2 = this.f13059j;
        int i3 = this.f13058i;
        if (i3 != i2) {
            byte[] bArr = this.f13056g;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f13059j = i4;
                return b2;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b2;
                if (i6 < 0) {
                    j4 = i6 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << StylePropertiesKt.TopId) ^ i6;
                    if (i8 >= 0) {
                        j4 = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << StylePropertiesKt.AlphaId);
                        if (i10 < 0) {
                            long j5 = (-2080896) ^ i10;
                            i5 = i9;
                            j4 = j5;
                        } else {
                            i7 = i2 + 5;
                            long j6 = (bArr[i9] << 28) ^ i10;
                            if (j6 >= 0) {
                                j4 = j6 ^ 266354560;
                            } else {
                                i5 = i2 + 6;
                                long j7 = (bArr[i7] << 35) ^ j6;
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i11 = i2 + 7;
                                    long j8 = j7 ^ (bArr[i5] << 42);
                                    if (j8 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i5 = i2 + 8;
                                        j7 = j8 ^ (bArr[i11] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i11 = i2 + 9;
                                            j8 = j7 ^ (bArr[i5] << 56);
                                            if (j8 >= 0) {
                                                j3 = 71499008037633920L;
                                            } else {
                                                i5 = i2 + 10;
                                                j7 = j8 ^ (bArr[i11] << 63);
                                                if (j7 >= 0) {
                                                    j2 = -9151873028817141888L;
                                                }
                                            }
                                        }
                                    }
                                    j4 = j3 ^ j8;
                                    i5 = i11;
                                }
                                j4 = j7 ^ j2;
                            }
                        }
                    }
                    i5 = i7;
                }
                this.f13059j = i5;
                return j4;
            }
        }
        return x();
    }

    final long x() throws eu {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j2 |= (r3 & 127) << i2;
            if ((a() & 128) == 0) {
                return j2;
            }
        }
        throw new eu("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.v.z
    public final long y() {
        return v();
    }

    @Override // com.google.v.z
    public final long z() {
        return Q(w());
    }
}
