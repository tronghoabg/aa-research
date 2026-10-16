package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {
    void drawContent();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.drawscope.ContentDrawScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m8783drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
            DrawScope.CC.m8825drawImageAZ2fEMs$default(contentDrawScope, imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2, 0, 512, null);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m8784getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return DrawScope.CC.m8800$default$getCenterF1C5BW0(contentDrawScope);
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m8785getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return DrawScope.CC.m8801$default$getSizeNHjbRc(contentDrawScope);
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m8786recordJVtK1S4(ContentDrawScope contentDrawScope, GraphicsLayer graphicsLayer, long j2, l<? super DrawScope, ab> lVar) {
            DrawScope.CC.m8802$default$recordJVtK1S4(contentDrawScope, graphicsLayer, j2, lVar);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m8787roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(contentDrawScope, j2);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m8788roundToPx0680j_4(ContentDrawScope contentDrawScope, float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(contentDrawScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m8789toDpGaN1DYA(ContentDrawScope contentDrawScope, long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(contentDrawScope, j2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m8790toDpu2uoSUM(ContentDrawScope contentDrawScope, float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(contentDrawScope, f2);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m8792toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(contentDrawScope, j2);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m8793toPxR2X_6o(ContentDrawScope contentDrawScope, long j2) {
            return Density.CC.m11133$default$toPxR2X_6o(contentDrawScope, j2);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m8794toPx0680j_4(ContentDrawScope contentDrawScope, float f2) {
            return Density.CC.m11134$default$toPx0680j_4(contentDrawScope, f2);
        }

        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect dpRect) {
            return Density.CC.$default$toRect(contentDrawScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m8795toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(contentDrawScope, j2);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m8796toSp0xMU5do(ContentDrawScope contentDrawScope, float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(contentDrawScope, f2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m8797toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(contentDrawScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m8791toDpu2uoSUM(ContentDrawScope contentDrawScope, int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) contentDrawScope, i2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m8798toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) contentDrawScope, i2);
        }
    }
}
