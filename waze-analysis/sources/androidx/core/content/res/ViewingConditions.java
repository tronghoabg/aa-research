package androidx.core.content.res;

import androidx.camera.video.AudioStats;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ViewingConditions {
    static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((CamUtils.yFromLStar(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    private ViewingConditions(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.mN = f2;
        this.mAw = f3;
        this.mNbb = f4;
        this.mNcb = f5;
        this.mC = f6;
        this.mNc = f7;
        this.mRgbD = fArr;
        this.mFl = f8;
        this.mFlRoot = f9;
        this.mZ = f10;
    }

    static ViewingConditions make(float[] fArr, float f2, float f3, float f4, boolean z) {
        char c2;
        float fLerp;
        float f5;
        float fExp;
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f6 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f7 = fArr3[0] * f6;
        float f8 = fArr[1];
        float f9 = fArr3[1] * f8;
        float f10 = fArr[2];
        float f11 = fArr3[2] * f10;
        float[] fArr4 = fArr2[1];
        float f12 = fArr4[0] * f6;
        float f13 = fArr4[1] * f8;
        float f14 = fArr4[2] * f10;
        float[] fArr5 = fArr2[2];
        float f15 = f6 * fArr5[0];
        float f16 = f8 * fArr5[1];
        float f17 = f10 * fArr5[2];
        float f18 = (f4 / 10.0f) + 0.8f;
        if (f18 >= 0.9d) {
            c2 = 1;
            fLerp = CamUtils.lerp(0.59f, 0.69f, ((-0.9f) + f18) * 10.0f);
        } else {
            c2 = 1;
            fLerp = CamUtils.lerp(0.525f, 0.59f, ((-0.8f) + f18) * 10.0f);
        }
        float f19 = fLerp;
        if (z) {
            f5 = 1.0f;
            fExp = 1.0f;
        } else {
            f5 = 1.0f;
            fExp = (1.0f - (((float) Math.exp(((-f2) - 42.0f) / 92.0f)) * 0.2777778f)) * f18;
        }
        double d2 = fExp;
        if (d2 > 1.0d) {
            fExp = f5;
        } else if (d2 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            fExp = 0.0f;
        }
        float f20 = f7 + f9 + f11;
        float[] fArr6 = new float[3];
        fArr6[0] = (((100.0f / f20) * fExp) + f5) - fExp;
        fArr6[c2] = (((100.0f / ((f12 + f13) + f14)) * fExp) + f5) - fExp;
        fArr6[2] = (((100.0f / ((f15 + f16) + f17)) * fExp) + f5) - fExp;
        float f21 = f5 / ((5.0f * f2) + f5);
        float f22 = f21 * f21 * f21 * f21;
        float f23 = f5 - f22;
        float fCbrt = (float) Math.cbrt(f2 * 5.0d);
        float fYFromLStar = CamUtils.yFromLStar(f3) / fArr[c2];
        double d3 = fYFromLStar;
        float fSqrt = (float) Math.sqrt(d3);
        float fPow = (float) Math.pow(d3, 0.2d);
        float f24 = (f22 * f2) + (0.1f * f23 * f23 * fCbrt);
        float fPow2 = (float) Math.pow(((fArr6[0] * f24) * f20) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((fArr6[c2] * f24) * r12) / 100.0d, 0.42d);
        float fPow4 = (float) Math.pow(((fArr6[2] * f24) * r3) / 100.0d, 0.42d);
        float[] fArr7 = new float[3];
        fArr7[0] = fPow2;
        fArr7[c2] = fPow3;
        fArr7[2] = fPow4;
        float f25 = fArr7[0];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[c2];
        float f28 = (f27 * 400.0f) / (f27 + 27.13f);
        float f29 = (400.0f * fPow4) / (fPow4 + 27.13f);
        float[] fArr8 = new float[3];
        fArr8[0] = f26;
        fArr8[c2] = f28;
        fArr8[2] = f29;
        float f30 = fArr8[0];
        float f31 = 0.725f / fPow;
        return new ViewingConditions(fYFromLStar, (f30 + f30 + fArr8[c2] + (f29 * 0.05f)) * f31, f31, f31, f19, f18, fArr6, f24, (float) Math.pow(f24, 0.25d), fSqrt + 1.48f);
    }

    float getAw() {
        return this.mAw;
    }

    float getC() {
        return this.mC;
    }

    float getFl() {
        return this.mFl;
    }

    float getFlRoot() {
        return this.mFlRoot;
    }

    float getN() {
        return this.mN;
    }

    float getNbb() {
        return this.mNbb;
    }

    float getNc() {
        return this.mNc;
    }

    float getNcb() {
        return this.mNcb;
    }

    float[] getRgbD() {
        return this.mRgbD;
    }

    float getZ() {
        return this.mZ;
    }
}
