package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Blur_androidKt {
    public static final BlurMaskFilter BlurFilter(float f2) {
        return new BlurMaskFilter(f2, BlurMaskFilter.Blur.NORMAL);
    }

    public static final void setBlurFilter(Paint paint, BlurMaskFilter blurMaskFilter) {
        AndroidPaint_androidKt.getNativePaint(paint).setMaskFilter(blurMaskFilter);
    }
}
