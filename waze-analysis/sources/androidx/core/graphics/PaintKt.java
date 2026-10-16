package androidx.core.graphics;

import android.graphics.Paint;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PaintKt {
    public static final boolean setBlendMode(Paint paint, BlendModeCompat blendModeCompat) {
        x.f(paint, "<this>");
        PaintCompat.setBlendMode(paint, blendModeCompat);
        return true;
    }
}
