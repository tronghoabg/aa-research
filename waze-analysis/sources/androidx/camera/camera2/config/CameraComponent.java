package androidx.camera.camera2.config;

import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.internal.StreamSpecsCalculator;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public interface CameraComponent {

    /* compiled from: WazeSource */
    public interface Builder {
        CameraComponent build();

        Builder config(CameraConfig cameraConfig);

        Builder streamSpecsCalculator(StreamSpecsCalculator streamSpecsCalculator);
    }

    CameraInternal getCameraInternal();
}
