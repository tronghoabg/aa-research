package androidx.camera.camera2.config;

import androidx.camera.camera2.impl.UseCaseCamera;

/* compiled from: WazeSource */
@UseCaseCameraScope
/* loaded from: classes2.dex */
public interface UseCaseCameraComponent {

    /* compiled from: WazeSource */
    public interface Builder {
        UseCaseCameraComponent build();

        Builder config(UseCaseCameraConfig useCaseCameraConfig);
    }

    UseCaseCamera getUseCaseCamera();

    UseCaseCameraContext getUseCaseCameraContext();
}
