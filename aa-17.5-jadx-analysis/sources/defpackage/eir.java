package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class eir extends eis {
    public final byte[] a;
    public int b;
    public int c;
    public int d;
    private final InputStream j;
    private int k;
    private int l;
    private int m = Alert.DURATION_SHOW_INDEFINITELY;

    public eir(InputStream inputStream) {
        Charset charset = ejn.a;
        this.j = inputStream;
        this.a = new byte[4096];
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    private final boolean A(int i) throws IOException {
        int i2 = this.c;
        int i3 = i2 + i;
        int i4 = this.b;
        if (i3 <= i4) {
            throw new IllegalStateException(a.bn(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.d;
        if (i > (Alert.DURATION_SHOW_INDEFINITELY - i5) - i2 || i5 + i2 + i > this.m) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.a;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.d + i2;
            this.d = i5;
            i4 = this.b - i2;
            this.b = i4;
            this.c = 0;
        }
        InputStream inputStream = this.j;
        int iY = y(inputStream, this.a, i4, Math.min(4096 - i4, (Alert.DURATION_SHOW_INDEFINITELY - i5) - i4));
        if (iY != 0 && iY >= -1 && iY <= 4096) {
            if (iY <= 0) {
                return false;
            }
            this.b += iY;
            z();
            return this.b >= i || A(i);
        }
        throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + iY + "\nThe InputStream implementation is buggy.");
    }

    private static int y(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (ejp e) {
            e.a();
            throw e;
        }
    }

    private final void z() {
        int i = this.b + this.k;
        this.b = i;
        int i2 = this.d + i;
        int i3 = this.m;
        if (i2 <= i3) {
            this.k = 0;
            return;
        }
        int i4 = i2 - i3;
        this.k = i4;
        this.b = i - i4;
    }

    public final byte a() throws IOException {
        if (this.c == this.b) {
            r(1);
        }
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        return bArr[i];
    }

    @Override // defpackage.eis
    public final double b() throws IOException {
        return Double.longBitsToDouble(n());
    }

    @Override // defpackage.eis
    public final float c() throws IOException {
        return Float.intBitsToFloat(f());
    }

    @Override // defpackage.eis
    public final int d() {
        return this.d + this.c;
    }

    @Override // defpackage.eis
    public final int e(int i) throws ejp {
        if (i < 0) {
            throw new ejp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.d + this.c;
        if (i2 < 0) {
            throw new ejp("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.m;
        if (i2 > i3) {
            throw new ejp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.m = i2;
        z();
        return i3;
    }

    public final int f() throws IOException {
        int i = this.c;
        if (this.b - i < 4) {
            r(4);
            i = this.c;
        }
        byte[] bArr = this.a;
        this.c = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    @Override // defpackage.eis
    public final int g() throws IOException {
        if (k()) {
            this.l = 0;
            return 0;
        }
        int iJ = j();
        this.l = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new ejp("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.eis
    public final void h(int i) throws ejp {
        if (this.l != i) {
            throw new ejp("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.eis
    public final void i(int i) {
        this.m = i;
        z();
    }

    public final int j() throws IOException {
        int i;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 != i2) {
            byte[] bArr = this.a;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.c = i4;
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
                this.c = i5;
                return i;
            }
        }
        return (int) p();
    }

    @Override // defpackage.eis
    public final boolean k() throws IOException {
        return this.c == this.b && !A(1);
    }

    @Override // defpackage.eis
    public final boolean l() throws IOException {
        return o() != 0;
    }

    @Override // defpackage.eis
    public final boolean m(int i) throws IOException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.b - this.c < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new ejp("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.a;
                int i4 = this.c;
                this.c = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new ejp("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            s(8);
            return true;
        }
        if (i2 == 2) {
            s(j());
            return true;
        }
        if (i2 == 3) {
            x();
            h(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            w();
            return false;
        }
        if (i2 != 5) {
            throw new ejo();
        }
        s(4);
        return true;
    }

    public final long n() throws IOException {
        int i = this.c;
        if (this.b - i < 8) {
            r(8);
            i = this.c;
        }
        byte[] bArr = this.a;
        this.c = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r2[r5] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eir.o():long");
    }

    final long p() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & 127) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw new ejp("CodedInputStream encountered a malformed varint.");
    }

    public final List q(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.j.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw new ejp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.d += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void r(int i) throws IOException {
        if (A(i)) {
            return;
        }
        if (i <= (Alert.DURATION_SHOW_INDEFINITELY - this.d) - this.c) {
            throw new ejp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new ejp("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final void s(int i) throws IOException {
        int i2 = this.b;
        int i3 = this.c;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.c = i3 + i;
            return;
        }
        if (i < 0) {
            throw new ejp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.d;
        int i6 = i5 + i3;
        int i7 = this.m;
        if (i6 + i > i7) {
            s((i7 - i5) - i3);
            throw new ejp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.d = i6;
        this.b = 0;
        this.c = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.j.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(this.j.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (ejp e) {
                    e.a();
                    throw e;
                }
            } finally {
                this.d += i4;
                z();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i8 = this.b;
        int i9 = i8 - this.c;
        this.c = i8;
        r(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.b;
            if (i10 <= i11) {
                this.c = i10;
                return;
            } else {
                i9 += i11;
                this.c = i11;
                r(1);
            }
        }
    }

    public final byte[] t(int i) throws IOException {
        if (i == 0) {
            return ejn.b;
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw new ejp("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.m;
        if (i4 > i5) {
            s((i5 - i2) - i3);
            throw new ejp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.b - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.j.available()) {
                    return null;
                }
            } catch (ejp e) {
                e.a();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.a, this.c, bArr, 0, i6);
        this.d += this.b;
        this.c = 0;
        this.b = 0;
        while (i6 < i) {
            int iY = y(this.j, bArr, i6, i - i6);
            if (iY == -1) {
                throw new ejp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.d += iY;
            i6 += iY;
        }
        return bArr;
    }

    public final byte[] u(int i) throws IOException {
        byte[] bArrT = t(i);
        if (bArrT != null) {
            return bArrT;
        }
        int i2 = this.c;
        int i3 = this.b;
        int i4 = i3 - i2;
        this.d += i3;
        this.c = 0;
        this.b = 0;
        List<byte[]> listQ = q(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.a, i2, bArr, 0, i4);
        for (byte[] bArr2 : listQ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }
}
