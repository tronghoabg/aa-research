package androidx.camera.camera2.impl;

import androidx.camera.core.UseCase;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import h.c.e;
import java.util.Collection;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface UseCaseCamera {
    br close();

    Object getCameraCapturePipeline(int i2, int i3, int i4, e<? super CameraCapturePipeline> eVar);

    UseCaseCameraRequestControl getRequestControl();

    void setActiveResumeMode(boolean z);

    void start();

    br updateRepeatingRequestAsync(boolean z, Collection<? extends UseCase> collection);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.UseCaseCamera$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$setActiveResumeMode(UseCaseCamera useCaseCamera, boolean z) {
        }

        public static /* synthetic */ void access$setActiveResumeMode$jd(UseCaseCamera useCaseCamera, boolean z) {
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static void setActiveResumeMode(UseCaseCamera useCaseCamera, boolean z) {
        }
    }
}
