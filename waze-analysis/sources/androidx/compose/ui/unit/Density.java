package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.FontScaling;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Density extends FontScaling {
    float getDensity();

    /* renamed from: roundToPx--R2X_6o */
    int mo2120roundToPxR2X_6o(long j2);

    /* renamed from: roundToPx-0680j_4 */
    int mo2121roundToPx0680j_4(float f2);

    /* renamed from: toDp-u2uoSUM */
    float mo2123toDpu2uoSUM(float f2);

    /* renamed from: toDp-u2uoSUM */
    float mo2124toDpu2uoSUM(int i2);

    /* renamed from: toDpSize-k-rfVVM */
    long mo2125toDpSizekrfVVM(long j2);

    /* renamed from: toPx--R2X_6o */
    float mo2126toPxR2X_6o(long j2);

    /* renamed from: toPx-0680j_4 */
    float mo2127toPx0680j_4(float f2);

    Rect toRect(DpRect dpRect);

    /* renamed from: toSize-XkaWNTQ */
    long mo2128toSizeXkaWNTQ(long j2);

    /* renamed from: toSp-kPz2Gy4 */
    long mo2130toSpkPz2Gy4(float f2);

    /* renamed from: toSp-kPz2Gy4 */
    long mo2131toSpkPz2Gy4(int i2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.unit.Density$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$roundToPx--R2X_6o, reason: not valid java name */
        public static int m11128$default$roundToPxR2X_6o(Density density, long j2) {
            return Math.round(density.mo2126toPxR2X_6o(j2));
        }

        /* renamed from: $default$roundToPx-0680j_4, reason: not valid java name */
        public static int m11129$default$roundToPx0680j_4(Density density, float f2) {
            float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(f2);
            if (Float.isInfinite(fMo2127toPx0680j_4)) {
                return Integer.MAX_VALUE;
            }
            return Math.round(fMo2127toPx0680j_4);
        }

        /* renamed from: $default$toDp-u2uoSUM, reason: not valid java name */
        public static float m11131$default$toDpu2uoSUM(Density density, int i2) {
            return i2 / density.getDensity();
        }

        /* renamed from: $default$toDpSize-k-rfVVM, reason: not valid java name */
        public static long m11132$default$toDpSizekrfVVM(Density density, long j2) {
            return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? DpKt.m11186DpSizeYgX7TsA(density.mo2123toDpu2uoSUM(Float.intBitsToFloat((int) (j2 >> 32))), density.mo2123toDpu2uoSUM(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)))) : DpSize.Companion.m11271getUnspecifiedMYxV2XQ();
        }

        /* renamed from: $default$toPx--R2X_6o, reason: not valid java name */
        public static float m11133$default$toPxR2X_6o(Density density, long j2) {
            if (!TextUnitType.m11390equalsimpl0(TextUnit.m11361getTypeUIouoOA(j2), TextUnitType.Companion.m11395getSpUIouoOA())) {
                InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
            }
            return density.mo2127toPx0680j_4(density.mo2122toDpGaN1DYA(j2));
        }

        /* renamed from: $default$toPx-0680j_4, reason: not valid java name */
        public static float m11134$default$toPx0680j_4(Density density, float f2) {
            return f2 * density.getDensity();
        }

        public static Rect $default$toRect(Density density, DpRect dpRect) {
            return new Rect(density.mo2127toPx0680j_4(dpRect.m11247getLeftD9Ej5fM()), density.mo2127toPx0680j_4(dpRect.m11249getTopD9Ej5fM()), density.mo2127toPx0680j_4(dpRect.m11248getRightD9Ej5fM()), density.mo2127toPx0680j_4(dpRect.m11246getBottomD9Ej5fM()));
        }

        /* renamed from: $default$toSize-XkaWNTQ, reason: not valid java name */
        public static long m11135$default$toSizeXkaWNTQ(Density density, long j2) {
            if (j2 == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                return Size.Companion.m8057getUnspecifiedNHjbRc();
            }
            float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(DpSize.m11262getWidthD9Ej5fM(j2));
            float fMo2127toPx0680j_42 = density.mo2127toPx0680j_4(DpSize.m11260getHeightD9Ej5fM(j2));
            return (Float.floatToRawIntBits(fMo2127toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo2127toPx0680j_42) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }

        /* renamed from: $default$toSp-kPz2Gy4, reason: not valid java name */
        public static long m11136$default$toSpkPz2Gy4(Density density, float f2) {
            return density.mo2129toSp0xMU5do(density.mo2123toDpu2uoSUM(f2));
        }

        /* renamed from: $default$toDp-u2uoSUM, reason: not valid java name */
        public static float m11130$default$toDpu2uoSUM(Density density, float f2) {
            return f2 / density.getDensity();
        }

        /* renamed from: $default$toSp-kPz2Gy4, reason: not valid java name */
        public static long m11137$default$toSpkPz2Gy4(Density density, int i2) {
            return density.mo2129toSp0xMU5do(density.mo2124toDpu2uoSUM(i2));
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m11150roundToPxR2X_6o(Density density, long j2) {
            return CC.m11128$default$roundToPxR2X_6o(density, j2);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m11151roundToPx0680j_4(Density density, float f2) {
            return CC.m11129$default$roundToPx0680j_4(density, f2);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m11152toDpGaN1DYA(Density density, long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(density, j2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m11153toDpu2uoSUM(Density density, float f2) {
            return CC.m11130$default$toDpu2uoSUM(density, f2);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m11155toDpSizekrfVVM(Density density, long j2) {
            return CC.m11132$default$toDpSizekrfVVM(density, j2);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m11156toPxR2X_6o(Density density, long j2) {
            return CC.m11133$default$toPxR2X_6o(density, j2);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m11157toPx0680j_4(Density density, float f2) {
            return CC.m11134$default$toPx0680j_4(density, f2);
        }

        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            return CC.$default$toRect(density, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m11158toSizeXkaWNTQ(Density density, long j2) {
            return CC.m11135$default$toSizeXkaWNTQ(density, j2);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m11159toSp0xMU5do(Density density, float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(density, f2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m11160toSpkPz2Gy4(Density density, float f2) {
            return CC.m11136$default$toSpkPz2Gy4(density, f2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m11154toDpu2uoSUM(Density density, int i2) {
            return CC.m11131$default$toDpu2uoSUM(density, i2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m11161toSpkPz2Gy4(Density density, int i2) {
            return CC.m11137$default$toSpkPz2Gy4(density, i2);
        }

        public static /* synthetic */ void getDensity$annotations() {
        }
    }
}
