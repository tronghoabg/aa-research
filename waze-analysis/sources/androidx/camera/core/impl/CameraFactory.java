package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.internal.StreamSpecsCalculator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraFactory extends CameraPresenceMonitor {

    /* compiled from: WazeSource */
    public interface Interrogator {
        List<String> getAvailableCameraIds(List<String> list);
    }

    /* compiled from: WazeSource */
    public interface Provider {
        CameraFactory newInstance(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector, long j2, CameraXConfig cameraXConfig, StreamSpecsCalculator streamSpecsCalculator);
    }

    Set<String> getAvailableCameraIds();

    CameraInternal getCamera(String str);

    CameraCoordinator getCameraCoordinator();

    Object getCameraManager();

    Observable<List<CameraIdentifier>> getCameraPresenceSource();

    void shutdown();

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.impl.CameraFactory$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$shutdown(CameraFactory cameraFactory) {
        }
    }
}
