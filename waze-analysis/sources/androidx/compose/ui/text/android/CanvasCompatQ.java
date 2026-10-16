package androidx.compose.ui.text.android;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CanvasCompatQ {
    public static final CanvasCompatQ INSTANCE = new CanvasCompatQ();

    private CanvasCompatQ() {
    }

    public final void disableZ(Canvas canvas) {
        canvas.disableZ();
    }

    public final void drawColor(Canvas canvas, int i2, BlendMode blendMode) {
        canvas.drawColor(i2, blendMode);
    }

    public final void drawDoubleRoundRect(Canvas canvas, RectF rectF, float f2, float f3, RectF rectF2, float f4, float f5, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f2, f3, rectF2, f4, f5, paint);
    }

    public final void drawRenderNode(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void drawTextRun(Canvas canvas, MeasuredText measuredText, int i2, int i3, int i4, int i5, float f2, float f3, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i2, i3, i4, i5, f2, f3, z, paint);
    }

    public final void enableZ(Canvas canvas) {
        canvas.enableZ();
    }

    public final void drawColor(Canvas canvas, long j2) {
        canvas.drawColor(j2);
    }

    public final void drawDoubleRoundRect(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void drawColor(Canvas canvas, long j2, BlendMode blendMode) {
        canvas.drawColor(j2, blendMode);
    }
}
