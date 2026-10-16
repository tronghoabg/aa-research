package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class Paint29 {
    public static final Paint29 INSTANCE = new Paint29();

    private Paint29() {
    }

    public static final void getTextBounds(Paint paint, CharSequence charSequence, int i2, int i3, Rect rect) {
        paint.getTextBounds(charSequence, i2, i3, rect);
    }
}
