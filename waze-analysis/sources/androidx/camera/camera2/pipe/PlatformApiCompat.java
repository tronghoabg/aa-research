package androidx.camera.camera2.pipe;

import android.hardware.camera2.MultiResolutionImageReader;
import android.hardware.camera2.params.MultiResolutionStreamConfigurationMap;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import h.g.b.x;
import java.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface PlatformApiCompat {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.PlatformApiCompat$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static MultiResolutionImageReader $default$buildMultiResolutionImageReader(PlatformApiCompat platformApiCompat, Collection collection, int i2, int i3, Long l2, Boolean bool) {
            x.f(collection, "streams");
            throw new UnsupportedOperationException("API not supported on current platform");
        }

        public static boolean $default$isConcurrentReadersSupported(PlatformApiCompat platformApiCompat, MultiResolutionStreamConfigurationMap multiResolutionStreamConfigurationMap, int i2) {
            x.f(multiResolutionStreamConfigurationMap, "multiResolutionStreamConfigurationMap");
            throw new UnsupportedOperationException("API not supported on current platform");
        }

        public static boolean $default$isMultiResolutionConcurrentReadersEnabled(PlatformApiCompat platformApiCompat) {
            return false;
        }

        public static void $default$setOnActiveOutputSurfacesListener(PlatformApiCompat platformApiCompat, MultiResolutionImageReader multiResolutionImageReader, Executor executor, CameraOnActiveOutputSurfacesListener cameraOnActiveOutputSurfacesListener) {
            x.f(multiResolutionImageReader, "multiResolutionImageReader");
            x.f(executor, "executor");
            x.f(cameraOnActiveOutputSurfacesListener, "listener");
            throw new UnsupportedOperationException("API not supported on current platform");
        }
    }

    MultiResolutionImageReader buildMultiResolutionImageReader(Collection<? extends MultiResolutionStreamInfo> collection, int i2, int i3, Long l2, Boolean bool);

    boolean isConcurrentReadersSupported(MultiResolutionStreamConfigurationMap multiResolutionStreamConfigurationMap, int i2);

    boolean isMultiResolutionConcurrentReadersEnabled();

    void setOnActiveOutputSurfacesListener(MultiResolutionImageReader multiResolutionImageReader, Executor executor, CameraOnActiveOutputSurfacesListener cameraOnActiveOutputSurfacesListener);
}
