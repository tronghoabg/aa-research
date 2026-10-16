package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import h.g.a.a;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r20, float r21, float r22, float r23, androidx.compose.ui.graphics.colorspace.ColorSpace r24) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long Color$default(float f2, float f3, float f4, float f5, ColorSpace colorSpace, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i2 & 8) != 0) {
            f5 = 1.0f;
        }
        return Color(f2, f3, f4, f5, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long UncheckedColor(float r18, float r19, float r20, float r21, androidx.compose.ui.graphics.colorspace.ColorSpace r22) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.UncheckedColor(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long UncheckedColor$default(float f2, float f3, float f4, float f5, ColorSpace colorSpace, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i2 & 8) != 0) {
            f5 = 1.0f;
        }
        return UncheckedColor(f2, f3, f4, f5, colorSpace);
    }

    private static final float compositeComponent(float f2, float f3, float f4, float f5, float f6) {
        if (f6 == 0.0f) {
            return 0.0f;
        }
        return ((f2 * f4) + ((f3 * f5) * (1.0f - f4))) / f6;
    }

    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m8273compositeOverOWjLjI(long j2, long j3) {
        long jM8225convertvNxB06k = Color.m8225convertvNxB06k(j2, Color.m8232getColorSpaceimpl(j3));
        float fM8230getAlphaimpl = Color.m8230getAlphaimpl(jM8225convertvNxB06k);
        float fM8234getRedimpl = Color.m8234getRedimpl(jM8225convertvNxB06k);
        float fM8234getRedimpl2 = Color.m8234getRedimpl(j3);
        float fM8230getAlphaimpl2 = Color.m8230getAlphaimpl(j3);
        float f2 = 1.0f - fM8230getAlphaimpl;
        float f3 = (fM8230getAlphaimpl2 * f2) + fM8230getAlphaimpl;
        return UncheckedColor(f3 == 0.0f ? 0.0f : ((fM8234getRedimpl * fM8230getAlphaimpl) + ((fM8234getRedimpl2 * fM8230getAlphaimpl2) * f2)) / f3, f3 == 0.0f ? 0.0f : ((Color.m8233getGreenimpl(jM8225convertvNxB06k) * fM8230getAlphaimpl) + ((Color.m8233getGreenimpl(j3) * fM8230getAlphaimpl2) * f2)) / f3, f3 != 0.0f ? ((Color.m8231getBlueimpl(jM8225convertvNxB06k) * fM8230getAlphaimpl) + ((Color.m8231getBlueimpl(j3) * fM8230getAlphaimpl2) * f2)) / f3 : 0.0f, f3, Color.m8232getColorSpaceimpl(j3));
    }

    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m8274getComponents8_81llA(long j2) {
        return new float[]{Color.m8234getRedimpl(j2), Color.m8233getGreenimpl(j2), Color.m8231getBlueimpl(j2), Color.m8230getAlphaimpl(j2)};
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m8275isSpecified8_81llA(long j2) {
        return j2 != 16;
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m8277isUnspecified8_81llA(long j2) {
        return j2 == 16;
    }

    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m8279lerpjxsXWHM(long j2, long j3, float f2) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM8225convertvNxB06k = Color.m8225convertvNxB06k(j2, oklab);
        long jM8225convertvNxB06k2 = Color.m8225convertvNxB06k(j3, oklab);
        float fM8230getAlphaimpl = Color.m8230getAlphaimpl(jM8225convertvNxB06k);
        float fM8234getRedimpl = Color.m8234getRedimpl(jM8225convertvNxB06k);
        float fM8233getGreenimpl = Color.m8233getGreenimpl(jM8225convertvNxB06k);
        float fM8231getBlueimpl = Color.m8231getBlueimpl(jM8225convertvNxB06k);
        float fM8230getAlphaimpl2 = Color.m8230getAlphaimpl(jM8225convertvNxB06k2);
        float fM8234getRedimpl2 = Color.m8234getRedimpl(jM8225convertvNxB06k2);
        float fM8233getGreenimpl2 = Color.m8233getGreenimpl(jM8225convertvNxB06k2);
        float fM8231getBlueimpl2 = Color.m8231getBlueimpl(jM8225convertvNxB06k2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return Color.m8225convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(fM8234getRedimpl, fM8234getRedimpl2, f2), MathHelpersKt.lerp(fM8233getGreenimpl, fM8233getGreenimpl2, f2), MathHelpersKt.lerp(fM8231getBlueimpl, fM8231getBlueimpl2, f2), MathHelpersKt.lerp(fM8230getAlphaimpl, fM8230getAlphaimpl2, f2), oklab), Color.m8232getColorSpaceimpl(j3));
    }

    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m8280luminance8_81llA(long j2) {
        ColorSpace colorSpaceM8232getColorSpaceimpl = Color.m8232getColorSpaceimpl(j2);
        if (!ColorModel.m8690equalsimpl0(colorSpaceM8232getColorSpaceimpl.m8699getModelxdoWZVw(), ColorModel.Companion.m8697getRgbxdoWZVw())) {
            String strM8693toStringimpl = ColorModel.m8693toStringimpl(colorSpaceM8232getColorSpaceimpl.m8699getModelxdoWZVw());
            Objects.toString(strM8693toStringimpl);
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(strM8693toStringimpl));
        }
        x.d(colorSpaceM8232getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc$ui_graphics = ((Rgb) colorSpaceM8232getColorSpaceimpl).getEotfFunc$ui_graphics();
        float fInvoke = (float) ((eotfFunc$ui_graphics.invoke(Color.m8234getRedimpl(j2)) * 0.2126d) + (eotfFunc$ui_graphics.invoke(Color.m8233getGreenimpl(j2)) * 0.7152d) + (eotfFunc$ui_graphics.invoke(Color.m8231getBlueimpl(j2)) * 0.0722d));
        if (fInvoke < 0.0f) {
            fInvoke = 0.0f;
        }
        if (fInvoke > 1.0f) {
            return 1.0f;
        }
        return fInvoke;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m8281takeOrElseDxMtmZc(long j2, a<Color> aVar) {
        return j2 != 16 ? j2 : aVar.invoke().m8238unboximpl();
    }

    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m8282toArgb8_81llA(long j2) {
        return (int) (Color.m8225convertvNxB06k(j2, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m8276isSpecified8_81llA$annotations(long j2) {
    }

    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m8278isUnspecified8_81llA$annotations(long j2) {
    }

    public static /* synthetic */ long Color$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            i5 = 255;
        }
        return Color(i2, i3, i4, i5);
    }

    public static final long Color(int i2) {
        Color.Companion companion = Color.Companion;
        return i2 << 32;
    }

    public static final long Color(int i2, int i3, int i4, int i5) {
        return Color(((i2 & 255) << 16) | ((i5 & 255) << 24) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final long Color(long j2) {
        Color.Companion companion = Color.Companion;
        return j2 << 32;
    }
}
