package androidx.camera.camera2.interop;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.Camera2ImplConfigKt;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2Interop {

    /* compiled from: WazeSource */
    public final class Extender<T> {
        private ExtendableBuilder<T> baseBuilder;

        public Extender(ExtendableBuilder<T> extendableBuilder) {
            x.f(extendableBuilder, "baseBuilder");
            this.baseBuilder = extendableBuilder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <ValueT> Extender<T> setCaptureRequestOption(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            x.f(key, "key");
            this.baseBuilder.getMutableConfig().insertOption(Camera2ImplConfigKt.createCaptureRequestOption(key), Config.OptionPriority.ALWAYS_OVERRIDE, valuet);
            return this;
        }

        public final Extender<T> setCaptureRequestTemplate(int i2) {
            this.baseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.TEMPLATE_TYPE_OPTION, Integer.valueOf(i2));
            return this;
        }

        public final Extender<T> setDeviceStateCallback(CameraDevice.StateCallback stateCallback) {
            x.f(stateCallback, "stateCallback");
            this.baseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.DEVICE_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }

        public final Extender<T> setPhysicalCameraId(String str) {
            x.f(str, "cameraId");
            this.baseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION, str);
            return this;
        }

        public final Extender<T> setSessionCaptureCallback(CameraCaptureSession.CaptureCallback captureCallback) {
            x.f(captureCallback, "captureCallback");
            this.baseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.SESSION_CAPTURE_CALLBACK_OPTION, captureCallback);
            return this;
        }

        public final Extender<T> setSessionStateCallback(CameraCaptureSession.StateCallback stateCallback) {
            x.f(stateCallback, "stateCallback");
            this.baseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.SESSION_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }

        public final Extender<T> setStreamUseCase(long j2) {
            this.baseBuilder.getMutableConfig().insertOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION, Long.valueOf(j2));
            return this;
        }
    }

    private Camera2Interop() {
    }
}
