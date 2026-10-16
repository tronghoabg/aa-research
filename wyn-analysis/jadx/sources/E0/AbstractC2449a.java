package e0;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.view.Surface;
import android.view.SurfaceControl;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2449a {
    public static /* synthetic */ BlendModeColorFilter b(int i5, BlendMode blendMode) {
        return new BlendModeColorFilter(i5, blendMode);
    }

    public static /* synthetic */ Surface f(SurfaceControl surfaceControl) {
        return new Surface(surfaceControl);
    }

    public static /* synthetic */ SurfaceControl.Builder g() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction h() {
        return new SurfaceControl.Transaction();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction j(Object obj) {
        return (SurfaceControl.Transaction) obj;
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void s() {
    }
}
