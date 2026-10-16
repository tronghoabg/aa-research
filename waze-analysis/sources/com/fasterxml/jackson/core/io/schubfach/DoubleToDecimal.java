package com.fasterxml.jackson.core.io.schubfach;

import androidx.camera.core.processing.util.GLUtils;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class DoubleToDecimal {
    public final int MAX_CHARS = 24;
    private final byte[] bytes = new byte[24];
    private int index;

    private DoubleToDecimal() {
    }

    private void append(int i2) {
        int i3 = this.index + 1;
        this.index = i3;
        this.bytes[i3] = (byte) i2;
    }

    private void append8Digits(int i2) {
        int iY = y(i2);
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = iY * 10;
            appendDigit(i4 >>> 28);
            iY = i4 & 268435455;
        }
    }

    private void appendDigit(int i2) {
        int i3 = this.index + 1;
        this.index = i3;
        this.bytes[i3] = (byte) (i2 + 48);
    }

    private String charsToString() {
        return new String(this.bytes, 0, 0, this.index + 1);
    }

    private void exponent(int i2) {
        append(69);
        if (i2 < 0) {
            append(45);
            i2 = -i2;
        }
        if (i2 < 10) {
            appendDigit(i2);
            return;
        }
        if (i2 >= 100) {
            int i3 = (i2 * DisplayStrings.DS_LOCATION_PREVIEW_GAS_PRICES_TITLE) >>> 17;
            appendDigit(i3);
            i2 -= i3 * 100;
        }
        int i4 = (i2 * 103) >>> 10;
        appendDigit(i4);
        appendDigit(i2 - (i4 * 10));
    }

    private void lowDigits(int i2) {
        if (i2 != 0) {
            append8Digits(i2);
        }
        removeTrailingZeroes();
    }

    private void removeTrailingZeroes() {
        int i2;
        byte b2;
        while (true) {
            byte[] bArr = this.bytes;
            i2 = this.index;
            b2 = bArr[i2];
            if (b2 != 48) {
                break;
            } else {
                this.index = i2 - 1;
            }
        }
        if (b2 == 46) {
            this.index = i2 + 1;
        }
    }

    private static long rop(long j2, long j3, long j4) {
        long jMultiplyHigh = ((j2 * j4) >>> 1) + MathUtils.multiplyHigh(j3, j4);
        return (MathUtils.multiplyHigh(j2, j4) + (jMultiplyHigh >>> 63)) | (((jMultiplyHigh & Long.MAX_VALUE) + Long.MAX_VALUE) >>> 63);
    }

    private int toChars(long j2, int i2) {
        int iFlog10pow2 = MathUtils.flog10pow2(64 - Long.numberOfLeadingZeros(j2));
        if (j2 >= MathUtils.pow10(iFlog10pow2)) {
            iFlog10pow2++;
        }
        long jPow10 = j2 * MathUtils.pow10(17 - iFlog10pow2);
        int i3 = i2 + iFlog10pow2;
        long jMultiplyHigh = MathUtils.multiplyHigh(jPow10, 193428131138340668L) >>> 20;
        int i4 = (int) ((1441151881 * jMultiplyHigh) >>> 57);
        int i5 = (int) (jMultiplyHigh - (100000000 * i4));
        int i6 = (int) (jPow10 - (jMultiplyHigh * 100000000));
        if (i3 > 0 && i3 <= 7) {
            toChars1(i4, i5, i6, i3);
            return 0;
        }
        if (i3 <= -3 || i3 > 0) {
            toChars3(i4, i5, i6, i3);
            return 0;
        }
        toChars2(i4, i5, i6, i3);
        return 0;
    }

    private int toChars1(int i2, int i3, int i4, int i5) {
        appendDigit(i2);
        int iY = y(i3);
        int i6 = 1;
        while (i6 < i5) {
            int i7 = iY * 10;
            appendDigit(i7 >>> 28);
            iY = i7 & 268435455;
            i6++;
        }
        append(46);
        while (i6 <= 8) {
            int i8 = iY * 10;
            appendDigit(i8 >>> 28);
            iY = i8 & 268435455;
            i6++;
        }
        lowDigits(i4);
        return 0;
    }

    private int toChars2(int i2, int i3, int i4, int i5) {
        appendDigit(0);
        append(46);
        while (i5 < 0) {
            appendDigit(0);
            i5++;
        }
        appendDigit(i2);
        append8Digits(i3);
        lowDigits(i4);
        return 0;
    }

    private int toChars3(int i2, int i3, int i4, int i5) {
        appendDigit(i2);
        append(46);
        append8Digits(i3);
        lowDigits(i4);
        exponent(i5 - 1);
        return 0;
    }

    private int toDecimal(int i2, long j2, int i3) {
        long j3;
        int iFlog10threeQuartersPow2;
        int i4;
        char c2;
        long j4;
        long j5 = j2 << 2;
        if ((j2 != 4503599627370496L) || (i2 == -1074)) {
            j3 = (-2) + j5;
            iFlog10threeQuartersPow2 = MathUtils.flog10pow2(i2);
        } else {
            j3 = (-1) + j5;
            iFlog10threeQuartersPow2 = MathUtils.flog10threeQuartersPow2(i2);
        }
        long j6 = 2 + j5;
        int iFlog2pow10 = i2 + MathUtils.flog2pow10(-iFlog10threeQuartersPow2) + 2;
        long jG1 = MathUtils.g1(iFlog10threeQuartersPow2);
        long jG0 = MathUtils.g0(iFlog10threeQuartersPow2);
        long jRop = rop(jG1, jG0, j5 << iFlog2pow10);
        long jRop2 = rop(jG1, jG0, j3 << iFlog2pow10);
        long jRop3 = rop(jG1, jG0, j6 << iFlog2pow10);
        boolean z = false;
        long j7 = jRop >> 2;
        long j8 = ((int) j2) & 1;
        long j9 = jRop2 + j8;
        if (j7 >= 100) {
            c2 = 2;
            j4 = jRop;
            long jMultiplyHigh = MathUtils.multiplyHigh(j7, 1844674407370955168L) * 10;
            long j10 = jMultiplyHigh << 2;
            long j11 = 10 + jMultiplyHigh;
            boolean z2 = (j11 << 2) + j8 <= jRop3;
            if (j9 > j10) {
                i4 = 0;
            } else {
                i4 = 0;
                z = true;
            }
            if (z != z2) {
                if (j9 > j10) {
                    jMultiplyHigh = j11;
                }
                toChars(jMultiplyHigh, iFlog10threeQuartersPow2);
                return i4;
            }
        } else {
            i4 = 0;
            c2 = 2;
            j4 = jRop;
        }
        int i5 = iFlog10threeQuartersPow2 + i3;
        long j12 = j7 + 1;
        long j13 = j7 << c2;
        if ((j9 > j13 ? i4 : 1) != ((j12 << c2) + j8 > jRop3 ? i4 : 1)) {
            if (j9 > j13) {
                j7 = j12;
            }
            toChars(j7, i5);
            return i4;
        }
        long j14 = j7 + j12;
        long j15 = j4 - (j14 + j14);
        if (j15 >= 0 && (j15 != 0 || (j7 & 1) != 0)) {
            j7 = j12;
        }
        toChars(j7, i5);
        return i4;
    }

    private String toDecimalString(double d2) {
        int decimal = toDecimal(d2);
        return decimal != 0 ? decimal != 1 ? decimal != 2 ? decimal != 3 ? decimal != 4 ? "NaN" : "-Infinity" : "Infinity" : "-0.0" : GLUtils.VERSION_UNKNOWN : charsToString();
    }

    public static String toString(double d2) {
        return new DoubleToDecimal().toDecimalString(d2);
    }

    private int y(int i2) {
        return ((int) (MathUtils.multiplyHigh((i2 + 1) << 28, 193428131138340668L) >>> 20)) - 1;
    }

    private int toDecimal(double d2) {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2);
        long j2 = 4503599627370495L & jDoubleToRawLongBits;
        int i2 = ((int) (jDoubleToRawLongBits >>> 52)) & 2047;
        if (i2 >= 2047) {
            if (j2 != 0) {
                return 5;
            }
            return jDoubleToRawLongBits > 0 ? 3 : 4;
        }
        this.index = -1;
        if (jDoubleToRawLongBits < 0) {
            append(45);
        }
        if (i2 == 0) {
            if (j2 == 0) {
                return jDoubleToRawLongBits == 0 ? 1 : 2;
            }
            if (j2 < 3) {
                toDecimal(-1074, j2 * 10, -1);
            } else {
                toDecimal(-1074, j2, 0);
            }
            return 0;
        }
        int i3 = 1075 - i2;
        long j3 = j2 | 4503599627370496L;
        if ((i3 < 53) & (i3 > 0)) {
            long j4 = j3 >> i3;
            if ((j4 << i3) == j3) {
                toChars(j4, 0);
                return 0;
            }
        }
        toDecimal(-i3, j3, 0);
        return 0;
    }
}
