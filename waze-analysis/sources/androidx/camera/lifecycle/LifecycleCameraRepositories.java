package androidx.camera.lifecycle;

import androidx.camera.core.impl.utils.ContextUtil;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LifecycleCameraRepositories {
    public static final LifecycleCameraRepositories INSTANCE = new LifecycleCameraRepositories();
    private static final Map<Integer, LifecycleCameraRepository> repositoryMap = new LinkedHashMap();

    private LifecycleCameraRepositories() {
    }

    public static final LifecycleCameraRepository getInstance$camera_lifecycle(int i2) {
        LifecycleCameraRepository lifecycleCameraRepository;
        Map<Integer, LifecycleCameraRepository> map = repositoryMap;
        synchronized (map) {
            Integer numValueOf = Integer.valueOf(i2);
            LifecycleCameraRepository lifecycleCameraRepository2 = map.get(numValueOf);
            if (lifecycleCameraRepository2 == null) {
                lifecycleCameraRepository2 = new LifecycleCameraRepository(i2);
                map.put(numValueOf, lifecycleCameraRepository2);
            }
            lifecycleCameraRepository = lifecycleCameraRepository2;
        }
        return lifecycleCameraRepository;
    }

    public static /* synthetic */ LifecycleCameraRepository getInstance$camera_lifecycle$default(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            int i4 = ContextUtil.f1641a;
            i2 = 0;
        }
        return getInstance$camera_lifecycle(i2);
    }

    public final void clear$camera_lifecycle() {
        Map<Integer, LifecycleCameraRepository> map = repositoryMap;
        synchronized (map) {
            map.clear();
        }
    }
}
