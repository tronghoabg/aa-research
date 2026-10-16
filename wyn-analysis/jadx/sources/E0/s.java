package e0;

import com.applovin.shadow.okio.Segment;

/* loaded from: classes.dex */
public abstract class s implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public static final ad.r f34384a = new ad.r();

    /* renamed from: b, reason: collision with root package name */
    public static final float f34385b;

    static {
        a(1.0f);
        a(-1.0f);
        f34385b = Float.intBitsToFloat(1056964608);
    }

    public static short a(float f10) {
        int i5;
        f34384a.getClass();
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i10 = iFloatToRawIntBits >>> 31;
        int i11 = (iFloatToRawIntBits >>> 23) & 255;
        int i12 = 8388607 & iFloatToRawIntBits;
        int i13 = 31;
        int i14 = 0;
        if (i11 != 255) {
            int i15 = i11 - 112;
            if (i15 >= 31) {
                i13 = 49;
            } else if (i15 > 0) {
                i14 = i12 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i5 = (((i15 << 10) | i14) + 1) | (i10 << 15);
                    return (short) i5;
                }
                i13 = i15;
            } else if (i15 >= -10) {
                int i16 = (8388608 | i12) >> (1 - i15);
                if ((i16 & 4096) != 0) {
                    i16 += Segment.SIZE;
                }
                i13 = 0;
                i14 = i16 >> 13;
            } else {
                i13 = 0;
            }
        } else if (i12 != 0) {
            i14 = 512;
        }
        i5 = (i10 << 15) | (i13 << 10) | i14;
        return (short) i5;
    }

    public static final float b(short s10) {
        int i5;
        int i10;
        int i11;
        int i12 = Short.MIN_VALUE & s10;
        int i13 = ((65535 & s10) >>> 10) & 31;
        int i14 = s10 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i5 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i5 = i13 + 112;
            }
            int i16 = i5;
            i10 = i15;
            i11 = i16;
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - f34385b;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }
}
