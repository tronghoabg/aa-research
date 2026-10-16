package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.FontScaling;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import java.util.List;

/* compiled from: WazeSource */
@DrawScopeMarker
/* loaded from: classes.dex */
public interface DrawScope extends Density {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m8168getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m8328getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m8840getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m8841getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    /* renamed from: drawArc-illE91I */
    void mo8731drawArcillE91I(Brush brush, float f2, float f3, boolean z, long j2, long j3, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawArc-yD3GUKo */
    void mo8732drawArcyD3GUKo(long j2, float f2, float f3, boolean z, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawCircle-V9BoPsw */
    void mo8733drawCircleV9BoPsw(Brush brush, float f2, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo8734drawCircleVaOC9Bg(long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo8735drawImage9jGpkUE(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawImage-AZ2fEMs */
    void mo8736drawImageAZ2fEMs(ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3);

    /* renamed from: drawImage-gbVJVH8 */
    void mo8737drawImagegbVJVH8(ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawLine-1RTmtNc */
    void mo8738drawLine1RTmtNc(Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo8739drawLineNGM6Ib0(long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3);

    /* renamed from: drawOval-AsUm42w */
    void mo8740drawOvalAsUm42w(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawOval-n-J9OG0 */
    void mo8741drawOvalnJ9OG0(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawPath-GBMwjPU */
    void mo8742drawPathGBMwjPU(Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawPath-LG529CI */
    void mo8743drawPathLG529CI(Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo8744drawPointsF8ZwMP8(List<Offset> list, int i2, long j2, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo8745drawPointsGsft0Ws(List<Offset> list, int i2, Brush brush, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4);

    /* renamed from: drawRect-AsUm42w */
    void mo8746drawRectAsUm42w(Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawRect-n-J9OG0 */
    void mo8747drawRectnJ9OG0(long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo8748drawRoundRectZuiqVtQ(Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo8749drawRoundRectuAw5IA(long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2);

    /* renamed from: getCenter-F1C5BW0 */
    long mo8750getCenterF1C5BW0();

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc */
    long mo8751getSizeNHjbRc();

    /* renamed from: record-JVtK1S4 */
    void mo8752recordJVtK1S4(GraphicsLayer graphicsLayer, long j2, l<? super DrawScope, ab> lVar);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.drawscope.DrawScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$getCenter-F1C5BW0, reason: not valid java name */
        public static long m8800$default$getCenterF1C5BW0(DrawScope drawScope) {
            return SizeKt.m8059getCenteruvyYCjk(drawScope.getDrawContext().mo8758getSizeNHjbRc());
        }

        /* renamed from: $default$getSize-NH-jbRc, reason: not valid java name */
        public static long m8801$default$getSizeNHjbRc(DrawScope drawScope) {
            return drawScope.getDrawContext().mo8758getSizeNHjbRc();
        }

        /* renamed from: $default$record-JVtK1S4, reason: not valid java name */
        public static void m8802$default$recordJVtK1S4(DrawScope drawScope, GraphicsLayer graphicsLayer, long j2, l lVar) {
            graphicsLayer.m8933recordmLhObY(drawScope, drawScope.getLayoutDirection(), j2, new DrawScope$record$1(drawScope, lVar));
        }

        /* renamed from: $private$offsetSize-PENXr5M, reason: not valid java name */
        public static long m8803$private$offsetSizePENXr5M(DrawScope drawScope, long j2, long j3) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }

        static {
            Companion companion = DrawScope.Companion;
        }

        /* renamed from: drawArc-illE91I$default, reason: not valid java name */
        public static /* synthetic */ void m8820drawArcillE91I$default(DrawScope drawScope, Brush brush, float f2, float f3, boolean z, long j2, long j3, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            DrawScope drawScope2;
            long jM8803$private$offsetSizePENXr5M;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
            }
            long jM7996getZeroF1C5BW0 = (i3 & 16) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j2;
            if ((i3 & 32) != 0) {
                drawScope2 = drawScope;
                jM8803$private$offsetSizePENXr5M = m8803$private$offsetSizePENXr5M(drawScope2, drawScope.mo8751getSizeNHjbRc(), jM7996getZeroF1C5BW0);
            } else {
                drawScope2 = drawScope;
                jM8803$private$offsetSizePENXr5M = j3;
            }
            drawScope2.mo8731drawArcillE91I(brush, f2, f3, z, jM7996getZeroF1C5BW0, jM8803$private$offsetSizePENXr5M, (i3 & 64) != 0 ? 1.0f : f4, (i3 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 256) != 0 ? null : colorFilter, (i3 & 512) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
        public static /* synthetic */ void m8821drawArcyD3GUKo$default(DrawScope drawScope, long j2, float f2, float f3, boolean z, long j3, long j4, float f4, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            DrawScope drawScope2;
            long jM8803$private$offsetSizePENXr5M;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
            }
            long jM7996getZeroF1C5BW0 = (i3 & 16) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j3;
            if ((i3 & 32) != 0) {
                drawScope2 = drawScope;
                jM8803$private$offsetSizePENXr5M = m8803$private$offsetSizePENXr5M(drawScope2, drawScope.mo8751getSizeNHjbRc(), jM7996getZeroF1C5BW0);
            } else {
                drawScope2 = drawScope;
                jM8803$private$offsetSizePENXr5M = j4;
            }
            drawScope2.mo8732drawArcyD3GUKo(j2, f2, f3, z, jM7996getZeroF1C5BW0, jM8803$private$offsetSizePENXr5M, (i3 & 64) != 0 ? 1.0f : f4, (i3 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 256) != 0 ? null : colorFilter, (i3 & 512) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
        public static /* synthetic */ void m8822drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f2, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
            }
            drawScope.mo8733drawCircleV9BoPsw(brush, (i3 & 2) != 0 ? Size.m8048getMinDimensionimpl(drawScope.mo8751getSizeNHjbRc()) / 2.0f : f2, (i3 & 4) != 0 ? drawScope.mo8750getCenterF1C5BW0() : j2, (i3 & 8) != 0 ? 1.0f : f3, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
        public static /* synthetic */ void m8823drawCircleVaOC9Bg$default(DrawScope drawScope, long j2, float f2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
            }
            if ((i3 & 2) != 0) {
                f2 = Size.m8048getMinDimensionimpl(drawScope.mo8751getSizeNHjbRc()) / 2.0f;
            }
            drawScope.mo8734drawCircleVaOC9Bg(j2, f2, (i3 & 4) != 0 ? drawScope.mo8750getCenterF1C5BW0() : j3, (i3 & 8) != 0 ? 1.0f : f3, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
        public static /* synthetic */ void m8824drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
            }
            long jM11307getZeronOccac = (i3 & 2) != 0 ? IntOffset.Companion.m11307getZeronOccac() : j2;
            long height = (i3 & 4) != 0 ? (imageBitmap.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (imageBitmap.getWidth() << 32) : j3;
            drawScope.mo8735drawImage9jGpkUE(imageBitmap, jM11307getZeronOccac, height, (i3 & 8) != 0 ? IntOffset.Companion.m11307getZeronOccac() : j4, (i3 & 16) != 0 ? height : j5, (i3 & 32) != 0 ? 1.0f : f2, (i3 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 128) != 0 ? null : colorFilter, (i3 & 256) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
        public static /* synthetic */ void m8825drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
            }
            long jM11307getZeronOccac = (i4 & 2) != 0 ? IntOffset.Companion.m11307getZeronOccac() : j2;
            long height = (i4 & 4) != 0 ? (imageBitmap.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (imageBitmap.getWidth() << 32) : j3;
            drawScope.mo8736drawImageAZ2fEMs(imageBitmap, jM11307getZeronOccac, height, (i4 & 8) != 0 ? IntOffset.Companion.m11307getZeronOccac() : j4, (i4 & 16) != 0 ? height : j5, (i4 & 32) != 0 ? 1.0f : f2, (i4 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i4 & 128) != 0 ? null : colorFilter, (i4 & 256) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2, (i4 & 512) != 0 ? DrawScope.Companion.m8841getDefaultFilterQualityfv9h1I() : i3);
        }

        /* renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
        public static /* synthetic */ void m8826drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
            }
            drawScope.mo8737drawImagegbVJVH8(imageBitmap, (i3 & 2) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j2, (i3 & 4) != 0 ? 1.0f : f2, (i3 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 16) != 0 ? null : colorFilter, (i3 & 32) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
        public static /* synthetic */ void m8827drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j2, long j3, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
            }
            drawScope.mo8738drawLine1RTmtNc(brush, j2, j3, (i4 & 8) != 0 ? 0.0f : f2, (i4 & 16) != 0 ? Stroke.Companion.m8910getDefaultCapKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f3, (i4 & 128) != 0 ? null : colorFilter, (i4 & 256) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i3);
        }

        /* renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
        public static /* synthetic */ void m8828drawLineNGM6Ib0$default(DrawScope drawScope, long j2, long j3, long j4, float f2, int i2, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
            }
            drawScope.mo8739drawLineNGM6Ib0(j2, j3, j4, (i4 & 8) != 0 ? 0.0f : f2, (i4 & 16) != 0 ? Stroke.Companion.m8910getDefaultCapKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f3, (i4 & 128) != 0 ? null : colorFilter, (i4 & 256) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i3);
        }

        /* renamed from: drawOval-AsUm42w$default, reason: not valid java name */
        public static /* synthetic */ void m8829drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
            }
            long jM7996getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j2;
            drawScope.mo8740drawOvalAsUm42w(brush, jM7996getZeroF1C5BW0, (i3 & 4) != 0 ? m8803$private$offsetSizePENXr5M(drawScope, drawScope.mo8751getSizeNHjbRc(), jM7996getZeroF1C5BW0) : j3, (i3 & 8) != 0 ? 1.0f : f2, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
        public static /* synthetic */ void m8830drawOvalnJ9OG0$default(DrawScope drawScope, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
            }
            long jM7996getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j3;
            drawScope.mo8741drawOvalnJ9OG0(j2, jM7996getZeroF1C5BW0, (i3 & 4) != 0 ? m8803$private$offsetSizePENXr5M(drawScope, drawScope.mo8751getSizeNHjbRc(), jM7996getZeroF1C5BW0) : j4, (i3 & 8) != 0 ? 1.0f : f2, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
        public static /* synthetic */ void m8831drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
            }
            if ((i3 & 4) != 0) {
                f2 = 1.0f;
            }
            float f3 = f2;
            if ((i3 & 8) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            if ((i3 & 16) != 0) {
                colorFilter = null;
            }
            ColorFilter colorFilter2 = colorFilter;
            if ((i3 & 32) != 0) {
                i2 = DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo8742drawPathGBMwjPU(path, brush, f3, drawStyle2, colorFilter2, i2);
        }

        /* renamed from: drawPath-LG529CI$default, reason: not valid java name */
        public static /* synthetic */ void m8832drawPathLG529CI$default(DrawScope drawScope, Path path, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
            }
            if ((i3 & 4) != 0) {
                f2 = 1.0f;
            }
            float f3 = f2;
            if ((i3 & 8) != 0) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            if ((i3 & 16) != 0) {
                colorFilter = null;
            }
            drawScope.mo8743drawPathLG529CI(path, j2, f3, drawStyle2, colorFilter, (i3 & 32) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
        public static /* synthetic */ void m8833drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i2, long j2, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
            }
            drawScope.mo8744drawPointsF8ZwMP8(list, i2, j2, (i5 & 8) != 0 ? 0.0f : f2, (i5 & 16) != 0 ? StrokeCap.Companion.m8632getButtKaPHkGw() : i3, (i5 & 32) != 0 ? null : pathEffect, (i5 & 64) != 0 ? 1.0f : f3, (i5 & 128) != 0 ? null : colorFilter, (i5 & 256) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i4);
        }

        /* renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
        public static /* synthetic */ void m8834drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i2, Brush brush, float f2, int i3, PathEffect pathEffect, float f3, ColorFilter colorFilter, int i4, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
            }
            drawScope.mo8745drawPointsGsft0Ws(list, i2, brush, (i5 & 8) != 0 ? 0.0f : f2, (i5 & 16) != 0 ? StrokeCap.Companion.m8632getButtKaPHkGw() : i3, (i5 & 32) != 0 ? null : pathEffect, (i5 & 64) != 0 ? 1.0f : f3, (i5 & 128) != 0 ? null : colorFilter, (i5 & 256) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i4);
        }

        /* renamed from: drawRect-AsUm42w$default, reason: not valid java name */
        public static /* synthetic */ void m8835drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j2, long j3, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
            }
            long jM7996getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j2;
            drawScope.mo8746drawRectAsUm42w(brush, jM7996getZeroF1C5BW0, (i3 & 4) != 0 ? m8803$private$offsetSizePENXr5M(drawScope, drawScope.mo8751getSizeNHjbRc(), jM7996getZeroF1C5BW0) : j3, (i3 & 8) != 0 ? 1.0f : f2, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
        public static /* synthetic */ void m8836drawRectnJ9OG0$default(DrawScope drawScope, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
            }
            long jM7996getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j3;
            drawScope.mo8747drawRectnJ9OG0(j2, jM7996getZeroF1C5BW0, (i3 & 4) != 0 ? m8803$private$offsetSizePENXr5M(drawScope, drawScope.mo8751getSizeNHjbRc(), jM7996getZeroF1C5BW0) : j4, (i3 & 8) != 0 ? 1.0f : f2, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
        public static /* synthetic */ void m8837drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j2, long j3, long j4, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
            }
            long jM7996getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j2;
            drawScope.mo8748drawRoundRectZuiqVtQ(brush, jM7996getZeroF1C5BW0, (i3 & 4) != 0 ? m8803$private$offsetSizePENXr5M(drawScope, drawScope.mo8751getSizeNHjbRc(), jM7996getZeroF1C5BW0) : j3, (i3 & 8) != 0 ? CornerRadius.Companion.m7952getZerokKHJgLs() : j4, (i3 & 16) != 0 ? 1.0f : f2, (i3 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 64) != 0 ? null : colorFilter, (i3 & 128) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
        public static /* synthetic */ void m8838drawRoundRectuAw5IA$default(DrawScope drawScope, long j2, long j3, long j4, long j5, DrawStyle drawStyle, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
            DrawScope drawScope2;
            long jM8803$private$offsetSizePENXr5M;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
            }
            long jM7996getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j3;
            if ((i3 & 4) != 0) {
                drawScope2 = drawScope;
                jM8803$private$offsetSizePENXr5M = m8803$private$offsetSizePENXr5M(drawScope2, drawScope.mo8751getSizeNHjbRc(), jM7996getZeroF1C5BW0);
            } else {
                drawScope2 = drawScope;
                jM8803$private$offsetSizePENXr5M = j4;
            }
            drawScope2.mo8749drawRoundRectuAw5IA(j2, jM7996getZeroF1C5BW0, jM8803$private$offsetSizePENXr5M, (i3 & 8) != 0 ? CornerRadius.Companion.m7952getZerokKHJgLs() : j5, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? 1.0f : f2, (i3 & 64) != 0 ? null : colorFilter, (i3 & 128) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: record-JVtK1S4$default, reason: not valid java name */
        public static /* synthetic */ void m8839recordJVtK1S4$default(DrawScope drawScope, GraphicsLayer graphicsLayer, long j2, l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
            }
            if ((i2 & 1) != 0) {
                j2 = IntSizeKt.m11350toIntSizeuvyYCjk(drawScope.mo8751getSizeNHjbRc());
            }
            drawScope.mo8752recordJVtK1S4(graphicsLayer, j2, lVar);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m8847drawImageAZ2fEMs(DrawScope drawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
            CC.m8825drawImageAZ2fEMs$default(drawScope, imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2, 0, 512, null);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m8862getCenterF1C5BW0(DrawScope drawScope) {
            return CC.m8800$default$getCenterF1C5BW0(drawScope);
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m8863getSizeNHjbRc(DrawScope drawScope) {
            return CC.m8801$default$getSizeNHjbRc(drawScope);
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m8864recordJVtK1S4(DrawScope drawScope, GraphicsLayer graphicsLayer, long j2, l<? super DrawScope, ab> lVar) {
            CC.m8802$default$recordJVtK1S4(drawScope, graphicsLayer, j2, lVar);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m8866roundToPxR2X_6o(DrawScope drawScope, long j2) {
            return Density.CC.m11128$default$roundToPxR2X_6o(drawScope, j2);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m8867roundToPx0680j_4(DrawScope drawScope, float f2) {
            return Density.CC.m11129$default$roundToPx0680j_4(drawScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m8868toDpGaN1DYA(DrawScope drawScope, long j2) {
            return FontScaling.CC.m11273$default$toDpGaN1DYA(drawScope, j2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m8869toDpu2uoSUM(DrawScope drawScope, float f2) {
            return Density.CC.m11130$default$toDpu2uoSUM(drawScope, f2);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m8871toDpSizekrfVVM(DrawScope drawScope, long j2) {
            return Density.CC.m11132$default$toDpSizekrfVVM(drawScope, j2);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m8872toPxR2X_6o(DrawScope drawScope, long j2) {
            return Density.CC.m11133$default$toPxR2X_6o(drawScope, j2);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m8873toPx0680j_4(DrawScope drawScope, float f2) {
            return Density.CC.m11134$default$toPx0680j_4(drawScope, f2);
        }

        @Deprecated
        public static Rect toRect(DrawScope drawScope, DpRect dpRect) {
            return Density.CC.$default$toRect(drawScope, dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m8874toSizeXkaWNTQ(DrawScope drawScope, long j2) {
            return Density.CC.m11135$default$toSizeXkaWNTQ(drawScope, j2);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m8875toSp0xMU5do(DrawScope drawScope, float f2) {
            return FontScaling.CC.m11274$default$toSp0xMU5do(drawScope, f2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m8876toSpkPz2Gy4(DrawScope drawScope, float f2) {
            return Density.CC.m11136$default$toSpkPz2Gy4(drawScope, f2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m8870toDpu2uoSUM(DrawScope drawScope, int i2) {
            return Density.CC.m11131$default$toDpu2uoSUM((Density) drawScope, i2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m8877toSpkPz2Gy4(DrawScope drawScope, int i2) {
            return Density.CC.m11137$default$toSpkPz2Gy4((Density) drawScope, i2);
        }
    }
}
