package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1835t f27676a;

    static {
        if (d2.f27666e && d2.f27665d) {
            Class cls = AbstractC1785c.f27652a;
        }
        f27676a = new C1835t();
    }

    public static int a(int i5, int i10, byte[] bArr) {
        byte b5 = bArr[i5 - 1];
        int i11 = i10 - i5;
        if (i11 == 0) {
            if (b5 > -12) {
                return -1;
            }
            return b5;
        }
        if (i11 == 1) {
            return g(b5, bArr[i5]);
        }
        if (i11 == 2) {
            return h(b5, bArr[i5], bArr[i5 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(int i5, int i10, ByteBuffer byteBuffer, int i11) {
        if (i11 == 0) {
            if (i5 > -12) {
                return -1;
            }
            return i5;
        }
        if (i11 == 1) {
            return g(i5, byteBuffer.get(i10));
        }
        if (i11 == 2) {
            return h(i5, byteBuffer.get(i10), byteBuffer.get(i10 + 1));
        }
        throw new AssertionError();
    }

    public static String c(ByteBuffer byteBuffer, int i5, int i10) {
        C1835t c1835t = f27676a;
        c1835t.getClass();
        if (byteBuffer.hasArray()) {
            return c1835t.b(byteBuffer.arrayOffset() + i5, i10, byteBuffer.array());
        }
        return byteBuffer.isDirect() ? C1835t.c(byteBuffer, i5, i10) : C1835t.c(byteBuffer, i5, i10);
    }

    public static int d(int i5, int i10, String str, byte[] bArr) {
        int i11;
        int i12;
        char cCharAt;
        f27676a.getClass();
        int length = str.length();
        int i13 = i10 + i5;
        int i14 = 0;
        while (i14 < length && (i12 = i14 + i5) < i13 && (cCharAt = str.charAt(i14)) < 128) {
            bArr[i12] = (byte) cCharAt;
            i14++;
        }
        if (i14 == length) {
            return i5 + length;
        }
        int i15 = i5 + i14;
        while (i14 < length) {
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 < 128 && i15 < i13) {
                bArr[i15] = (byte) cCharAt2;
                i15++;
            } else if (cCharAt2 < 2048 && i15 <= i13 - 2) {
                int i16 = i15 + 1;
                bArr[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                i15 += 2;
                bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i15 > i13 - 3) {
                    if (i15 > i13 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i11 = i14 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i11)))) {
                            throw new e2(i14, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i15);
                    }
                    int i17 = i14 + 1;
                    if (i17 != str.length()) {
                        char cCharAt3 = str.charAt(i17);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i15 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i18 = i15 + 3;
                            bArr[i15 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i15 += 4;
                            bArr[i18] = (byte) ((codePoint & 63) | 128);
                            i14 = i17;
                        } else {
                            i14 = i17;
                        }
                    }
                    throw new e2(i14 - 1, length);
                }
                bArr[i15] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i19 = i15 + 2;
                bArr[i15 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i15 += 3;
                bArr[i19] = (byte) ((cCharAt2 & '?') | 128);
            }
            i14++;
        }
        return i15;
    }

    public static void e(String str, ByteBuffer byteBuffer) {
        f27676a.getClass();
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(d(byteBuffer.position() + iArrayOffset, byteBuffer.remaining(), str, byteBuffer.array()) - iArrayOffset);
        } else if (byteBuffer.isDirect()) {
            C1835t.d(str, byteBuffer);
        } else {
            C1835t.d(str, byteBuffer);
        }
    }

    public static int f(String str) {
        int length = str.length();
        int i5 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
                i10++;
            } else {
                int length2 = str.length();
                while (i10 < length2) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 2048) {
                        i5 += (127 - cCharAt2) >>> 31;
                    } else {
                        i5 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new e2(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i5;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static int g(int i5, int i10) {
        if (i5 > -12 || i10 > -65) {
            return -1;
        }
        return i5 ^ (i10 << 8);
    }

    public static int h(int i5, int i10, int i11) {
        if (i5 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i5 ^ (i10 << 8)) ^ (i11 << 16);
    }
}
