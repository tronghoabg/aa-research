package androidx.camera.camera2.pipe;

import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.graph.LatestFrameMetadataAggregator;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface RequestListeners {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.RequestListeners$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Request.Listener createLatestFrameMetadataListener(Set<? extends CaptureResult.Key<?>> set, Set<? extends Metadata.Key<?>> set2, l<? super RequestMetadata, Boolean> lVar, l<? super LatestFrameMetadata, ab> lVar2) {
            return RequestListeners.Companion.createLatestFrameMetadataListener(set, set2, lVar, lVar2);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Request.Listener createLatestFrameMetadataListener$default(Companion companion, Set set, Set set2, l lVar, l lVar2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                set = e.c.d.a.p();
            }
            if ((i2 & 2) != 0) {
                set2 = e.c.d.a.p();
            }
            if ((i2 & 4) != 0) {
                lVar = null;
            }
            return companion.createLatestFrameMetadataListener(set, set2, lVar, lVar2);
        }

        public final Request.Listener createLatestFrameMetadataListener(Set<? extends CaptureResult.Key<?>> set, Set<? extends Metadata.Key<?>> set2, l<? super RequestMetadata, Boolean> lVar, l<? super LatestFrameMetadata, ab> lVar2) {
            x.f(set, "captureResultKeys");
            x.f(set2, "metadataKeys");
            x.f(lVar2, "listener");
            if (set.isEmpty() && set2.isEmpty()) {
                throw new IllegalArgumentException("At least one of captureResultKeys or metadataKeys must be non-empty");
            }
            return new LatestFrameMetadataAggregator(set, set2, 0, lVar, lVar2, 4, null);
        }
    }

    void add(Request.Listener listener);

    void addAll(List<? extends Request.Listener> list);

    void remove(Request.Listener listener);

    void removeAll(List<? extends Request.Listener> list);
}
