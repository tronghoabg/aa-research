package androidx.compose.material3.internal.colorUtil;

import androidx.camera.video.AudioStats;
import androidx.core.graphics.ColorUtils;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CamUtils {
    public static final CamUtils INSTANCE = new CamUtils();
    private static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    private static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    private static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};
    private static final double[][] SRGB_TO_XYZ = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    private static final double[][] XYZ_TO_SRGB = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final int $stable = 8;

    private CamUtils() {
    }

    private final int argbFromRgb(int i2, int i3, int i4) {
        return ((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255);
    }

    private final int argbFromXyz(double d2, double d3, double d4) {
        double[][] dArr = XYZ_TO_SRGB;
        double[] dArr2 = dArr[0];
        double d5 = dArr2[0] * d2;
        double d6 = dArr2[1] * d3;
        double d7 = dArr2[2] * d4;
        double[] dArr3 = dArr[1];
        double d8 = dArr3[0] * d2;
        double d9 = dArr3[1] * d3;
        double d10 = dArr3[2] * d4;
        double[] dArr4 = dArr[2];
        double d11 = dArr4[0] * d2;
        double d12 = dArr4[1] * d3;
        return argbFromRgb(delinearized(d5 + d6 + d7), delinearized(d8 + d9 + d10), delinearized(d11 + d12 + (dArr4[2] * d4)));
    }

    private final int clampInt(int i2, int i3, int i4) {
        return i4 < i2 ? i2 : i4 > i3 ? i3 : i4;
    }

    private final int delinearized(double d2) {
        double d3 = d2 / 100.0d;
        return clampInt(0, 255, (int) Math.round((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    private final float linearized(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    private final float lstarFromY(float f2) {
        float f3 = f2 / 100.0f;
        return f3 <= 0.008856452f ? f3 * 903.2963f : (((float) Math.cbrt(f3)) * 116.0f) - 16.0f;
    }

    private final float yFromInt(int i2) {
        double dLinearized = linearized((i2 >> 16) & 255);
        int i3 = i2 & 255;
        float fLinearized = linearized((i2 >> 8) & 255);
        float fLinearized2 = linearized(i3);
        double[] dArr = SRGB_TO_XYZ[1];
        return (float) ((dLinearized * dArr[0]) + (fLinearized * dArr[1]) + (fLinearized2 * dArr[2]));
    }

    public final int argbFromLinrgbComponents(double d2, double d3, double d4) {
        return argbFromRgb(delinearized(d2), delinearized(d3), delinearized(d4));
    }

    public final int argbFromLstar(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d3 * d3 * d3;
        double d5 = d2 > 8.0d ? d4 : d2 / 903.2962962962963d;
        boolean z = d4 > 0.008856451679035631d;
        double d6 = z ? d4 : d2 / 903.2962962962963d;
        if (!z) {
            d4 = d2 / 903.2962962962963d;
        }
        float[] fArr = WHITE_POINT_D65;
        return argbFromXyz(d6 * fArr[0], d5 * fArr[1], d4 * fArr[2]);
    }

    public final float[][] getCAM16RGB_TO_XYZ() {
        return CAM16RGB_TO_XYZ;
    }

    public final float[] getWHITE_POINT_D65() {
        return WHITE_POINT_D65;
    }

    public final float[][] getXYZ_TO_CAM16RGB() {
        return XYZ_TO_CAM16RGB;
    }

    public final int intFromLstar(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (16.0f + f2) / 116.0f;
        float f4 = f3 * f3 * f3;
        float f5 = f2 > 8.0f ? f4 : f2 / 903.2963f;
        boolean z = f4 > 0.008856452f;
        float f6 = z ? f4 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return ColorUtils.XYZToColor(f6 * fArr[0], f5 * fArr[1], f4 * fArr[2]);
    }

    public final float lstarFromInt(int i2) {
        return lstarFromY(yFromInt(i2));
    }

    public final int signum(double d2) {
        if (d2 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            return -1;
        }
        return d2 != AudioStats.AUDIO_AMPLITUDE_NONE ? 1 : 0;
    }

    public final float[] xyzFromInt(int i2) {
        double dLinearized = linearized((i2 >> 16) & 255);
        float fLinearized = linearized((i2 >> 8) & 255);
        float fLinearized2 = linearized(i2 & 255);
        double[][] dArr = SRGB_TO_XYZ;
        double[] dArr2 = dArr[0];
        double d2 = dArr2[0] * dLinearized;
        double d3 = fLinearized;
        double d4 = dArr2[1] * d3;
        double d5 = fLinearized2;
        double d6 = dArr2[2] * d5;
        double[] dArr3 = dArr[1];
        double d7 = dArr3[0] * dLinearized;
        double d8 = dArr3[1] * d3;
        double d9 = dArr3[2] * d5;
        double[] dArr4 = dArr[2];
        return new float[]{(float) (d2 + d4 + d6), (float) (d7 + d8 + d9), (float) ((dLinearized * dArr4[0]) + (d3 * dArr4[1]) + (d5 * dArr4[2]))};
    }

    public final double yFromLstar(double d2) {
        return d2 > 8.0d ? Math.pow((d2 + 16.0d) / 116.0d, 3.0d) * 100.0d : (d2 / 903.2962962962963d) * 100.0d;
    }
}
