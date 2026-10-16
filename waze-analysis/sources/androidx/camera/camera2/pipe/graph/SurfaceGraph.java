package androidx.camera.camera2.pipe.graph;

import android.view.Surface;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.SurfaceTracker;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.media.ImageSource;
import h.a.i;
import h.a.r;
import h.g.b.au;
import h.g.b.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SurfaceGraph implements SurfaceTracker, AutoCloseable {
    private final g.a.a<CameraController> cameraController;
    private boolean closed;
    private final Map<StreamId, ImageSource> imageSources;
    private final Object lock;
    private boolean shouldRegisterSurfaces;
    private final StreamGraphImpl streamGraphImpl;
    private final CameraSurfaceManager surfaceManager;
    private final Map<StreamId, Surface> surfaceMap;
    private final Map<Surface, AutoCloseable> surfaceUsageMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SurfaceGraph(StreamGraphImpl streamGraphImpl, g.a.a<CameraController> aVar, CameraSurfaceManager cameraSurfaceManager, Map<StreamId, ? extends ImageSource> map) {
        x.f(streamGraphImpl, "streamGraphImpl");
        x.f(aVar, "cameraController");
        x.f(cameraSurfaceManager, "surfaceManager");
        x.f(map, "imageSources");
        this.streamGraphImpl = streamGraphImpl;
        this.cameraController = aVar;
        this.surfaceManager = cameraSurfaceManager;
        this.imageSources = map;
        this.lock = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((ImageSource) entry.getValue()).getSurface());
        }
        this.surfaceMap = linkedHashMap;
        this.surfaceUsageMap = new LinkedHashMap();
        this.shouldRegisterSurfaces = true;
    }

    private final Map<StreamId, Surface> buildSurfaceMap() {
        synchronized (this.lock) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (StreamGraphImpl.OutputConfig outputConfig : this.streamGraphImpl.getOutputConfigs$camera_camera2_pipe()) {
                for (CameraStream cameraStream : outputConfig.getStreamBuilder$camera_camera2_pipe()) {
                    Surface surface = this.surfaceMap.get(StreamId.m974boximpl(cameraStream.m578getIdptHMqGs()));
                    if (surface != null) {
                        linkedHashMap.put(StreamId.m974boximpl(cameraStream.m578getIdptHMqGs()), surface);
                    } else if (!outputConfig.getDeferrable()) {
                        return r.j();
                    }
                }
            }
            return linkedHashMap;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.surfaceMap.clear();
            List listAo = i.ao(this.surfaceUsageMap.values());
            this.surfaceUsageMap.clear();
            Iterator it = listAo.iterator();
            while (it.hasNext()) {
                SurfaceGraph$$ExternalSyntheticAutoCloseableDispatcher0.m((AutoCloseable) it.next());
            }
        }
    }

    public final void maybeUpdateSurfaces$camera_camera2_pipe() {
        Map<StreamId, Surface> mapBuildSurfaceMap = buildSurfaceMap();
        if (mapBuildSurfaceMap.isEmpty()) {
            return;
        }
        this.cameraController.get().updateSurfaceMap(mapBuildSurfaceMap);
    }

    @Override // androidx.camera.camera2.pipe.SurfaceTracker
    public void registerAllSurfaces() {
        synchronized (this.lock) {
            if (this.closed) {
                throw new IllegalStateException("Check failed.");
            }
            for (Surface surface : this.surfaceMap.values()) {
                this.surfaceUsageMap.put(surface, this.surfaceManager.registerSurface$camera_camera2_pipe(surface));
            }
            this.shouldRegisterSurfaces = true;
        }
    }

    /* renamed from: set-NYG5g8E, reason: not valid java name */
    public final void m1201setNYG5g8E(int i2, Surface surface) {
        String str;
        if (this.imageSources.keySet().contains(StreamId.m974boximpl(i2))) {
            throw new IllegalStateException("Cannot configure surface for " + StreamId.m979toStringimpl(i2) + ", it is permanently assigned to " + this.imageSources.get(StreamId.m974boximpl(i2)));
        }
        synchronized (this.lock) {
            if (this.closed) {
                if (surface != null && Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Refusing to configure " + StreamId.m979toStringimpl(i2) + " with " + surface + " after close!");
                }
                return;
            }
            AutoCloseable autoCloseableRemove = null;
            if (Log.INSTANCE.getINFO_LOGGABLE()) {
                if (surface != null) {
                    str = "Configured " + StreamId.m979toStringimpl(i2) + " with " + surface;
                } else {
                    str = "Removed surface for " + StreamId.m979toStringimpl(i2);
                    surface = null;
                }
                android.util.Log.i(Log.TAG, str);
            }
            Map<StreamId, Surface> map = this.surfaceMap;
            if (surface == null) {
                Surface surfaceRemove = map.remove(StreamId.m974boximpl(i2));
                if (this.shouldRegisterSurfaces && surfaceRemove != null) {
                    autoCloseableRemove = this.surfaceUsageMap.remove(surfaceRemove);
                }
            } else {
                Surface surface2 = map.get(StreamId.m974boximpl(i2));
                this.surfaceMap.put(StreamId.m974boximpl(i2), surface);
                if (this.shouldRegisterSurfaces && !x.n(surface2, surface)) {
                    if (this.surfaceUsageMap.containsKey(surface)) {
                        throw new IllegalStateException(a.a(surface, "Surface (", ") is already in use!"));
                    }
                    autoCloseableRemove = (AutoCloseable) au.c(this.surfaceUsageMap).remove(surface2);
                    this.surfaceUsageMap.put(surface, this.surfaceManager.registerSurface$camera_camera2_pipe(surface));
                }
            }
            maybeUpdateSurfaces$camera_camera2_pipe();
            if (autoCloseableRemove != null) {
                SurfaceGraph$$ExternalSyntheticAutoCloseableDispatcher0.m(autoCloseableRemove);
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.SurfaceTracker
    public void unregisterAllSurfaces() throws Exception {
        List listAo;
        synchronized (this.lock) {
            this.shouldRegisterSurfaces = false;
            listAo = i.ao(this.surfaceUsageMap.values());
            this.surfaceUsageMap.clear();
        }
        Iterator it = listAo.iterator();
        while (it.hasNext()) {
            SurfaceGraph$$ExternalSyntheticAutoCloseableDispatcher0.m((AutoCloseable) it.next());
        }
    }
}
