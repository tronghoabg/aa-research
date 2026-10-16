package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.ConcurrentCameraGraphs;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ConcurrentSessionSequencers {
    private final Object lock = new Object();
    private final Map<ConcurrentCameraGraphs, ConcurrentSessionSequencer> sequencers = new LinkedHashMap();
    private final Set<CameraGraphId> pending = new LinkedHashSet();

    public final ConcurrentSessionSequencer getSequencer(CameraGraphId cameraGraphId, ConcurrentCameraGraphs concurrentCameraGraphs) {
        ConcurrentSessionSequencer concurrentSessionSequencer;
        x.f(cameraGraphId, "cameraGraphId");
        x.f(concurrentCameraGraphs, "concurrentCameraGraphs");
        synchronized (this.lock) {
            if (!this.sequencers.containsKey(concurrentCameraGraphs)) {
                ConcurrentSessionSequencer concurrentSessionSequencer2 = new ConcurrentSessionSequencer();
                this.sequencers.put(concurrentCameraGraphs, concurrentSessionSequencer2);
                this.pending.addAll(e.c.d.a.u(concurrentCameraGraphs.getCameraGraphIds(), cameraGraphId));
                return concurrentSessionSequencer2;
            }
            this.pending.remove(cameraGraphId);
            Set<CameraGraphId> cameraGraphIds = concurrentCameraGraphs.getCameraGraphIds();
            if (!(cameraGraphIds instanceof Collection) || !cameraGraphIds.isEmpty()) {
                Iterator<T> it = cameraGraphIds.iterator();
                while (it.hasNext()) {
                    if (this.pending.contains((CameraGraphId) it.next())) {
                        ConcurrentSessionSequencer concurrentSessionSequencer3 = this.sequencers.get(concurrentCameraGraphs);
                        if (concurrentSessionSequencer3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        concurrentSessionSequencer = concurrentSessionSequencer3;
                        return concurrentSessionSequencer;
                    }
                }
            }
            ConcurrentSessionSequencer concurrentSessionSequencerRemove = this.sequencers.remove(concurrentCameraGraphs);
            if (concurrentSessionSequencerRemove == null) {
                throw new IllegalStateException("Required value was null.");
            }
            concurrentSessionSequencer = concurrentSessionSequencerRemove;
            return concurrentSessionSequencer;
        }
    }
}
