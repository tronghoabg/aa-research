package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExtensionSessionState implements CameraExtensionSessionWrapper.StateCallback {
    private final CaptureSessionState captureSessionState;

    public ExtensionSessionState(CaptureSessionState captureSessionState) {
        x.f(captureSessionState, "captureSessionState");
        this.captureSessionState = captureSessionState;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper.StateCallback
    public void onClosed(CameraExtensionSessionWrapper cameraExtensionSessionWrapper) {
        x.f(cameraExtensionSessionWrapper, "session");
        this.captureSessionState.onClosed(cameraExtensionSessionWrapper);
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper.StateCallback
    public void onConfigureFailed(CameraExtensionSessionWrapper cameraExtensionSessionWrapper) {
        x.f(cameraExtensionSessionWrapper, "session");
        this.captureSessionState.onConfigureFailed(cameraExtensionSessionWrapper);
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper.StateCallback
    public void onConfigured(CameraExtensionSessionWrapper cameraExtensionSessionWrapper) {
        x.f(cameraExtensionSessionWrapper, "session");
        this.captureSessionState.onConfigured(cameraExtensionSessionWrapper);
    }

    @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
    public void onSessionDisconnected() {
        this.captureSessionState.onSessionDisconnected();
    }

    @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
    public void onSessionFinalized() throws Exception {
        this.captureSessionState.onSessionFinalized();
    }
}
