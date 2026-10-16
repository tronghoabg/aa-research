package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OutlineResolver {
    public static final int $stable = 8;
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private Path cachedRrectPath;
    private boolean isSupportedOutline = true;
    private androidx.compose.ui.graphics.Outline outline;
    private boolean outlineNeeded;
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private Path tmpOpPath;
    private Path tmpPath;
    private RoundRect tmpRoundRect;
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.rectTopLeft = Offset.Companion.m7996getZeroF1C5BW0();
        this.rectSize = Size.Companion.m8058getZeroNHjbRc();
    }

    /* renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m10283isSameBounds4L21HEs(RoundRect roundRect, long j2, long j3, float f2) {
        if (roundRect == null || !RoundRectKt.isSimple(roundRect)) {
            return false;
        }
        int i2 = (int) (j2 >> 32);
        if (roundRect.getLeft() != Float.intBitsToFloat(i2)) {
            return false;
        }
        float top = roundRect.getTop();
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        if (top == Float.intBitsToFloat(i3) && roundRect.getRight() == Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32))) {
            return roundRect.getBottom() == Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) && Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() >> 32)) == f2;
        }
        return false;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.Companion.m7996getZeroF1C5BW0();
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            androidx.compose.ui.graphics.Outline outline = this.outline;
            if (outline == null || !this.outlineNeeded || Float.intBitsToFloat((int) (this.rectSize >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.rectSize & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            if (outline instanceof Outline.Rectangle) {
                updateCacheWithRect(((Outline.Rectangle) outline).getRect());
            } else if (outline instanceof Outline.Rounded) {
                updateCacheWithRoundRect(((Outline.Rounded) outline).getRoundRect());
            } else {
                if (!(outline instanceof Outline.Generic)) {
                    throw new i();
                }
                updateCacheWithPath(((Outline.Generic) outline).getPath());
            }
        }
    }

    private final void updateCacheWithPath(Path path) {
        int i2 = Build.VERSION.SDK_INT;
        android.graphics.Outline outline = this.cachedOutline;
        if (i2 >= 30) {
            OutlineVerificationHelper.INSTANCE.setPath(outline, path);
        } else {
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((AndroidPath) path).getInternalPath());
        }
        this.usePathForClip = !this.cachedOutline.canClip();
        this.outlinePath = path;
    }

    private final void updateCacheWithRect(Rect rect) {
        float left = rect.getLeft();
        float top = rect.getTop();
        this.rectTopLeft = (Float.floatToRawIntBits(top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(left) << 32);
        float right = rect.getRight() - rect.getLeft();
        float bottom = rect.getBottom() - rect.getTop();
        this.rectSize = (Float.floatToRawIntBits(bottom) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(right) << 32);
        this.cachedOutline.setRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.m8030getTopLeftCornerRadiuskKHJgLs() >> 32));
        float left = roundRect.getLeft();
        float top = roundRect.getTop();
        this.rectTopLeft = (Float.floatToRawIntBits(top) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(left) << 32);
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        this.rectSize = (Float.floatToRawIntBits(height) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(width) << 32);
        if (RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(Math.round(roundRect.getLeft()), Math.round(roundRect.getTop()), Math.round(roundRect.getRight()), Math.round(roundRect.getBottom()), fIntBitsToFloat);
            this.roundedCornerRadius = fIntBitsToFloat;
            return;
        }
        Path Path = this.cachedRrectPath;
        if (Path == null) {
            Path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = Path;
        }
        Path.reset();
        Path.CC.addRoundRect$default(Path, roundRect, null, 2, null);
        updateCacheWithPath(Path);
    }

    public final void clipToOutline(Canvas canvas) {
        Path clipPath = getClipPath();
        if (clipPath != null) {
            Canvas.CC.m8200clipPathmtrdDE$default(canvas, clipPath, 0, 2, null);
            return;
        }
        float f2 = this.roundedCornerRadius;
        if (f2 <= 0.0f) {
            Canvas.CC.m8201clipRectN_I0leg$default(canvas, Float.intBitsToFloat((int) (this.rectTopLeft >> 32)), Float.intBitsToFloat((int) (this.rectTopLeft & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (this.rectTopLeft >> 32)) + Float.intBitsToFloat((int) (this.rectSize >> 32)), Float.intBitsToFloat((int) (this.rectTopLeft & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + Float.intBitsToFloat((int) (this.rectSize & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), 0, 16, null);
            return;
        }
        Path Path = this.tmpPath;
        RoundRect roundRect = this.tmpRoundRect;
        if (Path == null || !m10283isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f2)) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (this.rectTopLeft >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.rectTopLeft & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.rectTopLeft >> 32)) + Float.intBitsToFloat((int) (this.rectSize >> 32));
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.rectTopLeft & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + Float.intBitsToFloat((int) (this.rectSize & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            float f3 = this.roundedCornerRadius;
            RoundRect roundRectM8034RoundRectgG7oq9Y = RoundRectKt.m8034RoundRectgG7oq9Y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            if (Path == null) {
                Path = AndroidPath_androidKt.Path();
            } else {
                Path.reset();
            }
            Path.CC.addRoundRect$default(Path, roundRectM8034RoundRectgG7oq9Y, null, 2, null);
            this.tmpRoundRect = roundRectM8034RoundRectgG7oq9Y;
            this.tmpPath = Path;
        }
        Canvas.CC.m8200clipPathmtrdDE$default(canvas, Path, 0, 2, null);
    }

    public final android.graphics.Outline getAndroidOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getCacheIsDirty$ui() {
        return this.cacheIsDirty;
    }

    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    /* renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m10284isInOutlinek4lQ0M(long j2) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.outline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    /* renamed from: update-S_szKao, reason: not valid java name */
    public final boolean m10285updateS_szKao(androidx.compose.ui.graphics.Outline outline, float f2, boolean z, float f3, long j2) {
        this.cachedOutline.setAlpha(f2);
        boolean zN = x.n(this.outline, outline);
        boolean z2 = !zN;
        if (!zN) {
            this.outline = outline;
            this.cacheIsDirty = true;
        }
        this.rectSize = j2;
        boolean z3 = false;
        if (outline != null && (z || f3 > 0.0f)) {
            z3 = true;
        }
        if (this.outlineNeeded != z3) {
            this.outlineNeeded = z3;
            this.cacheIsDirty = true;
        }
        return z2;
    }
}
