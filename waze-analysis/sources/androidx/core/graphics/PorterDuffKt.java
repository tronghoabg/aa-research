package androidx.core.graphics;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PorterDuffKt {
    public static final PorterDuffColorFilter toColorFilter(PorterDuff.Mode mode, int i2) {
        x.f(mode, "<this>");
        return new PorterDuffColorFilter(i2, mode);
    }

    public static final PorterDuffXfermode toXfermode(PorterDuff.Mode mode) {
        x.f(mode, "<this>");
        return new PorterDuffXfermode(mode);
    }
}
