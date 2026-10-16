package androidx.graphics.shapes;

import androidx.camera.video.AudioStats;
import h.a.i;
import h.g.b.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ArcConverter {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final List<Cubic> arcToBezier(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
            float f11 = f4;
            ArrayList arrayList = new ArrayList();
            float f12 = 4.0f;
            int iCeil = (int) Math.ceil(Math.abs((f10 * 4.0f) / 3.141592653589793d));
            double d2 = f8;
            float fCos = (float) Math.cos(d2);
            float fSin = (float) Math.sin(d2);
            float f13 = f9;
            double d3 = f13;
            float fCos2 = (float) Math.cos(d3);
            float fSin2 = (float) Math.sin(d3);
            float f14 = f5 * fCos;
            float f15 = -f11;
            float f16 = f15 * fSin;
            float f17 = (f16 * fSin2) + (f14 * fCos2);
            float f18 = f5 * fSin;
            float f19 = f15 * fCos;
            float f20 = (fSin2 * f19) - (fCos2 * f18);
            int i2 = 0;
            float f21 = f6;
            float f22 = f7;
            while (i2 < iCeil) {
                float f23 = f12;
                float f24 = (f10 / iCeil) + f13;
                int i3 = iCeil;
                float f25 = fSin;
                double d4 = f24;
                float fSin3 = (float) Math.sin(d4);
                float fCos3 = (float) Math.cos(d4);
                float f26 = f2 + (f11 * fCos * fCos3);
                float f27 = f3 + (f11 * f25 * fCos3);
                float fTan = (float) Math.tan(r5 / 2.0f);
                float fSin4 = (((float) Math.sin(f24 - f13)) * (((float) Math.sqrt(((fTan * 3.0f) * fTan) + f23)) - 1.0f)) / 3.0f;
                float f28 = (f16 * fSin3) + (f14 * fCos3);
                float f29 = f26 - (fSin3 * f18);
                float f30 = f27 + (f14 * fSin3);
                float f31 = (f19 * fSin3) - (f18 * fCos3);
                arrayList.add(CubicKt.Cubic(f21, f22, (f20 * fSin4) + f21, (f17 * fSin4) + f22, f29 - (fSin4 * f31), f30 - (fSin4 * f28), f29, f30));
                i2++;
                f12 = f23;
                f13 = f24;
                f17 = f28;
                f20 = f31;
                f21 = f29;
                f22 = f30;
                iCeil = i3;
                f11 = f4;
                fSin = f25;
            }
            return arrayList;
        }

        public final List<Cubic> arcToCubics(float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
            double d2;
            double d3;
            double d4 = (f8 / 180.0d) * 3.141592653589793d;
            double dCos = Math.cos(d4);
            double d5 = f3;
            double dSin = Math.sin(d4);
            double d6 = d5 * dSin;
            double d7 = f5;
            double d8 = f7;
            double d9 = (((-f2) * dSin) + (d5 * dCos)) / d8;
            double d10 = (((-f4) * dSin) + (d7 * dCos)) / d8;
            double d11 = d9 - d10;
            double d12 = f6;
            double d13 = ((f2 * dCos) + d6) / d12;
            double d14 = ((f4 * dCos) + (d7 * dSin)) / d12;
            double d15 = d13 - d14;
            double d16 = (d15 * d15) + (d11 * d11);
            if (d16 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                return i.h();
            }
            double d17 = (1.0d / d16) - 0.25d;
            if (d17 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                float fSqrt = (float) (Math.sqrt(d16) / 1.99999d);
                return arcToCubics(f2, f3, f4, f5, f6 * fSqrt, f7 * fSqrt, f8, z, z2);
            }
            double dSqrt = Math.sqrt(d17);
            double d18 = (d9 + d10) / 2.0d;
            double d19 = d15 * dSqrt;
            double d20 = (d13 + d14) / 2.0d;
            double d21 = dSqrt * d11;
            if (z == z2) {
                d2 = d20 - d21;
                d3 = d18 + d19;
            } else {
                d2 = d20 + d21;
                d3 = d18 - d19;
            }
            double dAtan2 = Math.atan2(d9 - d3, d13 - d2);
            double dAtan22 = Math.atan2(d10 - d3, d14 - d2) - dAtan2;
            if (z2 != (dAtan22 >= AudioStats.AUDIO_AMPLITUDE_NONE)) {
                dAtan22 += dAtan22 > AudioStats.AUDIO_AMPLITUDE_NONE ? -6.283185307179586d : 6.283185307179586d;
            }
            double d22 = d2 * d12;
            double d23 = d3 * d8;
            return arcToBezier((float) ((d22 * dCos) - (d23 * dSin)), (float) ((d22 * dSin) + (d23 * dCos)), f6, f7, f2, f3, (float) d4, (float) dAtan2, (float) dAtan22);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
