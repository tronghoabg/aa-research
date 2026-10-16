package androidx.compose.ui.graphics;

import androidx.camera.video.AudioStats;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Color {
    private final long value;
    public static final Companion Companion = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics());

    private /* synthetic */ Color(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m8218boximpl(long j2) {
        return new Color(j2);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m8219component1impl(long j2) {
        return m8234getRedimpl(j2);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m8220component2impl(long j2) {
        return m8233getGreenimpl(j2);
    }

    /* renamed from: component3-impl, reason: not valid java name */
    public static final float m8221component3impl(long j2) {
        return m8231getBlueimpl(j2);
    }

    /* renamed from: component4-impl, reason: not valid java name */
    public static final float m8222component4impl(long j2) {
        return m8230getAlphaimpl(j2);
    }

    /* renamed from: component5-impl, reason: not valid java name */
    public static final ColorSpace m8223component5impl(long j2) {
        return m8232getColorSpaceimpl(j2);
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m8225convertvNxB06k(long j2, ColorSpace colorSpace) {
        return ColorSpaceKt.m8702connectYBCOT_4$default(m8232getColorSpaceimpl(j2), colorSpace, 0, 2, null).mo8705transformToColorl2rxGTc$ui_graphics(j2);
    }

    /* renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m8226copywmQWz5c(long j2, float f2, float f3, float f4, float f5) {
        return ColorKt.Color(f3, f4, f5, f2, m8232getColorSpaceimpl(j2));
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m8227copywmQWz5c$default(long j2, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = m8230getAlphaimpl(j2);
        }
        float f6 = f2;
        if ((i2 & 2) != 0) {
            f3 = m8234getRedimpl(j2);
        }
        float f7 = f3;
        if ((i2 & 4) != 0) {
            f4 = m8233getGreenimpl(j2);
        }
        float f8 = f4;
        if ((i2 & 8) != 0) {
            f5 = m8231getBlueimpl(j2);
        }
        return m8226copywmQWz5c(j2, f6, f7, f8, f5);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8228equalsimpl(long j2, Object obj) {
        return (obj instanceof Color) && j2 == ((Color) obj).m8238unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8229equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m8230getAlphaimpl(long j2) {
        float f2;
        float f3;
        if ((63 & j2) == 0) {
            f2 = (float) ((j2 >>> 56) + AudioStats.AUDIO_AMPLITUDE_NONE);
            f3 = 255.0f;
        } else {
            f2 = (float) (((j2 >>> 6) & 1023) + AudioStats.AUDIO_AMPLITUDE_NONE);
            f3 = 1023.0f;
        }
        return f2 / f3;
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m8231getBlueimpl(long j2) {
        int i2;
        int i3;
        if ((63 & j2) == 0) {
            return ((float) (((j2 >>> 32) & 255) + AudioStats.AUDIO_AMPLITUDE_NONE)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        char c2 = (char) s;
        int i4 = c2 & 1023;
        int i5 = (s >>> 10) & 31;
        int i6 = c2 & 32768;
        if (i5 != 0) {
            i2 = i4 << 13;
            if (i5 == 31) {
                i3 = 255;
                if (i2 != 0) {
                    i2 |= 4194304;
                }
            } else {
                i3 = i5 + 112;
            }
        } else {
            if (i4 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i4 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i6 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i6 << 16) | i2);
    }

    /* renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m8232getColorSpaceimpl(long j2) {
        return ColorSpaces.INSTANCE.getColorSpacesArray$ui_graphics()[(int) (j2 & 63)];
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m8233getGreenimpl(long j2) {
        int i2;
        int i3;
        if ((63 & j2) == 0) {
            return ((float) (((j2 >>> 40) & 255) + AudioStats.AUDIO_AMPLITUDE_NONE)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        char c2 = (char) s;
        int i4 = c2 & 1023;
        int i5 = (s >>> 10) & 31;
        int i6 = c2 & 32768;
        if (i5 != 0) {
            i2 = i4 << 13;
            if (i5 == 31) {
                i3 = 255;
                if (i2 != 0) {
                    i2 |= 4194304;
                }
            } else {
                i3 = i5 + 112;
            }
        } else {
            if (i4 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i4 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i6 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i6 << 16) | i2);
    }

    /* renamed from: getRed-impl, reason: not valid java name */
    public static final float m8234getRedimpl(long j2) {
        int i2;
        int i3;
        long j3 = 63 & j2;
        long j4 = j2 >>> 48;
        if (j3 == 0) {
            return ((float) ((j4 & 255) + AudioStats.AUDIO_AMPLITUDE_NONE)) / 255.0f;
        }
        short s = (short) j4;
        char c2 = (char) s;
        int i4 = c2 & 1023;
        int i5 = (s >>> 10) & 31;
        int i6 = c2 & 32768;
        if (i5 != 0) {
            i2 = i4 << 13;
            if (i5 == 31) {
                i3 = 255;
                if (i2 != 0) {
                    i2 |= 4194304;
                }
            } else {
                i3 = i5 + 112;
            }
        } else {
            if (i4 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i4 + 1056964608) - Float16Kt.Fp32DenormalFloat;
                return i6 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i6 << 16) | i2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8235hashCodeimpl(long j2) {
        return a.a.b(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8236toStringimpl(long j2) {
        return "Color(" + m8234getRedimpl(j2) + ", " + m8233getGreenimpl(j2) + ", " + m8231getBlueimpl(j2) + ", " + m8230getAlphaimpl(j2) + ", " + m8232getColorSpaceimpl(j2).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m8228equalsimpl(this.value, obj);
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name */
    public final long m8237getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return m8235hashCodeimpl(this.value);
    }

    public String toString() {
        return m8236toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8238unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m8252hslJlNiLsg$default(Companion companion, float f2, float f3, float f4, float f5, Rgb rgb, int i2, Object obj) {
            if ((i2 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            Rgb rgb2 = rgb;
            if ((i2 & 8) != 0) {
                f5 = 1.0f;
            }
            return companion.m8267hslJlNiLsg(f2, f3, f4, f5, rgb2);
        }

        private final float hslToRgbComponent(int i2, float f2, float f3, float f4) {
            float f5 = (i2 + (f2 / 30.0f)) % 12.0f;
            return f4 - ((f3 * Math.min(f4, 1.0f - f4)) * Math.max(-1.0f, Math.min(f5 - 3.0f, Math.min(9.0f - f5, 1.0f))));
        }

        /* renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m8253hsvJlNiLsg$default(Companion companion, float f2, float f3, float f4, float f5, Rgb rgb, int i2, Object obj) {
            if ((i2 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            Rgb rgb2 = rgb;
            if ((i2 & 8) != 0) {
                f5 = 1.0f;
            }
            return companion.m8268hsvJlNiLsg(f2, f3, f4, f5, rgb2);
        }

        private final float hsvToRgbComponent(int i2, float f2, float f3, float f4) {
            float f5 = (i2 + (f2 / 60.0f)) % 6.0f;
            return f4 - ((f3 * f4) * Math.max(0.0f, Math.min(f5, Math.min(4.0f - f5, 1.0f))));
        }

        /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m8254getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m8255getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m8256getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m8257getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m8258getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m8259getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m8260getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m8261getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m8262getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m8263getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m8264getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m8265getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m8266getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m8267hslJlNiLsg(float f2, float f3, float f4, float f5, Rgb rgb) {
            if (f2 < 0.0f || f2 > 360.0f || f3 < 0.0f || f3 > 1.0f || f4 < 0.0f || f4 > 1.0f) {
                InlineClassHelperKt.throwIllegalArgumentException("HSL (" + f2 + ", " + f3 + ", " + f4 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hslToRgbComponent(0, f2, f3, f4), hslToRgbComponent(8, f2, f3, f4), hslToRgbComponent(4, f2, f3, f4), f5, rgb);
        }

        /* renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m8268hsvJlNiLsg(float f2, float f3, float f4, float f5, Rgb rgb) {
            if (f2 < 0.0f || f2 > 360.0f || f3 < 0.0f || f3 > 1.0f || f4 < 0.0f || f4 > 1.0f) {
                InlineClassHelperKt.throwIllegalArgumentException("HSV (" + f2 + ", " + f3 + ", " + f4 + ") must be in range (0..360, 0..1, 0..1)");
            }
            return ColorKt.Color(hsvToRgbComponent(5, f2, f3, f4), hsvToRgbComponent(3, f2, f3, f4), hsvToRgbComponent(1, f2, f3, f4), f5, rgb);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m8239getBlack0d7_KjU$annotations() {
        }

        /* renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m8240getBlue0d7_KjU$annotations() {
        }

        /* renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m8241getCyan0d7_KjU$annotations() {
        }

        /* renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m8242getDarkGray0d7_KjU$annotations() {
        }

        /* renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m8243getGray0d7_KjU$annotations() {
        }

        /* renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m8244getGreen0d7_KjU$annotations() {
        }

        /* renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m8245getLightGray0d7_KjU$annotations() {
        }

        /* renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m8246getMagenta0d7_KjU$annotations() {
        }

        /* renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m8247getRed0d7_KjU$annotations() {
        }

        /* renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m8248getTransparent0d7_KjU$annotations() {
        }

        /* renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m8249getUnspecified0d7_KjU$annotations() {
        }

        /* renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m8250getWhite0d7_KjU$annotations() {
        }

        /* renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m8251getYellow0d7_KjU$annotations() {
        }
    }

    public static /* synthetic */ void getAlpha$annotations() {
    }

    public static /* synthetic */ void getBlue$annotations() {
    }

    public static /* synthetic */ void getColorSpace$annotations() {
    }

    public static /* synthetic */ void getGreen$annotations() {
    }

    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8224constructorimpl(long j2) {
        return j2;
    }
}
