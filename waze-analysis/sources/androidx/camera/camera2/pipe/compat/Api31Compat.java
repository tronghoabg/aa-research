package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Range;
import android.util.Size;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api31Compat {
    public static final Api31Compat INSTANCE = new Api31Compat();

    private Api31Compat() {
    }

    public static final void addSensorPixelModeUsed(OutputConfiguration outputConfiguration, int i2) {
        x.f(outputConfiguration, "outputConfiguration");
        outputConfiguration.addSensorPixelModeUsed(i2);
    }

    public static final void createExtensionCaptureSession(CameraDevice cameraDevice, ExtensionSessionConfiguration extensionSessionConfiguration) throws CameraAccessException {
        x.f(cameraDevice, "cameraDevice");
        x.f(extensionSessionConfiguration, "extensionConfiguration");
        cameraDevice.createExtensionSession(extensionSessionConfiguration);
    }

    public static final CameraExtensionCharacteristics getCameraExtensionCharacteristics(CameraManager cameraManager, String str) throws CameraAccessException {
        x.f(cameraManager, "cameraManager");
        x.f(str, "cameraId");
        CameraExtensionCharacteristics cameraExtensionCharacteristics = cameraManager.getCameraExtensionCharacteristics(str);
        x.e(cameraExtensionCharacteristics, "getCameraExtensionCharacteristics(...)");
        return cameraExtensionCharacteristics;
    }

    public static final Range<Long> getEstimatedCaptureLatencyRangeMillis(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i2, Size size, int i3) {
        x.f(cameraExtensionCharacteristics, "extensionCharacteristics");
        x.f(size, "captureSize");
        return cameraExtensionCharacteristics.getEstimatedCaptureLatencyRangeMillis(i2, size, i3);
    }

    public static final List<Size> getExtensionSupportedSizes(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i2, Class<?> cls) {
        x.f(cameraExtensionCharacteristics, "extensionCharacteristics");
        x.f(cls, "klass");
        List<Size> extensionSupportedSizes = cameraExtensionCharacteristics.getExtensionSupportedSizes(i2, cls);
        x.e(extensionSupportedSizes, "getExtensionSupportedSizes(...)");
        return extensionSupportedSizes;
    }

    public static final Map<String, CaptureResult> getPhysicalCameraTotalResults(TotalCaptureResult totalCaptureResult) {
        x.f(totalCaptureResult, "totalCaptureResult");
        return totalCaptureResult.getPhysicalCameraTotalResults();
    }

    public static final List<Integer> getSupportedExtensions(CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        x.f(cameraExtensionCharacteristics, "extensionCharacteristics");
        List<Integer> supportedExtensions = cameraExtensionCharacteristics.getSupportedExtensions();
        x.e(supportedExtensions, "getSupportedExtensions(...)");
        return supportedExtensions;
    }

    public static final ExtensionSessionConfiguration newExtensionSessionConfiguration(int i2, List<OutputConfiguration> list, Executor executor, CameraExtensionSession$StateCallback cameraExtensionSession$StateCallback) {
        x.f(list, "outputs");
        x.f(executor, "executor");
        x.f(cameraExtensionSession$StateCallback, "stateCallback");
        return new ExtensionSessionConfiguration(i2, list, executor, cameraExtensionSession$StateCallback);
    }

    public static final InputConfiguration newInputConfiguration(List<InputConfigData> list, String str) {
        x.f(list, "inputConfigData");
        x.f(str, "cameraId");
        if (list.isEmpty()) {
            throw new IllegalStateException("Call to create InputConfiguration but list of InputConfigData is empty.");
        }
        if (list.size() == 1) {
            InputConfigData inputConfigData = (InputConfigData) i.P(list);
            return new InputConfiguration(inputConfigData.getWidth(), inputConfigData.getHeight(), inputConfigData.getFormat());
        }
        List<InputConfigData> list2 = list;
        ArrayList arrayList = new ArrayList(i.q(list2, 10));
        for (InputConfigData inputConfigData2 : list2) {
            arrayList.add(new MultiResolutionStreamInfo(inputConfigData2.getWidth(), inputConfigData2.getHeight(), str));
        }
        return new InputConfiguration(arrayList, ((InputConfigData) i.P(list)).getFormat());
    }

    public static final MultiResolutionStreamInfo newMultiResolutionStreamInfo(int i2, int i3, String str) {
        x.f(str, "physicalCameraId");
        return new MultiResolutionStreamInfo(i2, i3, str);
    }

    public static final List<Size> getExtensionSupportedSizes(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i2, int i3) {
        x.f(cameraExtensionCharacteristics, "extensionCharacteristics");
        List<Size> extensionSupportedSizes = cameraExtensionCharacteristics.getExtensionSupportedSizes(i2, i3);
        x.e(extensionSupportedSizes, "getExtensionSupportedSizes(...)");
        return extensionSupportedSizes;
    }
}
