package androidx.camera.camera2.impl;

import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import kotlinx.a.b;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class VideoUsageControl implements UseCaseCameraControl {
    private UseCaseCameraRequestControl requestControl;
    private final b videoUsage = h.e.b.f(0);

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public abstract UseCaseCameraControl provideControls(VideoUsageControl videoUsageControl);
    }

    public final void decrementUsage() {
        int iA = this.videoUsage.a();
        if (iA >= 0) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "decrementUsage: videoUsage = " + iA);
                return;
            }
            return;
        }
        Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "decrementUsage: videoUsage = " + iA + ", which is less than 0!");
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public UseCaseCameraRequestControl getRequestControl() {
        return this.requestControl;
    }

    public final void incrementUsage() {
        int iE = this.videoUsage.e();
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "incrementUsage: videoUsage = " + iE);
        }
    }

    public final boolean isInVideoUsage() {
        int iD = this.videoUsage.d();
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "isInVideoUsage: videoUsage = " + iD);
        }
        return iD > 0;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        this.videoUsage.f(0);
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "reset: videoUsage = 0");
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this.requestControl = useCaseCameraRequestControl;
    }
}
