package androidx.compose.ui.graphics.colorspace;

import androidx.camera.video.AudioStats;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ColorSpaces {
    public static final int $stable;
    private static final Rgb Aces;
    private static final Rgb Acescg;
    private static final Rgb AdobeRgb;
    private static final Rgb Bt2020;
    private static final Rgb Bt2020Hlg;
    private static final TransferParameters Bt2020HlgTransferParameters;
    private static final Rgb Bt2020Pq;
    private static final TransferParameters Bt2020PqTransferParameters;
    private static final float[] Bt2020Primaries;
    private static final Rgb Bt709;
    private static final ColorSpace CieLab;
    private static final ColorSpace CieXyz;
    private static final ColorSpace[] ColorSpacesArray;
    private static final Rgb DciP3;
    private static final Rgb DisplayP3;
    private static final Rgb ExtendedSrgb;
    public static final ColorSpaces INSTANCE = new ColorSpaces();
    private static final Rgb LinearExtendedSrgb;
    private static final Rgb LinearSrgb;
    private static final TransferParameters NoneTransferParameters;
    private static final Rgb Ntsc1953;
    private static final float[] Ntsc1953Primaries;
    private static final ColorSpace Oklab;
    private static final Rgb ProPhotoRgb;
    private static final Rgb SmpteC;
    private static final Rgb Srgb;
    private static final float[] SrgbPrimaries;
    private static final TransferParameters SrgbTransferParameters;
    private static final Rgb Unspecified;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        SrgbPrimaries = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Ntsc1953Primaries = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        Bt2020Primaries = fArr3;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null);
        SrgbTransferParameters = transferParameters;
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null);
        NoneTransferParameters = transferParameters2;
        TransferParameters transferParameters3 = new TransferParameters(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        Bt2020HlgTransferParameters = transferParameters3;
        TransferParameters transferParameters4 = new TransferParameters(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        Bt2020PqTransferParameters = transferParameters4;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, Illuminant.INSTANCE.getD65(), transferParameters, 0);
        Srgb = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, Illuminant.INSTANCE.getD65(), 1.0d, 0.0f, 1.0f, 1);
        LinearSrgb = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, Illuminant.INSTANCE.getD65(), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.ColorSpaces$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return ColorSpaceKt.absRcpResponse(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.ColorSpaces$$ExternalSyntheticLambda1
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return ColorSpaceKt.absResponse(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
            }
        }, -0.799f, 2.399f, transferParameters, 2);
        ExtendedSrgb = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, Illuminant.INSTANCE.getD65(), 1.0d, -0.5f, 7.499f, 3);
        LinearExtendedSrgb = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, Illuminant.INSTANCE.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null), 4);
        Bt709 = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, Illuminant.INSTANCE.getD65(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null), 5);
        Bt2020 = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        DciP3 = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, Illuminant.INSTANCE.getD65(), transferParameters, 7);
        DisplayP3 = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, Illuminant.INSTANCE.getC(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null), 8);
        Ntsc1953 = rgb9;
        double d2 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double d3 = AudioStats.AUDIO_AMPLITUDE_NONE;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, Illuminant.INSTANCE.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, d2, d3, 96, null), 9);
        SmpteC = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, Illuminant.INSTANCE.getD65(), 2.2d, 0.0f, 1.0f, 10);
        AdobeRgb = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, Illuminant.INSTANCE.getD50(), new TransferParameters(1.8d, 1.0d, AudioStats.AUDIO_AMPLITUDE_NONE, 0.0625d, 0.031248d, d3, AudioStats.AUDIO_AMPLITUDE_NONE, 96, null), 11);
        ProPhotoRgb = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, Illuminant.INSTANCE.getD60(), 1.0d, -65504.0f, 65504.0f, 12);
        Aces = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, Illuminant.INSTANCE.getD60(), 1.0d, -65504.0f, 65504.0f, 13);
        Acescg = rgb14;
        Xyz xyz = new Xyz("Generic XYZ", 14);
        CieXyz = xyz;
        Lab lab = new Lab("Generic L*a*b*", 15);
        CieLab = lab;
        Rgb rgb15 = new Rgb("None", fArr, Illuminant.INSTANCE.getD65(), transferParameters2, 16);
        Unspecified = rgb15;
        Rgb rgb16 = new Rgb("Hybrid Log Gamma encoding", fArr3, Illuminant.INSTANCE.getD65(), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.ColorSpaces$$ExternalSyntheticLambda2
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d4) {
                return ColorSpaces.INSTANCE.transferHlgOetf$ui_graphics(ColorSpaces.Bt2020HlgTransferParameters, d4);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.ColorSpaces$$ExternalSyntheticLambda3
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d4) {
                return ColorSpaces.INSTANCE.transferHlgEotf$ui_graphics(ColorSpaces.Bt2020HlgTransferParameters, d4);
            }
        }, 0.0f, 1.0f, transferParameters3, 17);
        Bt2020Hlg = rgb16;
        Rgb rgb17 = new Rgb("Perceptual Quantizer encoding", fArr3, Illuminant.INSTANCE.getD65(), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.ColorSpaces$$ExternalSyntheticLambda4
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d4) {
                return ColorSpaces.INSTANCE.transferSt2048Oetf$ui_graphics(ColorSpaces.Bt2020PqTransferParameters, d4);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.ColorSpaces$$ExternalSyntheticLambda5
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d4) {
                return ColorSpaces.INSTANCE.transferSt2048Eotf$ui_graphics(ColorSpaces.Bt2020PqTransferParameters, d4);
            }
        }, 0.0f, 1.0f, transferParameters4, 18);
        Bt2020Pq = rgb17;
        Oklab oklab = new Oklab("Oklab", 19);
        Oklab = oklab;
        ColorSpacesArray = new ColorSpace[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, xyz, lab, rgb15, rgb16, rgb17, oklab};
        $stable = 8;
    }

    private ColorSpaces() {
    }

    public final Rgb getAces() {
        return Aces;
    }

    public final Rgb getAcescg() {
        return Acescg;
    }

    public final Rgb getAdobeRgb() {
        return AdobeRgb;
    }

    public final Rgb getBt2020() {
        return Bt2020;
    }

    public final Rgb getBt2020Hlg() {
        return Bt2020Hlg;
    }

    public final TransferParameters getBt2020HlgTransferParameters$ui_graphics() {
        return Bt2020HlgTransferParameters;
    }

    public final Rgb getBt2020Pq() {
        return Bt2020Pq;
    }

    public final TransferParameters getBt2020PqTransferParameters$ui_graphics() {
        return Bt2020PqTransferParameters;
    }

    public final float[] getBt2020Primaries$ui_graphics() {
        return Bt2020Primaries;
    }

    public final Rgb getBt709() {
        return Bt709;
    }

    public final ColorSpace getCieLab() {
        return CieLab;
    }

    public final ColorSpace getCieXyz() {
        return CieXyz;
    }

    public final ColorSpace getColorSpace$ui_graphics(int i2) {
        return getColorSpacesArray$ui_graphics()[i2];
    }

    public final ColorSpace[] getColorSpacesArray$ui_graphics() {
        return ColorSpacesArray;
    }

    public final Rgb getDciP3() {
        return DciP3;
    }

    public final Rgb getDisplayP3() {
        return DisplayP3;
    }

    public final Rgb getExtendedSrgb() {
        return ExtendedSrgb;
    }

    public final Rgb getLinearExtendedSrgb() {
        return LinearExtendedSrgb;
    }

    public final Rgb getLinearSrgb() {
        return LinearSrgb;
    }

    public final Rgb getNtsc1953() {
        return Ntsc1953;
    }

    public final float[] getNtsc1953Primaries$ui_graphics() {
        return Ntsc1953Primaries;
    }

    public final ColorSpace getOklab() {
        return Oklab;
    }

    public final Rgb getProPhotoRgb() {
        return ProPhotoRgb;
    }

    public final Rgb getSmpteC() {
        return SmpteC;
    }

    public final Rgb getSrgb() {
        return Srgb;
    }

    public final float[] getSrgbPrimaries$ui_graphics() {
        return SrgbPrimaries;
    }

    public final TransferParameters getSrgbTransferParameters$ui_graphics() {
        return SrgbTransferParameters;
    }

    public final Rgb getUnspecified$ui_graphics() {
        return Unspecified;
    }

    public final ColorSpace match(float[] fArr, TransferParameters transferParameters) {
        for (ColorSpace colorSpace : ColorSpacesArray) {
            if (ColorModel.m8690equalsimpl0(colorSpace.m8699getModelxdoWZVw(), ColorModel.Companion.m8697getRgbxdoWZVw())) {
                ColorSpace colorSpaceAdapt$default = ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null);
                x.d(colorSpaceAdapt$default, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                Rgb rgb = (Rgb) colorSpaceAdapt$default;
                if (ColorSpaceKt.compare(fArr, rgb.getTransform$ui_graphics()) && ColorSpaceKt.compare(transferParameters, rgb.getTransferParameters())) {
                    return colorSpace;
                }
            }
        }
        return null;
    }

    public final double transferHlgEotf$ui_graphics(TransferParameters transferParameters, double d2) {
        double a2 = transferParameters.getA();
        double b2 = transferParameters.getB();
        double c2 = transferParameters.getC();
        double d3 = transferParameters.getD();
        double e2 = transferParameters.getE();
        double f2 = transferParameters.getF() + 1.0d;
        double d4 = d2 < AudioStats.AUDIO_AMPLITUDE_NONE ? -1.0d : 1.0d;
        double d5 = d2 * d4;
        double d6 = a2 * d5;
        return f2 * d4 * (d6 <= 1.0d ? Math.pow(d6, b2) : Math.exp((d5 - e2) * c2) + d3);
    }

    public final double transferHlgOetf$ui_graphics(TransferParameters transferParameters, double d2) {
        double a2 = 1.0d / transferParameters.getA();
        double b2 = 1.0d / transferParameters.getB();
        double c2 = 1.0d / transferParameters.getC();
        double d3 = transferParameters.getD();
        double e2 = transferParameters.getE();
        double f2 = transferParameters.getF() + 1.0d;
        double d4 = d2 < AudioStats.AUDIO_AMPLITUDE_NONE ? -1.0d : 1.0d;
        double d5 = (d2 * d4) / f2;
        return d4 * (d5 <= 1.0d ? a2 * Math.pow(d5, b2) : (c2 * Math.log(d5 - d3)) + e2);
    }

    public final double transferSt2048Eotf$ui_graphics(TransferParameters transferParameters, double d2) {
        double d3 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double d4 = d2 < AudioStats.AUDIO_AMPLITUDE_NONE ? -1.0d : 1.0d;
        double d5 = d2 * d4;
        double a2 = transferParameters.getA() + (transferParameters.getB() * Math.pow(d5, transferParameters.getC()));
        double d6 = transferParameters.getD() + (transferParameters.getE() * Math.pow(d5, transferParameters.getC()));
        if (a2 >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            d3 = a2;
        }
        return d4 * Math.pow(d3 / d6, transferParameters.getF());
    }

    public final double transferSt2048Oetf$ui_graphics(TransferParameters transferParameters, double d2) {
        double d3 = -transferParameters.getA();
        double d4 = transferParameters.getD();
        double f2 = 1.0d / transferParameters.getF();
        double b2 = transferParameters.getB();
        double d5 = -transferParameters.getE();
        double c2 = 1.0d / transferParameters.getC();
        double d6 = d2 < AudioStats.AUDIO_AMPLITUDE_NONE ? -1.0d : 1.0d;
        double d7 = d2 * d6;
        return d6 * Math.pow(Math.max(d3 + (d4 * Math.pow(d7, f2)), AudioStats.AUDIO_AMPLITUDE_NONE) / (b2 + (d5 * Math.pow(d7, f2))), c2);
    }
}
