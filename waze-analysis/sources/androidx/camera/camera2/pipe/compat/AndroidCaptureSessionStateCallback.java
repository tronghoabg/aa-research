package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidCaptureSessionStateCallback extends CameraCaptureSession.StateCallback {
    private final kotlinx.a.d<SessionStateCallback> _lastStateCallback;
    private final Handler callbackHandler;
    private final CameraErrorListener cameraErrorListener;
    private final kotlinx.a.d<CameraCaptureSessionWrapper> captureSession;
    private final CameraDeviceWrapper device;
    private final CameraInterop.CaptureSessionListener interopCaptureSessionListener;
    private final CameraCaptureSessionWrapper.StateCallback stateCallback;

    public AndroidCaptureSessionStateCallback(CameraDeviceWrapper cameraDeviceWrapper, CameraCaptureSessionWrapper.StateCallback stateCallback, SessionStateCallback sessionStateCallback, CameraErrorListener cameraErrorListener, CameraInterop.CaptureSessionListener captureSessionListener, Handler handler) {
        x.f(cameraDeviceWrapper, "device");
        x.f(stateCallback, "stateCallback");
        x.f(cameraErrorListener, "cameraErrorListener");
        x.f(handler, "callbackHandler");
        this.device = cameraDeviceWrapper;
        this.stateCallback = stateCallback;
        this.cameraErrorListener = cameraErrorListener;
        this.interopCaptureSessionListener = captureSessionListener;
        this.callbackHandler = handler;
        this._lastStateCallback = h.e.b.h(sessionStateCallback);
        this.captureSession = h.e.b.h(null);
    }

    private final void finalizeLastSession() {
        SessionStateCallback sessionStateCallback = (SessionStateCallback) this._lastStateCallback.a(null);
        if (sessionStateCallback != null) {
            sessionStateCallback.onSessionFinalized();
        }
    }

    private final void finalizeSession() {
        finalizeLastSession();
        this.stateCallback.onSessionFinalized();
    }

    private final CameraCaptureSessionWrapper getWrapped(CameraCaptureSession cameraCaptureSession, CameraErrorListener cameraErrorListener) {
        CameraCaptureSessionWrapper cameraCaptureSessionWrapper = (CameraCaptureSessionWrapper) this.captureSession.b();
        if (cameraCaptureSessionWrapper != null) {
            return cameraCaptureSessionWrapper;
        }
        CameraCaptureSessionWrapper cameraCaptureSessionWrapperWrapSession = wrapSession(cameraCaptureSession, cameraErrorListener);
        if (this.captureSession.e(null, cameraCaptureSessionWrapperWrapSession)) {
            return cameraCaptureSessionWrapperWrapSession;
        }
        Object objB = this.captureSession.b();
        x.c(objB);
        return (CameraCaptureSessionWrapper) objB;
    }

    private final CameraCaptureSessionWrapper wrapSession(CameraCaptureSession cameraCaptureSession, CameraErrorListener cameraErrorListener) {
        boolean z = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession;
        CameraDeviceWrapper cameraDeviceWrapper = this.device;
        return z ? new AndroidCameraConstrainedHighSpeedCaptureSession(cameraDeviceWrapper, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, cameraErrorListener, this.callbackHandler) : new AndroidCameraCaptureSession(cameraDeviceWrapper, cameraCaptureSession, cameraErrorListener, this.callbackHandler);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        x.f(cameraCaptureSession, "session");
        CameraErrorListener cameraErrorListener = this.cameraErrorListener;
        CameraCaptureSessionWrapper wrapped = getWrapped(cameraCaptureSession, cameraErrorListener);
        this.stateCallback.onActive(getWrapped(cameraCaptureSession, cameraErrorListener));
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo241onActiverphkYDA(this.device.mo985getCameraIdDz_R5H8(), wrapped.mo982getId159jkk4());
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        x.f(cameraCaptureSession, "session");
        CameraErrorListener cameraErrorListener = this.cameraErrorListener;
        CameraCaptureSessionWrapper wrapped = getWrapped(cameraCaptureSession, cameraErrorListener);
        this.stateCallback.onCaptureQueueEmpty(getWrapped(cameraCaptureSession, cameraErrorListener));
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo242onCaptureQueueEmptyrphkYDA(this.device.mo985getCameraIdDz_R5H8(), wrapped.mo982getId159jkk4());
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        x.f(cameraCaptureSession, "session");
        CameraErrorListener cameraErrorListener = this.cameraErrorListener;
        CameraCaptureSessionWrapper wrapped = getWrapped(cameraCaptureSession, cameraErrorListener);
        this.stateCallback.onClosed(getWrapped(cameraCaptureSession, cameraErrorListener));
        finalizeSession();
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo243onClosedrphkYDA(this.device.mo985getCameraIdDz_R5H8(), wrapped.mo982getId159jkk4());
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        x.f(cameraCaptureSession, "session");
        CameraCaptureSessionWrapper.StateCallback stateCallback = this.stateCallback;
        CameraCaptureSessionWrapper wrapped = getWrapped(cameraCaptureSession, this.cameraErrorListener);
        stateCallback.onConfigureFailed(wrapped);
        finalizeSession();
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo244onConfigureFailedrphkYDA(this.device.mo985getCameraIdDz_R5H8(), wrapped.mo982getId159jkk4());
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        x.f(cameraCaptureSession, "session");
        CameraCaptureSessionWrapper.StateCallback stateCallback = this.stateCallback;
        CameraCaptureSessionWrapper wrapped = getWrapped(cameraCaptureSession, this.cameraErrorListener);
        stateCallback.onConfigured(wrapped);
        finalizeLastSession();
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo245onConfiguredrphkYDA(this.device.mo985getCameraIdDz_R5H8(), wrapped.mo982getId159jkk4());
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        x.f(cameraCaptureSession, "session");
        CameraErrorListener cameraErrorListener = this.cameraErrorListener;
        CameraCaptureSessionWrapper wrapped = getWrapped(cameraCaptureSession, cameraErrorListener);
        this.stateCallback.onReady(getWrapped(cameraCaptureSession, cameraErrorListener));
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo246onReadyrphkYDA(this.device.mo985getCameraIdDz_R5H8(), wrapped.mo982getId159jkk4());
        }
    }

    public /* synthetic */ AndroidCaptureSessionStateCallback(CameraDeviceWrapper cameraDeviceWrapper, CameraCaptureSessionWrapper.StateCallback stateCallback, SessionStateCallback sessionStateCallback, CameraErrorListener cameraErrorListener, CameraInterop.CaptureSessionListener captureSessionListener, Handler handler, int i2, o oVar) {
        this(cameraDeviceWrapper, stateCallback, sessionStateCallback, cameraErrorListener, (i2 & 16) != 0 ? null : captureSessionListener, handler);
    }
}
