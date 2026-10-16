package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class ajmy implements Cloneable, ByteChannel, ajna, ajmz {
    public ajnx a;
    public long b;

    @Override // defpackage.ajna
    public final void A(long j) throws EOFException {
        while (j > 0) {
            ajnx ajnxVar = this.a;
            if (ajnxVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, ajnxVar.c - ajnxVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = ajnxVar.b + iMin;
            ajnxVar.b = i;
            if (i == ajnxVar.c) {
                this.a = ajnxVar.a();
                ajny.b(ajnxVar);
            }
        }
    }

    @Override // defpackage.ajna
    public final boolean B() {
        return this.b == 0;
    }

    @Override // defpackage.ajna
    public final boolean C(long j) {
        throw null;
    }

    public final byte[] D() {
        return E(this.b);
    }

    public final byte[] E(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.bN(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iE = e(bArr, i2, i - i2);
            if (iE == -1) {
                throw new EOFException();
            }
            i2 += iE;
        }
        return bArr;
    }

    public final void F(ajmy ajmyVar, long j, long j2) {
        long j3 = j;
        ahfd.g(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        ajmyVar.b += j2;
        ajnx ajnxVar = this.a;
        while (true) {
            ajnxVar.getClass();
            long j4 = ajnxVar.c - ajnxVar.b;
            if (j3 < j4) {
                break;
            }
            ajnxVar = ajnxVar.f;
            j3 -= j4;
        }
        long j5 = j2;
        while (j5 > 0) {
            ajnxVar.getClass();
            ajnx ajnxVarB = ajnxVar.b();
            int i = ajnxVarB.b + ((int) j3);
            ajnxVarB.b = i;
            ajnxVarB.c = Math.min(i + ((int) j5), ajnxVarB.c);
            ajnx ajnxVar2 = ajmyVar.a;
            if (ajnxVar2 == null) {
                ajnxVarB.g = ajnxVarB;
                ajnxVarB.f = ajnxVarB.g;
                ajmyVar.a = ajnxVarB.f;
            } else {
                ajnx ajnxVar3 = ajnxVar2.g;
                ajnxVar3.getClass();
                ajnxVar3.d(ajnxVarB);
            }
            j5 -= ajnxVarB.c - ajnxVarB.b;
            ajnxVar = ajnxVar.f;
            j3 = 0;
        }
    }

    @Override // defpackage.ajna
    public final long G(ajnb ajnbVar) throws IOException {
        ajnbVar.getClass();
        byte[] bArr = ajog.a;
        return ajog.b(this, ajnbVar, 0L, 1024L, ajnbVar.c());
    }

    @Override // defpackage.ajna
    public final boolean H(ajnb ajnbVar) {
        ajnbVar.getClass();
        return I(0L, ajnbVar, ajnbVar.c());
    }

    public final boolean I(long j, ajnb ajnbVar, int i) {
        if (i >= 0 && j >= 0 && i + j <= this.b && i <= ajnbVar.c()) {
            return i == 0 || ajog.b(this, ajnbVar, j, j + 1, i) != -1;
        }
        return false;
    }

    @Override // defpackage.ajna
    public final void J(ajoa ajoaVar) throws IOException {
        long j = this.b;
        if (j > 0) {
            ajoaVar.a(this, j);
        }
    }

    public final void K(ajnb ajnbVar) {
        ajnbVar.getClass();
        ajnbVar.q(this, ajnbVar.c());
    }

    public final void L(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        ahfd.g(bArr.length, i, j);
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                this.b += j;
                return;
            }
            ajnx ajnxVarV = v(1);
            int i5 = 8192 - ajnxVarV.c;
            byte[] bArr2 = ajnxVarV.a;
            int iMin = Math.min(i4 - i3, i5);
            int i6 = i3 + iMin;
            woy.dn(bArr, bArr2, ajnxVarV.c, i3, i6);
            ajnxVarV.c += iMin;
            i3 = i6;
        }
    }

    public final void M(ajoc ajocVar) throws IOException {
        while (ajocVar.hU(this, 8192L) != -1) {
        }
    }

    public final void N(int i) {
        ajnx ajnxVarV = v(1);
        byte[] bArr = ajnxVarV.a;
        int i2 = ajnxVarV.c;
        ajnxVarV.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void O(int i) {
        ajnx ajnxVarV = v(4);
        byte[] bArr = ajnxVarV.a;
        int i2 = ajnxVarV.c;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        ajnxVarV.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.ajmz
    public final /* bridge */ /* synthetic */ void P(int i) {
        throw null;
    }

    @Override // defpackage.ajmz
    public final /* bridge */ /* synthetic */ void Q(int i) {
        throw null;
    }

    public final void R(OutputStream outputStream, long j) throws IOException {
        outputStream.getClass();
        ahfd.g(this.b, 0L, j);
        ajnx ajnxVar = this.a;
        long j2 = j;
        while (j2 > 0) {
            ajnxVar.getClass();
            int iMin = (int) Math.min(j2, ajnxVar.c - ajnxVar.b);
            outputStream.write(ajnxVar.a, ajnxVar.b, iMin);
            int i = ajnxVar.b + iMin;
            ajnxVar.b = i;
            long j3 = iMin;
            this.b -= j3;
            j2 -= j3;
            if (i == ajnxVar.c) {
                ajnx ajnxVarA = ajnxVar.a();
                this.a = ajnxVarA;
                ajny.b(ajnxVar);
                ajnxVar = ajnxVarA;
            }
        }
    }

    public final void S(String str, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(a.bp(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.bo(i, i2, "endIndex < beginIndex: ", " < "));
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                ajnx ajnxVarV = v(1);
                byte[] bArr = ajnxVarV.a;
                int i4 = ajnxVarV.c - i;
                int iMin = Math.min(i2, 8192 - i4);
                bArr[i + i4] = (byte) cCharAt;
                i = i3;
                while (i < iMin) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i + i4] = (byte) cCharAt2;
                    i++;
                }
                int i5 = ajnxVarV.c;
                int i6 = (i4 + i) - i5;
                ajnxVarV.c = i5 + i6;
                this.b += i6;
            } else {
                if (cCharAt < 2048) {
                    ajnx ajnxVarV2 = v(2);
                    byte[] bArr2 = ajnxVarV2.a;
                    int i7 = ajnxVarV2.c;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt & '?') | 128);
                    ajnxVarV2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    ajnx ajnxVarV3 = v(3);
                    byte[] bArr3 = ajnxVarV3.a;
                    int i8 = ajnxVarV3.c;
                    bArr3[i8] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt & '?') | 128);
                    ajnxVarV3.c = i8 + 3;
                    this.b += 3;
                } else {
                    char cCharAt3 = i3 < i2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 >= 57344) {
                        N(63);
                    } else {
                        ajnx ajnxVarV4 = v(4);
                        byte[] bArr4 = ajnxVarV4.a;
                        int i9 = ajnxVarV4.c;
                        int i10 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        bArr4[i9] = (byte) ((i10 >> 18) | 240);
                        bArr4[i9 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i9 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i9 + 3] = (byte) ((i10 & 63) | 128);
                        ajnxVarV4.c = i9 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i = i3;
            }
        }
    }

    public final void T(int i) {
        if (i < 128) {
            N(i);
            return;
        }
        if (i < 2048) {
            ajnx ajnxVarV = v(2);
            byte[] bArr = ajnxVarV.a;
            int i2 = ajnxVarV.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            ajnxVarV.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (i >= 55296 && i < 57344) {
            N(63);
            return;
        }
        if (i < 65536) {
            ajnx ajnxVarV2 = v(3);
            byte[] bArr2 = ajnxVarV2.a;
            int i3 = ajnxVarV2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            ajnxVarV2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(ahfd.f(i)));
        }
        ajnx ajnxVarV3 = v(4);
        byte[] bArr3 = ajnxVarV3.a;
        int i4 = ajnxVarV3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        ajnxVarV3.c = i4 + 4;
        this.b += 4;
    }

    public final void U(long j) {
        if (j == 0) {
            N(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) >> 2);
        ajnx ajnxVarV = v(i);
        byte[] bArr = ajnxVarV.a;
        int i2 = ajnxVarV.c;
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 < i2) {
                ajnxVarV.c += i;
                this.b += i;
                return;
            } else {
                bArr[i3] = ajog.a[(int) (15 & j)];
                j >>>= 4;
            }
        }
    }

    public final void V(String str) {
        str.getClass();
        S(str, 0, str.length());
    }

    @Override // defpackage.ajmz
    public final /* bridge */ /* synthetic */ void W(int i) {
        throw null;
    }

    public final void X(long j) {
        boolean z;
        if (j == 0) {
            N(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                V("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = ajog.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > ajog.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        ajnx ajnxVarV = v(i);
        byte[] bArr2 = ajnxVarV.a;
        int i2 = ajnxVarV.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = ajog.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        ajnxVarV.c += i;
        this.b += i;
    }

    @Override // defpackage.ajmz
    public final /* bridge */ /* synthetic */ void Y(long j) {
        throw null;
    }

    @Override // defpackage.ajmz
    public final /* bridge */ /* synthetic */ void Z(String str) {
        throw null;
    }

    @Override // defpackage.ajoa
    public final void a(ajmy ajmyVar, long j) {
        ajnx ajnxVarB;
        ajmyVar.getClass();
        if (ajmyVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        ahfd.g(ajmyVar.b, 0L, j);
        while (j > 0) {
            ajnx ajnxVar = ajmyVar.a;
            ajnxVar.getClass();
            int i = ajnxVar.c;
            ajnxVar.getClass();
            int i2 = i - ajnxVar.b;
            int i3 = 0;
            if (j < i2) {
                ajnx ajnxVar2 = this.a;
                ajnx ajnxVar3 = ajnxVar2 != null ? ajnxVar2.g : null;
                int i4 = (int) j;
                if (ajnxVar3 != null && ajnxVar3.e) {
                    if ((ajnxVar3.c + j) - (ajnxVar3.d ? 0 : ajnxVar3.b) <= 8192) {
                        ajnxVar.getClass();
                        ajnxVar.c(ajnxVar3, i4);
                        ajmyVar.b -= j;
                        this.b += j;
                        return;
                    }
                }
                ajnxVar.getClass();
                if (i4 > i2) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    ajnxVarB = ajnxVar.b();
                } else {
                    byte[] bArr = ajnxVar.a;
                    ajnx ajnxVarA = ajny.a();
                    byte[] bArr2 = ajnxVarA.a;
                    int i5 = ajnxVar.b;
                    woy.dn(bArr, bArr2, 0, i5, i5 + i4);
                    ajnxVarB = ajnxVarA;
                }
                ajnxVarB.c = ajnxVarB.b + i4;
                ajnxVar.b += i4;
                ajnx ajnxVar4 = ajnxVar.g;
                ajnxVar4.getClass();
                ajnxVar4.d(ajnxVarB);
                ajmyVar.a = ajnxVarB;
            }
            ajnx ajnxVar5 = ajmyVar.a;
            ajnxVar5.getClass();
            int i6 = ajnxVar5.c - ajnxVar5.b;
            ajmyVar.a = ajnxVar5.a();
            ajnx ajnxVar6 = this.a;
            if (ajnxVar6 == null) {
                this.a = ajnxVar5;
                ajnxVar5.g = ajnxVar5;
                ajnxVar5.f = ajnxVar5.g;
            } else {
                ajnx ajnxVar7 = ajnxVar6.g;
                ajnxVar7.getClass();
                ajnxVar7.d(ajnxVar5);
                ajnx ajnxVar8 = ajnxVar5.g;
                if (ajnxVar8 == ajnxVar5) {
                    throw new IllegalStateException("cannot compact");
                }
                ajnxVar8.getClass();
                if (ajnxVar8.e) {
                    int i7 = ajnxVar5.c - ajnxVar5.b;
                    ajnxVar8.getClass();
                    int i8 = 8192 - ajnxVar8.c;
                    ajnxVar8.getClass();
                    if (!ajnxVar8.d) {
                        ajnxVar8.getClass();
                        i3 = ajnxVar8.b;
                    }
                    if (i7 <= i8 + i3) {
                        ajnxVar8.getClass();
                        ajnxVar5.c(ajnxVar8, i7);
                        ajnxVar5.a();
                        ajny.b(ajnxVar5);
                    }
                }
            }
            long j2 = i6;
            ajmyVar.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    public final byte c(long j) {
        ahfd.g(this.b, j, 1L);
        ajnx ajnxVar = this.a;
        ajnxVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                ajnxVar = ajnxVar.g;
                ajnxVar.getClass();
                j2 -= ajnxVar.c - ajnxVar.b;
            }
            ajnxVar.getClass();
            return ajnxVar.a[(int) ((ajnxVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = ajnxVar.c;
            int i2 = ajnxVar.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                ajnxVar.getClass();
                return ajnxVar.a[(int) ((i2 + j) - j3)];
            }
            ajnxVar = ajnxVar.f;
            ajnxVar.getClass();
            j3 = j4;
        }
    }

    public final /* synthetic */ Object clone() {
        ajmy ajmyVar = new ajmy();
        if (this.b == 0) {
            return ajmyVar;
        }
        ajnx ajnxVar = this.a;
        ajnxVar.getClass();
        ajnx ajnxVarB = ajnxVar.b();
        ajmyVar.a = ajnxVarB;
        ajnxVarB.g = ajnxVarB;
        ajnxVarB.f = ajnxVarB.g;
        for (ajnx ajnxVar2 = ajnxVar.f; ajnxVar2 != ajnxVar; ajnxVar2 = ajnxVar2.f) {
            ajnx ajnxVar3 = ajnxVarB.g;
            ajnxVar3.getClass();
            ajnxVar2.getClass();
            ajnxVar3.d(ajnxVar2.b());
        }
        ajmyVar.b = this.b;
        return ajmyVar;
    }

    @Override // defpackage.ajna
    public final byte d() throws EOFException {
        long j = this.b;
        if (j == 0) {
            throw new EOFException();
        }
        ajnx ajnxVar = this.a;
        ajnxVar.getClass();
        int i = ajnxVar.b;
        int i2 = i + 1;
        byte[] bArr = ajnxVar.a;
        int i3 = ajnxVar.c;
        byte b = bArr[i];
        this.b = j - 1;
        if (i2 != i3) {
            ajnxVar.b = i2;
            return b;
        }
        this.a = ajnxVar.a();
        ajny.b(ajnxVar);
        return b;
    }

    public final int e(byte[] bArr, int i, int i2) {
        bArr.getClass();
        ahfd.g(bArr.length, i, i2);
        ajnx ajnxVar = this.a;
        if (ajnxVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, ajnxVar.c - ajnxVar.b);
        int i3 = ajnxVar.b;
        woy.dn(ajnxVar.a, bArr, i, i3, i3 + iMin);
        int i4 = ajnxVar.b + iMin;
        ajnxVar.b = i4;
        this.b -= iMin;
        if (i4 != ajnxVar.c) {
            return iMin;
        }
        this.a = ajnxVar.a();
        ajny.b(ajnxVar);
        return iMin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajmy)) {
            return false;
        }
        long j = this.b;
        ajmy ajmyVar = (ajmy) obj;
        if (j != ajmyVar.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        ajnx ajnxVar = this.a;
        ajnxVar.getClass();
        ajnx ajnxVar2 = ajmyVar.a;
        ajnxVar2.getClass();
        int i = ajnxVar.b;
        int i2 = ajnxVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(ajnxVar.c - i, ajnxVar2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (ajnxVar.a[i] != ajnxVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == ajnxVar.c) {
                ajnxVar = ajnxVar.f;
                ajnxVar.getClass();
                i = ajnxVar.b;
            }
            if (i2 == ajnxVar2.c) {
                ajnxVar2 = ajnxVar2.f;
                ajnxVar2.getClass();
                i2 = ajnxVar2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // defpackage.ajna
    public final int f() throws EOFException {
        long j = this.b;
        if (j < 4) {
            throw new EOFException();
        }
        ajnx ajnxVar = this.a;
        ajnxVar.getClass();
        int i = ajnxVar.b;
        int i2 = ajnxVar.c;
        if (i2 - i < 4) {
            return (d() & 255) | ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8);
        }
        byte[] bArr = ajnxVar.a;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = (bArr[i + 1] & 255) << 16;
        int i5 = (bArr[i + 2] & 255) << 8;
        int i6 = bArr[i + 3] & 255;
        this.b = j - 4;
        int i7 = i3 | i4 | i5 | i6;
        int i8 = i + 4;
        if (i8 != i2) {
            ajnxVar.b = i8;
            return i7;
        }
        this.a = ajnxVar.a();
        ajny.b(ajnxVar);
        return i7;
    }

    @Override // defpackage.ajna
    public final int g() throws EOFException {
        throw null;
    }

    public final long h() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        ajnx ajnxVar = this.a;
        ajnxVar.getClass();
        ajnx ajnxVar2 = ajnxVar.g;
        ajnxVar2.getClass();
        return (ajnxVar2.c >= 8192 || !ajnxVar2.e) ? j : j - (r2 - ajnxVar2.b);
    }

    @Override // defpackage.ajoc
    public final long hU(ajmy ajmyVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.bN(j, "byteCount < 0: "));
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        ajmyVar.a(this, j);
        return j;
    }

    @Override // defpackage.ajoc
    public final ajoe hV() {
        return ajoe.k;
    }

    public final int hashCode() {
        ajnx ajnxVar = this.a;
        if (ajnxVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ajnxVar.c;
            for (int i3 = ajnxVar.b; i3 < i2; i3++) {
                i = (i * 31) + ajnxVar.a[i3];
            }
            ajnxVar = ajnxVar.f;
            ajnxVar.getClass();
        } while (ajnxVar != this.a);
        return i;
    }

    public final long i(byte b, long j, long j2) {
        ajnx ajnxVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (j3 < 0 || j3 > j4) {
            throw new IllegalArgumentException("size=" + this.b + " fromIndex=" + j3 + " toIndex=" + j4);
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (ajnxVar = this.a) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                ajnxVar = ajnxVar.g;
                ajnxVar.getClass();
                j6 -= ajnxVar.c - ajnxVar.b;
            }
            if (ajnxVar == null) {
                return -1L;
            }
            while (j6 < j4) {
                byte[] bArr = ajnxVar.a;
                long j8 = j7;
                int iMin = (int) Math.min(ajnxVar.c, (ajnxVar.b + j4) - j6);
                for (int i = (int) ((ajnxVar.b + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return (i - ajnxVar.b) + j6;
                    }
                }
                j6 += ajnxVar.c - ajnxVar.b;
                ajnxVar = ajnxVar.f;
                ajnxVar.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = (ajnxVar.c - ajnxVar.b) + j5;
            if (j9 > j3) {
                break;
            }
            ajnxVar = ajnxVar.f;
            ajnxVar.getClass();
            j5 = j9;
        }
        if (ajnxVar == null) {
            return -1L;
        }
        while (j5 < j4) {
            byte[] bArr2 = ajnxVar.a;
            int iMin2 = (int) Math.min(ajnxVar.c, (ajnxVar.b + j4) - j5);
            for (int i2 = (int) ((ajnxVar.b + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - ajnxVar.b) + j5;
                }
            }
            j5 += ajnxVar.c - ajnxVar.b;
            ajnxVar = ajnxVar.f;
            ajnxVar.getClass();
            j3 = j5;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j(ajnb ajnbVar) {
        int i;
        int i2;
        ajnbVar.getClass();
        ajnx ajnxVar = this.a;
        if (ajnxVar == null) {
            return -1L;
        }
        long j = this.b;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                ajnxVar = ajnxVar.g;
                ajnxVar.getClass();
                j -= ajnxVar.c - ajnxVar.b;
            }
            if (ajnxVar == null) {
                return -1L;
            }
            if (ajnbVar.c() == 2) {
                byte bA = ajnbVar.a(0);
                byte bA2 = ajnbVar.a(1);
                while (j < this.b) {
                    byte[] bArr = ajnxVar.a;
                    long j3 = ajnxVar.b + j2;
                    int i3 = ajnxVar.c;
                    i = (int) (j3 - j);
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b == bA || b == bA2) {
                            i2 = ajnxVar.b;
                        } else {
                            i++;
                        }
                    }
                    j2 = (ajnxVar.c - ajnxVar.b) + j;
                    ajnxVar = ajnxVar.f;
                    ajnxVar.getClass();
                    j = j2;
                }
                return -1L;
            }
            byte[] bArr2 = ajnbVar.b;
            while (j < this.b) {
                byte[] bArr3 = ajnxVar.a;
                long j4 = ajnxVar.b + j2;
                int i4 = ajnxVar.c;
                i = (int) (j4 - j);
                while (i < i4) {
                    byte b2 = bArr3[i];
                    for (byte b3 : bArr2) {
                        if (b2 == b3) {
                            i2 = ajnxVar.b;
                        }
                    }
                    i++;
                }
                j2 = (ajnxVar.c - ajnxVar.b) + j;
                ajnxVar = ajnxVar.f;
                ajnxVar.getClass();
                j = j2;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j5 = (ajnxVar.c - ajnxVar.b) + j;
            if (j5 > 0) {
                break;
            }
            ajnxVar = ajnxVar.f;
            ajnxVar.getClass();
            j = j5;
        }
        if (ajnxVar == null) {
            return -1L;
        }
        if (ajnbVar.c() == 2) {
            byte bA3 = ajnbVar.a(0);
            byte bA4 = ajnbVar.a(1);
            while (j < this.b) {
                byte[] bArr4 = ajnxVar.a;
                long j6 = ajnxVar.b + j2;
                int i5 = ajnxVar.c;
                i = (int) (j6 - j);
                while (i < i5) {
                    byte b4 = bArr4[i];
                    if (b4 == bA3 || b4 == bA4) {
                        i2 = ajnxVar.b;
                    } else {
                        i++;
                    }
                }
                j2 = (ajnxVar.c - ajnxVar.b) + j;
                ajnxVar = ajnxVar.f;
                ajnxVar.getClass();
                j = j2;
            }
            return -1L;
        }
        byte[] bArr5 = ajnbVar.b;
        while (j < this.b) {
            byte[] bArr6 = ajnxVar.a;
            long j7 = ajnxVar.b + j2;
            int i6 = ajnxVar.c;
            i = (int) (j7 - j);
            while (i < i6) {
                byte b5 = bArr6[i];
                for (byte b6 : bArr5) {
                    if (b5 == b6) {
                        i2 = ajnxVar.b;
                    }
                }
                i++;
            }
            j2 = (ajnxVar.c - ajnxVar.b) + j;
            ajnxVar = ajnxVar.f;
            ajnxVar.getClass();
            j = j2;
        }
        return -1L;
        return (i - i2) + j;
    }

    @Override // defpackage.ajna
    public final long k() throws EOFException {
        throw null;
    }

    @Override // defpackage.ajna
    public final InputStream l() {
        return new ajmx(this);
    }

    public final String m(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.bN(j, "byteCount: "));
        }
        long j2 = this.b;
        if (j2 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        ajnx ajnxVar = this.a;
        ajnxVar.getClass();
        int i = ajnxVar.b;
        int i2 = ajnxVar.c;
        if (i + j > i2) {
            return new String(E(j), charset);
        }
        int i3 = (int) j;
        String str = new String(ajnxVar.a, i, i3, charset);
        int i4 = i + i3;
        ajnxVar.b = i4;
        this.b = j2 - j;
        if (i4 == i2) {
            this.a = ajnxVar.a();
            ajny.b(ajnxVar);
        }
        return str;
    }

    public final String n() {
        return m(this.b, aise.a);
    }

    @Override // defpackage.ajna
    public final String o(long j) throws EOFException {
        return m(j, aise.a);
    }

    @Override // defpackage.ajna
    public final String p(long j) throws EOFException {
        throw null;
    }

    @Override // defpackage.ajna
    public final ajna q() {
        throw null;
    }

    public final ajnb r() {
        return s(this.b);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        byteBuffer.getClass();
        ajnx ajnxVar = this.a;
        if (ajnxVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), ajnxVar.c - ajnxVar.b);
        byteBuffer.put(ajnxVar.a, ajnxVar.b, iMin);
        int i = ajnxVar.b + iMin;
        ajnxVar.b = i;
        this.b -= iMin;
        if (i == ajnxVar.c) {
            this.a = ajnxVar.a();
            ajny.b(ajnxVar);
        }
        return iMin;
    }

    @Override // defpackage.ajna
    public final ajnb s(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.bN(j, "byteCount: "));
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ajnb(E(j));
        }
        ajnb ajnbVarU = u((int) j);
        A(j);
        return ajnbVarU;
    }

    public final ajnb t() {
        long j = this.b;
        if (j <= 2147483647L) {
            return u((int) j);
        }
        throw new IllegalStateException(a.bN(j, "size > Int.MAX_VALUE: "));
    }

    public final String toString() {
        return t().toString();
    }

    public final ajnb u(int i) {
        if (i == 0) {
            return ajnb.a;
        }
        ahfd.g(this.b, 0L, i);
        ajnx ajnxVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            ajnxVar.getClass();
            int i5 = ajnxVar.c;
            int i6 = ajnxVar.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            ajnxVar = ajnxVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 + i4];
        ajnx ajnxVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            ajnxVar2.getClass();
            bArr[i7] = ajnxVar2.a;
            i2 += ajnxVar2.c - ajnxVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = ajnxVar2.b;
            ajnxVar2.d = true;
            i7++;
            ajnxVar2 = ajnxVar2.f;
        }
        return new ajnz(bArr, iArr);
    }

    public final ajnx v(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        ajnx ajnxVar = this.a;
        if (ajnxVar == null) {
            ajnx ajnxVarA = ajny.a();
            this.a = ajnxVarA;
            ajnxVarA.g = ajnxVarA;
            ajnxVarA.f = ajnxVarA;
            return ajnxVarA;
        }
        ajnx ajnxVar2 = ajnxVar.g;
        ajnxVar2.getClass();
        if (ajnxVar2.c + i <= 8192 && ajnxVar2.e) {
            return ajnxVar2;
        }
        ajnx ajnxVarA2 = ajny.a();
        ajnxVar2.d(ajnxVarA2);
        return ajnxVarA2;
    }

    @Override // defpackage.ajna
    public final short w() throws EOFException {
        int iD;
        long j = this.b;
        if (j < 2) {
            throw new EOFException();
        }
        ajnx ajnxVar = this.a;
        ajnxVar.getClass();
        int i = ajnxVar.b;
        int i2 = ajnxVar.c;
        if (i2 - i < 2) {
            iD = (d() & 255) | ((d() & 255) << 8);
        } else {
            byte[] bArr = ajnxVar.a;
            int i3 = (bArr[i] & 255) << 8;
            int i4 = bArr[i + 1] & 255;
            this.b = j - 2;
            int i5 = i + 2;
            if (i5 == i2) {
                this.a = ajnxVar.a();
                ajny.b(ajnxVar);
            } else {
                ajnxVar.b = i5;
            }
            iD = i3 | i4;
        }
        return (short) iD;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            ajnx ajnxVarV = v(1);
            int i2 = 8192 - ajnxVarV.c;
            byte[] bArr = ajnxVarV.a;
            int iMin = Math.min(i, i2);
            byteBuffer.get(bArr, ajnxVarV.c, iMin);
            i -= iMin;
            ajnxVarV.c += iMin;
        }
        this.b += iRemaining;
        return iRemaining;
    }

    @Override // defpackage.ajna
    public final short x() throws EOFException {
        throw null;
    }

    public final void y() throws EOFException {
        A(this.b);
    }

    @Override // defpackage.ajna
    public final void z(long j) throws EOFException {
        throw null;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.ajoc
    public final void close() {
    }

    @Override // defpackage.ajmz, defpackage.ajoa, java.io.Flushable
    public final void flush() {
    }
}
