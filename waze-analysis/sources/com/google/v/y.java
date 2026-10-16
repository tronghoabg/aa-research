package com.google.v;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.work.WorkInfo;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class y extends z {

    /* renamed from: g, reason: collision with root package name */
    private final InputStream f13062g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f13063h;

    /* renamed from: i, reason: collision with root package name */
    private int f13064i;

    /* renamed from: j, reason: collision with root package name */
    private int f13065j;

    /* renamed from: k, reason: collision with root package name */
    private int f13066k;

    /* renamed from: l, reason: collision with root package name */
    private int f13067l;
    private int m;
    private int n;

    /* synthetic */ y(InputStream inputStream) {
        super(null);
        this.n = Integer.MAX_VALUE;
        this.f13062g = inputStream;
        this.f13063h = new byte[4096];
        this.f13064i = 0;
        this.f13066k = 0;
        this.m = 0;
    }

    private final void N(int i2) throws eu {
        if (aa(i2)) {
            return;
        }
        if (i2 <= (this.f13073d - this.m) - this.f13066k) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new eu("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean aa(int i2) throws eu {
        int i3 = this.f13066k;
        int i4 = i3 + i2;
        int i5 = this.f13064i;
        if (i4 <= i5) {
            throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
        }
        int i6 = this.f13073d;
        int i7 = this.m;
        if (i2 > (i6 - i7) - i3 || i7 + i3 + i2 > this.n) {
            return false;
        }
        if (i3 > 0) {
            if (i5 > i3) {
                byte[] bArr = this.f13063h;
                System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
            }
            i7 = this.m + i3;
            this.m = i7;
            i5 = this.f13064i - i3;
            this.f13064i = i5;
            this.f13066k = 0;
        }
        InputStream inputStream = this.f13062g;
        int iN = n(inputStream, this.f13063h, i5, Math.min(4096 - i5, (this.f13073d - i7) - i5));
        if (iN != 0 && iN >= -1 && iN <= 4096) {
            if (iN <= 0) {
                return false;
            }
            this.f13064i += iN;
            x();
            return this.f13064i >= i2 || aa(i2);
        }
        throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + iN + "\nThe InputStream implementation is buggy.");
    }

    private final byte[] ab(int i2) throws eu {
        if (i2 == 0) {
            return ep.f12912a;
        }
        int i3 = this.m;
        int i4 = this.f13066k;
        int i5 = i3 + i4 + i2;
        if (i5 - this.f13073d > 0) {
            throw new eu("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.n;
        if (i5 > i6) {
            I((i6 - i3) - i4);
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i7 = this.f13064i - i4;
        int i8 = i2 - i7;
        if (i8 >= 4096) {
            try {
                if (i8 > this.f13062g.available()) {
                    return null;
                }
            } catch (eu e2) {
                e2.a();
                throw e2;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f13063h, this.f13066k, bArr, 0, i7);
        this.m += this.f13064i;
        this.f13066k = 0;
        this.f13064i = 0;
        while (i7 < i2) {
            int iN = n(this.f13062g, bArr, i7, i2 - i7);
            if (iN == -1) {
                throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.m += iN;
            i7 += iN;
        }
        return bArr;
    }

    private final byte[] ac(int i2) throws eu {
        byte[] bArrAb = ab(i2);
        if (bArrAb != null) {
            return bArrAb;
        }
        int i3 = this.f13066k;
        int i4 = this.f13064i;
        int i5 = i4 - i3;
        this.m += i4;
        this.f13066k = 0;
        this.f13064i = 0;
        List<byte[]> listV = v(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f13063h, i3, bArr, 0, i5);
        for (byte[] bArr2 : listV) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return bArr;
    }

    private static int n(InputStream inputStream, byte[] bArr, int i2, int i3) throws eu {
        try {
            return inputStream.read(bArr, i2, i3);
        } catch (eu e2) {
            e2.a();
            throw e2;
        }
    }

    private final List v(int i2) throws eu {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(i2, 4096);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                int iN = n(this.f13062g, bArr, i3, iMin - i3);
                if (iN == -1) {
                    throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.m += iN;
                i3 += iN;
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void x() {
        int i2 = this.f13064i + this.f13065j;
        this.f13064i = i2;
        int i3 = this.m + i2;
        int i4 = this.n;
        if (i3 <= i4) {
            this.f13065j = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f13065j = i5;
        this.f13064i = i2 - i5;
    }

    @Override // com.google.v.z
    public final long A() {
        return w();
    }

    @Override // com.google.v.z
    public final v B() throws eu {
        int iK = k();
        int i2 = this.f13064i;
        int i3 = this.f13066k;
        if (iK <= i2 - i3 && iK > 0) {
            v vVarY = v.y(this.f13063h, i3, iK);
            this.f13066k += iK;
            return vVarY;
        }
        if (iK == 0) {
            return v.f13054a;
        }
        if (iK < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrAb = ab(iK);
        if (bArrAb != null) {
            return v.y(bArrAb, 0, bArrAb.length);
        }
        int i4 = this.f13066k;
        int i5 = this.f13064i;
        int i6 = i5 - i4;
        this.m += i5;
        this.f13066k = 0;
        this.f13064i = 0;
        List<byte[]> listV = v(iK - i6);
        byte[] bArr = new byte[iK];
        System.arraycopy(this.f13063h, i4, bArr, 0, i6);
        for (byte[] bArr2 : listV) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i6, length);
            i6 += length;
        }
        return v.t(bArr);
    }

    @Override // com.google.v.z
    public final String C() throws eu {
        int iK = k();
        if (iK > 0) {
            int i2 = this.f13064i;
            int i3 = this.f13066k;
            if (iK <= i2 - i3) {
                String str = new String(this.f13063h, i3, iK, StandardCharsets.UTF_8);
                this.f13066k += iK;
                return str;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iK > this.f13064i) {
            return new String(ac(iK), StandardCharsets.UTF_8);
        }
        N(iK);
        String str2 = new String(this.f13063h, this.f13066k, iK, StandardCharsets.UTF_8);
        this.f13066k += iK;
        return str2;
    }

    @Override // com.google.v.z
    public final String D() throws eu {
        byte[] bArrAc;
        int iK = k();
        int i2 = this.f13066k;
        int i3 = this.f13064i;
        if (iK <= i3 - i2 && iK > 0) {
            bArrAc = this.f13063h;
            this.f13066k = i2 + iK;
        } else {
            if (iK == 0) {
                return "";
            }
            if (iK < 0) {
                throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i2 = 0;
            if (iK <= i3) {
                N(iK);
                bArrAc = this.f13063h;
                this.f13066k = iK;
            } else {
                bArrAc = ac(iK);
            }
        }
        return dc.p(bArrAc, i2, iK);
    }

    @Override // com.google.v.z
    public final void E(int i2) throws eu {
        if (this.f13067l != i2) {
            throw new eu("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.v.z
    public final void F(int i2) {
        this.n = i2;
        x();
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
        int iK = k();
        U();
        int iF = f(iK);
        this.f13070a++;
        fhVar.mergeFrom(this, deVar);
        E(0);
        this.f13070a--;
        if (d() != 0) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        F(iF);
    }

    @Override // com.google.v.z
    public final void I(int i2) throws eu {
        int i3 = this.f13064i;
        int i4 = this.f13066k;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.f13066k = i4 + i2;
            return;
        }
        if (i2 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = this.m;
        int i7 = i6 + i4;
        int i8 = this.n;
        if (i7 + i2 > i8) {
            I((i8 - i6) - i4);
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.m = i7;
        this.f13064i = 0;
        this.f13066k = 0;
        while (i5 < i2) {
            try {
                long j2 = i2 - i5;
                try {
                    long jSkip = this.f13062g.skip(j2);
                    if (jSkip < 0 || jSkip > j2) {
                        throw new IllegalStateException(String.valueOf(this.f13062g.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i5 += (int) jSkip;
                    }
                } catch (eu e2) {
                    e2.a();
                    throw e2;
                }
            } finally {
                this.m += i5;
                x();
            }
        }
        if (i5 >= i2) {
            return;
        }
        int i9 = this.f13064i;
        int i10 = i9 - this.f13066k;
        this.f13066k = i9;
        N(1);
        while (true) {
            int i11 = i2 - i10;
            int i12 = this.f13064i;
            if (i11 <= i12) {
                this.f13066k = i11;
                return;
            } else {
                i10 += i12;
                this.f13066k = i12;
                N(1);
            }
        }
    }

    @Override // com.google.v.z
    public final boolean J() {
        return this.f13066k == this.f13064i && !aa(1);
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
            if (this.f13064i - this.f13066k < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new eu("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.f13063h;
                int i4 = this.f13066k;
                this.f13066k = i4 + 1;
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
            I(k());
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
    public final byte[] M() throws eu {
        int iK = k();
        int i2 = this.f13064i;
        int i3 = this.f13066k;
        if (iK > i2 - i3 || iK <= 0) {
            if (iK >= 0) {
                return ac(iK);
            }
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f13063h, i3, i3 + iK);
        this.f13066k += iK;
        return bArrCopyOfRange;
    }

    public final byte a() throws eu {
        if (this.f13066k == this.f13064i) {
            N(1);
        }
        byte[] bArr = this.f13063h;
        int i2 = this.f13066k;
        this.f13066k = i2 + 1;
        return bArr[i2];
    }

    @Override // com.google.v.z
    public final double b() {
        return Double.longBitsToDouble(l());
    }

    @Override // com.google.v.z
    public final float c() {
        return Float.intBitsToFloat(j());
    }

    @Override // com.google.v.z
    public final int d() {
        int i2 = this.n;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.m + this.f13066k);
    }

    @Override // com.google.v.z
    public final int e() {
        return this.m + this.f13066k;
    }

    @Override // com.google.v.z
    public final int f(int i2) throws eu {
        if (i2 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = i2 + this.m + this.f13066k;
        if (i3 < 0) {
            throw new eu("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i4 = this.n;
        if (i3 > i4) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.n = i3;
        x();
        return i4;
    }

    @Override // com.google.v.z
    public final int g() {
        return k();
    }

    @Override // com.google.v.z
    public final int h() {
        return j();
    }

    @Override // com.google.v.z
    public final int i() {
        return k();
    }

    public final int j() throws eu {
        int i2 = this.f13066k;
        if (this.f13064i - i2 < 4) {
            N(4);
            i2 = this.f13066k;
        }
        byte[] bArr = this.f13063h;
        this.f13066k = i2 + 4;
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24);
    }

    @Override // com.google.v.z
    public final int k() {
        int i2;
        int i3 = this.f13066k;
        int i4 = this.f13064i;
        if (i4 != i3) {
            byte[] bArr = this.f13063h;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f13066k = i5;
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
                this.f13066k = i6;
                return i2;
            }
        }
        return (int) m();
    }

    public final long l() throws eu {
        int i2 = this.f13066k;
        if (this.f13064i - i2 < 8) {
            N(8);
            i2 = this.f13066k;
        }
        byte[] bArr = this.f13063h;
        this.f13066k = i2 + 8;
        long j2 = bArr[i2];
        long j3 = bArr[i2 + 2];
        long j4 = bArr[i2 + 3];
        return ((bArr[i2 + 6] & 255) << 48) | (j2 & 255) | ((bArr[i2 + 1] & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 7] & 255) << 56);
    }

    final long m() throws eu {
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
    public final int o() {
        return j();
    }

    @Override // com.google.v.z
    public final int p() {
        return O(k());
    }

    @Override // com.google.v.z
    public final int q() throws eu {
        if (J()) {
            this.f13067l = 0;
            return 0;
        }
        int iK = k();
        this.f13067l = iK;
        if (go.a(iK) != 0) {
            return iK;
        }
        throw new eu("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.v.z
    public final int r() {
        return k();
    }

    @Override // com.google.v.z
    public final int s(byte[] bArr, int i2, int i3) throws eu {
        z.T(bArr, i2, i3);
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f13064i;
        int i5 = this.f13066k;
        int i6 = i4 - i5;
        if (i6 > 0) {
            int iMin = Math.min(i3, i6);
            System.arraycopy(this.f13063h, this.f13066k, bArr, i2, iMin);
            this.f13066k += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i3, (this.n - this.m) - i5);
        if (iMin2 <= 0) {
            return -1;
        }
        int iN = n(this.f13062g, bArr, i2, iMin2);
        if (iN != -1) {
            this.m += iN;
        }
        return iN;
    }

    @Override // com.google.v.z
    public final long t() {
        return l();
    }

    @Override // com.google.v.z
    public final long u() {
        return w();
    }

    @Override // com.google.v.z
    public final long w() {
        long j2;
        long j3;
        long j4;
        int i2 = this.f13066k;
        int i3 = this.f13064i;
        if (i3 != i2) {
            byte[] bArr = this.f13063h;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f13066k = i4;
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
                this.f13066k = i5;
                return j4;
            }
        }
        return m();
    }

    @Override // com.google.v.z
    public final long y() {
        return l();
    }

    @Override // com.google.v.z
    public final long z() {
        return Q(w());
    }
}
