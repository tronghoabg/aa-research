package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.media3.muxer.MuxerUtil;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(RoundRect roundRect) {
        return Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() >> 32)) + Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() >> 32)) <= roundRect.getWidth() && Float.intBitsToFloat((int) (roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() >> 32)) + Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() >> 32)) <= roundRect.getWidth() && Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + Float.intBitsToFloat((int) (roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) <= roundRect.getHeight() && Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & roundRect.m8029getBottomRightCornerRadiuskKHJgLs())) <= roundRect.getHeight();
    }

    public static final boolean isInOutline(Outline outline, float f2, float f3, Path path, Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f2, f3);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f2, f3, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f2, f3, path, path2);
        }
        throw new i();
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f2, float f3, Path path, Path path2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            path = null;
        }
        if ((i2 & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f2, f3, path, path2);
    }

    private static final boolean isInPath(Path path, float f2, float f3, Path path2, Path path3) {
        Rect rect = new Rect(f2 - 0.005f, (-0.005f) + f3, f2 + 0.005f, f3 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        Path.CC.addRect$default(path2, rect, null, 2, null);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo8117opN5in7k0(path, path2, PathOperation.Companion.m8565getIntersectb3I0S0c());
        boolean zIsEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !zIsEmpty;
    }

    private static final boolean isInRectangle(Rect rect, float f2, float f3) {
        return rect.getLeft() <= f2 && f2 < rect.getRight() && rect.getTop() <= f3 && f3 < rect.getBottom();
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f2, float f3, Path path, Path path2) {
        RoundRect roundRect = rounded.getRoundRect();
        if (f2 < roundRect.getLeft() || f2 >= roundRect.getRight() || f3 < roundRect.getTop() || f3 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            Path Path = path2 == null ? AndroidPath_androidKt.Path() : path2;
            Path.CC.addRoundRect$default(Path, roundRect, null, 2, null);
            return isInPath(Path, f2, f3, path, path2);
        }
        float left = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() >> 32));
        float top = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float right = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() >> 32));
        float top2 = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.m8031getTopRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float right2 = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() >> 32));
        float bottom = roundRect.getBottom() - Float.intBitsToFloat((int) (roundRect.m8029getBottomRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float bottom2 = roundRect.getBottom() - Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & roundRect.m8028getBottomLeftCornerRadiuskKHJgLs()));
        float left2 = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.m8028getBottomLeftCornerRadiuskKHJgLs() >> 32));
        if (f2 < left && f3 < top) {
            return m10289isWithinEllipseVE1yxkc(f2, f3, roundRect.m8030getTopLeftCornerRadiuskKHJgLs(), left, top);
        }
        if (f2 < left2 && f3 > bottom2) {
            return m10289isWithinEllipseVE1yxkc(f2, f3, roundRect.m8028getBottomLeftCornerRadiuskKHJgLs(), left2, bottom2);
        }
        if (f2 > right && f3 < top2) {
            return m10289isWithinEllipseVE1yxkc(f2, f3, roundRect.m8031getTopRightCornerRadiuskKHJgLs(), right, top2);
        }
        if (f2 <= right2 || f3 <= bottom) {
            return true;
        }
        return m10289isWithinEllipseVE1yxkc(f2, f3, roundRect.m8029getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
    }

    /* renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m10289isWithinEllipseVE1yxkc(float f2, float f3, long j2, float f4, float f5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        float f6 = f3 - f5;
        float f7 = f2 - f4;
        return ((f7 * f7) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }
}
