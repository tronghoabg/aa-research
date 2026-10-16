package androidx.compose.ui.graphics;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import h.g.a;
import h.g.b.o;
import h.g.b.x;
import h.m.k;
import h.n.l;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Float16 implements Comparable<Float16> {
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;
    public static final Companion Companion = new Companion(null);
    private static final short Epsilon = 5120;
    private static final short LowestValue = -1025;
    private static final short MaxValue = 31743;
    private static final short MinNormal = SilenceSkippingAudioProcessor.DEFAULT_SILENCE_THRESHOLD_LEVEL;
    private static final short MinValue = 1;
    private static final short NaN = 32256;
    private static final short NegativeInfinity = -1024;
    private static final short NegativeZero = Short.MIN_VALUE;
    private static final short PositiveInfinity = 31744;
    private static final short PositiveZero = 0;

    private /* synthetic */ Float16(short s) {
        this.halfValue = s;
    }

    /* renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m8331absoluteValueslo4al4(short s) {
        return (short) (s & Short.MAX_VALUE);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Float16 m8332boximpl(short s) {
        return new Float16(s);
    }

    /* renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m8333ceilslo4al4(short s) {
        int i2 = (char) s;
        int i3 = i2 & 32767;
        if (i3 < 15360) {
            i2 = (i2 & 32768) | ((-((~((s >> 15) & 1)) & (i3 == 0 ? 0 : 1))) & StylePropertiesKt.FontSynthesisMask);
        } else if (i3 < 25600) {
            int i4 = (1 << (25 - (i3 >> 10))) - 1;
            i2 = (i2 + ((((s >> 15) & 1) - 1) & i4)) & (~i4);
        }
        return (short) i2;
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m8334compareTo41bOqos(short s, short s2) {
        if (m8347isNaNimpl(s)) {
            return m8347isNaNimpl(s2) ? 0 : 1;
        }
        if (m8347isNaNimpl(s2)) {
            return -1;
        }
        int i2 = (char) s2;
        int i3 = (char) s;
        if ((s & Short.MIN_VALUE) != 0) {
            i3 = 32768 - i3;
        }
        if ((s2 & Short.MIN_VALUE) != 0) {
            i2 = 32768 - i2;
        }
        return x.a(i3, i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m8336constructorimpl(float f2) {
        int i2;
        int i3;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        int i4 = iFloatToRawIntBits >> 13;
        int i5 = 8388607 & iFloatToRawIntBits;
        int i6 = (iFloatToRawIntBits >>> 31) << 15;
        int i7 = (iFloatToRawIntBits >>> 23) & 255;
        if (i7 == 255) {
            i2 = i5 != 0 ? 512 : 0;
            i = 31;
        } else {
            int i8 = i7 - 112;
            if (i8 >= 31) {
                i = 49;
                i2 = 0;
            } else if (i8 > 0) {
                int i9 = i4 & 1023;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i8 << 10) | i9) + 1) | i6;
                    return (short) i3;
                }
                i2 = i9;
                i = i8;
            } else if (i8 >= -10) {
                int i10 = (8388608 | i5) >> (1 - i8);
                if ((i10 & 4096) != 0) {
                    i10 += 8192;
                }
                i2 = i10 >> 13;
            } else {
                i2 = 0;
            }
        }
        i3 = i2 | i6 | (i << 10);
        return (short) i3;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8338equalsimpl(short s, Object obj) {
        return (obj instanceof Float16) && s == ((Float16) obj).m8363unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8339equalsimpl0(short s, short s2) {
        return s == s2;
    }

    /* renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m8340floorslo4al4(short s) {
        int i2 = (char) s;
        int i3 = i2 & 32767;
        if (i3 < 15360) {
            i2 = (i2 & 32768) | ((i2 > 32768 ? 65535 : 0) & StylePropertiesKt.FontSynthesisMask);
        } else if (i3 < 25600) {
            int i4 = (1 << (25 - (i3 >> 10))) - 1;
            i2 = (i2 + ((-((s >> 15) & 1)) & i4)) & (~i4);
        }
        return (short) i2;
    }

    /* renamed from: getExponent-impl, reason: not valid java name */
    public static final int m8341getExponentimpl(short s) {
        return ((s >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m8342getSignslo4al4(short s) {
        int i2 = s & Short.MAX_VALUE;
        if (!((i2 > 31744) | (i2 == 0))) {
            i2 = (s & Short.MIN_VALUE) | StylePropertiesKt.FontSynthesisMask;
        }
        return (short) i2;
    }

    /* renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m8343getSignificandimpl(short s) {
        return s & 1023;
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m8345isFiniteimpl(short s) {
        return (s & Short.MAX_VALUE) != 31744;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m8346isInfiniteimpl(short s) {
        return (s & Short.MAX_VALUE) == 31744;
    }

    /* renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m8347isNaNimpl(short s) {
        return (s & Short.MAX_VALUE) > 31744;
    }

    /* renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m8348isNormalizedimpl(short s) {
        int i2 = s & 31744;
        return (i2 != 0) & (i2 != 31744);
    }

    /* renamed from: round-slo4al4, reason: not valid java name */
    public static final short m8349roundslo4al4(short s) {
        int i2 = (char) s;
        int i3 = i2 & 32767;
        if (i3 < 15360) {
            i2 = (i2 & 32768) | ((i3 >= 14336 ? 65535 : 0) & StylePropertiesKt.FontSynthesisMask);
        } else if (i3 < 25600) {
            i2 = (i2 + (1 << (24 - (i3 >> 10)))) & (~((1 << (25 - r0)) - 1));
        }
        return (short) i2;
    }

    /* renamed from: toBits-impl, reason: not valid java name */
    public static final int m8350toBitsimpl(short s) {
        if (m8347isNaNimpl(s)) {
            return 32256;
        }
        return (char) s;
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    public static final byte m8351toByteimpl(short s) {
        return (byte) m8353toFloatimpl(s);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m8352toDoubleimpl(short s) {
        return m8353toFloatimpl(s);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    public static final float m8353toFloatimpl(short s) {
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
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i7 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i7 << 16) | (i3 << 23) | i2);
    }

    /* renamed from: toHexString-impl, reason: not valid java name */
    public static final String m8354toHexStringimpl(short s) {
        StringBuilder sb = new StringBuilder();
        int i2 = s >>> 15;
        int i3 = (s >>> 10) & 31;
        int i4 = s & 1023;
        int i5 = i2 & 1;
        if (i3 != 31) {
            if (i5 == 1) {
                sb.append('-');
            }
            if (i3 != 0) {
                sb.append("0x1.");
                k.y(16);
                String string = Integer.toString(i4, 16);
                x.e(string, "toString(...)");
                sb.append(new l("0{2,}$").i(string));
                sb.append('p');
                sb.append(String.valueOf(i3 - 15));
            } else if (i4 == 0) {
                sb.append("0x0.0p0");
            } else {
                sb.append("0x0.");
                k.y(16);
                String string2 = Integer.toString(i4, 16);
                x.e(string2, "toString(...)");
                sb.append(new l("0{2,}$").i(string2));
                sb.append("p-14");
            }
        } else if (i4 == 0) {
            if (i5 != 0) {
                sb.append('-');
            }
            sb.append("Infinity");
        } else {
            sb.append("NaN");
        }
        return sb.toString();
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m8355toIntimpl(short s) {
        return (int) m8353toFloatimpl(s);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m8356toLongimpl(short s) {
        return (long) m8353toFloatimpl(s);
    }

    /* renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m8357toRawBitsimpl(short s) {
        return (char) s;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    public static final short m8358toShortimpl(short s) {
        return (short) m8353toFloatimpl(s);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8359toStringimpl(short s) {
        return String.valueOf(m8353toFloatimpl(s));
    }

    /* renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m8360truncslo4al4(short s) {
        int i2;
        int i3 = (char) s;
        int i4 = i3 & 32767;
        if (i4 >= 15360) {
            i2 = i4 < 25600 ? ~((1 << (25 - (i4 >> 10))) - 1) : 32768;
            return (short) i3;
        }
        i3 &= i2;
        return (short) i3;
    }

    /* renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m8361withSignqCeQghg(short s, short s2) {
        return (short) ((s & Short.MAX_VALUE) | (s2 & Short.MIN_VALUE));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m8362compareTo41bOqos(float16.m8363unboximpl());
    }

    public boolean equals(Object obj) {
        return m8338equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return this.halfValue;
    }

    public String toString() {
        return m8359toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m8363unboximpl() {
        return this.halfValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getEpsilon-slo4al4, reason: not valid java name */
        public final short m8364getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4, reason: not valid java name */
        public final short m8365getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4, reason: not valid java name */
        public final short m8366getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4, reason: not valid java name */
        public final short m8367getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4, reason: not valid java name */
        public final short m8368getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4, reason: not valid java name */
        public final short m8369getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4, reason: not valid java name */
        public final short m8370getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4, reason: not valid java name */
        public final short m8371getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4, reason: not valid java name */
        public final short m8372getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4, reason: not valid java name */
        public final short m8373getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8344hashCodeimpl(short s) {
        return s;
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m8362compareTo41bOqos(short s) {
        return m8334compareTo41bOqos(this.halfValue, s);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m8335constructorimpl(double d2) {
        return m8336constructorimpl((float) d2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m8337constructorimpl(short s) {
        return s;
    }
}
