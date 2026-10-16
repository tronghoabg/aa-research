package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.Trace;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidCameraConstrainedHighSpeedCaptureSession extends AndroidCameraCaptureSession implements CameraConstrainedHighSpeedCaptureSessionWrapper {
    private final CameraConstrainedHighSpeedCaptureSession session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCameraConstrainedHighSpeedCaptureSession(CameraDeviceWrapper cameraDeviceWrapper, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, CameraErrorListener cameraErrorListener, Handler handler) {
        super(cameraDeviceWrapper, cameraConstrainedHighSpeedCaptureSession, cameraErrorListener, handler);
        x.f(cameraDeviceWrapper, "device");
        x.f(cameraConstrainedHighSpeedCaptureSession, "session");
        x.f(cameraErrorListener, "cameraErrorListener");
        x.f(handler, "callbackHandler");
        this.session = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraConstrainedHighSpeedCaptureSessionWrapper
    public List<CaptureRequest> createHighSpeedRequestList(CaptureRequest captureRequest) {
        x.f(captureRequest, "request");
        try {
            try {
                Trace.beginSection("CXCP#createHighSpeedRequestList");
                return this.session.createHighSpeedRequestList(captureRequest);
            } finally {
                Trace.endSection();
            }
        } catch (IllegalArgumentException unused) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to createHighSpeedRequestList from " + getDevice() + " because the output surface was destroyed before calling createHighSpeedRequestList.");
                return null;
            }
            return null;
        } catch (IllegalStateException unused2) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to createHighSpeedRequestList. " + getDevice() + " may be closed.");
                return null;
            }
            return null;
        } catch (UnsupportedOperationException unused3) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to createHighSpeedRequestList from " + getDevice() + " because the output surface was not available.");
                return null;
            }
            return null;
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.AndroidCameraCaptureSession, androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return x.n(cls, CameraConstrainedHighSpeedCaptureSession.class) ? (T) this.session : (T) super.unwrapAs(cls);
    }
}
