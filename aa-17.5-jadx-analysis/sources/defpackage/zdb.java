package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class zdb {
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final xwp c = xwp.h("-_.*").c(new xwh('0', '9')).c(new xwh('A', 'Z')).c(new xwh('a', 'z'));
    public static final Charset a = StandardCharsets.UTF_8;

    public static String a(String str, Charset charset) {
        char c2;
        char c3;
        char c4;
        int i;
        int codePoint;
        char[] cArr;
        if (charset.equals(a)) {
            ysi ysiVar = zcx.a;
            str.getClass();
            int i2 = 0;
            while (i2 < str.length()) {
                char cCharAt = str.charAt(i2);
                zcy zcyVar = (zcy) ysiVar;
                boolean[] zArr = zcyVar.d;
                if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                    int length = str.length();
                    char[] cArrB = (char[]) ynr.a.get();
                    cArrB.getClass();
                    int i3 = 0;
                    int i4 = 0;
                    while (i2 < length) {
                        if (i2 >= length) {
                            throw new IndexOutOfBoundsException("Index exceeds specified range");
                        }
                        int i5 = i2 + 1;
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                            c3 = 1;
                            c4 = '%';
                            i = 0;
                            codePoint = cCharAt2;
                        } else {
                            c3 = 1;
                            c4 = '%';
                            i = 0;
                            if (cCharAt2 > 56319) {
                                throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i2 + " in '" + str + "'");
                            }
                            if (i5 == length) {
                                codePoint = -cCharAt2;
                            } else {
                                char cCharAt3 = str.charAt(i5);
                                if (!Character.isLowSurrogate(cCharAt3)) {
                                    throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt3 + "' with value " + ((int) cCharAt3) + " at index " + i5 + " in '" + str + "'");
                                }
                                codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            }
                        }
                        if (codePoint < 0) {
                            throw new IllegalArgumentException("Trailing high surrogate at end of input");
                        }
                        if (codePoint < zArr.length && zArr[codePoint]) {
                            cArr = null;
                        } else if (codePoint == 32 && zcyVar.c) {
                            cArr = zcy.a;
                        } else if (codePoint <= 127) {
                            cArr = new char[3];
                            cArr[i] = c4;
                            char[] cArr2 = zcy.b;
                            cArr[2] = cArr2[codePoint & 15];
                            cArr[c3] = cArr2[codePoint >>> 4];
                        } else if (codePoint <= 2047) {
                            cArr = new char[6];
                            cArr[i] = c4;
                            cArr[3] = c4;
                            char[] cArr3 = zcy.b;
                            cArr[5] = cArr3[codePoint & 15];
                            cArr[4] = cArr3[(3 & (codePoint >>> 4)) | 8];
                            cArr[2] = cArr3[(codePoint >>> 6) & 15];
                            cArr[c3] = cArr3[(codePoint >>> 10) | 12];
                        } else if (codePoint <= 65535) {
                            cArr = new char[9];
                            cArr[i] = c4;
                            cArr[c3] = 'E';
                            cArr[3] = c4;
                            cArr[6] = c4;
                            char[] cArr4 = zcy.b;
                            cArr[8] = cArr4[codePoint & 15];
                            cArr[7] = cArr4[((codePoint >>> 4) & 3) | 8];
                            cArr[5] = cArr4[(codePoint >>> 6) & 15];
                            cArr[4] = cArr4[((codePoint >>> 10) & 3) | 8];
                            cArr[2] = cArr4[codePoint >>> 12];
                        } else {
                            if (codePoint > 1114111) {
                                throw new IllegalArgumentException(a.bp(codePoint, "Invalid unicode character value "));
                            }
                            cArr = new char[12];
                            cArr[i] = c4;
                            cArr[c3] = 'F';
                            cArr[3] = c4;
                            cArr[6] = c4;
                            cArr[9] = c4;
                            char[] cArr5 = zcy.b;
                            cArr[11] = cArr5[codePoint & 15];
                            cArr[10] = cArr5[((codePoint >>> 4) & 3) | 8];
                            cArr[8] = cArr5[(codePoint >>> 6) & 15];
                            cArr[7] = cArr5[((codePoint >>> 10) & 3) | 8];
                            cArr[5] = cArr5[(codePoint >>> 12) & 15];
                            cArr[4] = cArr5[((codePoint >>> 16) & 3) | 8];
                            cArr[2] = cArr5[codePoint >>> 18];
                        }
                        int iCharCount = Character.charCount(codePoint) + i2;
                        if (cArr != null) {
                            int i6 = i2 - i3;
                            int i7 = i4 + i6;
                            int length2 = cArrB.length;
                            int length3 = cArr.length;
                            int i8 = i7 + length3;
                            if (length2 < i8) {
                                cArrB = ysi.b(cArrB, i4, i8 + (length - i2) + 32);
                            }
                            if (i6 > 0) {
                                str.getChars(i3, i2, cArrB, i4);
                                i4 = i7;
                            }
                            System.arraycopy(cArr, i, cArrB, i4, length3);
                            i4 += length3;
                            i3 = iCharCount;
                        }
                        i2 = iCharCount;
                        while (i2 < length) {
                            char cCharAt4 = str.charAt(i2);
                            if (cCharAt4 >= zArr.length || !zArr[cCharAt4]) {
                                break;
                            }
                            i2++;
                        }
                    }
                    int i9 = length - i3;
                    if (i9 > 0) {
                        int i10 = i9 + i4;
                        if (cArrB.length < i10) {
                            cArrB = ysi.b(cArrB, i4, i10);
                        }
                        str.getChars(i3, length, cArrB, i4);
                        i4 = i10;
                    }
                    return new String(cArrB, 0, i4);
                }
                i2++;
            }
        } else {
            boolean z = false;
            char c5 = '%';
            int length4 = str.length();
            StringBuilder sb = new StringBuilder(length4 + length4);
            byte[] bytes = str.getBytes(charset);
            int length5 = bytes.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length5) {
                byte b2 = bytes[i11];
                int i13 = b2 & 255;
                char c6 = (char) i13;
                if (c.b(c6)) {
                    sb.append(c6);
                    i12++;
                } else if (i13 == 32) {
                    sb.append('+');
                    i12++;
                    z = true;
                } else {
                    c2 = c5;
                    sb.append(c2);
                    char[] cArr6 = b;
                    sb.append(cArr6[i13 >> 4]);
                    sb.append(cArr6[b2 & 15]);
                    i12 += 3;
                    i11++;
                    c5 = c2;
                }
                c2 = c5;
                i11++;
                c5 = c2;
            }
            if (z || i12 != str.length()) {
                return sb.toString();
            }
        }
        return str;
    }
}
