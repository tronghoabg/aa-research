package androidx.compose.ui.draw;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ShadowScope extends Density {
    float getAlpha();

    /* renamed from: getBlendMode-0nO6VwU */
    int mo7739getBlendMode0nO6VwU();

    Brush getBrush();

    /* renamed from: getColor-0d7_KjU */
    long mo7740getColor0d7_KjU();

    /* renamed from: getOffset-F1C5BW0 */
    long mo7741getOffsetF1C5BW0();

    float getRadius();

    float getSpread();

    void setAlpha(float f2);

    /* renamed from: setBlendMode-s9anfk8 */
    void mo7742setBlendModes9anfk8(int i2);

    void setBrush(Brush brush);

    /* renamed from: setColor-8_81llA */
    void mo7743setColor8_81llA(long j2);

    /* renamed from: setOffset-k-4lQ0M */
    void mo7744setOffsetk4lQ0M(long j2);

    void setRadius(float f2);

    void setSpread(float f2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.draw.ShadowScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m7838roundToPxR2X_6o(ShadowScope shadowScope, long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(shadowScope, j2);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m7839roundToPx0680j_4(ShadowScope shadowScope, float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(shadowScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m7840toDpGaN1DYA(ShadowScope shadowScope, long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(shadowScope, j2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7841toDpu2uoSUM(ShadowScope shadowScope, float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(shadowScope, f2);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m7843toDpSizekrfVVM(ShadowScope shadowScope, long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(shadowScope, j2);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m7844toPxR2X_6o(ShadowScope shadowScope, long j2) {
            return Density.CC.m11133$default$toPxR2X_6o(shadowScope, j2);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m7845toPx0680j_4(ShadowScope shadowScope, float f2) {
            return Density.CC.m11134$default$toPx0680j_4(shadowScope, f2);
        }

        @Deprecated
        public static Rect toRect(ShadowScope shadowScope, DpRect dpRect) {
            return Density.CC.$default$toRect(shadowScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m7846toSizeXkaWNTQ(ShadowScope shadowScope, long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(shadowScope, j2);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m7847toSp0xMU5do(ShadowScope shadowScope, float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(shadowScope, f2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7848toSpkPz2Gy4(ShadowScope shadowScope, float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(shadowScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m7842toDpu2uoSUM(ShadowScope shadowScope, int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) shadowScope, i2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m7849toSpkPz2Gy4(ShadowScope shadowScope, int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) shadowScope, i2);
        }
    }
}
