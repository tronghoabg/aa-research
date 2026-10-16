package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class Connector {
    private final ColorSpace destination;
    private final int renderIntent;
    private final ColorSpace source;
    private final float[] transform;
    private final ColorSpace transformDestination;
    private final ColorSpace transformSource;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        this(colorSpace, colorSpace2, ColorModel.m8690equalsimpl0(colorSpace.m8699getModelxdoWZVw(), ColorModel.Companion.m8697getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace, ColorModel.m8690equalsimpl0(colorSpace2.m8699getModelxdoWZVw(), ColorModel.Companion.m8697getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(colorSpace2, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace2, i2, Companion.m8707computeTransformYBCOT_4(colorSpace, colorSpace2, i2), null);
    }

    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* renamed from: getRenderIntent-uksYyKA, reason: not valid java name */
    public final int m8704getRenderIntentuksYyKA() {
        return this.renderIntent;
    }

    public final ColorSpace getSource() {
        return this.source;
    }

    public float[] transform(float[] fArr) {
        float[] fArr2 = this.transform;
        float[] xyz = this.transformSource.toXyz(fArr);
        if (fArr2 != null) {
            xyz[0] = xyz[0] * fArr2[0];
            xyz[1] = xyz[1] * fArr2[1];
            xyz[2] = xyz[2] * fArr2[2];
        }
        return this.transformDestination.fromXyz(xyz);
    }

    /* renamed from: transformToColor-l2rxGTc$ui_graphics, reason: not valid java name */
    public long mo8705transformToColorl2rxGTc$ui_graphics(long j2) {
        ColorSpace colorSpace = this.transformSource;
        float fM8234getRedimpl = Color.m8234getRedimpl(j2);
        float fM8233getGreenimpl = Color.m8233getGreenimpl(j2);
        float fM8231getBlueimpl = Color.m8231getBlueimpl(j2);
        long xy$ui_graphics = colorSpace.toXy$ui_graphics(fM8234getRedimpl, fM8233getGreenimpl, fM8231getBlueimpl);
        long j3 = xy$ui_graphics >> 32;
        long j4 = xy$ui_graphics & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        ColorSpace colorSpace2 = this.transformSource;
        float fIntBitsToFloat = Float.intBitsToFloat((int) j3);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j4);
        float z$ui_graphics = colorSpace2.toZ$ui_graphics(fM8234getRedimpl, fM8233getGreenimpl, fM8231getBlueimpl);
        float[] fArr = this.transform;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            z$ui_graphics *= fArr[2];
        }
        float f2 = fIntBitsToFloat2;
        float f3 = fIntBitsToFloat;
        float fM8230getAlphaimpl = Color.m8230getAlphaimpl(j2);
        return this.transformDestination.mo8700xyzaToColorJlNiLsg$ui_graphics(f3, f2, z$ui_graphics, fM8230getAlphaimpl, this.destination);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        public final float[] m8707computeTransformYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
            if (!RenderIntent.m8713equalsimpl0(i2, RenderIntent.Companion.m8717getAbsoluteuksYyKA())) {
                return null;
            }
            boolean zM8690equalsimpl0 = ColorModel.m8690equalsimpl0(colorSpace.m8699getModelxdoWZVw(), ColorModel.Companion.m8697getRgbxdoWZVw());
            boolean zM8690equalsimpl02 = ColorModel.m8690equalsimpl0(colorSpace2.m8699getModelxdoWZVw(), ColorModel.Companion.m8697getRgbxdoWZVw());
            if (zM8690equalsimpl0) {
                if (zM8690equalsimpl02) {
                    return null;
                }
                zM8690equalsimpl02 = false;
            }
            if (!zM8690equalsimpl0) {
                if (!zM8690equalsimpl02) {
                    return null;
                }
                zM8690equalsimpl02 = true;
            }
            if (true != zM8690equalsimpl0) {
                colorSpace = colorSpace2;
            }
            x.d(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            float[] xyz$ui_graphics = zM8690equalsimpl0 ? rgb.getWhitePoint().toXyz$ui_graphics() : Illuminant.INSTANCE.getD50Xyz$ui_graphics();
            float[] xyz$ui_graphics2 = zM8690equalsimpl02 ? rgb.getWhitePoint().toXyz$ui_graphics() : Illuminant.INSTANCE.getD50Xyz$ui_graphics();
            return new float[]{xyz$ui_graphics[0] / xyz$ui_graphics2[0], xyz$ui_graphics[1] / xyz$ui_graphics2[1], xyz$ui_graphics[2] / xyz$ui_graphics2[2]};
        }

        public final Connector identity$ui_graphics(final ColorSpace colorSpace) {
            final int iM8719getRelativeuksYyKA = RenderIntent.Companion.m8719getRelativeuksYyKA();
            return new Connector(colorSpace, iM8719getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                {
                    super(colorSpace, colorSpace, iM8719getRelativeuksYyKA, null);
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                public float[] transform(float[] fArr) {
                    return fArr;
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                /* renamed from: transformToColor-l2rxGTc$ui_graphics */
                public long mo8705transformToColorl2rxGTc$ui_graphics(long j2) {
                    return j2;
                }
            };
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class RgbConnector extends Connector {
        public static final int $stable = 8;
        private final Rgb mDestination;
        private final Rgb mSource;
        private final float[] mTransform;

        /* JADX WARN: Illegal instructions before constructor call */
        private RgbConnector(Rgb rgb, Rgb rgb2, int i2) {
            Rgb rgb3 = rgb;
            Rgb rgb4 = rgb2;
            super(rgb3, rgb4, rgb3, rgb4, i2, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m8708computeTransformYBCOT_4(rgb, rgb2, i2);
        }

        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m8708computeTransformYBCOT_4(Rgb rgb, Rgb rgb2, int i2) {
            if (ColorSpaceKt.compare(rgb.getWhitePoint(), rgb2.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(rgb2.getInverseTransform$ui_graphics(), rgb.getTransform$ui_graphics());
            }
            float[] transform$ui_graphics = rgb.getTransform$ui_graphics();
            float[] inverseTransform$ui_graphics = rgb2.getInverseTransform$ui_graphics();
            float[] xyz$ui_graphics = rgb.getWhitePoint().toXyz$ui_graphics();
            float[] xyz$ui_graphics2 = rgb2.getWhitePoint().toXyz$ui_graphics();
            if (!ColorSpaceKt.compare(rgb.getWhitePoint(), Illuminant.INSTANCE.getD50())) {
                transform$ui_graphics = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics(), xyz$ui_graphics, Illuminant.INSTANCE.newD50Xyz$ui_graphics()), rgb.getTransform$ui_graphics());
            }
            if (!ColorSpaceKt.compare(rgb2.getWhitePoint(), Illuminant.INSTANCE.getD50())) {
                inverseTransform$ui_graphics = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics(), xyz$ui_graphics2, Illuminant.INSTANCE.newD50Xyz$ui_graphics()), rgb2.getTransform$ui_graphics()));
            }
            if (RenderIntent.m8713equalsimpl0(i2, RenderIntent.Companion.m8717getAbsoluteuksYyKA())) {
                transform$ui_graphics = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics[0] / xyz$ui_graphics2[0], xyz$ui_graphics[1] / xyz$ui_graphics2[1], xyz$ui_graphics[2] / xyz$ui_graphics2[2]}, transform$ui_graphics);
            }
            return ColorSpaceKt.mul3x3(inverseTransform$ui_graphics, transform$ui_graphics);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        public float[] transform(float[] fArr) {
            fArr[0] = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fArr[0]);
            fArr[1] = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fArr[1]);
            fArr[2] = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fArr[2]);
            ColorSpaceKt.mul3x3Float3(this.mTransform, fArr);
            fArr[0] = (float) this.mDestination.getOetfFunc$ui_graphics().invoke(fArr[0]);
            fArr[1] = (float) this.mDestination.getOetfFunc$ui_graphics().invoke(fArr[1]);
            fArr[2] = (float) this.mDestination.getOetfFunc$ui_graphics().invoke(fArr[2]);
            return fArr;
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* renamed from: transformToColor-l2rxGTc$ui_graphics */
        public long mo8705transformToColorl2rxGTc$ui_graphics(long j2) {
            double dM8234getRedimpl = Color.m8234getRedimpl(j2);
            Rgb rgb = this.mSource;
            float fM8233getGreenimpl = Color.m8233getGreenimpl(j2);
            float fM8231getBlueimpl = Color.m8231getBlueimpl(j2);
            float fInvoke = (float) rgb.getEotfFunc$ui_graphics().invoke(dM8234getRedimpl);
            float fInvoke2 = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fM8233getGreenimpl);
            float fInvoke3 = (float) this.mSource.getEotfFunc$ui_graphics().invoke(fM8231getBlueimpl);
            float[] fArr = this.mTransform;
            float f2 = fArr[0] * fInvoke;
            float f3 = fArr[3] * fInvoke2;
            float f4 = fArr[6] * fInvoke3;
            float f5 = fArr[1] * fInvoke;
            float f6 = fArr[4] * fInvoke2;
            float f7 = fArr[7] * fInvoke3;
            float f8 = fArr[2] * fInvoke;
            float f9 = fArr[5] * fInvoke2;
            float f10 = fArr[8] * fInvoke3;
            return ColorKt.Color((float) this.mDestination.getOetfFunc$ui_graphics().invoke(f2 + f3 + f4), (float) this.mDestination.getOetfFunc$ui_graphics().invoke(f5 + f6 + f7), (float) this.mDestination.getOetfFunc$ui_graphics().invoke(f8 + f9 + f10), Color.m8230getAlphaimpl(j2), this.mDestination);
        }

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i2, o oVar) {
            this(rgb, rgb2, i2);
        }
    }

    public final float[] transform(float f2, float f3, float f4) {
        return transform(new float[]{f2, f3, f4});
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i2, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i2;
        this.transform = fArr;
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i2, float[] fArr, o oVar) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i2, fArr);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i2, o oVar) {
        this(colorSpace, colorSpace2, i2);
    }
}
