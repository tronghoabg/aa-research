package androidx.camera.camera2.pipe.compat;

import android.hardware.HardwareBuffer;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.Image;
import android.media.ImageReader;
import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import android.view.Surface;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api28Compat {
    public static final Api28Compat INSTANCE = new Api28Compat();

    private Api28Compat() {
    }

    public static final void createCaptureSession(CameraDevice cameraDevice, SessionConfiguration sessionConfiguration) throws CameraAccessException {
        x.f(cameraDevice, "cameraDevice");
        x.f(sessionConfiguration, "sessionConfig");
        cameraDevice.createCaptureSession(sessionConfiguration);
    }

    public static final void discardFreeBuffers(ImageReader imageReader) {
        x.f(imageReader, "imageReader");
        imageReader.discardFreeBuffers();
    }

    public static final List<CaptureRequest.Key<?>> getAvailablePhysicalCameraRequestKeys(CameraCharacteristics cameraCharacteristics) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        return cameraCharacteristics.getAvailablePhysicalCameraRequestKeys();
    }

    public static final List<CaptureRequest.Key<?>> getAvailableSessionKeys(CameraCharacteristics cameraCharacteristics) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        return cameraCharacteristics.getAvailableSessionKeys();
    }

    public static final HardwareBuffer getHardwareBuffer(Image image) {
        x.f(image, "image");
        return image.getHardwareBuffer();
    }

    public static final int getMaxSharedSurfaceCount(OutputConfiguration outputConfiguration) {
        x.f(outputConfiguration, "outputConfig");
        return outputConfiguration.getMaxSharedSurfaceCount();
    }

    public static final Set<String> getPhysicalCameraIds(CameraCharacteristics cameraCharacteristics) {
        x.f(cameraCharacteristics, "cameraCharacteristics");
        Set<String> physicalCameraIds = cameraCharacteristics.getPhysicalCameraIds();
        x.e(physicalCameraIds, "getPhysicalCameraIds(...)");
        return physicalCameraIds;
    }

    public static final Map<String, CaptureResult> getPhysicalCaptureResults(TotalCaptureResult totalCaptureResult) {
        x.f(totalCaptureResult, "totalCaptureResult");
        return totalCaptureResult.getPhysicalCameraResults();
    }

    public static final SessionConfiguration newSessionConfiguration(int i2, List<OutputConfiguration> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        x.f(list, "outputs");
        x.f(executor, "executor");
        x.f(stateCallback, "stateCallback");
        return new SessionConfiguration(i2, list, executor, stateCallback);
    }

    public static final void openCamera(CameraManager cameraManager, String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException {
        x.f(cameraManager, "cameraManager");
        x.f(str, "cameraId");
        x.f(executor, "executor");
        x.f(stateCallback, "callback");
        cameraManager.openCamera(str, executor, stateCallback);
    }

    public static final void registerAvailabilityCallback(CameraManager cameraManager, Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        x.f(cameraManager, "cameraManager");
        x.f(executor, "executor");
        x.f(availabilityCallback, "callback");
        cameraManager.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public static final void removeSurface(OutputConfiguration outputConfiguration, Surface surface) {
        x.f(outputConfiguration, "outputConfig");
        x.f(surface, "surface");
        outputConfiguration.removeSurface(surface);
    }

    public static final void setInputConfiguration(SessionConfiguration sessionConfiguration, InputConfiguration inputConfiguration) {
        x.f(sessionConfiguration, "sessionConfig");
        x.f(inputConfiguration, "inputConfig");
        sessionConfiguration.setInputConfiguration(inputConfiguration);
    }

    public static final void setPhysicalCameraId(OutputConfiguration outputConfiguration, String str) {
        x.f(outputConfiguration, "outputConfig");
        outputConfiguration.setPhysicalCameraId(str);
    }

    public static final void setSessionParameters(SessionConfiguration sessionConfiguration, CaptureRequest captureRequest) {
        x.f(sessionConfiguration, "sessionConfig");
        x.f(captureRequest, "params");
        sessionConfiguration.setSessionParameters(captureRequest);
    }

    public static final <T> T unwrapAsHardwareBuffer(Image image, Class<T> cls) {
        x.f(image, "image");
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, j$$ExternalSyntheticApiModelOutline1.m70m())) {
            return (T) image.getHardwareBuffer();
        }
        return null;
    }
}
