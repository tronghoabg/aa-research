package androidx.camera.view;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.lifecycle.LifecycleOwner;
import com.google.d.m.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
interface ProcessCameraProviderWrapper {
    Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, SessionConfig sessionConfig);

    Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCaseGroup useCaseGroup);

    CameraInfo getCameraInfo(CameraSelector cameraSelector);

    boolean hasCamera(CameraSelector cameraSelector);

    bm<Void> shutdownAsync();

    void unbind(SessionConfig sessionConfig);

    void unbind(UseCase... useCaseArr);

    void unbindAll();
}
