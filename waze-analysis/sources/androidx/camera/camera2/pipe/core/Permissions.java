package androidx.camera.camera2.pipe.core;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.camera.camera2.pipe.config.CameraPipeContext;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Permissions {
    private volatile boolean _hasCameraPermission;
    private final Context cameraPipeContext;

    public Permissions(@CameraPipeContext Context context) {
        x.f(context, "cameraPipeContext");
        this.cameraPipeContext = context;
    }

    private final boolean checkCameraPermission() {
        if (x.n(Build.FINGERPRINT, "robolectric")) {
            return true;
        }
        if (!this._hasCameraPermission) {
            Trace.beginSection("CXCP#checkCameraPermission");
            if (this.cameraPipeContext.checkSelfPermission("android.permission.CAMERA") == 0) {
                this._hasCameraPermission = true;
            }
            Trace.endSection();
        }
        return this._hasCameraPermission;
    }

    public final boolean getHasCameraPermission() {
        return checkCameraPermission();
    }
}
