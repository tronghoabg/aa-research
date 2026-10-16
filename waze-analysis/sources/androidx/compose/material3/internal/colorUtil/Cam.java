package androidx.compose.material3.internal.colorUtil;

import androidx.camera.video.AudioStats;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Cam {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float astar;
    private final float bstar;
    private final float chroma;
    private final float hue;

    /* renamed from: j, reason: collision with root package name */
    private final float f1666j;
    private float jstar;
    private final float m;
    private final float s;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public Cam(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.hue = f2;
        this.chroma = f3;
        this.f1666j = f4;
        this.m = f5;
        this.s = f6;
        this.jstar = f7;
        this.astar = f8;
        this.bstar = f9;
    }

    public final float distance(Cam cam) {
        float f2 = this.jstar - cam.jstar;
        float f3 = this.astar - cam.astar;
        float f4 = this.bstar - cam.bstar;
        return (float) (Math.pow(Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4)), 0.63d) * 1.41d);
    }

    public final float getAstar() {
        return this.astar;
    }

    public final float getBstar() {
        return this.bstar;
    }

    public final float getChroma() {
        return this.chroma;
    }

    public final float getHue() {
        return this.hue;
    }

    public final float getJ() {
        return this.f1666j;
    }

    public final float getJstar() {
        return this.jstar;
    }

    public final float getM() {
        return this.m;
    }

    public final float getS() {
        return this.s;
    }

    public final void setJstar(float f2) {
        this.jstar = f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int viewed(androidx.compose.material3.internal.colorUtil.Frame r15) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.colorUtil.Cam.viewed(androidx.compose.material3.internal.colorUtil.Frame):int");
    }

    public final int viewedInSrgb() {
        return viewed(Frame.Companion.getDefault());
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final Cam findCamByJ(float f2, float f3, float f4) {
            Cam cam = null;
            float f5 = 1000.0f;
            float f6 = 100.0f;
            float f7 = 0.0f;
            float f8 = 1000.0f;
            while (Math.abs(f7 - f6) > 0.009999999776482582d) {
                float f9 = ((f6 - f7) / 2.0f) + f7;
                int iViewedInSrgb = fromJch(f9, f3, f2).viewedInSrgb();
                float fLstarFromInt = CamUtils.INSTANCE.lstarFromInt(iViewedInSrgb);
                float fAbs = (float) Math.abs(f4 - fLstarFromInt);
                if (fAbs < 0.2f) {
                    Cam camFromInt = fromInt(iViewedInSrgb);
                    float fDistance = camFromInt.distance(fromJch(camFromInt.getJ(), camFromInt.getChroma(), f2));
                    if (fDistance <= 1.0f) {
                        cam = camFromInt;
                        f5 = fAbs;
                        f8 = fDistance;
                    }
                }
                if (f5 == 0.0f && f8 == 0.0f) {
                    return cam;
                }
                if (fLstarFromInt < f4) {
                    f7 = f9;
                } else {
                    f6 = f9;
                }
            }
            return cam;
        }

        private final Cam fromIntInFrame(int i2, Frame frame) {
            float[] fArrXyzFromInt = CamUtils.INSTANCE.xyzFromInt(i2);
            float[][] xyz_to_cam16rgb = CamUtils.INSTANCE.getXYZ_TO_CAM16RGB();
            float f2 = fArrXyzFromInt[0];
            float[] fArr = xyz_to_cam16rgb[0];
            float f3 = fArr[0] * f2;
            float f4 = fArrXyzFromInt[1];
            float f5 = fArr[1] * f4;
            float f6 = fArrXyzFromInt[2];
            float f7 = fArr[2] * f6;
            float[] fArr2 = xyz_to_cam16rgb[1];
            float f8 = fArr2[0] * f2;
            float f9 = fArr2[1] * f4;
            float f10 = fArr2[2] * f6;
            float[] fArr3 = xyz_to_cam16rgb[2];
            float f11 = f2 * fArr3[0];
            float f12 = f4 * fArr3[1];
            float f13 = f6 * fArr3[2];
            float f14 = frame.getRgbD()[0] * (f3 + f5 + f7);
            float f15 = frame.getRgbD()[1] * (f8 + f9 + f10);
            float f16 = frame.getRgbD()[2] * (f11 + f12 + f13);
            float fPow = (float) Math.pow((frame.getFl() * Math.abs(f14)) / 100.0f, 0.41999998688697815d);
            float fPow2 = (float) Math.pow((frame.getFl() * Math.abs(f15)) / 100.0f, 0.41999998688697815d);
            float fPow3 = (float) Math.pow((frame.getFl() * Math.abs(f16)) / 100.0f, 0.41999998688697815d);
            float fSignum = Math.signum(f15) * 400.0f * fPow2;
            float fSignum2 = Math.signum(f16) * 400.0f * fPow3;
            float fSignum3 = ((Math.signum(f14) * 400.0f) * fPow) / (fPow + 27.13f);
            float f17 = fSignum / (fPow2 + 27.13f);
            float f18 = fSignum2 / (27.13f + fPow3);
            float fAtan2 = (((float) Math.atan2(((fSignum3 + f17) - (f18 + f18)) / 9.0f, (((fSignum3 * 11.0f) + ((-12.0f) * f17)) + f18) / 11.0f)) * 180.0f) / 3.1415927f;
            if (fAtan2 < 0.0f) {
                fAtan2 += 360.0f;
            } else if (fAtan2 >= 360.0f) {
                fAtan2 -= 360.0f;
            }
            float f19 = fAtan2;
            float f20 = f17 * 20.0f;
            float f21 = (f19 * 3.1415927f) / 180.0f;
            float fPow4 = ((float) Math.pow((((((40.0f * fSignum3) + f20) + f18) / 20.0f) * frame.getNbb()) / frame.getAw(), frame.getC() * frame.getZ())) * 100.0f;
            float fPow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f19) < 20.14d ? 360.0f + f19 : f19) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * frame.getNc()) * frame.getNcb()) * ((float) Math.sqrt((r8 * r8) + (r0 * r0)))) / (((((fSignum3 * 20.0f) + f20) + (f18 * 21.0f)) / 20.0f) + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, frame.getN())), 0.7300000190734863d)) * ((float) Math.sqrt(fPow4 / 100.0f));
            float flRoot = fPow5 * frame.getFlRoot();
            float fSqrt = (float) Math.sqrt((r0 * frame.getC()) / (frame.getAw() + 4.0f));
            double d2 = f21;
            float fLog = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
            return new Cam(f19, fPow5, fPow4, flRoot, fSqrt * 50.0f, (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f), fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
        }

        private final Cam fromJch(float f2, float f3, float f4) {
            return fromJchInFrame(f2, f3, f4, Frame.Companion.getDefault());
        }

        private final Cam fromJchInFrame(float f2, float f3, float f4, Frame frame) {
            float flRoot = f3 * frame.getFlRoot();
            float fSqrt = (float) Math.sqrt(((f3 / ((float) Math.sqrt(f2 / 100.0d))) * frame.getC()) / (frame.getAw() + 4.0f));
            double d2 = (3.1415927f * f4) / 180.0f;
            float fLog = ((float) Math.log((flRoot * 0.0228d) + 1.0d)) * 43.85965f;
            return new Cam(f4, f3, f2, flRoot, fSqrt * 50.0f, (1.7f * f2) / ((0.007f * f2) + 1.0f), fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
        }

        private final int getInt(float f2, float f3, float f4, Frame frame) {
            double d2 = f3;
            if (x.n(frame, Frame.Companion.getDefault())) {
                return HctSolver.INSTANCE.solveToInt(f2, d2, f4);
            }
            if (d2 < 1.0d || Math.round(f4) <= AudioStats.AUDIO_AMPLITUDE_NONE || Math.round(f4) >= 100.0d) {
                return CamUtils.INSTANCE.intFromLstar(f4);
            }
            float fMin = f2 < 0.0f ? 0.0f : Math.min(360.0f, f2);
            boolean z = true;
            Cam cam = null;
            float f5 = 0.0f;
            float f6 = f3;
            while (Math.abs(f5 - f3) >= 0.4000000059604645d) {
                Cam camFindCamByJ = findCamByJ(fMin, f6, f4);
                if (!z) {
                    if (camFindCamByJ != null) {
                        cam = camFindCamByJ;
                    }
                    if (camFindCamByJ != null) {
                        f5 = f6;
                    }
                    if (camFindCamByJ == null) {
                        f3 = f6;
                    }
                    f6 = ((f3 - f5) / 2.0f) + f5;
                } else {
                    if (camFindCamByJ != null) {
                        return camFindCamByJ.viewed(frame);
                    }
                    f6 = ((f3 - f5) / 2.0f) + f5;
                    z = false;
                }
            }
            return cam == null ? CamUtils.INSTANCE.intFromLstar(f4) : cam.viewed(frame);
        }

        public final Cam fromInt(int i2) {
            return fromIntInFrame(i2, Frame.Companion.getDefault());
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final int getInt(float f2, float f3, float f4) {
            return getInt(f2, f3, f4, Frame.Companion.getDefault());
        }
    }
}
