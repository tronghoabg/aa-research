package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class t0 extends Q {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18272c;

    public static int m(long j8, byte[] bArr, int i5, int i10) {
        if (i10 == 0) {
            Q q4 = v0.f18273a;
            if (i5 > -12) {
                return -1;
            }
            return i5;
        }
        if (i10 == 1) {
            return v0.c(i5, s0.f(j8, bArr));
        }
        if (i10 == 2) {
            return v0.d(i5, s0.f(j8, bArr), s0.f(j8 + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    @Override // androidx.datastore.preferences.protobuf.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(int r19, int r20, byte[] r21) throws androidx.datastore.preferences.protobuf.A {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t0.e(int, int, byte[]):java.lang.String");
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    public final int f(int i5, int i10, String str, byte[] bArr) {
        int i11;
        int i12;
        char cCharAt;
        long j8;
        char c10;
        long j10;
        String str2;
        int i13;
        char c11;
        int i14;
        char cCharAt2;
        String str3 = str;
        switch (this.f18272c) {
            case 0:
                int length = str3.length();
                int i15 = i10 + i5;
                int i16 = 0;
                while (i16 < length && (i12 = i16 + i5) < i15 && (cCharAt = str3.charAt(i16)) < 128) {
                    bArr[i12] = (byte) cCharAt;
                    i16++;
                }
                if (i16 == length) {
                    return i5 + length;
                }
                int i17 = i5 + i16;
                while (i16 < length) {
                    char cCharAt3 = str3.charAt(i16);
                    if (cCharAt3 < 128 && i17 < i15) {
                        bArr[i17] = (byte) cCharAt3;
                        i17++;
                    } else if (cCharAt3 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt3 >>> 6) | 960);
                        i17 += 2;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i11 = i16 + 1) == str3.length() || !Character.isSurrogatePair(cCharAt3, str3.charAt(i11)))) {
                                    throw new u0(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != str3.length()) {
                                char cCharAt4 = str3.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i20 = i17 + 3;
                                    bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i17 += 4;
                                    bArr[i20] = (byte) ((codePoint & 63) | 128);
                                    i16 = i19;
                                } else {
                                    i16 = i19;
                                }
                            }
                            throw new u0(i16 - 1, length);
                        }
                        bArr[i17] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i21 = i17 + 2;
                        bArr[i17 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i17 += 3;
                        bArr[i21] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i16++;
                }
                return i17;
            default:
                long j11 = i5;
                long j12 = i10 + j11;
                int length2 = str3.length();
                if (length2 > i10 || bArr.length - i10 < i5) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str3.charAt(length2 - 1) + " at index " + (i5 + i10));
                }
                int i22 = 0;
                while (true) {
                    j8 = 1;
                    c10 = 128;
                    if (i22 < length2 && (cCharAt2 = str3.charAt(i22)) < 128) {
                        s0.j(bArr, j11, (byte) cCharAt2);
                        i22++;
                        j11 = 1 + j11;
                    }
                }
                if (i22 != length2) {
                    while (i22 < length2) {
                        char cCharAt5 = str3.charAt(i22);
                        if (cCharAt5 < c10 && j11 < j12) {
                            s0.j(bArr, j11, (byte) cCharAt5);
                            i13 = i22;
                            c11 = c10;
                            j10 = j8;
                            j11 += j8;
                        } else if (cCharAt5 >= 2048 || j11 > j12 - 2) {
                            j10 = j8;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j11 > j12 - 3) {
                                if (j11 > j12 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i14)))) {
                                        throw new u0(i22, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j11);
                                }
                                i13 = i22 + 1;
                                if (i13 != length2) {
                                    str2 = str;
                                    char cCharAt6 = str2.charAt(i13);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        s0.j(bArr, j11, (byte) ((codePoint2 >>> 18) | 240));
                                        int i23 = (codePoint2 >>> 12) & 63;
                                        c11 = 128;
                                        s0.j(bArr, j11 + j10, (byte) (i23 | 128));
                                        long j13 = j11 + 3;
                                        s0.j(bArr, j11 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j11 += 4;
                                        s0.j(bArr, j13, (byte) ((codePoint2 & 63) | 128));
                                    } else {
                                        i22 = i13;
                                    }
                                }
                                throw new u0(i22 - 1, length2);
                            }
                            s0.j(bArr, j11, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j14 = j11 + 2;
                            s0.j(bArr, j11 + j10, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j11 += 3;
                            s0.j(bArr, j14, (byte) ((cCharAt5 & '?') | 128));
                            str2 = str;
                            i13 = i22;
                            c11 = 128;
                            c10 = c11;
                            i22 = i13 + 1;
                            str3 = str2;
                            j8 = j10;
                        } else {
                            j10 = j8;
                            long j15 = j11 + j10;
                            s0.j(bArr, j11, (byte) ((cCharAt5 >>> 6) | 960));
                            j11 += 2;
                            s0.j(bArr, j15, (byte) ((cCharAt5 & '?') | c10));
                            i13 = i22;
                            c11 = c10;
                        }
                        str2 = str3;
                        c10 = c11;
                        i22 = i13 + 1;
                        str3 = str2;
                        j8 = j10;
                    }
                }
                return (int) j11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    public final int i(byte[] bArr, int i5, int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = i5;
        int i15 = 2;
        switch (this.f18272c) {
            case 0:
                while (i14 < i10 && bArr[i14] >= 0) {
                    i14++;
                }
                if (i14 < i10) {
                    while (i14 < i10) {
                        int i16 = i14 + 1;
                        byte b5 = bArr[i14];
                        if (b5 < 0) {
                            if (b5 < -32) {
                                if (i16 >= i10) {
                                    return b5;
                                }
                                if (b5 >= -62) {
                                    i14 += 2;
                                    if (bArr[i16] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b5 < -16) {
                                if (i16 >= i10 - 1) {
                                    return v0.a(i16, i10, bArr);
                                }
                                int i17 = i14 + 2;
                                byte b10 = bArr[i16];
                                if (b10 <= -65 && ((b5 != -32 || b10 >= -96) && (b5 != -19 || b10 < -96))) {
                                    i14 += 3;
                                    if (bArr[i17] > -65) {
                                    }
                                }
                            } else {
                                if (i16 >= i10 - 2) {
                                    return v0.a(i16, i10, bArr);
                                }
                                int i18 = i14 + 2;
                                byte b11 = bArr[i16];
                                if (b11 <= -65 && (((b11 + 112) + (b5 << 28)) >> 30) == 0) {
                                    int i19 = i14 + 3;
                                    if (bArr[i18] <= -65) {
                                        i14 += 4;
                                        if (bArr[i19] > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i14 = i16;
                    }
                }
                return 0;
            default:
                if (((bArr.length - i10) | i14 | i10) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i14), Integer.valueOf(i10)));
                }
                long j8 = i14;
                int i20 = (int) (i10 - j8);
                if (i20 < 16) {
                    i11 = -1;
                    i12 = 0;
                } else {
                    i11 = -1;
                    long j10 = j8;
                    i12 = 0;
                    while (true) {
                        if (i12 < i20) {
                            long j11 = j10 + 1;
                            if (s0.f(j10, bArr) >= 0) {
                                i12++;
                                j10 = j11;
                            }
                        } else {
                            i12 = i20;
                        }
                    }
                }
                int i21 = i20 - i12;
                long j12 = j8 + i12;
                while (true) {
                    byte bF = 0;
                    while (true) {
                        if (i21 > 0) {
                            long j13 = j12 + 1;
                            bF = s0.f(j12, bArr);
                            if (bF >= 0) {
                                i21--;
                                j12 = j13;
                            } else {
                                j12 = j13;
                            }
                        }
                    }
                    if (i21 == 0) {
                        return 0;
                    }
                    int i22 = i21 - 1;
                    if (bF < -32) {
                        if (i22 == 0) {
                            return bF;
                        }
                        i21 -= 2;
                        if (bF >= -62) {
                            long j14 = j12 + 1;
                            if (s0.f(j12, bArr) <= -65) {
                                j12 = j14;
                                i13 = i15;
                            }
                        }
                    } else if (bF < -16) {
                        if (i22 < i15) {
                            return m(j12, bArr, bF, i22);
                        }
                        i21 -= 3;
                        long j15 = j12 + 1;
                        byte bF2 = s0.f(j12, bArr);
                        if (bF2 <= -65 && ((bF != -32 || bF2 >= -96) && (bF != -19 || bF2 < -96))) {
                            j12 += 2;
                            if (s0.f(j15, bArr) > -65) {
                            }
                            i13 = i15;
                        }
                    } else {
                        if (i22 < 3) {
                            return m(j12, bArr, bF, i22);
                        }
                        i21 -= 4;
                        long j16 = j12 + 1;
                        byte bF3 = s0.f(j12, bArr);
                        if (bF3 <= -65 && (((bF3 + 112) + (bF << 28)) >> 30) == 0) {
                            i13 = i15;
                            long j17 = j12 + 2;
                            if (s0.f(j16, bArr) <= -65) {
                                j12 += 3;
                                if (s0.f(j17, bArr) > -65) {
                                }
                            }
                        }
                    }
                    i15 = i13;
                }
                return i11;
        }
    }
}
