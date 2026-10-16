package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CanvasCompatM {
    public static final CanvasCompatM INSTANCE = new CanvasCompatM();

    private CanvasCompatM() {
    }

    public final void drawTextRun(Canvas canvas, CharSequence charSequence, int i2, int i3, int i4, int i5, float f2, float f3, boolean z, Paint paint) {
        canvas.drawTextRun(charSequence, i2, i3, i4, i5, f2, f3, z, paint);
    }

    public final void drawTextRun(Canvas canvas, char[] cArr, int i2, int i3, int i4, int i5, float f2, float f3, boolean z, Paint paint) {
        canvas.drawTextRun(cArr, i2, i3, i4, i5, f2, f3, z, paint);
    }
}
