package com.google.v;

import androidx.compose.foundation.style.StylePropertiesKt;
import java.nio.charset.StandardCharsets;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13041a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static volatile int f13042b = 100;

    static long A(byte[] bArr, int i2) {
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | ((bArr[i2 + 7] & 255) << 56);
    }

    private static void B(int i2) throws eu {
        if (i2 >= f13042b) {
            throw new eu("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    static double a(byte[] bArr, int i2) {
        return Double.longBitsToDouble(A(bArr, i2));
    }

    static float b(byte[] bArr, int i2) {
        return Float.intBitsToFloat(d(bArr, i2));
    }

    static int c(byte[] bArr, int i2, k kVar) throws eu {
        int iT = t(bArr, i2, kVar);
        int i3 = kVar.f13036a;
        if (i3 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iT) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i3 == 0) {
            kVar.f13038c = v.f13054a;
            return iT;
        }
        kVar.f13038c = v.r(bArr, iT, i3);
        return iT + i3;
    }

    static int d(byte[] bArr, int i2) {
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    static int e(ft ftVar, byte[] bArr, int i2, int i3, int i4, k kVar) throws eu {
        Object objE = ftVar.e();
        int iX = x(objE, ftVar, bArr, i2, i3, i4, kVar);
        ftVar.f(objE);
        kVar.f13038c = objE;
        return iX;
    }

    static int f(ft ftVar, byte[] bArr, int i2, int i3, k kVar) throws eu {
        Object objE = ftVar.e();
        int iY = y(objE, ftVar, bArr, i2, i3, kVar);
        ftVar.f(objE);
        kVar.f13038c = objE;
        return iY;
    }

    static int g(ft ftVar, int i2, byte[] bArr, int i3, int i4, eo eoVar, k kVar) throws eu {
        int iF = f(ftVar, bArr, i3, i4, kVar);
        eoVar.add(kVar.f13038c);
        while (iF < i4) {
            int iT = t(bArr, iF, kVar);
            if (i2 != kVar.f13036a) {
                break;
            }
            iF = f(ftVar, bArr, iT, i4, kVar);
            eoVar.add(kVar.f13038c);
        }
        return iF;
    }

    static int h(byte[] bArr, int i2, eo eoVar, k kVar) throws eu {
        p pVar = (p) eoVar;
        int iT = t(bArr, i2, kVar);
        int i3 = kVar.f13036a;
        if (i3 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iT) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = i3 + iT;
        while (iT < i4) {
            iT = w(bArr, iT, kVar);
            pVar.g(kVar.f13037b != 0);
        }
        if (iT == i4) {
            return iT;
        }
        throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(byte[] bArr, int i2, eo eoVar, k kVar) throws eu {
        cz czVar = (cz) eoVar;
        int iT = t(bArr, i2, kVar);
        int i3 = kVar.f13036a;
        if (i3 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iT) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = iT + i3;
        czVar.i(czVar.size() + (i3 >> 3));
        while (iT < i4) {
            czVar.h(a(bArr, iT));
            iT += 8;
        }
        if (iT == i4) {
            return iT;
        }
        throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int j(byte[] bArr, int i2, eo eoVar, k kVar) throws eu {
        ed edVar = (ed) eoVar;
        int iT = t(bArr, i2, kVar);
        int i3 = kVar.f13036a;
        if (i3 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iT) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = iT + i3;
        edVar.j(edVar.size() + (i3 >> 2));
        while (iT < i4) {
            edVar.i(d(bArr, iT));
            iT += 4;
        }
        if (iT == i4) {
            return iT;
        }
        throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int k(byte[] bArr, int i2, eo eoVar, k kVar) throws eu {
        fc fcVar = (fc) eoVar;
        int iT = t(bArr, i2, kVar);
        int i3 = kVar.f13036a;
        if (i3 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iT) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = iT + i3;
        fcVar.i(fcVar.size() + (i3 >> 3));
        while (iT < i4) {
            fcVar.g(A(bArr, iT));
            iT += 8;
        }
        if (iT == i4) {
            return iT;
        }
        throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int l(byte[] bArr, int i2, eo eoVar, k kVar) throws eu {
        dj djVar = (dj) eoVar;
        int iT = t(bArr, i2, kVar);
        int i3 = kVar.f13036a;
        if (i3 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iT) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = iT + i3;
        djVar.j(djVar.size() + (i3 >> 2));
        while (iT < i4) {
            djVar.i(b(bArr, iT));
            iT += 4;
        }
        if (iT == i4) {
            return iT;
        }
        throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int m(byte[] bArr, int i2, eo eoVar, k kVar) throws eu {
        ed edVar = (ed) eoVar;
        int iT = t(bArr, i2, kVar);
        int i3 = kVar.f13036a;
        if (i3 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iT) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = i3 + iT;
        while (iT < i4) {
            iT = t(bArr, iT, kVar);
            edVar.i(z.O(kVar.f13036a));
        }
        if (iT == i4) {
            return iT;
        }
        throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int n(byte[] bArr, int i2, eo eoVar, k kVar) throws eu {
        fc fcVar = (fc) eoVar;
        int iT = t(bArr, i2, kVar);
        int i3 = kVar.f13036a;
        if (i3 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iT) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = i3 + iT;
        while (iT < i4) {
            iT = w(bArr, iT, kVar);
            fcVar.g(z.Q(kVar.f13037b));
        }
        if (iT == i4) {
            return iT;
        }
        throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int o(byte[] bArr, int i2, eo eoVar, k kVar) throws eu {
        ed edVar = (ed) eoVar;
        int iT = t(bArr, i2, kVar);
        int i3 = kVar.f13036a;
        if (i3 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iT) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = i3 + iT;
        while (iT < i4) {
            iT = t(bArr, iT, kVar);
            edVar.i(kVar.f13036a);
        }
        if (iT == i4) {
            return iT;
        }
        throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int p(byte[] bArr, int i2, eo eoVar, k kVar) throws eu {
        fc fcVar = (fc) eoVar;
        int iT = t(bArr, i2, kVar);
        int i3 = kVar.f13036a;
        if (i3 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - iT) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = i3 + iT;
        while (iT < i4) {
            iT = w(bArr, iT, kVar);
            fcVar.g(kVar.f13037b);
        }
        if (iT == i4) {
            return iT;
        }
        throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int q(byte[] bArr, int i2, k kVar) throws eu {
        int iT = t(bArr, i2, kVar);
        int i3 = kVar.f13036a;
        if (i3 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            kVar.f13038c = "";
            return iT;
        }
        kVar.f13038c = new String(bArr, iT, i3, StandardCharsets.UTF_8);
        return iT + i3;
    }

    static int r(byte[] bArr, int i2, k kVar) throws eu {
        int iT = t(bArr, i2, kVar);
        int i3 = kVar.f13036a;
        if (i3 < 0) {
            throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            kVar.f13038c = "";
            return iT;
        }
        kVar.f13038c = dc.p(bArr, iT, i3);
        return iT + i3;
    }

    static int s(int i2, byte[] bArr, int i3, int i4, gf gfVar, k kVar) throws eu {
        if (go.a(i2) == 0) {
            throw new eu("Protocol message contained an invalid tag (zero).");
        }
        int iB = go.b(i2);
        if (iB == 0) {
            int iW = w(bArr, i3, kVar);
            gfVar.i(i2, Long.valueOf(kVar.f13037b));
            return iW;
        }
        if (iB == 1) {
            gfVar.i(i2, Long.valueOf(A(bArr, i3)));
            return i3 + 8;
        }
        if (iB == 2) {
            int iT = t(bArr, i3, kVar);
            int i5 = kVar.f13036a;
            if (i5 < 0) {
                throw new eu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iT) {
                throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                gfVar.i(i2, v.f13054a);
            } else {
                gfVar.i(i2, v.r(bArr, iT, i5));
            }
            return iT + i5;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new eu("Protocol message contained an invalid tag (zero).");
            }
            gfVar.i(i2, Integer.valueOf(d(bArr, i3)));
            return i3 + 4;
        }
        int i6 = (i2 & (-8)) | 4;
        gf gfVarE = gf.e();
        int i7 = kVar.f13040e + 1;
        kVar.f13040e = i7;
        B(i7);
        int i8 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int iT2 = t(bArr, i3, kVar);
            int i9 = kVar.f13036a;
            if (i9 == i6) {
                i8 = i9;
                i3 = iT2;
                break;
            }
            i3 = s(i9, bArr, iT2, i4, gfVarE, kVar);
            i8 = i9;
        }
        kVar.f13040e--;
        if (i3 > i4 || i8 != i6) {
            throw new eu("Failed to parse the message.");
        }
        gfVar.i(i2, gfVarE);
        return i3;
    }

    static int t(byte[] bArr, int i2, k kVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return u(b2, bArr, i3, kVar);
        }
        kVar.f13036a = b2;
        return i3;
    }

    static int u(int i2, byte[] bArr, int i3, k kVar) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & 127;
        if (b2 >= 0) {
            kVar.f13036a = i5 | (b2 << 7);
            return i4;
        }
        int i6 = i5 | ((b2 & 127) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            kVar.f13036a = i6 | (b3 << StylePropertiesKt.TopId);
            return i7;
        }
        int i8 = i6 | ((b3 & 127) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            kVar.f13036a = i8 | (b4 << StylePropertiesKt.AlphaId);
            return i9;
        }
        int i10 = i8 | ((b4 & 127) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            kVar.f13036a = i10 | (b5 << StylePropertiesKt.RotationZId);
            return i11;
        }
        int i12 = i10 | ((b5 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                kVar.f13036a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    static int v(int i2, byte[] bArr, int i3, int i4, eo eoVar, k kVar) {
        ed edVar = (ed) eoVar;
        int iT = t(bArr, i3, kVar);
        edVar.i(kVar.f13036a);
        while (iT < i4) {
            int iT2 = t(bArr, iT, kVar);
            if (i2 != kVar.f13036a) {
                break;
            }
            iT = t(bArr, iT2, kVar);
            edVar.i(kVar.f13036a);
        }
        return iT;
    }

    static int w(byte[] bArr, int i2, k kVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            kVar.f13037b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | ((b2 & 127) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (r10 & 127) << i5;
            b2 = bArr[i4];
            i4 = i6;
        }
        kVar.f13037b = j3;
        return i4;
    }

    static int x(Object obj, ft ftVar, byte[] bArr, int i2, int i3, int i4, k kVar) throws eu {
        int i5 = kVar.f13040e + 1;
        kVar.f13040e = i5;
        B(i5);
        int iC = ((fl) ftVar).c(obj, bArr, i2, i3, i4, kVar);
        kVar.f13040e--;
        kVar.f13038c = obj;
        return iC;
    }

    static int y(Object obj, ft ftVar, byte[] bArr, int i2, int i3, k kVar) throws eu {
        int iU = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iU = u(i4, bArr, iU, kVar);
            i4 = kVar.f13036a;
        }
        int i5 = iU;
        if (i4 < 0 || i4 > i3 - i5) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = kVar.f13040e + 1;
        kVar.f13040e = i6;
        B(i6);
        int i7 = i5 + i4;
        ftVar.i(obj, bArr, i5, i7, kVar);
        kVar.f13040e--;
        kVar.f13038c = obj;
        return i7;
    }

    static int z(int i2, byte[] bArr, int i3, int i4, k kVar) throws eu {
        if (go.a(i2) == 0) {
            throw new eu("Protocol message contained an invalid tag (zero).");
        }
        int iB = go.b(i2);
        if (iB == 0) {
            return w(bArr, i3, kVar);
        }
        if (iB == 1) {
            return i3 + 8;
        }
        if (iB == 2) {
            return t(bArr, i3, kVar) + kVar.f13036a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i3 + 4;
            }
            throw new eu("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i2 & (-8)) | 4;
        int i6 = kVar.f13040e + 1;
        kVar.f13040e = i6;
        B(i6);
        int i7 = 0;
        while (i3 < i4) {
            i3 = t(bArr, i3, kVar);
            i7 = kVar.f13036a;
            if (i7 == i5) {
                break;
            }
            i3 = z(i7, bArr, i3, i4, kVar);
        }
        kVar.f13040e--;
        if (i3 > i4 || i7 != i5) {
            throw new eu("Failed to parse the message.");
        }
        return i3;
    }
}
