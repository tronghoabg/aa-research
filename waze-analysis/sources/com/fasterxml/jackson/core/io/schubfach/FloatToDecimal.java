package com.fasterxml.jackson.core.io.schubfach;

import androidx.camera.core.processing.util.GLUtils;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class FloatToDecimal {
    public final int MAX_CHARS = 15;
    private final byte[] bytes = new byte[15];
    private int index;

    private FloatToDecimal() {
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
        int i3 = (i2 * 103) >>> 10;
        appendDigit(i3);
        appendDigit(i2 - (i3 * 10));
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

    private static int rop(long j2, long j3) {
        long jMultiplyHigh = MathUtils.multiplyHigh(j2, j3);
        return (int) ((((jMultiplyHigh & MuxerUtil.UNSIGNED_INT_MAX_VALUE) + MuxerUtil.UNSIGNED_INT_MAX_VALUE) >>> 32) | (jMultiplyHigh >>> 31));
    }

    private int toChars(int i2, int i3) {
        int iFlog10pow2 = MathUtils.flog10pow2(32 - Integer.numberOfLeadingZeros(i2));
        long j2 = i2;
        if (j2 >= MathUtils.pow10(iFlog10pow2)) {
            iFlog10pow2++;
        }
        int i4 = i3 + iFlog10pow2;
        int iPow10 = (int) (j2 * MathUtils.pow10(9 - iFlog10pow2));
        int i5 = (int) ((iPow10 * 1441151881) >>> 57);
        int i6 = iPow10 - (100000000 * i5);
        if (i4 > 0 && i4 <= 7) {
            toChars1(i5, i6, i4);
            return 0;
        }
        if (i4 <= -3 || i4 > 0) {
            toChars3(i5, i6, i4);
            return 0;
        }
        toChars2(i5, i6, i4);
        return 0;
    }

    private int toChars1(int i2, int i3, int i4) {
        appendDigit(i2);
        int iY = y(i3);
        int i5 = 1;
        while (i5 < i4) {
            int i6 = iY * 10;
            appendDigit(i6 >>> 28);
            iY = i6 & 268435455;
            i5++;
        }
        append(46);
        while (i5 <= 8) {
            int i7 = iY * 10;
            appendDigit(i7 >>> 28);
            iY = i7 & 268435455;
            i5++;
        }
        removeTrailingZeroes();
        return 0;
    }

    private int toChars2(int i2, int i3, int i4) {
        appendDigit(0);
        append(46);
        while (i4 < 0) {
            appendDigit(0);
            i4++;
        }
        appendDigit(i2);
        append8Digits(i3);
        removeTrailingZeroes();
        return 0;
    }

    private int toChars3(int i2, int i3, int i4) {
        appendDigit(i2);
        append(46);
        append8Digits(i3);
        removeTrailingZeroes();
        exponent(i4 - 1);
        return 0;
    }

    private int toDecimal(int i2, int i3, int i4) {
        long j2;
        int iFlog10threeQuartersPow2;
        long j3 = i3 << 2;
        if ((i3 != 8388608) || (i2 == -149)) {
            j2 = (-2) + j3;
            iFlog10threeQuartersPow2 = MathUtils.flog10pow2(i2);
        } else {
            j2 = (-1) + j3;
            iFlog10threeQuartersPow2 = MathUtils.flog10threeQuartersPow2(i2);
        }
        long j4 = 2 + j3;
        int i5 = i3 & 1;
        int iFlog2pow10 = i2 + MathUtils.flog2pow10(-iFlog10threeQuartersPow2);
        long jG1 = MathUtils.g1(iFlog10threeQuartersPow2) + 1;
        int i6 = iFlog2pow10 + 33;
        int iRop = rop(jG1, j3 << i6);
        int i7 = iRop >> 2;
        int iRop2 = rop(jG1, j2 << i6) + i5;
        int iRop3 = rop(jG1, j4 << i6);
        if (i7 >= 100) {
            int i8 = ((int) ((i7 * 1717986919) >>> 34)) * 10;
            int i9 = i8 << 2;
            int i10 = i8 + 10;
            if ((iRop2 <= i9) != ((i10 << 2) + i5 <= iRop3)) {
                if (iRop2 > i9) {
                    i8 = i10;
                }
                toChars(i8, iFlog10threeQuartersPow2);
                return 0;
            }
        }
        int i11 = iFlog10threeQuartersPow2 + i4;
        int i12 = i7 + 1;
        int i13 = i7 << 2;
        if ((iRop2 <= i13) != ((i12 << 2) + i5 <= iRop3)) {
            if (iRop2 > i13) {
                i7 = i12;
            }
            toChars(i7, i11);
            return 0;
        }
        int i14 = i7 + i12;
        int i15 = iRop - (i14 + i14);
        if (i15 >= 0 && (i15 != 0 || (i7 & 1) != 0)) {
            i7 = i12;
        }
        toChars(i7, i11);
        return 0;
    }

    private String toDecimalString(float f2) {
        int decimal = toDecimal(f2);
        return decimal != 0 ? decimal != 1 ? decimal != 2 ? decimal != 3 ? decimal != 4 ? "NaN" : "-Infinity" : "Infinity" : "-0.0" : GLUtils.VERSION_UNKNOWN : charsToString();
    }

    public static String toString(float f2) {
        return new FloatToDecimal().toDecimalString(f2);
    }

    private int y(int i2) {
        return ((int) (MathUtils.multiplyHigh((i2 + 1) << 28, 193428131138340668L) >>> 20)) - 1;
    }

    private int toDecimal(float f2) {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        int i2 = 8388607 & iFloatToRawIntBits;
        int i3 = (iFloatToRawIntBits >>> 23) & 255;
        if (i3 >= 255) {
            if (i2 != 0) {
                return 5;
            }
            return iFloatToRawIntBits > 0 ? 3 : 4;
        }
        this.index = -1;
        if (iFloatToRawIntBits < 0) {
            append(45);
        }
        if (i3 == 0) {
            if (i2 == 0) {
                return iFloatToRawIntBits == 0 ? 1 : 2;
            }
            if (i2 < 8) {
                toDecimal(-149, i2 * 10, -1);
            } else {
                toDecimal(-149, i2, 0);
            }
            return 0;
        }
        int i4 = 150 - i3;
        int i5 = i2 | 8388608;
        if ((i4 > 0) & (i4 < 24)) {
            int i6 = i5 >> i4;
            if ((i6 << i4) == i5) {
                toChars(i6, 0);
                return 0;
            }
        }
        toDecimal(-i4, i5, 0);
        return 0;
    }
}
