package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CanvasKt {
    public static final Canvas Canvas(ImageBitmap imageBitmap) {
        return AndroidCanvas_androidKt.ActualCanvas(imageBitmap);
    }

    public static final void rotate(Canvas canvas, float f2, float f3, float f4) {
        if (f2 == 0.0f) {
            return;
        }
        canvas.translate(f3, f4);
        canvas.rotate(f2);
        canvas.translate(-f3, -f4);
    }

    public static final void rotateRad(Canvas canvas, float f2, float f3, float f4) {
        rotate(canvas, DegreesKt.degrees(f2), f3, f4);
    }

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        rotateRad(canvas, f2, f3, f4);
    }

    public static final void scale(Canvas canvas, float f2, float f3, float f4, float f5) {
        if (f2 == 1.0f && f3 == 1.0f) {
            return;
        }
        canvas.translate(f4, f5);
        canvas.scale(f2, f3);
        canvas.translate(-f4, -f5);
    }

    public static /* synthetic */ void scale$default(Canvas canvas, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = f2;
        }
        scale(canvas, f2, f3, f4, f5);
    }

    public static final void withSave(Canvas canvas, a<ab> aVar) {
        try {
            canvas.save();
            aVar.invoke();
        } finally {
            canvas.restore();
        }
    }

    public static final void withSaveLayer(Canvas canvas, Rect rect, Paint paint, a<ab> aVar) {
        try {
            canvas.saveLayer(rect, paint);
            aVar.invoke();
        } finally {
            canvas.restore();
        }
    }
}
