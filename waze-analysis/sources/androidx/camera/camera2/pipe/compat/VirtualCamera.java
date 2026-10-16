package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface VirtualCamera {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.VirtualCamera$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: disconnect-TPqeGZw$default, reason: not valid java name */
        public static /* synthetic */ void m1106disconnectTPqeGZw$default(VirtualCamera virtualCamera, CameraError cameraError, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disconnect-TPqeGZw");
            }
            if (1 == (i2 & 1)) {
                cameraError = null;
            }
            virtualCamera.mo1105disconnectTPqeGZw(cameraError);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    /* renamed from: disconnect-TPqeGZw, reason: not valid java name */
    void mo1105disconnectTPqeGZw(CameraError cameraError);

    k<CameraState> getState();

    CameraState getValue();
}
