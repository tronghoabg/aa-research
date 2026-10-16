package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.view.Surface;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.compat.AudioRestrictionController;
import androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraDeviceWrapper extends UnsafeWrapper, AudioRestrictionController.Listener {
    /* renamed from: createCaptureRequest-2PPcXtw */
    CaptureRequest.Builder mo983createCaptureRequest2PPcXtw(int i2);

    boolean createCaptureSession(SessionConfigData sessionConfigData);

    boolean createCaptureSession(List<? extends Surface> list, CameraCaptureSessionWrapper.StateCallback stateCallback);

    boolean createCaptureSessionByOutputConfigurations(List<? extends OutputConfigurationWrapper> list, CameraCaptureSessionWrapper.StateCallback stateCallback);

    boolean createConstrainedHighSpeedCaptureSession(List<? extends Surface> list, CameraCaptureSessionWrapper.StateCallback stateCallback);

    boolean createExtensionSession(ExtensionSessionConfigData extensionSessionConfigData);

    CaptureRequest.Builder createReprocessCaptureRequest(TotalCaptureResult totalCaptureResult);

    boolean createReprocessableCaptureSession(InputConfiguration inputConfiguration, List<? extends Surface> list, CameraCaptureSessionWrapper.StateCallback stateCallback);

    boolean createReprocessableCaptureSessionByConfigurations(InputConfigData inputConfigData, List<? extends OutputConfigurationWrapper> list, CameraCaptureSessionWrapper.StateCallback stateCallback);

    /* renamed from: getCameraAudioRestriction-_b5Q8KE */
    int mo984getCameraAudioRestriction_b5Q8KE();

    /* renamed from: getCameraId-Dz_R5H8 */
    String mo985getCameraIdDz_R5H8();

    void onDeviceClosed();

    void onDeviceClosing();
}
