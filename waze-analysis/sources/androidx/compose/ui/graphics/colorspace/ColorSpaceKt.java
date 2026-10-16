package androidx.compose.ui.graphics.colorspace;

import androidx.camera.video.AudioStats;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.graphics.colorspace.Connector;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ColorSpaceKt {
    public static final double absRcpResponse(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Math.copySign(rcpResponse(d2 < AudioStats.AUDIO_AMPLITUDE_NONE ? -d2 : d2, d3, d4, d5, d6, d7), d2);
    }

    public static final double absResponse(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Math.copySign(response(d2 < AudioStats.AUDIO_AMPLITUDE_NONE ? -d2 : d2, d3, d4, d5, d6, d7), d2);
    }

    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation) {
        if (ColorModel.m8690equalsimpl0(colorSpace.m8699getModelxdoWZVw(), ColorModel.Companion.m8697getRgbxdoWZVw())) {
            x.d(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            if (!compare(rgb.getWhitePoint(), whitePoint)) {
                return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform$ui_graphics(), rgb.getWhitePoint().toXyz$ui_graphics(), whitePoint.toXyz$ui_graphics()), rgb.getTransform$ui_graphics()), whitePoint);
            }
        }
        return colorSpace;
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            adaptation = Adaptation.Companion.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    public static final float[] chromaticAdaptation(float[] fArr, float[] fArr2, float[] fArr3) {
        mul3x3Float3(fArr, fArr2);
        mul3x3Float3(fArr, fArr3);
        return mul3x3(inverse3x3(fArr), mul3x3Diag(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final boolean compare(TransferParameters transferParameters, TransferParameters transferParameters2) {
        return transferParameters2 != null && Math.abs(transferParameters.getA() - transferParameters2.getA()) < 0.001d && Math.abs(transferParameters.getB() - transferParameters2.getB()) < 0.001d && Math.abs(transferParameters.getC() - transferParameters2.getC()) < 0.001d && Math.abs(transferParameters.getD() - transferParameters2.getD()) < 0.002d && Math.abs(transferParameters.getE() - transferParameters2.getE()) < 0.001d && Math.abs(transferParameters.getF() - transferParameters2.getF()) < 0.001d && Math.abs(transferParameters.getGamma() - transferParameters2.getGamma()) < 0.001d;
    }

    /* renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final Connector m8701connectYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        int id$ui_graphics = colorSpace.getId$ui_graphics();
        int id$ui_graphics2 = colorSpace2.getId$ui_graphics();
        if ((id$ui_graphics | id$ui_graphics2) < 0) {
            return m8703createConnectorYBCOT_4(colorSpace, colorSpace2, i2);
        }
        MutableIntObjectMap<Connector> connectors = ConnectorKt.getConnectors();
        int i3 = id$ui_graphics | (id$ui_graphics2 << 6) | (i2 << 12);
        Connector connectorM8703createConnectorYBCOT_4 = connectors.get(i3);
        if (connectorM8703createConnectorYBCOT_4 == null) {
            connectorM8703createConnectorYBCOT_4 = m8703createConnectorYBCOT_4(colorSpace, colorSpace2, i2);
            connectors.set(i3, connectorM8703createConnectorYBCOT_4);
        }
        return connectorM8703createConnectorYBCOT_4;
    }

    /* renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ Connector m8702connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i3 & 2) != 0) {
            i2 = RenderIntent.Companion.m8718getPerceptualuksYyKA();
        }
        return m8701connectYBCOT_4(colorSpace, colorSpace2, i2);
    }

    /* renamed from: createConnector-YBCOT_4, reason: not valid java name */
    private static final Connector m8703createConnectorYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        if (colorSpace == colorSpace2) {
            return Connector.Companion.identity$ui_graphics(colorSpace);
        }
        o oVar = null;
        if (!ColorModel.m8690equalsimpl0(colorSpace.m8699getModelxdoWZVw(), ColorModel.Companion.m8697getRgbxdoWZVw()) || !ColorModel.m8690equalsimpl0(colorSpace2.m8699getModelxdoWZVw(), ColorModel.Companion.m8697getRgbxdoWZVw())) {
            return new Connector(colorSpace, colorSpace2, i2, oVar);
        }
        x.d(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        x.d(colorSpace2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i2, oVar);
    }

    public static final float[] inverse3x3(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float[] fArr2 = new float[fArr.length];
        float f14 = (f2 * f11) + (f3 * f12) + (f4 * f13);
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final float[] mul3x3(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length >= 9 && fArr2.length >= 9) {
            float f2 = fArr[0] * fArr2[0];
            float f3 = fArr[3];
            float f4 = fArr2[1];
            float f5 = fArr[6];
            float f6 = fArr2[2];
            fArr3[0] = f2 + (f3 * f4) + (f5 * f6);
            float f7 = fArr[1];
            float f8 = fArr2[0];
            float f9 = fArr[4];
            float f10 = fArr[7];
            fArr3[1] = (f7 * f8) + (f4 * f9) + (f10 * f6);
            float f11 = fArr[2] * f8;
            float f12 = fArr[5];
            float f13 = fArr2[1] * f12;
            float f14 = fArr[8];
            fArr3[2] = f11 + f13 + (f6 * f14);
            float f15 = fArr[0];
            float f16 = fArr2[3] * f15;
            float f17 = fArr2[4];
            float f18 = fArr2[5];
            fArr3[3] = f16 + (f3 * f17) + (f5 * f18);
            float f19 = fArr[1];
            float f20 = fArr2[3];
            fArr3[4] = (f19 * f20) + (f9 * f17) + (f10 * f18);
            float f21 = fArr[2];
            fArr3[5] = (f20 * f21) + (f12 * fArr2[4]) + (f18 * f14);
            float f22 = f15 * fArr2[6];
            float f23 = fArr[3];
            float f24 = fArr2[7];
            float f25 = fArr2[8];
            fArr3[6] = f22 + (f23 * f24) + (f5 * f25);
            float f26 = fArr2[6];
            fArr3[7] = (f19 * f26) + (fArr[4] * f24) + (f10 * f25);
            fArr3[8] = (f21 * f26) + (fArr[5] * fArr2[7]) + (f14 * f25);
        }
        return fArr3;
    }

    public static final float[] mul3x3Diag(float[] fArr, float[] fArr2) {
        float f2 = fArr[0];
        float f3 = fArr2[0] * f2;
        float f4 = fArr[1];
        float f5 = fArr2[1] * f4;
        float f6 = fArr[2];
        return new float[]{f3, f5, fArr2[2] * f6, fArr2[3] * f2, fArr2[4] * f4, fArr2[5] * f6, f2 * fArr2[6], f4 * fArr2[7], f6 * fArr2[8]};
    }

    public static final float[] mul3x3Float3(float[] fArr, float[] fArr2) {
        if (fArr.length >= 9 && fArr2.length >= 3) {
            float f2 = fArr2[0];
            float f3 = fArr2[1];
            float f4 = fArr2[2];
            fArr2[0] = (fArr[0] * f2) + (fArr[3] * f3) + (fArr[6] * f4);
            fArr2[1] = (fArr[1] * f2) + (fArr[4] * f3) + (fArr[7] * f4);
            fArr2[2] = (fArr[2] * f2) + (fArr[5] * f3) + (fArr[8] * f4);
        }
        return fArr2;
    }

    public static final float mul3x3Float3_0(float[] fArr, float f2, float f3, float f4) {
        return (fArr[0] * f2) + (fArr[3] * f3) + (fArr[6] * f4);
    }

    public static final float mul3x3Float3_1(float[] fArr, float f2, float f3, float f4) {
        return (fArr[1] * f2) + (fArr[4] * f3) + (fArr[7] * f4);
    }

    public static final float mul3x3Float3_2(float[] fArr, float f2, float f3, float f4) {
        return (fArr[2] * f2) + (fArr[5] * f3) + (fArr[8] * f4);
    }

    public static final double rcpResponse(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return d2 >= d6 * d5 ? (Math.pow(d2 - d7, 1.0d / d9) - d4) / d3 : (d2 - d8) / d5;
    }

    public static final double response(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return d2 >= d6 ? Math.pow((d3 * d2) + d4, d9) + d7 : (d5 * d2) + d8;
    }

    public static final double response(double d2, double d3, double d4, double d5, double d6, double d7) {
        return d2 >= d6 ? Math.pow((d3 * d2) + d4, d7) : d5 * d2;
    }

    public static final double rcpResponse(double d2, double d3, double d4, double d5, double d6, double d7) {
        return d2 >= d6 * d5 ? (Math.pow(d2, 1.0d / d7) - d4) / d3 : d2 / d5;
    }

    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint) {
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }

    public static final boolean compare(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean compare(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (Float.compare(fArr[i2], fArr2[i2]) != 0 && Math.abs(fArr[i2] - fArr2[i2]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
