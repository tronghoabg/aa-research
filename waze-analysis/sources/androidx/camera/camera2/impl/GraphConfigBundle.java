package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.core.impl.DeferrableSurface;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class GraphConfigBundle {
    private final CameraGraph.Config graphConfig;
    private final Map<CameraStream.Config, DeferrableSurface> streamToSurfaceMap;

    /* JADX WARN: Multi-variable type inference failed */
    public GraphConfigBundle(CameraGraph.Config config, Map<CameraStream.Config, ? extends DeferrableSurface> map) {
        x.f(config, "graphConfig");
        x.f(map, "streamToSurfaceMap");
        this.graphConfig = config;
        this.streamToSurfaceMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GraphConfigBundle copy$default(GraphConfigBundle graphConfigBundle, CameraGraph.Config config, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            config = graphConfigBundle.graphConfig;
        }
        if ((i2 & 2) != 0) {
            map = graphConfigBundle.streamToSurfaceMap;
        }
        return graphConfigBundle.copy(config, map);
    }

    public final CameraGraph.Config component1() {
        return this.graphConfig;
    }

    public final Map<CameraStream.Config, DeferrableSurface> component2() {
        return this.streamToSurfaceMap;
    }

    public final GraphConfigBundle copy(CameraGraph.Config config, Map<CameraStream.Config, ? extends DeferrableSurface> map) {
        x.f(config, "graphConfig");
        x.f(map, "streamToSurfaceMap");
        return new GraphConfigBundle(config, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphConfigBundle)) {
            return false;
        }
        GraphConfigBundle graphConfigBundle = (GraphConfigBundle) obj;
        return x.n(this.graphConfig, graphConfigBundle.graphConfig) && x.n(this.streamToSurfaceMap, graphConfigBundle.streamToSurfaceMap);
    }

    public final CameraGraph.Config getGraphConfig() {
        return this.graphConfig;
    }

    public final Map<CameraStream.Config, DeferrableSurface> getStreamToSurfaceMap() {
        return this.streamToSurfaceMap;
    }

    public int hashCode() {
        return (this.graphConfig.hashCode() * 31) + this.streamToSurfaceMap.hashCode();
    }

    public String toString() {
        return "GraphConfigBundle(graphConfig=" + this.graphConfig + ", streamToSurfaceMap=" + this.streamToSurfaceMap + ")";
    }
}
