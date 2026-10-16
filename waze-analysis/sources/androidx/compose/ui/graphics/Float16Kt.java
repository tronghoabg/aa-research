package androidx.compose.ui.graphics;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Float16Kt {
    private static final int Fp16Combined = 32767;
    private static final int Fp16ExponentBias = 15;
    private static final int Fp16ExponentMask = 31;
    private static final int Fp16ExponentMax = 31744;
    private static final int Fp16ExponentShift = 10;
    private static final int Fp16One = 15360;
    private static final int Fp16SignMask = 32768;
    private static final int Fp16SignShift = 15;
    private static final int Fp16SignificandMask = 1023;
    private static final int Fp16TheNaN = 32256;
    private static final int Fp32ExponentBias = 127;
    private static final int Fp32ExponentMask = 255;
    private static final int Fp32ExponentShift = 23;
    private static final int Fp32QNaNMask = 4194304;
    private static final int Fp32SignShift = 31;
    private static final int Fp32SignificandMask = 8388607;
    private static final int Fp32DenormalMagic = 1056964608;
    private static final float Fp32DenormalFloat = Float.intBitsToFloat(Fp32DenormalMagic);

    public static final short floatToHalf(float f2) {
        int i2;
        int i3;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        int i4 = iFloatToRawIntBits >> 13;
        int i5 = 8388607 & iFloatToRawIntBits;
        int i6 = (iFloatToRawIntBits >>> 31) << 15;
        int i7 = (iFloatToRawIntBits >>> 23) & 255;
        if (i7 == 255) {
            i3 = i5 != 0 ? 512 : 0;
            i = 31;
        } else {
            int i8 = i7 - 112;
            if (i8 >= 31) {
                i = 49;
                i3 = 0;
            } else if (i8 > 0) {
                int i9 = i4 & 1023;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i2 = (((i8 << 10) | i9) + 1) | i6;
                    return (short) i2;
                }
                i3 = i9;
                i = i8;
            } else if (i8 >= -10) {
                int i10 = (8388608 | i5) >> (1 - i8);
                if ((i10 & 4096) != 0) {
                    i10 += 8192;
                }
                i3 = i10 >> 13;
            } else {
                i3 = 0;
            }
        }
        i2 = i3 | i6 | (i << 10);
        return (short) i2;
    }

    public static final float halfToFloat(short s) {
        int i2;
        int i3;
        int i4 = s >>> 10;
        char c2 = (char) s;
        int i5 = i4 & 31;
        int i6 = c2 & 1023;
        int i7 = c2 & 32768;
        if (i5 != 0) {
            i2 = i6 << 13;
            if (i5 == 31) {
                i3 = 255;
                if (i2 != 0) {
                    i2 = 4194304 | i2;
                }
            } else {
                i3 = i5 + 112;
            }
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + Fp32DenormalMagic) - Fp32DenormalFloat;
                return i7 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i7 << 16) | (i3 << 23) | i2);
    }

    /* renamed from: max-AoSsdG0, reason: not valid java name */
    public static final short m8374maxAoSsdG0(short s, short s2) {
        return (Float16.m8347isNaNimpl(s) || Float16.m8347isNaNimpl(s2)) ? Float16.Companion.m8369getNaNslo4al4() : Float16.m8334compareTo41bOqos(s, s2) >= 0 ? s : s2;
    }

    /* renamed from: min-AoSsdG0, reason: not valid java name */
    public static final short m8375minAoSsdG0(short s, short s2) {
        return (Float16.m8347isNaNimpl(s) || Float16.m8347isNaNimpl(s2)) ? Float16.Companion.m8369getNaNslo4al4() : Float16.m8334compareTo41bOqos(s, s2) <= 0 ? s : s2;
    }

    private static final int toCompareValue(short s) {
        char c2 = (char) s;
        return (s & Short.MIN_VALUE) != 0 ? 32768 - c2 : c2;
    }
}
