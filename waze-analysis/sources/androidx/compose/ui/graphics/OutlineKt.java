package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.p;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OutlineKt {
    public static final void addOutline(Path path, Outline outline) {
        if (outline instanceof Outline.Rectangle) {
            Path.CC.addRect$default(path, ((Outline.Rectangle) outline).getRect(), null, 2, null);
        } else if (outline instanceof Outline.Rounded) {
            Path.CC.addRoundRect$default(path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
        } else {
            if (!(outline instanceof Outline.Generic)) {
                throw new i();
            }
            Path.CC.m8542addPathUv8p0NA$default(path, ((Outline.Generic) outline).getPath(), 0L, 2, null);
        }
    }

    public static final void drawOutline(Canvas canvas, Outline outline, Paint paint) {
        if (outline instanceof Outline.Rectangle) {
            canvas.drawRect(((Outline.Rectangle) outline).getRect(), paint);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new i();
            }
            canvas.drawPath(((Outline.Generic) outline).getPath(), paint);
        } else {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics = rounded.getRoundRectPath$ui_graphics();
            if (roundRectPath$ui_graphics != null) {
                canvas.drawPath(roundRectPath$ui_graphics, paint);
            } else {
                canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), Float.intBitsToFloat((int) (rounded.getRoundRect().m8028getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m8028getBottomLeftCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), paint);
            }
        }
    }

    /* renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m8527drawOutlinehn5TExg(DrawScope drawScope, Outline outline, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo8746drawRectAsUm42w(brush, topLeft(rect), size(rect), f2, drawStyle, colorFilter, i2);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new i();
            }
            drawScope.mo8742drawPathGBMwjPU(((Outline.Generic) outline).getPath(), brush, f2, drawStyle, colorFilter, i2);
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics = rounded.getRoundRectPath$ui_graphics();
        if (roundRectPath$ui_graphics != null) {
            drawScope.mo8742drawPathGBMwjPU(roundRectPath$ui_graphics, brush, f2, drawStyle, colorFilter, i2);
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() >> 32));
        drawScope.mo8748drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), f2, drawStyle, colorFilter, i2);
    }

    /* renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m8528drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
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
        int i4 = i2;
        if ((i3 & 4) != 0) {
            f2 = 1.0f;
        }
        m8527drawOutlinehn5TExg(drawScope, outline, brush, f2, drawStyle2, colorFilter2, i4);
    }

    /* renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m8529drawOutlinewDX37Ww(DrawScope drawScope, Outline outline, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2) {
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawScope.mo8747drawRectnJ9OG0(j2, topLeft(rect), size(rect), f2, drawStyle, colorFilter, i2);
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new i();
            }
            drawScope.mo8743drawPathLG529CI(((Outline.Generic) outline).getPath(), j2, f2, drawStyle, colorFilter, i2);
            return;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        Path roundRectPath$ui_graphics = rounded.getRoundRectPath$ui_graphics();
        if (roundRectPath$ui_graphics != null) {
            drawScope.mo8743drawPathLG529CI(roundRectPath$ui_graphics, j2, f2, drawStyle, colorFilter, i2);
            return;
        }
        RoundRect roundRect = rounded.getRoundRect();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() >> 32));
        drawScope.mo8749drawRoundRectuAw5IA(j2, topLeft(roundRect), size(roundRect), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), drawStyle, f2, colorFilter, i2);
    }

    /* renamed from: drawOutline-wDX37Ww$default, reason: not valid java name */
    public static /* synthetic */ void m8530drawOutlinewDX37Ww$default(DrawScope drawScope, Outline outline, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i3 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        int iM8840getDefaultBlendMode0nO6VwU = (i3 & 32) != 0 ? DrawScope.Companion.m8840getDefaultBlendMode0nO6VwU() : i2;
        if ((i3 & 4) != 0) {
            f2 = 1.0f;
        }
        m8529drawOutlinewDX37Ww(drawScope, outline, j2, f2, drawStyle2, colorFilter2, iM8840getDefaultBlendMode0nO6VwU);
    }

    private static final void drawOutlineHelper(DrawScope drawScope, Outline outline, p<? super DrawScope, ? super Rect, ab> pVar, p<? super DrawScope, ? super RoundRect, ab> pVar2, p<? super DrawScope, ? super Path, ab> pVar3) {
        if (outline instanceof Outline.Rectangle) {
            pVar.invoke(drawScope, ((Outline.Rectangle) outline).getRect());
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Generic)) {
                throw new i();
            }
            pVar3.invoke(drawScope, ((Outline.Generic) outline).getPath());
        } else {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics = rounded.getRoundRectPath$ui_graphics();
            if (roundRectPath$ui_graphics != null) {
                pVar3.invoke(drawScope, roundRectPath$ui_graphics);
            } else {
                pVar2.invoke(drawScope, rounded.getRoundRect());
            }
        }
    }

    private static final boolean hasSameCornerRadius(RoundRect roundRect) {
        return ((Float.intBitsToFloat((int) (roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() >> 32)) > Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() >> 32)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() >> 32)) == Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() >> 32)) ? 0 : -1)) == 0) && ((Float.intBitsToFloat((int) (roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) > Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) == Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) > Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) == Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) ? 0 : -1)) == 0 && (Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) > Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) ? 1 : (Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) == Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) ? 0 : -1)) == 0);
    }

    private static final long size(Rect rect) {
        float right = rect.getRight() - rect.getLeft();
        float bottom = rect.getBottom() - rect.getTop();
        return (Float.floatToRawIntBits(bottom) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(right) << 32);
    }

    private static final long topLeft(Rect rect) {
        float left = rect.getLeft();
        float top = rect.getTop();
        return (Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    private static final long topLeft(RoundRect roundRect) {
        float left = roundRect.getLeft();
        float top = roundRect.getTop();
        return (Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    private static final long size(RoundRect roundRect) {
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        return (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
