package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.compat.AudioRestrictionController;
import androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl;
import androidx.camera.camera2.pipe.compat.Camera2Backend;
import androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor;
import androidx.camera.camera2.pipe.compat.Camera2CameraOpener;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCache;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCloser;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl;
import androidx.camera.camera2.pipe.compat.Camera2DeviceManager;
import androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl;
import androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor;
import androidx.camera.camera2.pipe.compat.Camera2MetadataCache;
import androidx.camera.camera2.pipe.compat.Camera2MetadataProvider;
import androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor;
import androidx.camera.camera2.pipe.compat.CameraOpener;
import androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener;
import androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import androidx.camera.camera2.pipe.internal.CriticalCameraErrorListener;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class Camera2Module {
    public abstract AudioRestrictionController bindAudioRestrictionController(AudioRestrictionControllerImpl audioRestrictionControllerImpl);

    public abstract Camera2DeviceCloser bindCamera2DeviceCloser(Camera2DeviceCloserImpl camera2DeviceCloserImpl);

    public abstract Camera2DeviceManager bindCamera2DeviceManager(Camera2DeviceManagerImpl camera2DeviceManagerImpl);

    public abstract CameraAvailabilityMonitor bindCameraAvailabilityMonitor(Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor);

    public abstract CameraErrorListener bindCameraErrorListener(Camera2ErrorProcessor camera2ErrorProcessor);

    public abstract Camera2MetadataProvider bindCameraMetadataProvider(Camera2MetadataCache camera2MetadataCache);

    public abstract CameraOpener bindCameraOpener(Camera2CameraOpener camera2CameraOpener);

    @DefaultCameraBackend
    public abstract CameraBackend bindCameraPipeCameraBackend(Camera2Backend camera2Backend);

    public abstract CriticalCameraErrorListener bindCriticalCameraErrorListener(Camera2DeviceCache camera2DeviceCache);

    public abstract RetryingCameraStateOpener bindRetryingCameraStateOpener(RetryingCameraStateOpenerImpl retryingCameraStateOpenerImpl);
}
