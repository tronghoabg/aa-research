package androidx.compose.material3.internal.colorUtil;

import androidx.camera.video.AudioStats;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Frame {
    public static final int $stable;
    public static final Companion Companion;
    private static final Frame Default;
    private final float aw;

    /* renamed from: c, reason: collision with root package name */
    private final float f1667c;
    private final float fl;
    private final float flRoot;
    private final float n;
    private final float nbb;
    private final float nc;
    private final float ncb;
    private final float[] rgbD;
    private final float z;

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        $stable = 8;
        Default = companion.make(CamUtils.INSTANCE.getWHITE_POINT_D65(), (float) ((CamUtils.INSTANCE.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    private Frame(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.n = f2;
        this.aw = f3;
        this.nbb = f4;
        this.ncb = f5;
        this.f1667c = f6;
        this.nc = f7;
        this.rgbD = fArr;
        this.fl = f8;
        this.flRoot = f9;
        this.z = f10;
    }

    public final float getAw() {
        return this.aw;
    }

    public final float getC() {
        return this.f1667c;
    }

    public final float getFl() {
        return this.fl;
    }

    public final float getFlRoot() {
        return this.flRoot;
    }

    public final float getN() {
        return this.n;
    }

    public final float getNbb() {
        return this.nbb;
    }

    public final float getNc() {
        return this.nc;
    }

    public final float getNcb() {
        return this.ncb;
    }

    public final float[] getRgbD() {
        return this.rgbD;
    }

    public final float getZ() {
        return this.z;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Frame getDefault() {
            return Frame.Default;
        }

        public final Frame make(float[] fArr, float f2, float f3, float f4, boolean z) {
            float f5;
            float fExp;
            float[][] xyz_to_cam16rgb = CamUtils.INSTANCE.getXYZ_TO_CAM16RGB();
            float f6 = fArr[0];
            float[] fArr2 = xyz_to_cam16rgb[0];
            float f7 = fArr2[0] * f6;
            float f8 = fArr[1];
            float f9 = fArr2[1] * f8;
            float f10 = fArr[2];
            float f11 = fArr2[2] * f10;
            float[] fArr3 = xyz_to_cam16rgb[1];
            float f12 = fArr3[0] * f6;
            float f13 = fArr3[1] * f8;
            float f14 = fArr3[2] * f10;
            float[] fArr4 = xyz_to_cam16rgb[2];
            float f15 = f6 * fArr4[0];
            float f16 = f8 * fArr4[1];
            float f17 = f10 * fArr4[2];
            float f18 = (f4 / 10.0f) + 0.8f;
            float fLerp = ((double) f18) >= 0.9d ? Frame_androidKt.lerp(0.59f, 0.69f, ((-0.9f) + f18) * 10.0f) : Frame_androidKt.lerp(0.525f, 0.59f, ((-0.8f) + f18) * 10.0f);
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
            float f19 = f12 + f13 + f14;
            float f20 = f7 + f9 + f11;
            float[] fArr5 = {(((100.0f / f20) * fExp) + f5) - fExp, (((100.0f / f19) * fExp) + f5) - fExp, (((100.0f / ((f15 + f16) + f17)) * fExp) + f5) - fExp};
            float f21 = f5 / ((5.0f * f2) + f5);
            float f22 = f21 * f21 * f21 * f21;
            float f23 = f5 - f22;
            float fCbrt = (float) Math.cbrt(f2 * 5.0d);
            float fYFromLstar = ((float) CamUtils.INSTANCE.yFromLstar(f3)) / fArr[1];
            double d3 = fYFromLstar;
            float fSqrt = (float) Math.sqrt(d3);
            float fPow = (float) Math.pow(d3, 0.20000000298023224d);
            float f24 = (f22 * f2) + (0.1f * f23 * f23 * fCbrt);
            float fPow2 = (float) Math.pow(((fArr5[0] * f24) * f20) / 100.0f, 0.41999998688697815d);
            float fPow3 = (float) Math.pow(((fArr5[1] * f24) * f19) / 100.0f, 0.41999998688697815d);
            float fPow4 = (float) Math.pow(((fArr5[2] * f24) * r3) / 100.0f, 0.41999998688697815d);
            float[] fArr6 = {fPow2, fPow3, fPow4};
            float f25 = fArr6[0];
            float f26 = (f25 * 400.0f) / (f25 + 27.13f);
            float f27 = fArr6[1];
            float f28 = (400.0f * fPow4) / (fPow4 + 27.13f);
            float[] fArr7 = {f26, (f27 * 400.0f) / (f27 + 27.13f), f28};
            float f29 = fArr7[0];
            float f30 = 0.725f / fPow;
            return new Frame(fYFromLstar, (f29 + f29 + fArr7[1] + (f28 * 0.05f)) * f30, f30, f30, fLerp, f18, fArr5, f24, (float) Math.pow(f24, 0.25d), fSqrt + 1.48f, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ Frame(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10, o oVar) {
        this(f2, f3, f4, f5, f6, f7, fArr, f8, f9, f10);
    }
}
