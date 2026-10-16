package com.google.protobuf;

import com.google.protobuf.Internal;
import org.apache.tika.fork.ForkServer;

/* renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1800h {
    public static int a(byte[] bArr, int i5, C1797g c1797g) {
        int iR = r(bArr, i5, c1797g);
        int i10 = c1797g.f27677a;
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i10 > bArr.length - iR) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i10 == 0) {
            c1797g.f27679c = ByteString.EMPTY;
            return iR;
        }
        c1797g.f27679c = ByteString.copyFrom(bArr, iR, i10);
        return iR + i10;
    }

    public static int b(int i5, byte[] bArr) {
        return ((bArr[i5 + 3] & ForkServer.ERROR) << 24) | (bArr[i5] & ForkServer.ERROR) | ((bArr[i5 + 1] & ForkServer.ERROR) << 8) | ((bArr[i5 + 2] & ForkServer.ERROR) << 16);
    }

    public static long c(int i5, byte[] bArr) {
        return ((bArr[i5 + 7] & 255) << 56) | (bArr[i5] & 255) | ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5 + 2] & 255) << 16) | ((bArr[i5 + 3] & 255) << 24) | ((bArr[i5 + 4] & 255) << 32) | ((bArr[i5 + 5] & 255) << 40) | ((bArr[i5 + 6] & 255) << 48);
    }

    public static int d(D1 d12, byte[] bArr, int i5, int i10, int i11, C1797g c1797g) {
        Object objNewInstance = d12.newInstance();
        int iU = u(objNewInstance, d12, bArr, i5, i10, i11, c1797g);
        d12.a(objNewInstance);
        c1797g.f27679c = objNewInstance;
        return iU;
    }

    public static int e(D1 d12, byte[] bArr, int i5, int i10, C1797g c1797g) {
        Object objNewInstance = d12.newInstance();
        int iV = v(objNewInstance, d12, bArr, i5, i10, c1797g);
        d12.a(objNewInstance);
        c1797g.f27679c = objNewInstance;
        return iV;
    }

    public static int f(D1 d12, int i5, byte[] bArr, int i10, int i11, Internal.ProtobufList protobufList, C1797g c1797g) {
        int iE = e(d12, bArr, i10, i11, c1797g);
        protobufList.add(c1797g.f27679c);
        while (iE < i11) {
            int iR = r(bArr, iE, c1797g);
            if (i5 != c1797g.f27677a) {
                break;
            }
            iE = e(d12, bArr, iR, i11, c1797g);
            protobufList.add(c1797g.f27679c);
        }
        return iE;
    }

    public static int g(byte[] bArr, int i5, Internal.ProtobufList protobufList, C1797g c1797g) {
        C1806j c1806j = (C1806j) protobufList;
        int iR = r(bArr, i5, c1797g);
        int i10 = c1797g.f27677a + iR;
        while (iR < i10) {
            iR = t(bArr, iR, c1797g);
            c1806j.addBoolean(c1797g.f27678b != 0);
        }
        if (iR == i10) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int h(byte[] bArr, int i5, Internal.ProtobufList protobufList, C1797g c1797g) {
        C1780a0 c1780a0 = (C1780a0) protobufList;
        int iR = r(bArr, i5, c1797g);
        int i10 = c1797g.f27677a + iR;
        while (iR < i10) {
            c1780a0.addDouble(Double.longBitsToDouble(c(iR, bArr)));
            iR += 8;
        }
        if (iR == i10) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int i(byte[] bArr, int i5, Internal.ProtobufList protobufList, C1797g c1797g) {
        G0 g02 = (G0) protobufList;
        int iR = r(bArr, i5, c1797g);
        int i10 = c1797g.f27677a + iR;
        while (iR < i10) {
            g02.addInt(b(iR, bArr));
            iR += 4;
        }
        if (iR == i10) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int j(byte[] bArr, int i5, Internal.ProtobufList protobufList, C1797g c1797g) {
        Y0 y02 = (Y0) protobufList;
        int iR = r(bArr, i5, c1797g);
        int i10 = c1797g.f27677a + iR;
        while (iR < i10) {
            y02.addLong(c(iR, bArr));
            iR += 8;
        }
        if (iR == i10) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int k(byte[] bArr, int i5, Internal.ProtobufList protobufList, C1797g c1797g) {
        C1854z0 c1854z0 = (C1854z0) protobufList;
        int iR = r(bArr, i5, c1797g);
        int i10 = c1797g.f27677a + iR;
        while (iR < i10) {
            c1854z0.addFloat(Float.intBitsToFloat(b(iR, bArr)));
            iR += 4;
        }
        if (iR == i10) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int l(byte[] bArr, int i5, Internal.ProtobufList protobufList, C1797g c1797g) {
        G0 g02 = (G0) protobufList;
        int iR = r(bArr, i5, c1797g);
        int i10 = c1797g.f27677a + iR;
        while (iR < i10) {
            iR = r(bArr, iR, c1797g);
            g02.addInt(CodedInputStream.decodeZigZag32(c1797g.f27677a));
        }
        if (iR == i10) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int m(byte[] bArr, int i5, Internal.ProtobufList protobufList, C1797g c1797g) {
        Y0 y02 = (Y0) protobufList;
        int iR = r(bArr, i5, c1797g);
        int i10 = c1797g.f27677a + iR;
        while (iR < i10) {
            iR = t(bArr, iR, c1797g);
            y02.addLong(CodedInputStream.decodeZigZag64(c1797g.f27678b));
        }
        if (iR == i10) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int n(byte[] bArr, int i5, Internal.ProtobufList protobufList, C1797g c1797g) {
        G0 g02 = (G0) protobufList;
        int iR = r(bArr, i5, c1797g);
        int i10 = c1797g.f27677a + iR;
        while (iR < i10) {
            iR = r(bArr, iR, c1797g);
            g02.addInt(c1797g.f27677a);
        }
        if (iR == i10) {
            return iR;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int o(byte[] bArr, int i5, C1797g c1797g) {
        int iR = r(bArr, i5, c1797g);
        int i10 = c1797g.f27677a;
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i10 == 0) {
            c1797g.f27679c = "";
            return iR;
        }
        c1797g.f27679c = new String(bArr, iR, i10, Internal.UTF_8);
        return iR + i10;
    }

    public static int p(int i5, byte[] bArr, int i10, int i11, UnknownFieldSetLite unknownFieldSetLite, C1797g c1797g) {
        if (WireFormat.getTagFieldNumber(i5) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i5);
        if (tagWireType == 0) {
            int iT = t(bArr, i10, c1797g);
            unknownFieldSetLite.storeField(i5, Long.valueOf(c1797g.f27678b));
            return iT;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i5, Long.valueOf(c(i10, bArr)));
            return i10 + 8;
        }
        if (tagWireType == 2) {
            int iR = r(bArr, i10, c1797g);
            int i12 = c1797g.f27677a;
            if (i12 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i12 > bArr.length - iR) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i12 == 0) {
                unknownFieldSetLite.storeField(i5, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i5, ByteString.copyFrom(bArr, iR, i12));
            }
            return iR + i12;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFieldSetLite.storeField(i5, Integer.valueOf(b(i10, bArr)));
            return i10 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int i13 = (i5 & (-8)) | 4;
        int i14 = c1797g.f27681e + 1;
        c1797g.f27681e = i14;
        if (i14 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iR2 = r(bArr, i10, c1797g);
            i15 = c1797g.f27677a;
            if (i15 == i13) {
                i10 = iR2;
                break;
            }
            i10 = p(i15, bArr, iR2, i11, unknownFieldSetLiteNewInstance, c1797g);
        }
        c1797g.f27681e--;
        if (i10 > i11 || i15 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i5, unknownFieldSetLiteNewInstance);
        return i10;
    }

    public static int q(int i5, byte[] bArr, int i10, C1797g c1797g) {
        int i11 = i5 & 127;
        int i12 = i10 + 1;
        byte b5 = bArr[i10];
        if (b5 >= 0) {
            c1797g.f27677a = i11 | (b5 << 7);
            return i12;
        }
        int i13 = i11 | ((b5 & 127) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            c1797g.f27677a = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & 127) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            c1797g.f27677a = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & 127) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            c1797g.f27677a = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                c1797g.f27677a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int r(byte[] bArr, int i5, C1797g c1797g) {
        int i10 = i5 + 1;
        byte b5 = bArr[i5];
        if (b5 < 0) {
            return q(b5, bArr, i10, c1797g);
        }
        c1797g.f27677a = b5;
        return i10;
    }

    public static int s(int i5, byte[] bArr, int i10, int i11, Internal.ProtobufList protobufList, C1797g c1797g) {
        G0 g02 = (G0) protobufList;
        int iR = r(bArr, i10, c1797g);
        g02.addInt(c1797g.f27677a);
        while (iR < i11) {
            int iR2 = r(bArr, iR, c1797g);
            if (i5 != c1797g.f27677a) {
                break;
            }
            iR = r(bArr, iR2, c1797g);
            g02.addInt(c1797g.f27677a);
        }
        return iR;
    }

    public static int t(byte[] bArr, int i5, C1797g c1797g) {
        int i10 = i5 + 1;
        long j8 = bArr[i5];
        if (j8 >= 0) {
            c1797g.f27678b = j8;
            return i10;
        }
        int i11 = i5 + 2;
        byte b5 = bArr[i10];
        long j10 = (j8 & 127) | ((b5 & 127) << 7);
        int i12 = 7;
        while (b5 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j10 |= (r10 & 127) << i12;
            b5 = bArr[i11];
            i11 = i13;
        }
        c1797g.f27678b = j10;
        return i11;
    }

    public static int u(Object obj, D1 d12, byte[] bArr, int i5, int i10, int i11, C1797g c1797g) {
        C1811k1 c1811k1 = (C1811k1) d12;
        int i12 = c1797g.f27681e + 1;
        c1797g.f27681e = i12;
        if (i12 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iH = c1811k1.H(obj, bArr, i5, i10, i11, c1797g);
        c1797g.f27681e--;
        c1797g.f27679c = obj;
        return iH;
    }

    public static int v(Object obj, D1 d12, byte[] bArr, int i5, int i10, C1797g c1797g) {
        int iQ = i5 + 1;
        int i11 = bArr[i5];
        if (i11 < 0) {
            iQ = q(i11, bArr, iQ, c1797g);
            i11 = c1797g.f27677a;
        }
        int i12 = iQ;
        if (i11 < 0 || i11 > i10 - i12) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i13 = c1797g.f27681e + 1;
        c1797g.f27681e = i13;
        if (i13 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int i14 = i12 + i11;
        d12.g(obj, bArr, i12, i14, c1797g);
        c1797g.f27681e--;
        c1797g.f27679c = obj;
        return i14;
    }

    public static int w(int i5, byte[] bArr, int i10, int i11, C1797g c1797g) {
        if (WireFormat.getTagFieldNumber(i5) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i5);
        if (tagWireType == 0) {
            return t(bArr, i10, c1797g);
        }
        if (tagWireType == 1) {
            return i10 + 8;
        }
        if (tagWireType == 2) {
            return r(bArr, i10, c1797g) + c1797g.f27677a;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i10 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i12 = (i5 & (-8)) | 4;
        int i13 = 0;
        while (i10 < i11) {
            i10 = r(bArr, i10, c1797g);
            i13 = c1797g.f27677a;
            if (i13 == i12) {
                break;
            }
            i10 = w(i13, bArr, i10, i11, c1797g);
        }
        if (i10 > i11 || i13 != i12) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i10;
    }
}
