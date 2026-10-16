package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import h.ab;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PressGestureScope extends Density {
    Object awaitRelease(e<? super ab> eVar);

    Object tryAwaitRelease(e<? super Boolean> eVar);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2271roundToPxR2X_6o(PressGestureScope pressGestureScope, long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(pressGestureScope, j2);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2272roundToPx0680j_4(PressGestureScope pressGestureScope, float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(pressGestureScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2273toDpGaN1DYA(PressGestureScope pressGestureScope, long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(pressGestureScope, j2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2274toDpu2uoSUM(PressGestureScope pressGestureScope, float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(pressGestureScope, f2);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2276toDpSizekrfVVM(PressGestureScope pressGestureScope, long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(pressGestureScope, j2);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2277toPxR2X_6o(PressGestureScope pressGestureScope, long j2) {
            return Density.CC.m11133$default$toPxR2X_6o(pressGestureScope, j2);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2278toPx0680j_4(PressGestureScope pressGestureScope, float f2) {
            return Density.CC.m11134$default$toPx0680j_4(pressGestureScope, f2);
        }

        @Deprecated
        public static Rect toRect(PressGestureScope pressGestureScope, DpRect dpRect) {
            return Density.CC.$default$toRect(pressGestureScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2279toSizeXkaWNTQ(PressGestureScope pressGestureScope, long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(pressGestureScope, j2);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2280toSp0xMU5do(PressGestureScope pressGestureScope, float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(pressGestureScope, f2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2281toSpkPz2Gy4(PressGestureScope pressGestureScope, float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(pressGestureScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2275toDpu2uoSUM(PressGestureScope pressGestureScope, int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) pressGestureScope, i2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2282toSpkPz2Gy4(PressGestureScope pressGestureScope, int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) pressGestureScope, i2);
        }
    }
}
