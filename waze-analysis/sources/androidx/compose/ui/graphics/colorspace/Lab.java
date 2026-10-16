package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Lab extends ColorSpace {
    public static final int $stable = 0;
    private static final float A = 0.008856452f;
    private static final float B = 7.787037f;
    private static final float C = 0.13793103f;
    public static final Companion Companion = new Companion(null);
    private static final float D = 0.20689656f;

    public Lab(String str, int i2) {
        super(str, ColorModel.Companion.m8696getLabxdoWZVw(), i2, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        float f2 = fArr[0] / Illuminant.INSTANCE.getD50Xyz$ui_graphics()[0];
        float f3 = fArr[1] / Illuminant.INSTANCE.getD50Xyz$ui_graphics()[1];
        float f4 = fArr[2] / Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2];
        float fCbrt = f2 > A ? (float) Math.cbrt(f2) : (f2 * B) + C;
        float fCbrt2 = f3 > A ? (float) Math.cbrt(f3) : (f3 * B) + C;
        float f5 = 116.0f * fCbrt2;
        float f6 = fCbrt - fCbrt2;
        float fCbrt3 = fCbrt2 - (f4 > A ? (float) Math.cbrt(f4) : (f4 * B) + C);
        float f7 = f5 - 16.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 100.0f) {
            f7 = 100.0f;
        }
        float f8 = f6 * 500.0f;
        fArr[0] = f7;
        if (f8 < -128.0f) {
            f8 = -128.0f;
        }
        if (f8 > 128.0f) {
            f8 = 128.0f;
        }
        float f9 = fCbrt3 * 200.0f;
        fArr[1] = f8;
        float f10 = f9 >= -128.0f ? f9 : -128.0f;
        fArr[2] = f10 <= 128.0f ? f10 : 128.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i2) {
        return i2 == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i2) {
        return i2 == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        float f6 = (f3 * 0.002f) + f5;
        float f7 = f6 > D ? f6 * f6 * f6 : (f6 - 0.13793103f) * 0.12841855f;
        float f8 = f5 > D ? f5 * f5 * f5 : (f5 - 0.13793103f) * 0.12841855f;
        return (Float.floatToRawIntBits(f7 * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[0]) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(f8 * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[1]));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        float f2 = fArr[0];
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        fArr[0] = f2;
        float f3 = fArr[1];
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        fArr[1] = f3;
        float f4 = fArr[2];
        float f5 = f4 >= -128.0f ? f4 : -128.0f;
        float f6 = f5 <= 128.0f ? f5 : 128.0f;
        fArr[2] = f6;
        float f7 = (f2 + 16.0f) / 116.0f;
        float f8 = (f3 * 0.002f) + f7;
        float f9 = f8 > D ? f8 * f8 * f8 : (f8 - 0.13793103f) * 0.12841855f;
        float f10 = f7 > D ? f7 * f7 * f7 : (f7 - 0.13793103f) * 0.12841855f;
        float f11 = f7 - (f6 * 0.005f);
        float f12 = f11 > D ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
        fArr[0] = f9 * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[0];
        fArr[1] = f10 * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[1];
        fArr[2] = f12 * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2];
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        if (f4 < -128.0f) {
            f4 = -128.0f;
        }
        if (f4 > 128.0f) {
            f4 = 128.0f;
        }
        float f5 = ((f2 + 16.0f) / 116.0f) - (f4 * 0.005f);
        return (f5 > D ? f5 * f5 * f5 : 0.12841855f * (f5 - 0.13793103f)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public long mo8700xyzaToColorJlNiLsg$ui_graphics(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        float f6 = f2 / Illuminant.INSTANCE.getD50Xyz$ui_graphics()[0];
        float f7 = f3 / Illuminant.INSTANCE.getD50Xyz$ui_graphics()[1];
        float f8 = f4 / Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2];
        float fCbrt = f6 > A ? (float) Math.cbrt(f6) : (f6 * B) + C;
        float fCbrt2 = f7 > A ? (float) Math.cbrt(f7) : (f7 * B) + C;
        float fCbrt3 = f8 > A ? (float) Math.cbrt(f8) : (f8 * B) + C;
        float f9 = 116.0f * fCbrt2;
        float f10 = fCbrt - fCbrt2;
        float f11 = fCbrt2 - fCbrt3;
        float f12 = f9 - 16.0f;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 > 100.0f) {
            f12 = 100.0f;
        }
        float f13 = f10 * 500.0f;
        if (f13 < -128.0f) {
            f13 = -128.0f;
        }
        if (f13 > 128.0f) {
            f13 = 128.0f;
        }
        float f14 = f11 * 200.0f;
        float f15 = f14 >= -128.0f ? f14 : -128.0f;
        return ColorKt.Color(f12, f13, f15 <= 128.0f ? f15 : 128.0f, f5, colorSpace);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
