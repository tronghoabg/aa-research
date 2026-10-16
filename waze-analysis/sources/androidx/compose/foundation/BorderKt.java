package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BorderKt {
    public static final /* synthetic */ Path access$createRoundRectPath(Path path, RoundRect roundRect, float f2, boolean z) {
        createRoundRectPath(path, roundRect, f2, z);
        return path;
    }

    public static final Modifier border(Modifier modifier, BorderStroke borderStroke, Shape shape) {
        return m1985borderziNgDLE(modifier, borderStroke.m1997getWidthD9Ej5fM(), borderStroke.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    /* renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m1983borderxT4_qwU(Modifier modifier, float f2, long j2, Shape shape) {
        return m1985borderziNgDLE(modifier, f2, new SolidColor(j2, null), shape);
    }

    /* renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1984borderxT4_qwU$default(Modifier modifier, float f2, long j2, Shape shape, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m1983borderxT4_qwU(modifier, f2, j2, shape);
    }

    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m1985borderziNgDLE(Modifier modifier, float f2, Brush brush, Shape shape) {
        return modifier.then(new BorderModifierNodeElement(f2, brush, shape, null));
    }

    private static final RoundRect createInsetRoundedRect(float f2, RoundRect roundRect) {
        return new RoundRect(f2, f2, roundRect.getWidth() - f2, roundRect.getHeight() - f2, m1987shrinkKibmq7A(roundRect.m8030getTopLeftCornerRadiuskKHJgLs(), f2), m1987shrinkKibmq7A(roundRect.m8031getTopRightCornerRadiuskKHJgLs(), f2), m1987shrinkKibmq7A(roundRect.m8029getBottomRightCornerRadiuskKHJgLs(), f2), m1987shrinkKibmq7A(roundRect.m8028getBottomLeftCornerRadiuskKHJgLs(), f2), null);
    }

    private static final Path createRoundRectPath(Path path, RoundRect roundRect, float f2, boolean z) {
        path.reset();
        Path.CC.addRoundRect$default(path, roundRect, null, 2, null);
        if (!z) {
            Path Path = AndroidPath_androidKt.Path();
            Path.CC.addRoundRect$default(Path, createInsetRoundedRect(f2, roundRect), null, 2, null);
            path.mo8117opN5in7k0(path, Path, PathOperation.Companion.m8564getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new l() { // from class: androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BorderKt.drawContentWithoutBorder$lambda$0((ContentDrawScope) obj);
            }
        });
    }

    static final ab drawContentWithoutBorder$lambda$0(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m1986drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j2, long j3, boolean z, float f2) {
        final long jM7996getZeroF1C5BW0 = z ? Offset.Companion.m7996getZeroF1C5BW0() : j2;
        final long jM7760getSizeNHjbRc = z ? cacheDrawScope.m7760getSizeNHjbRc() : j3;
        final DrawStyle stroke = z ? Fill.INSTANCE : new Stroke(f2, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new l() { // from class: androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BorderKt.drawRectBorder_NsqcLGU$lambda$0(brush, jM7996getZeroF1C5BW0, jM7760getSizeNHjbRc, stroke, (ContentDrawScope) obj);
            }
        });
    }

    static final ab drawRectBorder_NsqcLGU$lambda$0(Brush brush, long j2, long j3, DrawStyle drawStyle, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        DrawScope.CC.m8835drawRectAsUm42w$default(contentDrawScope, brush, j2, j3, 0.0f, drawStyle, null, 0, 104, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m1987shrinkKibmq7A(long j2, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - f2;
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fMax = Math.max(0.0f, fIntBitsToFloat);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat(i2) - f2);
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
