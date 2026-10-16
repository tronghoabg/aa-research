package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.view.Surface;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper;
import androidx.camera.camera2.pipe.compat.CameraExtensionSessionWrapper;
import androidx.camera.camera2.pipe.core.Log;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VirtualAndroidCameraDevice implements CameraDeviceWrapper {
    private final AndroidCameraDevice androidCameraDevice;
    private boolean disconnected;
    private final Object lock;

    public VirtualAndroidCameraDevice(AndroidCameraDevice androidCameraDevice) {
        x.f(androidCameraDevice, "androidCameraDevice");
        this.androidCameraDevice = androidCameraDevice;
        this.lock = new Object();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /* renamed from: createCaptureRequest-2PPcXtw */
    public CaptureRequest.Builder mo983createCaptureRequest2PPcXtw(int i2) {
        CaptureRequest.Builder builderMo983createCaptureRequest2PPcXtw;
        synchronized (this.lock) {
            if (this.disconnected) {
                builderMo983createCaptureRequest2PPcXtw = null;
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "createCaptureRequest failed: Virtual device disconnected");
                }
            } else {
                builderMo983createCaptureRequest2PPcXtw = this.androidCameraDevice.mo983createCaptureRequest2PPcXtw(i2);
            }
        }
        return builderMo983createCaptureRequest2PPcXtw;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public boolean createCaptureSession(List<? extends Surface> list, CameraCaptureSessionWrapper.StateCallback stateCallback) {
        boolean zCreateCaptureSession;
        x.f(list, "outputs");
        x.f(stateCallback, "stateCallback");
        synchronized (this.lock) {
            if (this.disconnected) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "createCaptureSession failed: Virtual device disconnected");
                }
                stateCallback.onSessionFinalized();
                zCreateCaptureSession = false;
            } else {
                zCreateCaptureSession = this.androidCameraDevice.createCaptureSession(list, stateCallback);
            }
        }
        return zCreateCaptureSession;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public boolean createCaptureSessionByOutputConfigurations(List<? extends OutputConfigurationWrapper> list, CameraCaptureSessionWrapper.StateCallback stateCallback) {
        boolean zCreateCaptureSessionByOutputConfigurations;
        x.f(list, "outputConfigurations");
        x.f(stateCallback, "stateCallback");
        synchronized (this.lock) {
            if (this.disconnected) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected");
                }
                stateCallback.onSessionFinalized();
                zCreateCaptureSessionByOutputConfigurations = false;
            } else {
                zCreateCaptureSessionByOutputConfigurations = this.androidCameraDevice.createCaptureSessionByOutputConfigurations(list, stateCallback);
            }
        }
        return zCreateCaptureSessionByOutputConfigurations;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public boolean createConstrainedHighSpeedCaptureSession(List<? extends Surface> list, CameraCaptureSessionWrapper.StateCallback stateCallback) {
        boolean zCreateConstrainedHighSpeedCaptureSession;
        x.f(list, "outputs");
        x.f(stateCallback, "stateCallback");
        synchronized (this.lock) {
            if (this.disconnected) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected");
                }
                stateCallback.onSessionFinalized();
                zCreateConstrainedHighSpeedCaptureSession = false;
            } else {
                zCreateConstrainedHighSpeedCaptureSession = this.androidCameraDevice.createConstrainedHighSpeedCaptureSession(list, stateCallback);
            }
        }
        return zCreateConstrainedHighSpeedCaptureSession;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public boolean createExtensionSession(ExtensionSessionConfigData extensionSessionConfigData) {
        boolean zCreateExtensionSession;
        x.f(extensionSessionConfigData, "config");
        synchronized (this.lock) {
            if (this.disconnected) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "createExtensionSession failed: Virtual device disconnected");
                }
                CameraExtensionSessionWrapper.StateCallback extensionStateCallback = extensionSessionConfigData.getExtensionStateCallback();
                x.c(extensionStateCallback);
                extensionStateCallback.onSessionFinalized();
                zCreateExtensionSession = false;
            } else {
                zCreateExtensionSession = this.androidCameraDevice.createExtensionSession(extensionSessionConfigData);
            }
        }
        return zCreateExtensionSession;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public CaptureRequest.Builder createReprocessCaptureRequest(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder builderCreateReprocessCaptureRequest;
        x.f(totalCaptureResult, "inputResult");
        synchronized (this.lock) {
            if (this.disconnected) {
                builderCreateReprocessCaptureRequest = null;
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "createReprocessCaptureRequest failed: Virtual device disconnected");
                }
            } else {
                builderCreateReprocessCaptureRequest = this.androidCameraDevice.createReprocessCaptureRequest(totalCaptureResult);
            }
        }
        return builderCreateReprocessCaptureRequest;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public boolean createReprocessableCaptureSession(InputConfiguration inputConfiguration, List<? extends Surface> list, CameraCaptureSessionWrapper.StateCallback stateCallback) {
        boolean zCreateReprocessableCaptureSession;
        x.f(inputConfiguration, "input");
        x.f(list, "outputs");
        x.f(stateCallback, "stateCallback");
        synchronized (this.lock) {
            if (this.disconnected) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "createReprocessableCaptureSession failed: Virtual device disconnected");
                }
                stateCallback.onSessionFinalized();
                zCreateReprocessableCaptureSession = false;
            } else {
                zCreateReprocessableCaptureSession = this.androidCameraDevice.createReprocessableCaptureSession(inputConfiguration, list, stateCallback);
            }
        }
        return zCreateReprocessableCaptureSession;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public boolean createReprocessableCaptureSessionByConfigurations(InputConfigData inputConfigData, List<? extends OutputConfigurationWrapper> list, CameraCaptureSessionWrapper.StateCallback stateCallback) {
        boolean zCreateReprocessableCaptureSessionByConfigurations;
        x.f(inputConfigData, "inputConfig");
        x.f(list, "outputs");
        x.f(stateCallback, "stateCallback");
        synchronized (this.lock) {
            if (this.disconnected) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "createReprocessableCaptureSessionByConfigurations failed: Virtual device disconnected");
                }
                stateCallback.onSessionFinalized();
                zCreateReprocessableCaptureSessionByConfigurations = false;
            } else {
                zCreateReprocessableCaptureSessionByConfigurations = this.androidCameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfigData, list, stateCallback);
            }
        }
        return zCreateReprocessableCaptureSessionByConfigurations;
    }

    public final void disconnect$camera_camera2_pipe() {
        synchronized (this.lock) {
            this.disconnected = true;
        }
    }

    public final AndroidCameraDevice getAndroidCameraDevice$camera_camera2_pipe() {
        return this.androidCameraDevice;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /* renamed from: getCameraAudioRestriction-_b5Q8KE */
    public int mo984getCameraAudioRestriction_b5Q8KE() {
        return this.androidCameraDevice.mo984getCameraAudioRestriction_b5Q8KE();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    /* renamed from: getCameraId-Dz_R5H8 */
    public String mo985getCameraIdDz_R5H8() {
        return this.androidCameraDevice.mo985getCameraIdDz_R5H8();
    }

    @Override // androidx.camera.camera2.pipe.compat.AudioRestrictionController.Listener
    /* renamed from: onCameraAudioRestrictionUpdated-LwUUkyU */
    public void mo986onCameraAudioRestrictionUpdatedLwUUkyU(int i2) {
        this.androidCameraDevice.mo986onCameraAudioRestrictionUpdatedLwUUkyU(i2);
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public void onDeviceClosed() {
        this.androidCameraDevice.onDeviceClosed();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public void onDeviceClosing() {
        this.androidCameraDevice.onDeviceClosing();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return (T) this.androidCameraDevice.unwrapAs(cls);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraDeviceWrapper
    public boolean createCaptureSession(SessionConfigData sessionConfigData) {
        boolean zCreateCaptureSession;
        x.f(sessionConfigData, "config");
        synchronized (this.lock) {
            if (this.disconnected) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "createCaptureSession failed: Virtual device disconnected");
                }
                sessionConfigData.getStateCallback().onSessionFinalized();
                zCreateCaptureSession = false;
            } else {
                zCreateCaptureSession = this.androidCameraDevice.createCaptureSession(sessionConfigData);
            }
        }
        return zCreateCaptureSession;
    }
}
