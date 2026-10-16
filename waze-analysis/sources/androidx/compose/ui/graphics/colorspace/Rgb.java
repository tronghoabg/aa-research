package androidx.compose.ui.graphics.colorspace;

import androidx.camera.video.AudioStats;
import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.muxer.MuxerUtil;
import h.a.c;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Rgb extends ColorSpace {
    private final l<Double, Double> eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final l<Double, Double> oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final DoubleFunction DoubleIdentity = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda2
        @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
        public final double invoke(double d2) {
            return d2;
        }
    };

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f2, float f3, TransferParameters transferParameters, int i2) {
        super(str, ColorModel.Companion.m8697getRgbxdoWZVw(), i2, null);
        float[] fArr3 = fArr2;
        this.whitePoint = whitePoint;
        this.min = f2;
        this.max = f3;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new Rgb$oetf$1(this);
        this.oetfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return n.d(this.f$0.oetfOrig.invoke(d2), r0.min, r0.max);
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new Rgb$eotf$1(this);
        this.eotfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda1
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return this.f$0.eotfOrig.invoke(n.d(d2, r0.min, r0.max));
            }
        };
        int length = fArr.length;
        if (length != 6 && length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Invalid range: min=" + f2 + ", max=" + f3 + "; min must be strictly < max");
        }
        Companion companion = Companion;
        float[] fArrXyPrimaries = companion.xyPrimaries(fArr);
        this.primaries = fArrXyPrimaries;
        if (fArr3 == null) {
            float[] fArrComputeXYZMatrix = companion.computeXYZMatrix(fArrXyPrimaries, whitePoint);
            this.transform = fArrComputeXYZMatrix;
            fArr3 = fArrComputeXYZMatrix;
        } else {
            int length2 = fArr3.length;
            if (length2 != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + length2);
            }
            this.transform = fArr3;
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(fArr3);
        this.isWideGamut = companion.isWideGamut(fArrXyPrimaries, f2, f3);
        this.isSrgb = companion.isSrgb(fArrXyPrimaries, whitePoint, doubleFunction, doubleFunction2, f2, f3, i2);
    }

    static final double _init_$lambda$4(double d2, double d3) {
        if (d3 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d3 = 0.0d;
        }
        return Math.pow(d3, 1.0d / d2);
    }

    static final double _init_$lambda$5(double d2, double d3) {
        if (d3 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d3 = 0.0d;
        }
        return Math.pow(d3, d2);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        Rgb rgb = (Rgb) obj;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !x.n(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return x.n(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (x.n(this.oetfOrig, rgb.oetfOrig)) {
            return x.n(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    public final float[] fromLinear(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.oetfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.oetfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.oetfFunc.invoke(fArr[2]);
        return fArr;
    }

    public final l<Double, Double> getEotf() {
        return this.eotf;
    }

    public final DoubleFunction getEotfFunc$ui_graphics() {
        return this.eotfFunc;
    }

    public final DoubleFunction getEotfOrig$ui_graphics() {
        return this.eotfOrig;
    }

    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        x.e(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public final float[] getInverseTransform$ui_graphics() {
        return this.inverseTransform;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i2) {
        return this.max;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i2) {
        return this.min;
    }

    public final l<Double, Double> getOetf() {
        return this.oetf;
    }

    public final DoubleFunction getOetfFunc$ui_graphics() {
        return this.oetfFunc;
    }

    public final DoubleFunction getOetfOrig$ui_graphics() {
        return this.oetfOrig;
    }

    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        x.e(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public final float[] getPrimaries$ui_graphics() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        x.e(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    public final float[] getTransform$ui_graphics() {
        return this.transform;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int iHashCode = (((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries);
        float f2 = this.min;
        int iFloatToIntBits = ((iHashCode * 31) + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        float f3 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (f3 == 0.0f ? 0 : Float.floatToIntBits(f3))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((iHashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : iHashCode2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.isSrgb;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    public final float[] toLinear(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics(float f2, float f3, float f4) {
        float fInvoke = (float) this.eotfFunc.invoke(f2);
        float fInvoke2 = (float) this.eotfFunc.invoke(f3);
        float fInvoke3 = (float) this.eotfFunc.invoke(f4);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        float f5 = fArr[0] * fInvoke;
        float f6 = fArr[3] * fInvoke2;
        float f7 = fArr[6] * fInvoke3;
        float f8 = fArr[1] * fInvoke;
        float f9 = fArr[4] * fInvoke2;
        float f10 = fArr[7] * fInvoke3;
        return (Float.floatToRawIntBits(f8 + f9 + f10) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits((f5 + f6) + f7) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        fArr[0] = (float) this.eotfFunc.invoke(fArr[0]);
        fArr[1] = (float) this.eotfFunc.invoke(fArr[1]);
        fArr[2] = (float) this.eotfFunc.invoke(fArr[2]);
        ColorSpaceKt.mul3x3Float3(this.transform, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics(float f2, float f3, float f4) {
        float fInvoke = (float) this.eotfFunc.invoke(f2);
        float fInvoke2 = (float) this.eotfFunc.invoke(f3);
        float fInvoke3 = (float) this.eotfFunc.invoke(f4);
        float[] fArr = this.transform;
        return (fArr[2] * fInvoke) + (fArr[5] * fInvoke2) + (fArr[8] * fInvoke3);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public long mo8700xyzaToColorJlNiLsg$ui_graphics(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        float[] fArr = this.inverseTransform;
        float f6 = fArr[0] * f2;
        float f7 = fArr[3] * f3;
        float f8 = fArr[6] * f4;
        float f9 = fArr[1] * f2;
        float f10 = fArr[4] * f3;
        float f11 = fArr[7] * f4;
        float f12 = fArr[2] * f2;
        float f13 = fArr[5] * f3;
        return ColorKt.Color((float) this.oetfFunc.invoke(f6 + f7 + f8), (float) this.oetfFunc.invoke(f9 + f10 + f11), (float) this.oetfFunc.invoke(f12 + f13 + (fArr[8] * f4)), f5, colorSpace);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final float area(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[2];
            float f5 = fArr[3];
            float f6 = fArr[4];
            float f7 = fArr[5];
            float f8 = ((((((f2 * f5) + (f3 * f6)) + (f4 * f7)) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
            return f8 < 0.0f ? -f8 : f8;
        }

        private final boolean compare(double d2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2) {
            return Math.abs(doubleFunction.invoke(d2) - doubleFunction2.invoke(d2)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] fArr) {
            float[] fArr2 = {1.0f, 1.0f, 1.0f};
            ColorSpaceKt.mul3x3Float3(fArr, fArr2);
            float f2 = fArr2[0];
            float f3 = fArr2[1];
            float f4 = f2 + f3 + fArr2[2];
            return new WhitePoint(f2 / f4, f3 / f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] fArr, WhitePoint whitePoint) {
            float f2 = fArr[0];
            float f3 = 1.0f - f2;
            float f4 = fArr[1];
            float f5 = f3 / f4;
            float f6 = fArr[2];
            float f7 = 1.0f - f6;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = 1.0f - f9;
            float f11 = fArr[5];
            float x = whitePoint.getX();
            float y = whitePoint.getY();
            float f12 = f2 / f4;
            float f13 = (f9 / f11) - f12;
            float f14 = (f6 / f8) - f12;
            float f15 = (x / y) - f12;
            float f16 = (f7 / f8) - f5;
            float f17 = (((((1.0f - x) / y) - f5) * f14) - (f16 * f15)) / ((((f10 / f11) - f5) * f14) - (f13 * f16));
            float f18 = (f15 - (f13 * f17)) / f14;
            float f19 = (1.0f - f18) - f17;
            float f20 = f19 / f4;
            float f21 = f18 / f8;
            float f22 = f17 / f11;
            return new float[]{f2 * f20, f19, f20 * (f3 - f4), f6 * f21, f18, f21 * (f7 - f8), f9 * f22, f17, f22 * (f10 - f11)};
        }

        private final boolean contains(float[] fArr, float[] fArr2) {
            float f2 = fArr[0];
            float f3 = fArr2[0];
            float f4 = fArr[1];
            float f5 = fArr2[1];
            float f6 = fArr[2];
            float f7 = fArr2[2];
            float f8 = fArr[3];
            float f9 = fArr2[3];
            float f10 = fArr[4];
            float f11 = fArr2[4];
            float f12 = fArr[5];
            float f13 = fArr2[5];
            float f14 = f12 - f13;
            float[] fArr3 = {f2 - f3, f4 - f5, f6 - f7, f8 - f9, f10 - f11, f14};
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            if (((f5 - f13) * f15) - ((f3 - f11) * f16) >= 0.0f && ((f3 - f7) * f16) - ((f5 - f9) * f15) >= 0.0f) {
                float f17 = fArr3[2];
                float f18 = fArr3[3];
                if (((f9 - f5) * f17) - ((f7 - f3) * f18) >= 0.0f && ((f7 - f11) * f18) - ((f9 - f13) * f17) >= 0.0f) {
                    float f19 = fArr3[4];
                    if (((f13 - f9) * f19) - ((f11 - f7) * f14) >= 0.0f && ((f11 - f3) * f14) - ((f13 - f5) * f19) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final float cross(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateEotf(final TransferParameters transferParameters) {
            return transferParameters.isHLGish$ui_graphics() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda0
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    return ColorSpaces.INSTANCE.transferHlgEotf$ui_graphics(transferParameters, d2);
                }
            } : transferParameters.isPQish$ui_graphics() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda1
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    return ColorSpaces.INSTANCE.transferSt2048Eotf$ui_graphics(transferParameters, d2);
                }
            } : (transferParameters.getE() == AudioStats.AUDIO_AMPLITUDE_NONE && transferParameters.getF() == AudioStats.AUDIO_AMPLITUDE_NONE) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda2
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    TransferParameters transferParameters2 = transferParameters;
                    return ColorSpaceKt.response(d2, transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getGamma());
                }
            } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda3
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    TransferParameters transferParameters2 = transferParameters;
                    return ColorSpaceKt.response(d2, transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getE(), transferParameters2.getF(), transferParameters2.getGamma());
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateOetf(final TransferParameters transferParameters) {
            return transferParameters.isHLGish$ui_graphics() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda4
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    return ColorSpaces.INSTANCE.transferHlgOetf$ui_graphics(transferParameters, d2);
                }
            } : transferParameters.isPQish$ui_graphics() ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda5
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    return ColorSpaces.INSTANCE.transferSt2048Oetf$ui_graphics(transferParameters, d2);
                }
            } : (transferParameters.getE() == AudioStats.AUDIO_AMPLITUDE_NONE && transferParameters.getF() == AudioStats.AUDIO_AMPLITUDE_NONE) ? new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda6
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    TransferParameters transferParameters2 = transferParameters;
                    return ColorSpaceKt.rcpResponse(d2, transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getGamma());
                }
            } : new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda7
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    TransferParameters transferParameters2 = transferParameters;
                    return ColorSpaceKt.rcpResponse(d2, transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getE(), transferParameters2.getF(), transferParameters2.getGamma());
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] fArr, WhitePoint whitePoint, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f2, float f3, int i2) {
            if (i2 == 0) {
                return true;
            }
            if (!ColorSpaceKt.compare(fArr, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics()) || !ColorSpaceKt.compare(whitePoint, Illuminant.INSTANCE.getD65()) || f2 != 0.0f || f3 != 1.0f) {
                return false;
            }
            Rgb srgb = ColorSpaces.INSTANCE.getSrgb();
            for (double d2 = AudioStats.AUDIO_AMPLITUDE_NONE; d2 <= 1.0d; d2 += 0.00392156862745098d) {
                if (!compare(d2, doubleFunction, srgb.getOetfOrig$ui_graphics()) || !compare(d2, doubleFunction2, srgb.getEotfOrig$ui_graphics())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] fArr, float f2, float f3) {
            if (area(fArr) / area(ColorSpaces.INSTANCE.getNtsc1953Primaries$ui_graphics()) <= 0.9f || !contains(fArr, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics())) {
                return f2 < 0.0f && f3 > 1.0f;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length != 9) {
                c.aK(fArr, fArr2, 0, 6, 6);
                return fArr2;
            }
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = f2 + f3 + fArr[2];
            fArr2[0] = f2 / f4;
            fArr2[1] = f3 / f4;
            float f5 = fArr[3];
            float f6 = fArr[4];
            float f7 = f5 + f6 + fArr[5];
            fArr2[2] = f5 / f7;
            fArr2[3] = f6 / f7;
            float f8 = fArr[6];
            float f9 = fArr[7];
            float f10 = f8 + f9 + fArr[8];
            fArr2[4] = f8 / f10;
            fArr2[5] = f9 / f10;
            return fArr2;
        }

        public final float[] computePrimaries$ui_graphics(float[] fArr) {
            float[] fArr2 = {1.0f, 0.0f, 0.0f};
            ColorSpaceKt.mul3x3Float3(fArr, fArr2);
            float[] fArr3 = {0.0f, 1.0f, 0.0f};
            ColorSpaceKt.mul3x3Float3(fArr, fArr3);
            float[] fArr4 = {0.0f, 0.0f, 1.0f};
            ColorSpaceKt.mul3x3Float3(fArr, fArr4);
            float f2 = fArr2[0];
            float f3 = fArr2[1];
            float f4 = f2 + f3 + fArr2[2];
            float f5 = fArr3[0];
            float f6 = fArr3[1];
            float f7 = f5 + f6 + fArr3[2];
            float f8 = fArr4[0];
            float f9 = fArr4[1];
            float f10 = f8 + f9 + fArr4[2];
            return new float[]{f2 / f4, f3 / f4, f5 / f7, f6 / f7, f8 / f10, f9 / f10};
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final float[] getInverseTransform(float[] fArr) {
        c.aK(this.inverseTransform, fArr, 0, 0, 14);
        return fArr;
    }

    public final float[] getPrimaries(float[] fArr) {
        c.aK(this.primaries, fArr, 0, 0, 14);
        return fArr;
    }

    public final float[] getTransform(float[] fArr) {
        c.aK(this.transform, fArr, 0, 0, 14);
        return fArr;
    }

    static final double DoubleIdentity$lambda$0(double d2) {
        return d2;
    }

    public final float[] fromLinear(float f2, float f3, float f4) {
        float[] fArr = {f2, f3, f4};
        fromLinear(fArr);
        return fArr;
    }

    public final float[] toLinear(float f2, float f3, float f4) {
        float[] fArr = {f2, f3, f4};
        toLinear(fArr);
        return fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, double d2) {
        Companion companion = Companion;
        this(str, companion.computePrimaries$ui_graphics(fArr), companion.computeWhitePoint(fArr), d2, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, TransferParameters transferParameters) {
        Companion companion = Companion;
        this(str, companion.computePrimaries$ui_graphics(fArr), companion.computeWhitePoint(fArr), transferParameters, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, double d2) {
        this(str, fArr, whitePoint, d2, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d2, float f2, float f3, int i2) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        if (d2 == 1.0d) {
            doubleFunction = DoubleIdentity;
        } else {
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda5
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d3) {
                    return Rgb._init_$lambda$4(d2, d3);
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (d2 == 1.0d) {
            doubleFunction2 = DoubleIdentity;
        } else {
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda6
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d3) {
                    return Rgb._init_$lambda$5(d2, d3);
                }
            };
        }
        this(str, fArr, whitePoint, null, doubleFunction3, doubleFunction2, f2, f3, new TransferParameters(d2, 1.0d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null), i2);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters, int i2) {
        Companion companion = Companion;
        this(str, fArr, whitePoint, null, companion.generateOetf(transferParameters), companion.generateEotf(transferParameters), 0.0f, 1.0f, transferParameters, i2);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final l<? super Double, Double> lVar, final l<? super Double, Double> lVar2, float f2, float f3) {
        this(str, fArr, whitePoint, null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda7
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return ((Number) lVar.invoke(Double.valueOf(d2))).doubleValue();
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda8
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return ((Number) lVar2.invoke(Double.valueOf(d2))).doubleValue();
            }
        }, f2, f3, null, -1);
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, final l<? super Double, Double> lVar, final l<? super Double, Double> lVar2) {
        Companion companion = Companion;
        this(str, companion.computePrimaries$ui_graphics(fArr), companion.computeWhitePoint(fArr), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda3
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return ((Number) lVar.invoke(Double.valueOf(d2))).doubleValue();
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda4
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return ((Number) lVar2.invoke(Double.valueOf(d2))).doubleValue();
            }
        }, 0.0f, 1.0f, null, -1);
    }
}
