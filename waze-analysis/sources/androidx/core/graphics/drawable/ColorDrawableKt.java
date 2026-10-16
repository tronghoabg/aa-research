package androidx.core.graphics.drawable;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ColorDrawableKt {
    public static final ColorDrawable toDrawable(Color color) {
        x.f(color, "<this>");
        return new ColorDrawable(color.toArgb());
    }

    public static final ColorDrawable toDrawable(int i2) {
        return new ColorDrawable(i2);
    }
}
