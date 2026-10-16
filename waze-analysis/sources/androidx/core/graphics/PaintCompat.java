package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import androidx.core.graphics.BlendModeUtils;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PaintCompat {

    /* compiled from: WazeSource */
    class Api29Impl {
        private Api29Impl() {
        }

        static void setBlendMode(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    private PaintCompat() {
    }

    public static boolean hasGlyph(Paint paint, String str) {
        return paint.hasGlyph(str);
    }

    public static boolean setBlendMode(Paint paint, BlendModeCompat blendModeCompat) {
        Api29Impl.setBlendMode(paint, blendModeCompat != null ? BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(blendModeCompat) : null);
        return true;
    }
}
