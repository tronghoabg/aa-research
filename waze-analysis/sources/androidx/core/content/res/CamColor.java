package androidx.core.content.res;

import androidx.camera.video.AudioStats;
import androidx.core.graphics.ColorUtils;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    CamColor(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.mHue = f2;
        this.mChroma = f3;
        this.mJ = f4;
        this.mQ = f5;
        this.mM = f6;
        this.mS = f7;
        this.mJstar = f8;
        this.mAstar = f9;
        this.mBstar = f10;
    }

    private static CamColor findCamByJ(float f2, float f3, float f4) {
        CamColor camColor = null;
        float f5 = 1000.0f;
        float f6 = 100.0f;
        float f7 = 0.0f;
        float f8 = 1000.0f;
        while (Math.abs(f7 - f6) > 0.01f) {
            float f9 = ((f6 - f7) / 2.0f) + f7;
            int iViewedInSrgb = fromJch(f9, f3, f2).viewedInSrgb();
            float fLStarFromInt = CamUtils.lStarFromInt(iViewedInSrgb);
            float fAbs = Math.abs(f4 - fLStarFromInt);
            if (fAbs < 0.2f) {
                CamColor camColorFromColor = fromColor(iViewedInSrgb);
                float fDistance = camColorFromColor.distance(fromJch(camColorFromColor.getJ(), camColorFromColor.getChroma(), f2));
                if (fDistance <= 1.0f) {
                    camColor = camColorFromColor;
                    f5 = fAbs;
                    f8 = fDistance;
                }
            }
            if (f5 == 0.0f && f8 == 0.0f) {
                return camColor;
            }
            if (fLStarFromInt >= f4) {
                f6 = f9;
            }
            if (fLStarFromInt < f4) {
                f7 = f9;
            }
        }
        return camColor;
    }

    static CamColor fromColor(int i2) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        fromColorInViewingConditions(i2, ViewingConditions.DEFAULT, fArr, fArr2);
        return new CamColor(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void fromColorInViewingConditions(int i2, ViewingConditions viewingConditions, float[] fArr, float[] fArr2) {
        CamUtils.xyzFromInt(i2, fArr2);
        float[][] fArr3 = CamUtils.XYZ_TO_CAM16RGB;
        float f2 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f3 = fArr4[0] * f2;
        float f4 = fArr2[1];
        float f5 = fArr4[1] * f4;
        float f6 = fArr2[2];
        float f7 = fArr4[2] * f6;
        float[] fArr5 = fArr3[1];
        float f8 = fArr5[0] * f2;
        float f9 = fArr5[1] * f4;
        float f10 = fArr5[2] * f6;
        float[] fArr6 = fArr3[2];
        float f11 = f2 * fArr6[0];
        float f12 = f4 * fArr6[1];
        float f13 = f6 * fArr6[2];
        float f14 = viewingConditions.getRgbD()[0] * (f3 + f5 + f7);
        float f15 = viewingConditions.getRgbD()[1] * (f8 + f9 + f10);
        float f16 = viewingConditions.getRgbD()[2] * (f11 + f12 + f13);
        float fPow = (float) Math.pow((viewingConditions.getFl() * Math.abs(f14)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f15)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((viewingConditions.getFl() * Math.abs(f16)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f14) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f15) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f16) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d2 = fSignum3;
        float fAtan2 = (((float) Math.atan2(((float) ((fSignum + fSignum2) - (d2 + d2))) / 9.0f, ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d2)) / 11.0f)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = fSignum2 * 20.0f;
        float f18 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((((((40.0f * fSignum) + f17) + fSignum3) / 20.0f) * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float c2 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float f19 = (((fSignum * 20.0f) + f17) + (fSignum3 * 21.0f)) / 20.0f;
        float fCos = ((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float fSqrt = (float) Math.sqrt((r2 * r2) + (r6 * r6));
        float fSqrt2 = ((float) Math.sqrt(fPow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((fCos * fSqrt) / (f19 + 0.305f), 0.9d));
        float flRoot = viewingConditions.getFlRoot() * fSqrt2;
        float fSqrt3 = (float) Math.sqrt((r5 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f));
        float f20 = 1.7f * fPow4;
        float f21 = 0.007f * fPow4;
        float fLog = (float) Math.log((0.0228f * flRoot) + 1.0f);
        double d3 = f18;
        float fCos2 = (float) Math.cos(d3);
        float fSin = (float) Math.sin(d3);
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt2;
        if (fArr != null) {
            float f22 = fLog * 43.85965f;
            fArr[0] = fPow4;
            fArr[1] = c2;
            fArr[2] = flRoot;
            fArr[3] = fSqrt3 * 50.0f;
            fArr[4] = f20 / (f21 + 1.0f);
            fArr[5] = f22 * fCos2;
            fArr[6] = fSin * f22;
        }
    }

    private static CamColor fromJch(float f2, float f3, float f4) {
        return fromJchInFrame(f2, f3, f4, ViewingConditions.DEFAULT);
    }

    private static CamColor fromJchInFrame(float f2, float f3, float f4, ViewingConditions viewingConditions) {
        float c2 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(f2 / 100.0d)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = viewingConditions.getFlRoot() * f3;
        float fSqrt = (float) Math.sqrt(((f3 / ((float) Math.sqrt(r4))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f));
        double d2 = (3.1415927f * f4) / 180.0f;
        float fLog = ((float) Math.log((flRoot * 0.0228d) + 1.0d)) * 43.85965f;
        return new CamColor(f4, f3, f2, c2, flRoot, fSqrt * 50.0f, (1.7f * f2) / ((0.007f * f2) + 1.0f), ((float) Math.cos(d2)) * fLog, fLog * ((float) Math.sin(d2)));
    }

    public static void getM3HCTfromColor(int i2, float[] fArr) {
        fromColorInViewingConditions(i2, ViewingConditions.DEFAULT, null, fArr);
        fArr[2] = CamUtils.lStarFromInt(i2);
    }

    static int toColor(float f2, float f3, float f4, ViewingConditions viewingConditions) {
        if (f3 < 1.0d || Math.round(f4) <= AudioStats.AUDIO_AMPLITUDE_NONE || Math.round(f4) >= 100.0d) {
            return CamUtils.intFromLStar(f4);
        }
        float fMin = f2 < 0.0f ? 0.0f : Math.min(360.0f, f2);
        boolean z = true;
        CamColor camColor = null;
        float f5 = 0.0f;
        float f6 = f3;
        while (Math.abs(f5 - f3) >= CHROMA_SEARCH_ENDPOINT) {
            CamColor camColorFindCamByJ = findCamByJ(fMin, f6, f4);
            if (!z) {
                if (camColorFindCamByJ != null) {
                    camColor = camColorFindCamByJ;
                }
                if (camColorFindCamByJ != null) {
                    f5 = f6;
                }
                if (camColorFindCamByJ == null) {
                    f3 = f6;
                }
                f6 = ((f3 - f5) / 2.0f) + f5;
            } else {
                if (camColorFindCamByJ != null) {
                    return camColorFindCamByJ.viewed(viewingConditions);
                }
                f6 = ((f3 - f5) / 2.0f) + f5;
                z = false;
            }
        }
        return camColor == null ? CamUtils.intFromLStar(f4) : camColor.viewed(viewingConditions);
    }

    float distance(CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    float getAStar() {
        return this.mAstar;
    }

    float getBStar() {
        return this.mBstar;
    }

    float getChroma() {
        return this.mChroma;
    }

    float getHue() {
        return this.mHue;
    }

    float getJ() {
        return this.mJ;
    }

    float getJStar() {
        return this.mJstar;
    }

    float getM() {
        return this.mM;
    }

    float getQ() {
        return this.mQ;
    }

    float getS() {
        return this.mS;
    }

    int viewed(ViewingConditions viewingConditions) {
        float chroma = 0.0f;
        if (getChroma() != AudioStats.AUDIO_AMPLITUDE_NONE && getJ() != AudioStats.AUDIO_AMPLITUDE_NONE) {
            chroma = getChroma() / ((float) Math.sqrt(getJ() / 100.0d));
        }
        float fPow = (float) Math.pow(chroma / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        double dCos = Math.cos(2.0d + hue) + 3.8d;
        float aw = viewingConditions.getAw() * ((float) Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()));
        float nc = ((float) dCos) * 0.25f * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw / viewingConditions.getNbb();
        float fSin = (float) Math.sin(hue);
        float fCos = (float) Math.cos(hue);
        float f2 = (((0.305f + nbb) * 23.0f) * fPow) / (((nc * 23.0f) + ((11.0f * fPow) * fCos)) + ((108.0f * fPow) * fSin));
        float f3 = fCos * f2;
        float f4 = f2 * fSin;
        float f5 = nbb * 460.0f;
        float fMax = (float) Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, (Math.abs(r0) * 27.13d) / (400.0d - Math.abs(r0)));
        float fSignum = Math.signum((((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f) * (100.0f / viewingConditions.getFl());
        float fPow2 = (float) Math.pow(fMax, 2.380952380952381d);
        float fMax2 = (float) Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, (Math.abs(r10) * 27.13d) / (400.0d - Math.abs(r10)));
        float fSignum2 = Math.signum(((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f) * (100.0f / viewingConditions.getFl());
        float f6 = ((f5 - (f3 * 220.0f)) - (6300.0f * f4)) / 1403.0f;
        float fPow3 = (float) Math.pow(fMax2, 2.380952380952381d);
        float fMax3 = (float) Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, (Math.abs(f6) * 27.13d) / (400.0d - Math.abs(f6)));
        float fSignum3 = Math.signum(f6) * (100.0f / viewingConditions.getFl());
        float fPow4 = (float) Math.pow(fMax3, 2.380952380952381d);
        float f7 = (fSignum * fPow2) / viewingConditions.getRgbD()[0];
        float f8 = (fSignum2 * fPow3) / viewingConditions.getRgbD()[1];
        float f9 = (fSignum3 * fPow4) / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f10 = fArr2[0] * f7;
        float f11 = fArr2[1] * f8;
        float f12 = fArr2[2] * f9;
        float[] fArr3 = fArr[1];
        float f13 = fArr3[0] * f7;
        float f14 = fArr3[1] * f8;
        float f15 = fArr3[2] * f9;
        float[] fArr4 = fArr[2];
        return ColorUtils.XYZToColor(f10 + f11 + f12, f13 + f14 + f15, (f7 * fArr4[0]) + (f8 * fArr4[1]) + (f9 * fArr4[2]));
    }

    int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    public static int toColor(float f2, float f3, float f4) {
        return toColor(f2, f3, f4, ViewingConditions.DEFAULT);
    }
}
