package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzamu extends zzamv {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final int zza(String str, byte[] bArr, int i5, int i10) {
        int i11;
        int i12;
        char cCharAt;
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
                            throw new zzamx(i14, length);
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
                    throw new zzamx(i14 - 1, length);
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final int zza(int i5, byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b5 = bArr[i10];
            if (b5 < 0) {
                if (b5 < -32) {
                    if (i12 >= i11) {
                        return b5;
                    }
                    if (b5 >= -62) {
                        i10 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b5 < -16) {
                    if (i12 >= i11 - 1) {
                        return zzamt.zza(bArr, i12, i11);
                    }
                    int i13 = i10 + 2;
                    byte b10 = bArr[i12];
                    if (b10 <= -65 && ((b5 != -32 || b10 >= -96) && (b5 != -19 || b10 < -96))) {
                        i10 += 3;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (i12 >= i11 - 2) {
                    return zzamt.zza(bArr, i12, i11);
                }
                int i14 = i10 + 2;
                byte b11 = bArr[i12];
                if (b11 <= -65) {
                    if ((((b11 + 112) + (b5 << 28)) >> 30) == 0) {
                        int i15 = i10 + 3;
                        if (bArr[i14] <= -65) {
                            i10 += 4;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i10 = i12;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final String zza(byte[] bArr, int i5, int i10) throws zzakf {
        if ((i5 | i10 | ((bArr.length - i5) - i10)) >= 0) {
            int i11 = i5 + i10;
            char[] cArr = new char[i10];
            int i12 = 0;
            while (i5 < i11) {
                byte b5 = bArr[i5];
                if (b5 < 0) {
                    break;
                }
                i5++;
                zzams.zza(b5, cArr, i12);
                i12++;
            }
            int i13 = i12;
            while (i5 < i11) {
                int i14 = i5 + 1;
                byte b10 = bArr[i5];
                if (b10 >= 0) {
                    int i15 = i13 + 1;
                    zzams.zza(b10, cArr, i13);
                    while (i14 < i11) {
                        byte b11 = bArr[i14];
                        if (b11 < 0) {
                            break;
                        }
                        i14++;
                        zzams.zza(b11, cArr, i15);
                        i15++;
                    }
                    i13 = i15;
                    i5 = i14;
                } else if (b10 < -32) {
                    if (i14 < i11) {
                        i5 += 2;
                        zzams.zza(b10, bArr[i14], cArr, i13);
                        i13++;
                    } else {
                        throw zzakf.zzd();
                    }
                } else if (b10 < -16) {
                    if (i14 < i11 - 1) {
                        int i16 = i5 + 2;
                        i5 += 3;
                        zzams.zza(b10, bArr[i14], bArr[i16], cArr, i13);
                        i13++;
                    } else {
                        throw zzakf.zzd();
                    }
                } else if (i14 < i11 - 2) {
                    byte b12 = bArr[i14];
                    int i17 = i5 + 3;
                    byte b13 = bArr[i5 + 2];
                    i5 += 4;
                    zzams.zza(b10, b12, b13, bArr[i17], cArr, i13);
                    i13 += 2;
                } else {
                    throw zzakf.zzd();
                }
            }
            return new String(cArr, 0, i13);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i10)));
    }
}
