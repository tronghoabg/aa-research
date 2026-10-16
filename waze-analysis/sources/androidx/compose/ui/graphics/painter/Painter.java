package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class Painter {
    public static final int $stable = 8;
    private ColorFilter colorFilter;
    private Paint layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final l<DrawScope, ab> drawLambda = new Painter$drawLambda$1(this);

    private final void configureAlpha(float f2) {
        if (this.alpha == f2) {
            return;
        }
        if (!applyAlpha(f2)) {
            if (f2 == 1.0f) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setAlpha(f2);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setAlpha(f2);
                this.useLayer = true;
            }
        }
        this.alpha = f2;
    }

    private final void configureColorFilter(ColorFilter colorFilter) {
        if (x.n(this.colorFilter, colorFilter)) {
            return;
        }
        if (!applyColorFilter(colorFilter)) {
            if (colorFilter == null) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setColorFilter(null);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setColorFilter(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    private final void configureLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
    }

    /* renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m8964drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j2, float f2, ColorFilter colorFilter, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i2 & 2) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        if ((i2 & 4) != 0) {
            colorFilter = null;
        }
        painter.m8965drawx_KDEd0(drawScope, j2, f3, colorFilter);
    }

    private final Paint obtainPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        this.layerPaint = Paint;
        return Paint;
    }

    protected boolean applyAlpha(float f2) {
        return false;
    }

    protected boolean applyColorFilter(ColorFilter colorFilter) {
        return false;
    }

    protected boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        return false;
    }

    /* renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m8965drawx_KDEd0(DrawScope drawScope, long j2, float f2, ColorFilter colorFilter) {
        configureAlpha(f2);
        configureColorFilter(colorFilter);
        configureLayoutDirection(drawScope.getLayoutDirection());
        int i2 = (int) (j2 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32)) - Float.intBitsToFloat(i2);
        long jMo8751getSizeNHjbRc = drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) jMo8751getSizeNHjbRc) - Float.intBitsToFloat(i3);
        drawScope.getDrawContext().getTransform().inset(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        float f3 = -fIntBitsToFloat;
        float f4 = -fIntBitsToFloat2;
        if (f2 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i2) > 0.0f && Float.intBitsToFloat(i3) > 0.0f) {
                    if (this.useLayer) {
                        long jM7996getZeroF1C5BW0 = Offset.Companion.m7996getZeroF1C5BW0();
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                        Rect rectM8020Recttz77jQw = RectKt.m8020Recttz77jQw(jM7996getZeroF1C5BW0, (Float.floatToRawIntBits(fIntBitsToFloat4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        Canvas canvas = drawScope.getDrawContext().getCanvas();
                        try {
                            canvas.saveLayer(rectM8020Recttz77jQw, obtainPaint());
                            onDraw(drawScope);
                            canvas.restore();
                        } catch (Throwable th) {
                            canvas.restore();
                            throw th;
                        }
                    } else {
                        onDraw(drawScope);
                    }
                }
            } finally {
                drawScope.getDrawContext().getTransform().inset(0.0f, 0.0f, f3, f4);
            }
        }
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo8959getIntrinsicSizeNHjbRc();

    protected abstract void onDraw(DrawScope drawScope);
}
