package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import h.g.b.o;
import h.g.b.x;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidExtensionSessionStateCallback extends CameraExtensionSession$StateCallback {
    private final kotlinx.a.d<SessionStateCallback> _lastStateCallback;
    private final Executor callbackExecutor;
    private final CameraErrorListener cameraErrorListener;
    private final CameraDeviceWrapper device;
    private final kotlinx.a.d<CameraExtensionSessionWrapper> extensionSession;
    private final CameraInterop.CaptureSessionListener interopCaptureSessionListener;
    private final CameraExtensionSessionWrapper.StateCallback stateCallback;

    public AndroidExtensionSessionStateCallback(CameraDeviceWrapper cameraDeviceWrapper, CameraExtensionSessionWrapper.StateCallback stateCallback, SessionStateCallback sessionStateCallback, CameraErrorListener cameraErrorListener, CameraInterop.CaptureSessionListener captureSessionListener, Executor executor) {
        x.f(cameraDeviceWrapper, "device");
        x.f(stateCallback, "stateCallback");
        x.f(cameraErrorListener, "cameraErrorListener");
        x.f(executor, "callbackExecutor");
        this.device = cameraDeviceWrapper;
        this.stateCallback = stateCallback;
        this.cameraErrorListener = cameraErrorListener;
        this.interopCaptureSessionListener = captureSessionListener;
        this.callbackExecutor = executor;
        this._lastStateCallback = h.e.b.h(sessionStateCallback);
        this.extensionSession = h.e.b.h(null);
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

    private final CameraExtensionSessionWrapper getWrapped(CameraExtensionSession cameraExtensionSession, CameraErrorListener cameraErrorListener) {
        CameraExtensionSessionWrapper cameraExtensionSessionWrapper = (CameraExtensionSessionWrapper) this.extensionSession.b();
        if (cameraExtensionSessionWrapper != null) {
            return cameraExtensionSessionWrapper;
        }
        CameraExtensionSessionWrapper cameraExtensionSessionWrapperWrapSession = wrapSession(cameraExtensionSession, cameraErrorListener);
        if (this.extensionSession.e(null, cameraExtensionSessionWrapperWrapSession)) {
            return cameraExtensionSessionWrapperWrapSession;
        }
        Object objB = this.extensionSession.b();
        x.c(objB);
        return (CameraExtensionSessionWrapper) objB;
    }

    private final CameraExtensionSessionWrapper wrapSession(CameraExtensionSession cameraExtensionSession, CameraErrorListener cameraErrorListener) {
        return new AndroidCameraExtensionSession(this.device, cameraExtensionSession, cameraErrorListener, this.callbackExecutor);
    }

    public void onClosed(CameraExtensionSession cameraExtensionSession) {
        x.f(cameraExtensionSession, "session");
        CameraErrorListener cameraErrorListener = this.cameraErrorListener;
        CameraExtensionSessionWrapper wrapped = getWrapped(cameraExtensionSession, cameraErrorListener);
        this.stateCallback.onClosed(getWrapped(cameraExtensionSession, cameraErrorListener));
        finalizeSession();
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo243onClosedrphkYDA(this.device.mo985getCameraIdDz_R5H8(), wrapped.mo982getId159jkk4());
        }
    }

    public void onConfigureFailed(CameraExtensionSession cameraExtensionSession) {
        x.f(cameraExtensionSession, "session");
        CameraExtensionSessionWrapper.StateCallback stateCallback = this.stateCallback;
        CameraExtensionSessionWrapper wrapped = getWrapped(cameraExtensionSession, this.cameraErrorListener);
        stateCallback.onConfigureFailed(wrapped);
        finalizeSession();
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo244onConfigureFailedrphkYDA(this.device.mo985getCameraIdDz_R5H8(), wrapped.mo982getId159jkk4());
        }
    }

    public void onConfigured(CameraExtensionSession cameraExtensionSession) {
        x.f(cameraExtensionSession, "session");
        CameraExtensionSessionWrapper.StateCallback stateCallback = this.stateCallback;
        CameraExtensionSessionWrapper wrapped = getWrapped(cameraExtensionSession, this.cameraErrorListener);
        stateCallback.onConfigured(wrapped);
        finalizeLastSession();
        CameraInterop.CaptureSessionListener captureSessionListener = this.interopCaptureSessionListener;
        if (captureSessionListener != null) {
            captureSessionListener.mo245onConfiguredrphkYDA(this.device.mo985getCameraIdDz_R5H8(), wrapped.mo982getId159jkk4());
        }
    }

    public /* synthetic */ AndroidExtensionSessionStateCallback(CameraDeviceWrapper cameraDeviceWrapper, CameraExtensionSessionWrapper.StateCallback stateCallback, SessionStateCallback sessionStateCallback, CameraErrorListener cameraErrorListener, CameraInterop.CaptureSessionListener captureSessionListener, Executor executor, int i2, o oVar) {
        this(cameraDeviceWrapper, stateCallback, sessionStateCallback, cameraErrorListener, (i2 & 16) != 0 ? null : captureSessionListener, executor);
    }
}
