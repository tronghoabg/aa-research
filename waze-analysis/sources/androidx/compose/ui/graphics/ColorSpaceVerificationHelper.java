package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import android.os.Build;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.compose.ui.graphics.colorspace.WhitePoint;
import androidx.core.util.HalfKt$$ExternalSyntheticApiModelOutline0;
import h.g.a.l;
import h.g.b.x;
import j$.util.function.DoubleUnaryOperator$CC;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ColorSpaceVerificationHelper {
    public static final ColorSpaceVerificationHelper INSTANCE = new ColorSpaceVerificationHelper();

    private ColorSpaceVerificationHelper() {
    }

    public static final ColorSpace androidColorSpace(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace.Rgb rgb;
        ColorSpace colorSpaceObtainAndroidColorSpace;
        ColorSpace colorSpaceObtainAndroidColorSpace2;
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getSrgb())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getAces())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getAcescg())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getAdobeRgb())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getBt2020())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getBt709())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getCieLab())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getCieXyz())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getDciP3())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getDisplayP3())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getLinearExtendedSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getLinearSrgb())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getNtsc1953())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getProPhotoRgb())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (x.n(colorSpace, ColorSpaces.INSTANCE.getSmpteC())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (colorSpaceObtainAndroidColorSpace2 = ColorSpaceVerificationHelperV34.obtainAndroidColorSpace(colorSpace)) != null) {
            return colorSpaceObtainAndroidColorSpace2;
        }
        if (Build.VERSION.SDK_INT >= 36 && (colorSpaceObtainAndroidColorSpace = ColorSpaceVerificationHelperV36.obtainAndroidColorSpace(colorSpace)) != null) {
            return colorSpaceObtainAndroidColorSpace;
        }
        if (!(colorSpace instanceof Rgb)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Rgb rgb2 = (Rgb) colorSpace;
        float[] xyz$ui_graphics = rgb2.getWhitePoint().toXyz$ui_graphics();
        TransferParameters transferParameters = rgb2.getTransferParameters();
        ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new ColorSpace.Rgb.TransferParameters(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma()) : null;
        float[] transform$ui_graphics = rgb2.getTransform$ui_graphics();
        if (transferParameters2 != null) {
            rgb = new ColorSpace.Rgb(colorSpace.getName(), rgb2.getPrimaries$ui_graphics(), xyz$ui_graphics, transferParameters2);
            if (!Float.isNaN(transform$ui_graphics[0]) && !Arrays.equals(rgb.getTransform(), transform$ui_graphics)) {
                rgb = new ColorSpace.Rgb(colorSpace.getName(), transform$ui_graphics, transferParameters2);
            }
        } else {
            String name = colorSpace.getName();
            float[] primaries$ui_graphics = rgb2.getPrimaries$ui_graphics();
            final l<Double, Double> oetf = rgb2.getOetf();
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda0
                public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                    return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                }

                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d2) {
                    return ((Number) oetf.invoke(Double.valueOf(d2))).doubleValue();
                }

                public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                    return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                }
            };
            final l<Double, Double> eotf = rgb2.getEotf();
            rgb = new ColorSpace.Rgb(name, primaries$ui_graphics, xyz$ui_graphics, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda1
                public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator2) {
                    return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                }

                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d2) {
                    return ((Number) eotf.invoke(Double.valueOf(d2))).doubleValue();
                }

                public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator2) {
                    return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                }
            }, rgb2.getMinValue(0), rgb2.getMaxValue(0));
        }
        return HalfKt$$ExternalSyntheticApiModelOutline0.m11752m((Object) rgb);
    }

    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace(final ColorSpace colorSpace) {
        Rgb srgb;
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return ColorSpaces.INSTANCE.getAces();
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        if (Build.VERSION.SDK_INT >= 34) {
            androidx.compose.ui.graphics.colorspace.ColorSpace colorSpaceObtainComposeColorSpaceFromId = ColorSpaceVerificationHelperV34.obtainComposeColorSpaceFromId(colorSpace.getId());
            if (!x.n(colorSpaceObtainComposeColorSpaceFromId, ColorSpaces.INSTANCE.getUnspecified$ui_graphics())) {
                return colorSpaceObtainComposeColorSpaceFromId;
            }
        }
        if (Build.VERSION.SDK_INT >= 36) {
            androidx.compose.ui.graphics.colorspace.ColorSpace colorSpaceObtainComposeColorSpaceFromId2 = ColorSpaceVerificationHelperV36.obtainComposeColorSpaceFromId(colorSpace.getId());
            if (!x.n(colorSpaceObtainComposeColorSpaceFromId2, ColorSpaces.INSTANCE.getUnspecified$ui_graphics())) {
                return colorSpaceObtainComposeColorSpaceFromId2;
            }
        }
        if (HalfKt$$ExternalSyntheticApiModelOutline0.m11764m((Object) colorSpace)) {
            ColorSpace.Rgb rgbM11750m = HalfKt$$ExternalSyntheticApiModelOutline0.m11750m((Object) colorSpace);
            ColorSpace.Rgb.TransferParameters transferParameters = rgbM11750m.getTransferParameters();
            srgb = new Rgb(rgbM11750m.getName(), rgbM11750m.getPrimaries(), rgbM11750m.getWhitePoint().length == 3 ? new WhitePoint(rgbM11750m.getWhitePoint()[0], rgbM11750m.getWhitePoint()[1], rgbM11750m.getWhitePoint()[2]) : new WhitePoint(rgbM11750m.getWhitePoint()[0], rgbM11750m.getWhitePoint()[1]), rgbM11750m.getTransform(), new DoubleFunction() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda2
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    return HalfKt$$ExternalSyntheticApiModelOutline0.m11750m((Object) colorSpace).getOetf().applyAsDouble(d2);
                }
            }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.ColorSpaceVerificationHelper$$ExternalSyntheticLambda3
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    return HalfKt$$ExternalSyntheticApiModelOutline0.m11750m((Object) colorSpace).getEotf().applyAsDouble(d2);
                }
            }, rgbM11750m.getMinValue(0), rgbM11750m.getMaxValue(0), transferParameters != null ? new TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null, rgbM11750m.getId());
        } else {
            srgb = ColorSpaces.INSTANCE.getSrgb();
        }
        return srgb;
    }
}
