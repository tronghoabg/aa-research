package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.graph.GraphListener;
import h.ab;
import h.g.a.l;
import java.util.List;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Camera2DeviceManager {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2DeviceManager$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ am closeAll$default(Camera2DeviceManager camera2DeviceManager, boolean z, int i2, Object obj) {
            if (obj == null) {
                return camera2DeviceManager.closeAll(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)));
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeAll");
        }
    }

    /* renamed from: close-EfqyGwQ, reason: not valid java name */
    am<ab> mo1023closeEfqyGwQ(String str);

    am<ab> closeAll(boolean z);

    /* renamed from: open-zDSwpeU, reason: not valid java name */
    VirtualCamera mo1024openzDSwpeU(String str, List<CameraId> list, GraphListener graphListener, boolean z, l<? super ab, Boolean> lVar);

    /* renamed from: prewarm-EfqyGwQ, reason: not valid java name */
    void mo1025prewarmEfqyGwQ(String str);
}
