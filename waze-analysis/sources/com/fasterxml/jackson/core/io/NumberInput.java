package com.fasterxml.jackson.core.io;

import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.media3.common.C;
import androidx.media3.common.PlaybackException;
import b.a.a.o;
import b.a.a.r;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NumberInput {
    static final String MAX_LONG_STR = "9223372036854775807";
    static final String MIN_LONG_STR_NO_SIGN = "9223372036854775808";
    private static final Pattern PATTERN_FLOAT = Pattern.compile("[+-]?[0-9]*[\\.]?[0-9]+([eE][+-]?[0-9]+)?");
    private static final Pattern PATTERN_FLOAT_TRAILING_DOT = Pattern.compile("[+-]?[0-9]+[\\.]");

    public static boolean inLongRange(char[] cArr, int i2, int i3, boolean z) {
        String str = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str.length();
        if (length > 19) {
            return true;
        }
        if (length < 19) {
            return false;
        }
        for (int i4 = 0; i4 < 19; i4++) {
            int iCharAt = cArr[i2 + i4] - str.charAt(i4);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static boolean looksLikeValidNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (str.length() != 1) {
            return PATTERN_FLOAT.matcher(str).matches() || PATTERN_FLOAT_TRAILING_DOT.matcher(str).matches();
        }
        char cCharAt = str.charAt(0);
        return cCharAt <= '9' && cCharAt >= '0';
    }

    public static double parseAsDouble(String str, double d2, boolean z) {
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                try {
                    return parseDouble(strTrim, false);
                } catch (NumberFormatException unused) {
                    return d2;
                }
            }
        }
        return d2;
    }

    public static int parseAsInt(String str, int i2) {
        String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return i2;
        }
        int i3 = 0;
        char cCharAt = strTrim.charAt(0);
        if (cCharAt == '+') {
            strTrim = strTrim.substring(1);
            length = strTrim.length();
        } else if (cCharAt == '-') {
            i3 = 1;
        }
        while (i3 < length) {
            char cCharAt2 = strTrim.charAt(i3);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                try {
                    return (int) parseDouble(strTrim, true);
                } catch (NumberFormatException unused) {
                    return i2;
                }
            }
            i3++;
        }
        try {
            return Integer.parseInt(strTrim);
        } catch (NumberFormatException unused2) {
            return i2;
        }
    }

    public static long parseAsLong(String str, long j2) {
        String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return j2;
        }
        int i2 = 0;
        char cCharAt = strTrim.charAt(0);
        if (cCharAt == '+') {
            strTrim = strTrim.substring(1);
            length = strTrim.length();
        } else if (cCharAt == '-') {
            i2 = 1;
        }
        while (i2 < length) {
            char cCharAt2 = strTrim.charAt(i2);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                try {
                    return (long) parseDouble(strTrim, true);
                } catch (NumberFormatException unused) {
                    return j2;
                }
            }
            i2++;
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused2) {
            return j2;
        }
    }

    public static BigDecimal parseBigDecimal(char[] cArr, boolean z) {
        return z ? BigDecimalParser.parseWithFastParser(cArr, 0, cArr.length) : BigDecimalParser.parse(cArr);
    }

    public static BigInteger parseBigInteger(String str, boolean z) {
        return z ? BigIntegerParser.parseWithFastParser(str) : new BigInteger(str);
    }

    public static double parseDouble(char[] cArr, int i2, int i3, boolean z) {
        return z ? o.b(cArr, i2, i3) : Double.parseDouble(new String(cArr, i2, i3));
    }

    public static float parseFloat(char[] cArr, int i2, int i3, boolean z) {
        return z ? r.b(cArr, i2, i3) : Float.parseFloat(new String(cArr, i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
    
        return java.lang.Integer.parseInt(r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int parseInt(java.lang.String r10) {
        /*
            r0 = 0
            char r1 = r10.charAt(r0)
            int r2 = r10.length()
            r3 = 45
            r4 = 1
            if (r1 != r3) goto Lf
            r0 = r4
        Lf:
            r3 = 2
            r5 = 10
            if (r0 == 0) goto L24
            if (r2 == r4) goto L1f
            if (r2 <= r5) goto L19
            goto L1f
        L19:
            char r1 = r10.charAt(r4)
            r4 = r3
            goto L28
        L1f:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L24:
            r6 = 9
            if (r2 > r6) goto L85
        L28:
            r6 = 57
            if (r1 > r6) goto L80
            r7 = 48
            if (r1 >= r7) goto L31
            goto L80
        L31:
            int r1 = r1 + (-48)
            if (r4 >= r2) goto L7b
            int r8 = r4 + 1
            char r9 = r10.charAt(r4)
            if (r9 > r6) goto L76
            if (r9 >= r7) goto L40
            goto L76
        L40:
            int r1 = r1 * 10
            int r9 = r9 + (-48)
            int r1 = r1 + r9
            if (r8 >= r2) goto L7b
            int r4 = r4 + r3
            char r3 = r10.charAt(r8)
            if (r3 > r6) goto L71
            if (r3 >= r7) goto L51
            goto L71
        L51:
            int r1 = r1 * 10
            int r3 = r3 + (-48)
            int r1 = r1 + r3
            if (r4 >= r2) goto L7b
        L58:
            int r3 = r4 + 1
            char r4 = r10.charAt(r4)
            if (r4 > r6) goto L6c
            if (r4 >= r7) goto L63
            goto L6c
        L63:
            int r1 = r1 * r5
            int r4 = r4 + (-48)
            int r1 = r1 + r4
            if (r3 < r2) goto L6a
            goto L7b
        L6a:
            r4 = r3
            goto L58
        L6c:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L71:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L76:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L7b:
            if (r0 == 0) goto L7f
            int r10 = -r1
            return r10
        L7f:
            return r1
        L80:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        L85:
            int r10 = java.lang.Integer.parseInt(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberInput.parseInt(java.lang.String):int");
    }

    public static long parseLong(char[] cArr, int i2, int i3) {
        return (parseInt(cArr, i2, i3 - 9) * C.NANOS_PER_SECOND) + parseInt(cArr, i2 + r6, 9);
    }

    public static long parseLong19(char[] cArr, int i2, boolean z) {
        long j2 = 0;
        for (int i3 = 0; i3 < 19; i3++) {
            j2 = (j2 * 10) + (cArr[i2 + i3] - '0');
        }
        return z ? -j2 : j2;
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i2, int i3, boolean z) {
        if (z) {
            return BigDecimalParser.parseWithFastParser(cArr, i2, i3);
        }
        return BigDecimalParser.parse(cArr, i2, i3);
    }

    public static BigDecimal parseBigDecimal(String str, boolean z) {
        if (z) {
            return BigDecimalParser.parseWithFastParser(str);
        }
        return BigDecimalParser.parse(str);
    }

    public static double parseDouble(String str, boolean z) {
        return z ? o.a(str) : Double.parseDouble(str);
    }

    public static float parseFloat(String str, boolean z) {
        if (z) {
            return r.a(str);
        }
        return Float.parseFloat(str);
    }

    public static double parseDouble(char[] cArr, boolean z) {
        return parseDouble(cArr, 0, cArr.length, z);
    }

    public static float parseFloat(char[] cArr, boolean z) {
        return parseFloat(cArr, 0, cArr.length, z);
    }

    public static double parseAsDouble(String str, double d2) {
        return parseAsDouble(str, d2, false);
    }

    public static long parseLong(String str) {
        if (str.length() <= 9) {
            return parseInt(str);
        }
        return Long.parseLong(str);
    }

    public static boolean inLongRange(String str, boolean z) {
        String str2 = MAX_LONG_STR;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            int iCharAt = str.charAt(i2) - str2.charAt(i2);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static int parseInt(char[] cArr, int i2, int i3) {
        if (i3 > 0 && cArr[i2] == '+') {
            i2++;
            i3--;
        }
        int i4 = cArr[(i2 + i3) - 1] - '0';
        switch (i3) {
            case 9:
                i4 += (cArr[i2] - '0') * 100000000;
                i2++;
            case 8:
                i4 += (cArr[i2] - '0') * DefaultEncoderProfilesProvider.DEFAULT_VIDEO_BITRATE_FHD;
                i2++;
            case 7:
                i4 += (cArr[i2] - '0') * PlaybackException.CUSTOM_ERROR_CODE_BASE;
                i2++;
            case 6:
                i4 += (cArr[i2] - '0') * 100000;
                i2++;
            case 5:
                i4 += (cArr[i2] - '0') * 10000;
                i2++;
            case 4:
                i4 += (cArr[i2] - '0') * 1000;
                i2++;
            case 3:
                i4 += (cArr[i2] - '0') * 100;
                i2++;
            case 2:
                return i4 + ((cArr[i2] - '0') * 10);
            default:
                return i4;
        }
    }
}
