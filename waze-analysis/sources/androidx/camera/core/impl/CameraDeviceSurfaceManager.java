package androidx.camera.core.impl;

import android.content.Context;
import android.util.Size;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraDeviceSurfaceManager extends InternalCameraPresenceListener {

    /* compiled from: WazeSource */
    public interface Provider {
        CameraDeviceSurfaceManager newInstance(Context context, Object obj, Set<String> set, String str);
    }

    SurfaceStreamSpecQueryResult getSuggestedStreamSpecs(int i2, String str, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map, VideoStabilization videoStabilization, boolean z, boolean z2, boolean z3);

    SurfaceConfig transformSurfaceConfig(int i2, String str, int i3, Size size, StreamUseCase streamUseCase);
}
