package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.core.impl.SessionConfig;
import h.a.i;
import h.e.b;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;
import kotlinx.a.d;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraInteropStateCallbackRepository {
    private final CameraDeviceStateCallbacks _deviceStateCallback = new CameraDeviceStateCallbacks();
    private final CaptureSessionStateCallbacks _sessionStateCallback = new CaptureSessionStateCallbacks();

    /* compiled from: WazeSource */
    public final class CameraDeviceStateCallbacks extends CameraDevice.StateCallback {
        private d<List<CameraDevice.StateCallback>> callbacks = b.h(i.h());

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            x.f(cameraDevice, "cameraDevice");
            Iterator it = ((List) this.callbacks.b()).iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            x.f(cameraDevice, "cameraDevice");
            Iterator it = ((List) this.callbacks.b()).iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i2) {
            x.f(cameraDevice, "cameraDevice");
            Iterator it = ((List) this.callbacks.b()).iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i2);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            x.f(cameraDevice, "cameraDevice");
            Iterator it = ((List) this.callbacks.b()).iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
            }
        }

        public final void updateCallbacks$camera_camera2(SessionConfig sessionConfig) {
            x.f(sessionConfig, "sessionConfig");
            d<List<CameraDevice.StateCallback>> dVar = this.callbacks;
            List<CameraDevice.StateCallback> deviceStateCallbacks = sessionConfig.getDeviceStateCallbacks();
            x.e(deviceStateCallbacks, "getDeviceStateCallbacks(...)");
            dVar.d(i.ao(deviceStateCallbacks));
        }
    }

    /* compiled from: WazeSource */
    public final class CaptureSessionStateCallbacks implements CameraInterop.CaptureSessionListener {
        private final RejectOperationCameraCaptureSession placeholderSession = new RejectOperationCameraCaptureSession();
        private d<List<CameraCaptureSession.StateCallback>> callbacks = b.h(i.h());

        /* compiled from: WazeSource */
        final class Api26CompatImpl {
            public static final Api26CompatImpl INSTANCE = new Api26CompatImpl();

            private Api26CompatImpl() {
            }

            public static final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession, d<List<CameraCaptureSession.StateCallback>> dVar) {
                x.f(cameraCaptureSession, "session");
                x.f(dVar, "callbacks");
                Iterator it = ((List) dVar.b()).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onActive-rphkYDA, reason: not valid java name */
        public void mo241onActiverphkYDA(String str, int i2) {
            x.f(str, "cameraId");
            Iterator it = ((List) this.callbacks.b()).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onActive(this.placeholderSession);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onCaptureQueueEmpty-rphkYDA, reason: not valid java name */
        public void mo242onCaptureQueueEmptyrphkYDA(String str, int i2) {
            x.f(str, "cameraId");
            Api26CompatImpl.onCaptureQueueEmpty(this.placeholderSession, this.callbacks);
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onClosed-rphkYDA, reason: not valid java name */
        public void mo243onClosedrphkYDA(String str, int i2) {
            x.f(str, "cameraId");
            Iterator it = ((List) this.callbacks.b()).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onClosed(this.placeholderSession);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onConfigureFailed-rphkYDA, reason: not valid java name */
        public void mo244onConfigureFailedrphkYDA(String str, int i2) {
            x.f(str, "cameraId");
            Iterator it = ((List) this.callbacks.b()).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(this.placeholderSession);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onConfigured-rphkYDA, reason: not valid java name */
        public void mo245onConfiguredrphkYDA(String str, int i2) {
            x.f(str, "cameraId");
            Iterator it = ((List) this.callbacks.b()).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigured(this.placeholderSession);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onReady-rphkYDA, reason: not valid java name */
        public void mo246onReadyrphkYDA(String str, int i2) {
            x.f(str, "cameraId");
            Iterator it = ((List) this.callbacks.b()).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onReady(this.placeholderSession);
            }
        }

        @Override // androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener
        /* renamed from: onSurfacePrepared-GyX_H3Q, reason: not valid java name */
        public void mo247onSurfacePreparedGyX_H3Q(String str, int i2, Surface surface) {
            x.f(str, "cameraId");
            x.f(surface, "surface");
            Iterator it = ((List) this.callbacks.b()).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(this.placeholderSession, surface);
            }
        }

        public final void updateCallbacks$camera_camera2(SessionConfig sessionConfig) {
            x.f(sessionConfig, "sessionConfig");
            d<List<CameraCaptureSession.StateCallback>> dVar = this.callbacks;
            List<CameraCaptureSession.StateCallback> sessionStateCallbacks = sessionConfig.getSessionStateCallbacks();
            x.e(sessionStateCallbacks, "getSessionStateCallbacks(...)");
            dVar.d(i.ao(sessionStateCallbacks));
        }
    }

    public final CameraDeviceStateCallbacks getDeviceStateCallback() {
        return this._deviceStateCallback;
    }

    public final CameraInterop.CaptureSessionListener getSessionStateCallback() {
        return this._sessionStateCallback;
    }

    public final void updateCallbacks(SessionConfig sessionConfig) {
        x.f(sessionConfig, "sessionConfig");
        this._deviceStateCallback.updateCallbacks$camera_camera2(sessionConfig);
        this._sessionStateCallback.updateCallbacks$camera_camera2(sessionConfig);
    }
}
