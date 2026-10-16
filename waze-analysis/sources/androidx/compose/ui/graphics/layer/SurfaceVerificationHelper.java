package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SurfaceVerificationHelper {
    public static final SurfaceVerificationHelper INSTANCE = new SurfaceVerificationHelper();

    private SurfaceVerificationHelper() {
    }

    public final Canvas lockHardwareCanvas(Surface surface) {
        return surface.lockHardwareCanvas();
    }
}
